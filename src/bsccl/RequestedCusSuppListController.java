/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class RequestedCusSuppListController implements Initializable {

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
    private Button viewRequestedCustomer;
    @FXML
    private Button viewRequestedSupplier;
    @FXML
    private TextArea requestedList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void viewRequestedCustomerOnclick(ActionEvent event) {
      requestedList.setText("");
        File file = new File("Requested_Customer.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            requestedList.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                requestedList.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @FXML
    private void viewRequestedSupplierOnclick(ActionEvent event) {
         requestedList.setText("");
        File file = new File("Requested_Supplier.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            requestedList.setText(null);
            //adminCusTextArea.appendText("");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(".");
                requestedList.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
