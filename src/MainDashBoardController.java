import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainDashBoardController {
    public Button btnStudent;
    public Button btnCourse;
    public AnchorPane slidebar;
    public Button btnClose;

    public void OnCourseClick(ActionEvent actionEvent) throws IOException
    {
            SetUI("Course");
    }

    public void OnStudentClick(ActionEvent actionEvent) throws IOException
    {
        SetUI("Student");
    }

    private void SetUI(String location) throws IOException {
        slidebar.getChildren().clear();
        slidebar.getChildren().add(FXMLLoader.load(getClass().getResource(location+".fxml")));
    }

    public void OnCloseEvent(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("UserLogin.fxml"))));
        stage.show();
    }
}
