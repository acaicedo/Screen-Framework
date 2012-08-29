/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescreenframework;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author angelacaicedo
 */
public class LabelsScreenController implements Initializable, ScreenController {
    private ScreenPane myScreenPane;
    
    @FXML
    private Label buttonsLbl;
    
    @FXML
    private Label checkLbl;
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
        if((Label)e.getSource() == buttonsLbl){
            myScreenPane.setScreen("buttons");
        }
        if((Label)e.getSource() == checkLbl){
            myScreenPane.setScreen("checkBoxes");
        }
    }
}
