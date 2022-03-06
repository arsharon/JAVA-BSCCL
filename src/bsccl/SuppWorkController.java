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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.Month;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class SuppWorkController implements Initializable {

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
    private TextField tenderNO;
    @FXML
    private TextField allocatedBudget;
    @FXML
    private TextField usedBudget;
    @FXML
    private TextField completedWork;
    @FXML
    private TextArea workProblems;
    @FXML
    private Button submit;
    @FXML
    private DatePicker startDate;
    @FXML
    private DatePicker finishedDate;

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
    private void workSubmitOnclick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        
        try {
           

            f = new File("SuppWork.txt");      
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
                   
            	"Tender ID : "+ tenderNO.getText()+","+"\n"
                +"Starting Date : "+startDate.getValue()+","+"\n"
                +"Finishing Date : "+finishedDate.getValue()+","+"\n"
                +"Allocated Budget : "+allocatedBudget.getText()+","+"\n"	
                +"Used Budget: "+usedBudget.getText()+","+"\n"
                +"Completed Work : "+completedWork.getText()+  "," +"\n"       
                +"Work Problems : "+workProblems.getText()+"\n"+"------------------------------------------------------------------------------------ \n"	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(SuppWorkController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(SuppWorkController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
