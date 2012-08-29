/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescreenframework;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author angelacaicedo
 */
public class CheckBoxScreenController implements Initializable, ScreenController {
 
    private ScreenPane myScreenPane;
    
    @FXML
    private CheckBox buttonsCB;
    
    @FXML
    private CheckBox labelsCB;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @Override
    public void setScreenPane(ScreenPane screenPage) {
        myScreenPane = screenPage;
    }
    

    public void clicked(MouseEvent e){
        if((CheckBox)e.getSource() == buttonsCB){
            myScreenPane.setScreen("buttons");
        }
        if((CheckBox)e.getSource() == labelsCB){
            myScreenPane.setScreen("labels");
        }
    }
}
