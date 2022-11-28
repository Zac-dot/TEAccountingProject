package TESoftware.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class ClientHistory {
    @FXML
    public Button gobackID;

    public void goBack(ActionEvent event) throws Exception{
        Stage stage = (Stage) gobackID.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/EmployeeProfile.fxml"));
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Welcome, Hubert Fry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}