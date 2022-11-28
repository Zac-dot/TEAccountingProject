package TESoftware.Controllers;

import TESoftware.Models.*;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;

import java.io.IOException;



public class Main extends Application {
    public static void main(String[] args) {

        launch(args);

        //Testing methods and classes
        Client Anthony = new Client("Anthony", "Palo Alta, CA", 18, 50.00);
        System.out.println(Anthony.toString());

        Business LarryHart = new Business("LarryHart Furniture","San Francisco, CA", 19, 26000.00, 12, "Retail");
        System.out.println(LarryHart.toString());

        Individual Magenta = new Individual("Magenta Rose", "Seattle, WA", 20, 700.00, "Freelancer", 29);
        System.out.println(Magenta.toString());

        Manager Valarie = new Manager("Valarie Peloski", 91828177);
        CEO Erin = new CEO("Erin Yager", 91820182);

        Erin.addsWorksOver(Valarie.getName());
        Erin.getsWorksOver();
        Valarie.setWorksUnder(Erin.getName());
        Valarie.getsWorksUnder();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/TESoftware/Views/Login.fxml"));
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }


}