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

public class SignupController implements Initializable {
    public TextField txtusername;
    public PasswordField txtpassword;
    public Button btnSignup;
    public Button btnClose;
    public Label lblAlert;
    public ComboBox cmbRole;
    public PasswordField txtcfmpassword;

    public void OnSelectEvent(ActionEvent actionEvent) {
    }

    public void OnCloseEvent(ActionEvent actionEvent)
    {
        System.exit(0);
    }

    public void OnSignupEvent(ActionEvent actionEvent) throws IOException
    {
        if(cmbRole.getSelectionModel().getSelectedItem() != null && txtusername.getText().isEmpty()==false && txtpassword.getText().isEmpty()==false && txtcfmpassword.getText().isEmpty()==false )
        {

            Stage stage=new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
//            try
//            {
//                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("UserLogin.fxml"))));
//            }
//            catch (IOException e)
//            {
//                lblAlert.setText("Please Enter Your UserName or Password ");
//
//            }

            stage.setScene( new Scene(FXMLLoader.load(getClass().getResource("UserLogin.fxml"))));
            stage.show();
            //lblAlert.setText("Create Successfully!");
        }
        else {

            lblAlert.setText("Please fill in all fields and \nselect an item from the combo box.");
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        ObservableList<String> list=FXCollections.observableArrayList("Admin","User","Staff");
        cmbRole.setItems(list);
           // cmbRole.getItems(FXCollections.observableArrayList());
    }

}
