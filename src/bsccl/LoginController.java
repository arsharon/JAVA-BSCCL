/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class LoginController implements Initializable {

    @FXML
    private ComboBox designation;
    @FXML
    private TextField email;
    @FXML
    private TextField pass;
    @FXML
    private Button login;
    @FXML
    private Button signup;
    @FXML
    private Label desgLabel;
    @FXML
    private Label showMessageLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designation.getItems().addAll("Adminstrative_Officer","Ministry","Customer","Supplier","Landing_Station");
        designation.setValue("Adminstrative_Officer");
       
    }    
    
    public void loadprofile(String type, ActionEvent event) throws IOException
            {
          if(type.equals("Adminstrative_Officer"))
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("admindash.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        }
        else if(type.equals("Ministry"))
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ministryDashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("Customer"))
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("cusDash.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("Supplier"))
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("suppDash.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
          else if(type.equals("Landing_Station"));
        {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("lsDash.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
            
        }
     
     
      
    }    


    @FXML
    private void designationOnaction(ActionEvent event) {
        this.desgLabel.setText("Selected Designation is: "+ designation.getValue().toString());
    }

    @FXML
    private void loginOnaction(ActionEvent event) {
        File f = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
      
        try {
            f = new File("UserList.bin");
           
             
            if(!f.exists()){
                showMessageLabel.setText("User does not exist!!");
            }
            else{
               
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
            
                String mail = email.getText();
                int password = Integer.parseInt(pass.getText());
                String type = designation.getValue().toString();
                
                while(true){
                  
                    if(mail.equals(dis.readUTF()))
                    {
                        if(password== dis.readInt())
                        {
                            if(type.equals(dis.readUTF()))
                            {
                                 loadprofile(designation.getValue().toString(),event);
                                break;
                            }
                        }
                    }
                    //break;
                    
                    
                    
                    //outputTextArea.setText(str);
                }
                
            }
        } catch (IOException ex) {
            showMessageLabel.setText(str);
            
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
               
            }
        }
    }

    @FXML
    private void signupOnaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
}
