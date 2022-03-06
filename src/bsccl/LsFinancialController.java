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
public class LsFinancialController implements Initializable {

    @FXML
    private Menu lsHome;
    @FXML
    private Menu info;
    @FXML
    private Menu comWithAdmin;
    @FXML
    private Menu notice;
    @FXML
    private Menu finInfo;
    @FXML
    private Menu logout;
    @FXML
    private TextField finAllBudget;
    @FXML
    private TextField finRemBudget;
    @FXML
    private TextField finExpen;
    @FXML
    private TextArea finspecial;
    @FXML
    private Button finSubmit;
    @FXML
    private DatePicker finDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lsHomeOnclick(ActionEvent event) {
    }

    @FXML
    private void infoOnclick(ActionEvent event) {
    }

    @FXML
    private void comWithAdminOnclick(ActionEvent event) {
    }

    @FXML
    private void noticeOnclick(ActionEvent event) {
    }

    @FXML
    private void finInfoOnclick(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void finSubmitOnaction(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        try {
            

            f = new File("financial_info.txt");     
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
                 "Date : "+finDate.getValue()+"."+"\n"
            	+"Allocated Budget : "+finAllBudget.getText()+"."+"\n"
                +"Remaining Budget : "+finRemBudget.getText()+"."+"\n"
                +"Expenses Sector : "+finExpen.getText()+"."+"\n"
                +"Special Informaton : "+finspecial.getText()+"\n"+"------------------------------------------------------------------------------------ \n"	
            );   
            
            finAllBudget.setText("");
            finRemBudget.setText("");
            finExpen.setText("");
            finspecial.setText("");
            
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
