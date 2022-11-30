package TESoftware.Controllers;

import TESoftware.Models.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


public class ClientHistory {
    //For use wtih SQL Connector
    static String databaseurl = "jdbc:mysql://localhost:3306/teaccounting";
    static String username = "root";
    static String password = "cs380";


    @FXML public Button gobackID;
    //Sets up the tables and columns
    @FXML public TableView<Order> table = new TableView<>();
    @FXML public TableColumn<Order, String> Column1 = new TableColumn<>("OrderID"); //OrderNum
    @FXML public TableColumn<Order, String> Column2 = new TableColumn<>("Clients");  // Employees
    @FXML public TableColumn<Order, String> Column3 = new TableColumn<>("Price/Budget");  //BudgetPrice
    @FXML public TableColumn<Order, String> Column4 = new TableColumn<>("Comments"); //Comments

    //Connects to the SQL Database and pulls the information from the individual table
    //For a specific name
    @FXML
    public void initialize() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/ClientHistory.fxml"));
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Order History");

        try{
            Connection conn = DriverManager.getConnection(databaseurl,username,password);
            Statement smt = (Statement) conn.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM orderhistory WHERE client = 'Philip J Fry';");

            //Making the table
            ObservableList<Order> data = FXCollections.observableArrayList();
            Order order; // Initialized Object

            //Setting up the columns
            Column1.setCellValueFactory(new PropertyValueFactory<>("OrderNum"));
            Column2.setCellValueFactory(new PropertyValueFactory<>("Employees"));
            Column3.setCellValueFactory(new PropertyValueFactory<>("BudgetPrice"));
            Column4.setCellValueFactory(new PropertyValueFactory<>("Comments"));
            while(rs.next()){
                String OrderNum = rs.getString("OrderID");
                String Clients = rs.getString("client");
                String BudgetPrice = rs.getString("budget");
                String Comments = rs.getString("comments");
                data.add(new Order(OrderNum, Clients, BudgetPrice, Comments));
                System.out.println("OrderNum: " + OrderNum + " Clients: " + Clients + " BudgetPrice: " + BudgetPrice + " Comments: " + Comments);
            }
            //Sets the table
            table.getColumns().addAll(Column1, Column2, Column3, Column4);
            table.setItems(data);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Something didn't go as planned");
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
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
