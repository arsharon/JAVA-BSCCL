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
import javafx.scene.control.Menu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class CustomerCheckController implements Initializable {

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
    private TableView<AdminApprovesCus> tableview;
    @FXML
    private TableColumn<AdminApprovesCus, String> cusCompName;
    @FXML
    private TableColumn<AdminApprovesCus, String> cusPackageId;
    @FXML
    private Menu packages;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       cusCompName.setCellValueFactory(new PropertyValueFactory<AdminApprovesCus,String>("compname"));
       cusPackageId.setCellValueFactory(new PropertyValueFactory<AdminApprovesCus,String>("comppack"));
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
    private void viewFromCusListOnclick(ActionEvent event) {
        ObjectInputStream ois=null;
        ObservableList<AdminApprovesCus> cusList = FXCollections.observableArrayList();
         try {
            AdminApprovesCus s;
            ois = new ObjectInputStream(new FileInputStream("AdminApprovesCustomer.bin"));
            while(true){
                s = (AdminApprovesCus) ois.readObject();
                cusList.add(s);
            }
           
        } catch (Exception ex) {            
            try {
                tableview.setItems(cusList);
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
    private void packagesOnaction(ActionEvent event) {
    }
    
}
