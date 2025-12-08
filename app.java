package com.bloodcare.bloodcare;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private static Stage mainStage; 

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        scene = new Scene(loadFXML("login"));
        stage.setTitle("BloodCare - login"); 
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        
        if (mainStage != null) {
            mainStage.sizeToScene();   
            mainStage.centerOnScreen();
            
            if (fxml.equals("login")) {
                mainStage.setTitle("BloodCare - login");
            } else {
                mainStage.setTitle("BloodCare - Dashboard");
            }
        }
    }


private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader loader = new FXMLLoader(
        App.class.getResource("/com/bloodcare/bloodcare/" + fxml + ".fxml")
    );

    if (loader.getLocation() == null) {
        System.out.println("❌ FXML NOT FOUND: " + fxml);
    }

    return loader.load();
}



    public static void main(String[] args) {
        launch();
    }
}
