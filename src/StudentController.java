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

public class StudentController {
    public TableView tblStudent;
    public TableColumn clmId;
    public TableColumn clmName;
    public TableColumn clmAddress;
    public Button btnClose;

    public void btnClose(ActionEvent actionEvent) throws IOException
    {
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("MainDashBoard.fxml"))));
        stage.show();
    }

    public void initialize()
    {
        clmId.setCellValueFactory(new PropertyValueFactory<>("ID"));
        clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        loadData();
    }

    ObservableList<Student> observableList= FXCollections.observableArrayList();
    private void loadData()
    {
        for (Student s:DataBase.studentslist)
        {
            observableList.add(new Student(s.getName(),s.getID(),s.getAddress()));
        }
        tblStudent.setItems(observableList);
    }



}
