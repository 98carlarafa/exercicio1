/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class FXMLController implements Initializable {

    @FXML
    private CheckBox checkBoxPooI;
    @FXML
    private CheckBox checkBoxBDI;
    @FXML
    private CheckBox checkBoxAedsI;
    @FXML
    private CheckBox checkBoxESI;
    @FXML
    private Button buttonPegarInfo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarInformacoes(ActionEvent event) {
        
        String info = "";
        //Com o elemento checkBox nós temos que verificar individiulmente
        //se o mesmo está ou não selecionado
        
        //o método isSelected() diz se o
        //checkBox está ou não selecionado
        if(checkBoxPooI.isSelected()){
            //getText retorna o text do checkBox
            info += checkBoxPooI.getText();
        }
        
        if(checkBoxBDI.isSelected()){
        
            info += checkBoxBDI.getText();
        }
        
        if(checkBoxESI.isSelected()){
        
            info += checkBoxESI.getText();
        }
        
        if(checkBoxAedsI.isSelected()){
        
            info += checkBoxAedsI.getText();
        }
    }
    
}
