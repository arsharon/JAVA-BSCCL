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
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class LsNoticeController implements Initializable {

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
    private Button saveNotice;
    @FXML
    private Button viewNotice;
    @FXML
    private TextArea noticeTextField;
    @FXML
    private TextField noticeFileName;

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
    private void saveNoticeOnaction(ActionEvent event) throws IOException {
        
       try {
            

           FileWriter fw = new FileWriter(noticeFileName.getText());
           String content;            
            content =   noticeTextField.getText()+"\n";
            fw.write(content);
          fw.close();
            
            
          
        } catch (IOException ex) {
            System.out.println(ex);
           
        }
    }

    @FXML
    private void viewNoticeOnaction(ActionEvent event) {
         Scanner sc;String str=null;  String[] tokens;
        try {
            File f = new File(noticeFileName.getText());
             sc = new Scanner(f);
            noticeTextField.setText(null);
            noticeTextField.appendText("Notices :\n--------------------\n");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(",");
                noticeTextField.appendText(str+"\n");  
            
            
        } 
    }
        catch (FileNotFoundException ex) {
            Logger.getLogger(LsNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
}
