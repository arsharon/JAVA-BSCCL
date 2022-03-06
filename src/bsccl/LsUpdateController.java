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
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class LsUpdateController implements Initializable {

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
    private Button coxLSinfo;
    @FXML
    private Button coxSubInfo;
    @FXML
    private Button kktLSinfo;
    @FXML
    private Button kktSubInfo;
    @FXML
    private TextArea infoField;

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
    private void coxLSinfoOnclick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
       
        try {
           

            f = new File("CoxLSInfo.txt");     
          
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	infoField.getText()
                	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void coxSubInfoOnclick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        
        try {
          

            f = new File("CoxSubInfo.txt");     
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	infoField.getText()
                	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void kktLSinfoOnclick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        
        try {
          

            f = new File("KktLSinfo.txt");     
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	infoField.getText()
                	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void kktSubInfoOnclick(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        
        try {
          

            f = new File("KktSubInfo.txt");     
           
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	infoField.getText()
                	
            );           
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
