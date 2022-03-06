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
public class AdminApprovesSuppController implements Initializable {

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
    private Menu tracking;
    @FXML
    private Menu logout;
    @FXML
    private TableView<AdminApprovesSupp> tableview;
    @FXML
    private TableColumn<AdminApprovesSupp, String> suppcompanyname;
    @FXML
    private TableColumn<AdminApprovesSupp, String> supptender;
    @FXML
    private TextField suppcompany;
    @FXML
    private TextField supptenderID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         suppcompanyname.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("suppcomp"));
       supptender.setCellValueFactory(new PropertyValueFactory<AdminApprovesSupp,String>("supptenID"));
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
    private void trackingOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutOnclick(ActionEvent event) {
    }

    @FXML
    private void appendSupp(ActionEvent event) {
         AdminApprovesSupp adappsupp = new AdminApprovesSupp(  
                    suppcompany.getText(),
                    supptenderID.getText()  
                );
        suppcompany.setText(null);    supptenderID.setText(null); 
        adappsupp.display();
        File f = new File("AdminApprovesSupplier.bin");
        ObjectOutputStream oos=null;
        try {
            if(f.exists())
                oos = new AppendableObjectOutputStream(new FileOutputStream(f,true));
            else
                oos = new ObjectOutputStream(new FileOutputStream(f,true));
           
            oos.writeObject(adappsupp);
            oos.close();
        } catch (Exception ex) {
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
