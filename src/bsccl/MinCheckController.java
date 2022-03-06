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
public class MinCheckController implements Initializable {

    @FXML
    private Menu minHome;
    @FXML
    private Menu minInfo;
    @FXML
    private Menu minTrack;
    @FXML
    private Menu minCheck;
    @FXML
    private Menu minCom;
    @FXML
    private Menu logout;
    @FXML
    private TableView<AdminApprovesCus> tableview;
    @FXML
    private TableColumn<AdminApprovesCus, String> cusCompName;
    @FXML
    private TableColumn<AdminApprovesCus, String> cusPackageId;
    @FXML
    private TableColumn<AdminApprovesSupp, String> suppcompanyname;
    @FXML
    private TableColumn<AdminApprovesSupp, String> supptender;
    @FXML
    private TableView<AdminApprovesSupp> tableview2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cusCompName.setCellValueFactory(new PropertyValueFactory<AdminApprovesCus,String>("compname"));
       cusPackageId.setCellValueFactory(new PropertyValueFactory<AdminApprovesCus,String>("comppack"));
       
       suppcompanyname.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("suppcomp"));
       supptender.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("supptenID"));
    }    

    @FXML
    private void minHomeOnclick(ActionEvent event) {
    }

    @FXML
    private void minInfoOnclick(ActionEvent event) {
    }

    @FXML
    private void minTrackOnclick(ActionEvent event) {
    }

    @FXML
    private void minCheckOnclick(ActionEvent event) {
    }

    @FXML
    private void minComOnclick(ActionEvent event) {
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
    private void viewSupp(ActionEvent event) {
        ObjectInputStream ois=null;
        ObservableList<AdminApprovesSupp> suppList = FXCollections.observableArrayList();
         try {
            AdminApprovesSupp c;
            ois = new ObjectInputStream(new FileInputStream("AdminApprovesSupplier.bin"));
            while(true){
                c = (AdminApprovesSupp) ois.readObject();
                suppList.add(c);
            }
           
        } catch (Exception ex) {            
            try {
                tableview2.setItems(suppList);
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
