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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author angelacaicedo
 */
public class ButtonScreenController implements Initializable, ScreenController {
    private ScreenPane myScreenPane;
    
    @FXML
    private Button checkBtn;
    
    @FXML
    private Button lblBtn;
    
    
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
        if((Button)e.getSource() == checkBtn){
            myScreenPane.setScreen("checkBoxes");
        }
        if((Button)e.getSource() == lblBtn){
            myScreenPane.setScreen("labels");
        }
    }
    
}
