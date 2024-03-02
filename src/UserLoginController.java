import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserLoginController implements Initializable {
    public Label lblAlert;
    public Button btnClose;
    public Button btnSignup;
    public Button btnLogin;


    public TextField txtusername;
    public PasswordField txtpassword;
    public Hyperlink lnkforgotpwd;
    public ComboBox cmbRole;

    public void OnLoginEvent(ActionEvent actionEvent) throws IOException {
        if(cmbRole.getSelectionModel().getSelectedItem() != null && txtusername.getText().isEmpty()==false && txtpassword.getText().isEmpty()==false )
        {
            lblAlert.setText("You try to login!");
            Stage stage=new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("MainDashBoard.fxml"))));
            stage.show();
        }
        else {
            lblAlert.setText("Please Enter Your UserName or Password \nselect an item from the combo box ");

        }

    }

    public void OnSignupEvent(ActionEvent actionEvent) throws IOException {
        lblAlert.setText("You are Registered!");
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("Signup.fxml"))));
        stage.show();
    }

    public void OnCloseEvent(ActionEvent actionEvent)
    {
        System.exit(0);
    }

    public void OnClick(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("Signup.fxml"))));
        stage.show();
    }

    public void OnSelectEvent(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        ObservableList<String> list= FXCollections.observableArrayList("Admin","User","Staff");
        cmbRole.setItems(list);
    }
}
