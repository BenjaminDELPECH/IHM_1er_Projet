package ihm_final;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Class IHM_FINAL
 * This class is the main class of the project. It allows to run the application  
 * @author group 8.1
 * @version 2019
 */
public class IHM_FINAL extends Application {
    
    /**
     * The method allows to get the scene and put it in the stage to show it in the main method.
     * @param stage
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
