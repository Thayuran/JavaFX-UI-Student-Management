import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CourseController {
    public TableColumn<Course,Integer> clmCourseId;
    public TableColumn<Course,String> clmCourseName;
    public TableColumn<Course,String> clmDuration;
    public Button btnClose;
    public TableView tblCourse;

    public void btnClose(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("MainDashBoard.fxml"))));
        stage.show();
    }

    public void initialize()
    {
        clmCourseId.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        clmCourseName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        clmDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        loadData();
    }

    ObservableList<Course> observableList= FXCollections.observableArrayList();
    private void loadData()
    {
        for (Course c:DataBase.courseslist)
        {
            observableList.add(new Course(c.getCourseID(),c.getCourseName(),c.getDuration()));
        }
        tblCourse.setItems(observableList);
    }




}
