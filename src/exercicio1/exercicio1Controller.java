/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class exercicio1Controller implements Initializable {
    
    private Label label;
    @FXML
    private TextField TFNumero;
    @FXML
    private TextField TFDobro;
    @FXML
    private TextField TFTriplo;
    @FXML
    private TextField TFQuadrado;
    @FXML
    private TextField TFCubo;
    @FXML
    private Button BCalcular;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcular(ActionEvent event) {
        
//      //armazena o valor do tfnumero
        String n = TFNumero.getText();
        
        //transformar o valor de n que é string em int
        double a = Double.parseDouble(n);
        
        //dobro
        double d = a * 2;
        //tranformar o d em string e armazena tfdobro
        TFDobro.setText(Double.toString(d));
        
        //triplo
        double t = a * 3;
        TFTriplo.setText(Double.toString(t));
        
        //quadrado
        //math pow é para potência (base, expoente)
        double q = Math.pow(a, 2);
        TFQuadrado.setText(Double.toString(q));
        
        //cubo
        double c = Math.pow(a, 3);
        TFCubo.setText(Double.toString(c));
    }
    
}
