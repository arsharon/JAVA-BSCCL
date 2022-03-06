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
public class SuppCheckController implements Initializable {

    @FXML
    private Menu suppHome;
    @FXML
    private Menu suppPerformance;
    @FXML
    private Menu suppBid;
    @FXML
    private Menu suppTender;
    @FXML
    private Menu suppSupport;
    @FXML
    private Menu suppProfile;
    @FXML
    private Menu suppCheck;
    @FXML
    private Menu logout;
    @FXML
    private TableView<AdminApprovesSupp> tableview;
    @FXML
    private TableColumn<AdminApprovesSupp, String> suppcompanyname;
    @FXML
    private TableColumn<AdminApprovesSupp, String> supptender;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        suppcompanyname.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("suppcomp"));
       supptender.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("supptenID"));
    }    

    @FXML
    private void suppHomeOnaction(ActionEvent event) {
    }

    @FXML
    private void suppPerformanceOnaction(ActionEvent event) {
    }

    @FXML
    private void suppBidOnaction(ActionEvent event) {
    }

    @FXML
    private void suppTenderOnaction(ActionEvent event) {
    }

    @FXML
    private void suppSupportOnaction(ActionEvent event) {
    }

    @FXML
    private void suppProfileOnaction(ActionEvent event) {
    }

    @FXML
    private void suppCheckOnaction(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void viewFromSuppApproveOnclick(ActionEvent event) {
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
                tableview.setItems(suppList);
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
