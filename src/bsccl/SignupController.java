/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;


import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class SignupController implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private TextField pass;
    @FXML
    private ComboBox designation;
    @FXML
    private Label showMessageLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designation.getItems().addAll("Adminstrative_Officer","Ministry","Customer","Supplier","Landing_Station");
        designation.setValue("Adminstrative Officer");
    }    

    @FXML
    private void confirmForm(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("UserList.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
           
            else fos = new FileOutputStream(f);
           
            
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            //dos = new DataOutputStream(fos);
            
            dos.writeUTF(email.getText());
            dos.writeInt(Integer.parseInt(pass.getText()));
            //dos.writeUTF(address.getText());
            //dos.writeUTF(company.getText());
            //dos.writeInt(Integer.parseInt(phone.getText()));
            dos.writeUTF(designation.getValue().toString());
            
            showMessageLabel.setText("Registration Successfull!");
            
           
            

        } catch (IOException ex) {
           
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                
            }
        }      
    }

    @FXML
    private void declineForm(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    

    @FXML
    private void designationOnaction(ActionEvent event) {
    }


    
}
