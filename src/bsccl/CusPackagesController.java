/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class CusPackagesController implements Initializable {

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
    private Menu packages;
    @FXML
    private Menu logout;
    @FXML
    private Button seepackage;
    @FXML
    private TableView<AdminPackage> tableview;
    @FXML
    private TableColumn<AdminPackage, String> packIDadmin;
    @FXML
    private TableColumn<AdminPackage, String> packBandadmin;
    @FXML
    private TableColumn<AdminPackage, String> packPriceadmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        packIDadmin.setCellValueFactory(new PropertyValueFactory<AdminPackage,String>("packIdAd"));
        packBandadmin.setCellValueFactory(new PropertyValueFactory<AdminPackage,String>("packBan"));
        packPriceadmin.setCellValueFactory(new PropertyValueFactory<AdminPackage,String>("packPr"));
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
    private void packagesOnaction(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void seepackageOnclick(ActionEvent event) {
        ObjectInputStream ois=null;
        ObservableList<AdminPackage> packList = FXCollections.observableArrayList();
         try {
            AdminPackage c;
            ois = new ObjectInputStream(new FileInputStream("AdminApprovesPacks.bin"));
            while(true){
                c = (AdminPackage) ois.readObject();
                packList.add(c);
            }
           
        } catch (Exception ex) {            
            try {
                tableview.setItems(packList);
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
    }
    
}
