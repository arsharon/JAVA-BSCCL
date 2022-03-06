/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class CusProfileController implements Initializable {

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
    private TableView<Profile> tableView;
    @FXML
    private TableColumn<Profile, String> email;
    @FXML
    private TableColumn<Profile, String> pass;
    @FXML
    private TableColumn<Profile, String> phn;
    @FXML
    private TableColumn<Profile, String> address;
    @FXML
    private TableColumn<Profile, String> compname;
    @FXML
    private Menu packages;
    @FXML
    private TextField proEmail;
    @FXML
    private TextField proPass;
    @FXML
    private TextField proPhn;
    @FXML
    private TextField proComp;
    @FXML
    private TextField proAdd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       email.setCellValueFactory(new PropertyValueFactory<Profile,String>("compEmail"));
       pass.setCellValueFactory(new PropertyValueFactory<Profile,String>("compPass"));
       phn.setCellValueFactory(new PropertyValueFactory<Profile,String>("compPhn"));
       address.setCellValueFactory(new PropertyValueFactory<Profile,String>("compAddress"));
       compname.setCellValueFactory(new PropertyValueFactory<Profile,String>("compName"));
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
    private void updatetOnAction(ActionEvent event) {
        ObjectInputStream ois=null;
        ObservableList<Profile> cusList = FXCollections.observableArrayList();
         try {
            Profile s;
            ois = new ObjectInputStream(new FileInputStream("CustomerProfile.bin"));
            while(true){
                s = (Profile) ois.readObject();
                cusList.add(s);
            }
           
        } catch (Exception ex) {            
            try {
                tableView.setItems(cusList);
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
    }

    @FXML
    private void profileUpdateOnclick(ActionEvent event) {
        Profile adappcuss = new Profile(  
                    proEmail.getText(),
                    proPass.getText(),
                    proPhn.getText(),
                   proComp.getText(),
                   proAdd.getText()
                    
                );
        proEmail.setText(null);    proPass.setText(null); proPhn.setText(null); proComp.setText(null); proAdd.setText(null);
        adappcuss.display();
        File f = new File("CustomerProfile.bin");
        ObjectOutputStream oos=null;
        try {
            if(f.exists())
                oos = new AppendableObjectOutputStream(new FileOutputStream(f,true));
            else
                oos = new ObjectOutputStream(new FileOutputStream(f,true));
            oos.writeObject(adappcuss);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void packagesOnaction(ActionEvent event) {
    }

    
    
}
