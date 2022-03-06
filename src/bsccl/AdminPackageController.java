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
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class AdminPackageController implements Initializable {

    @FXML
    private Menu adminHome;
    @FXML
    private Menu adminInfo;
    @FXML
    private MenuItem comMin;
    @FXML
    private MenuItem comcus;
    @FXML
    private MenuItem comCox;
    @FXML
    private MenuItem comKKT;
    @FXML
    private MenuItem approveSupp;
    @FXML
    private MenuItem approveCus;
    @FXML
    private MenuItem approvePackages;
    @FXML
    private Menu tracking;
    @FXML
    private Menu logout;
    @FXML
    private TextField packID;
    @FXML
    private TextField packBand;
    @FXML
    private TextField packPrice;
    @FXML
    private Button packSave;
    @FXML
    private Button packView;
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
    private void adminHomeOnclick(ActionEvent event) {
    }

    @FXML
    private void adminInfoOnclick(ActionEvent event) {
    }

    @FXML
    private void comWithMin(ActionEvent event) {
    }

    @FXML
    private void comWithCus(ActionEvent event) {
    }

    @FXML
    private void comCox(ActionEvent event) {
    }

    @FXML
    private void comKKT(ActionEvent event) {
    }

    @FXML
    private void approveSupp(ActionEvent event) {
    }

    @FXML
    private void approveCus(ActionEvent event) {
    }

    @FXML
    private void approvePackages(ActionEvent event) {
    }

    @FXML
    private void trackingOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutOnclick(ActionEvent event) {
    }

    @FXML
    private void packSaveOnclick(ActionEvent event) {
        AdminPackage adapppack = new AdminPackage(  
                    packID.getText(),
                    packBand.getText(),
                    packPrice.getText()
                );
        packID.setText(null);    packBand.setText(null); packPrice.setText(null);
        adapppack.display();
        File f = new File("AdminApprovesPacks.bin");
        ObjectOutputStream oos=null;
        try {
            if(f.exists())
                oos = new AppendableObjectOutputStream(new FileOutputStream(f,true));
            else
                oos = new ObjectOutputStream(new FileOutputStream(f,true));
           
            oos.writeObject(adapppack);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void packViewOnclick(ActionEvent event) {
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
