package TESoftware.Controllers;

//JavaFX Imports
import TESoftware.Models.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

import java.io.IOException;

//Db Imports
import java.sql.*;

public class Main extends Application {
    public static void main(String[] args) {


        //Lets the person know the logins for each profile
        System.out.println(" -- Hey! The logins for these profiles are -- ");
        System.out.println("Employee Login: HubertFry with password: admin");
        System.out.println("Client Login: PhilipJFry with password: pass\n");

        //Testing methods and classes
        Client Anthony = new Client("Anthony", "Palo Alta, CA", 18, 50.00);
        Business LarryHart = new Business("LarryHart Furniture","San Francisco, CA", 19, 26000.00, 12, "Retail");
        Individual Magenta = new Individual("Magenta Rose", "Seattle, WA", 20, 700.00, "Freelancer", 29);
        Manager Valarie = new Manager("Valarie Peloski", 91828177);
        CEO Erin = new CEO("Erin Yager", 91820182);

        //For use with SQL Connector
        String databaseurl = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "cs380";

        //Attempting to connect to database and create what is needed
        try {
            Connection conn = DriverManager.getConnection(databaseurl, username, password);
            Statement smt = conn.createStatement();
            //Creates database and tables as needed when first connecting
            //Will skip any if made
            System.out.println("Connected to MySQL...");
            smt.executeUpdate("create database if not exists teaccounting");
            smt.executeUpdate("use teaccounting");
            System.out.println("Connected to database");
            //Will make tables, or atleast check if they have been made
            smt.executeUpdate("create table if not exists employees(managedby varchar(50), name varchar(70), ID Integer);"); //Employees
            smt.executeUpdate("create table if not exists manager(managedby varchar(200), managerof varchar(200), name varchar(70), ID Integer);"); //Manager
            smt.executeUpdate("create table if not exists CEO(manages varchar(200), name varchar(70), ID Integer);"); //CEO
            smt.executeUpdate("create table if not exists individual(name varchar(80), budget double, location varchar(200), orderID Integer);"); //Individual
            smt.executeUpdate("create table if not exists company(companyname varchar(200), budget double, orderID Integer);"); //Company
            smt.executeUpdate("create table if not exists orderhistory(orderID Integer, client varchar(200), budget double, comments varchar(200));"); //OrderHistory
            System.out.println("Tables have been checked and made");

            //Goes straight into scenes
            launch(args);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Couldn't connect to MySQL");
            System.out.println("Make sure that MySQl is downloaded and a database is made with 'root' as username and 'cs380' as password");
            System.exit(0);
        }

    }

    //Initalizes the Login Screen
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/Login.fxml"));
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }


}