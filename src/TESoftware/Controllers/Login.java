package TESoftware.Controllers;

import java.io.IOException;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class Login {
    @FXML
    private Label sID;
    @FXML
    private TextField usernameID;
    @FXML
    private TextField passID;

    public void Login(ActionEvent event) throws Exception{
        //Client / User profile
        if(usernameID.getText().equals("PhilipFry") && passID.getText().equals("pass")){
            sID.setText("Successfully got in!");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/ClientProfile.fxml"));
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setTitle("Welcome, Philip J Fry");
            primaryStage.setScene(scene);
            primaryStage.show();
        //Admin Profile essentially
        }else if(usernameID.getText().equals("HubertFry") && passID.getText().equals("admin")){
            sID.setText("Successfully got in!");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/EmployeeProfile.fxml"));
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setTitle("Welcome, Hubert Fry");
            primaryStage.setScene(scene);
            primaryStage.show();
        } else{
            sID.setText("Couldn't login");
        }
    }

}
