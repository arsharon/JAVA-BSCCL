/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class CustomerComAdminController implements Initializable {

    @FXML
    private Menu cusHome;
    @FXML
    private Menu cusCheck;
    @FXML
    private Menu cusComm;
    @FXML
    private Menu cusForm;
    @FXML
    private Menu cusSupport;
    @FXML
    private Menu cusProfile;
    @FXML
    private Menu logout;
    @FXML
    private TextField adminCusTextField2;
    //private TextArea adminCusTextArea2;
    @FXML
    private TextArea adminCusTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cusHomeOnaction(ActionEvent event) {
    }

    @FXML
    private void cusCheckOnaction(ActionEvent event) {
    }

    @FXML
    private void cusCommOnaction(ActionEvent event) {
    }

    @FXML
    private void cusFormOnaction(ActionEvent event) {
    }

    @FXML
    private void cusSupportOnaction(ActionEvent event) {
    }

    @FXML
    private void cusProfileOnaction(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void appendAtComCusFile(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
       
        try {
           

            f = new File("AdminComCus.txt");     
          
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	"Customer : "+adminCusTextField2.getText()+"."+"\n"
           
                	
            );  
            adminCusTextField2.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        adminCusTextArea.setText("");
        File file = new File("AdminComCus.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            adminCusTextArea.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                adminCusTextArea.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @FXML
    private void ReadFromComCusFile(ActionEvent event) {
        adminCusTextArea.setText("");
        File file = new File("AdminComCus.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            adminCusTextArea.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                adminCusTextArea.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
