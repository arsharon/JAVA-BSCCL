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

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class LsComController implements Initializable {

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
    private TextArea adminLStextarea;
    @FXML
    private TextField adminLStextField;

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
    private void appendAtComLSfile(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
       
        try {
           

            f = new File("AdminComLS.txt");     
          
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	"Manager : "+adminLStextField.getText()+"."+"\n"
           
                	
            );  
            adminLStextField.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LsUpdateController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        adminLStextarea.setText("");
        File file = new File("AdminComLS.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            adminLStextarea.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                adminLStextarea.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @FXML
    private void readFromComLSfile(ActionEvent event) {
         adminLStextarea.setText("");
        File file = new File("AdminComLS.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            adminLStextarea.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                adminLStextarea.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
