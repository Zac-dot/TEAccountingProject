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
        if(usernameID.getText().equals("test") && passID.getText().equals("test")){
            sID.setText("Successfully got in!");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/ClientProfile.fxml"));
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setTitle("Welcome, " + usernameID.getText());
            primaryStage.setScene(scene);
            primaryStage.show();
        }else{
          sID.setText("Couldn't login");
        }
    }

}
