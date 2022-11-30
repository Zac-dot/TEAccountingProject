package TESoftware.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//Almost a exact replica of ClientProfile
public class EmployeeProfile{

    @FXML
    public Button cliID;
    //Shows the stage for the Client Profile
    public void ClientHistory(ActionEvent event) throws Exception {
        Stage stage = (Stage) cliID.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/EmployeeHistory.fxml"));
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Client History");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //On click of button, will show the stage for a new client interaction
    @FXML
    public Button clientID;
    public void NewClient(ActionEvent event) throws Exception{
        Stage stage = (Stage) clientID.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/EmployeeToClient.fxml"));
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Order History");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @FXML
    public Button closeButton;
    //Closes window and will logout
    public void Logout (ActionEvent event) throws Exception {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
