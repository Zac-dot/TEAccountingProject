package TESoftware.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ClientProfile {

    @FXML
    public Button orderID;
    public void Order(ActionEvent event) throws Exception{
        Stage stage = (Stage) orderID.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/OrderHistory.fxml"));
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Order History");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Grabs OrderButtonID, closes previous stage, and then opens up an order page
    @FXML
    public Button OrderButtonID;
    public void NewOrder(ActionEvent event) throws Exception{
        Stage stage = (Stage) OrderButtonID.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/ClientToEmployee.fxml"));
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Order History");
        primaryStage.setScene(scene);
        primaryStage.show();
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
