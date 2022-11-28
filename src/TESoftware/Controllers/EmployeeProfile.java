package TESoftware.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Almost a exact replica of ClientProfile
public class EmployeeProfile {
    public void Login(ActionEvent event) throws Exception{

    }

    @FXML
    public Button closeButton;

    //Closes window and will logout
    @FXML
    private Label aID;
    public void Logout (ActionEvent event) throws Exception {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
