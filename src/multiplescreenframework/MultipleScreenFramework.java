/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescreenframework;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author angelacaicedo
 */
public class MultipleScreenFramework extends Application {
   public static String buttonFXML = "ButtonScreen.fxml";
   public static String checkBoxFXML = "CheckBoxScreen.fxml";
   public static String labelFXML = "LabelsScreen.fxml";
   
   
   @Override
    public void start(Stage stage) throws Exception {
        ScreenPane mainContainer = new ScreenPane();
        mainContainer.loadScreen("buttons", MultipleScreenFramework.buttonFXML);
        mainContainer.loadScreen("checkBoxes", MultipleScreenFramework.checkBoxFXML);
        mainContainer.loadScreen("labels", MultipleScreenFramework.labelFXML);
        mainContainer.setScreen("buttons");
        
        Scene scene = new Scene(mainContainer);
        
        
        //xx.getChildren().remove(test);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
