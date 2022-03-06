/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class AdmininfoController implements Initializable {

    @FXML
    private Menu adminHome;
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
    private Menu adminInfo;
    @FXML
    private TextArea infoField;

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
    private void adminInfoOnclick(ActionEvent event) {
    }

    @FXML
    private void readCoxLSinfoOnclick(ActionEvent event) throws Exception {
 
       File file = new File("CoxLSinfo.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            infoField.setText(null);
            infoField.appendText("Information of CoxBazar Landing Station:\n");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(",");
                infoField.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @FXML
    private void readKktLSinfoOnclick(ActionEvent event) {
        File file = new File("KktLSinfo.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            infoField.setText(null);
            infoField.appendText("Information of Kuakata Landing Station:\n");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(",");
                infoField.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @FXML
    private void readCoxSubInfoOnclick(ActionEvent event) {
        File file = new File("CoxSubInfo.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            infoField.setText(null);
            infoField.appendText("Information of CoxBazar Submarine Cable(SEA-ME-WE 4):\n");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(",");
                infoField.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @FXML
    private void readKktSubInfoOnclick(ActionEvent event) {
        File file = new File("KktSubInfo.txt");
        Scanner sc; String str=null;  String[] tokens;
        try {
            sc = new Scanner(file);
            infoField.setText(null);
            infoField.appendText("Information of Kuakata Submarine Cable(SEA-ME-WE 5):\n");
            while(sc.hasNextLine()){
                str=sc.nextLine();
                tokens = str.split(",");
                infoField.appendText(str+"\n");             
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdmininfoController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
  }

    

