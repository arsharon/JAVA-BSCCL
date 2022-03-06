/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class SuppBidController implements Initializable {

    @FXML
    private Menu suppHome;
    @FXML
    private Menu suppPerformance;
    @FXML
    private Menu suppBid;
    @FXML
    private Menu suppTender;
    @FXML
    private Menu suppSupport;
    @FXML
    private Menu suppProfile;
    @FXML
    private Menu logout;
    @FXML
    private TextField compName;
    @FXML
    private TextField packNo;
    @FXML
    private TextField cusExplain;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void suppHomeOnaction(ActionEvent event) {
    }

    @FXML
    private void suppPerformanceOnaction(ActionEvent event) {
    }

    @FXML
    private void suppBidOnaction(ActionEvent event) {
    }

    @FXML
    private void suppTenderOnaction(ActionEvent event) {
    }

    @FXML
    private void suppSupportOnaction(ActionEvent event) {
    }

    @FXML
    private void suppProfileOnaction(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void submitCusFormOnaction(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        try {
            

            f = new File("Requested_Supplier.txt");     
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	"Company Name : "+compName.getText()+"."+"\n"
                +"Tender ID : "+packNo.getText()+"."+"\n"		
                +"Explanation : "+cusExplain.getText()+"\n"+"------------------------------------------------------------------------------------ \n"	
            );   
            
            compName.setText("");
            packNo.setText("");
            cusExplain.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(CusFormController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(CusFormController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
