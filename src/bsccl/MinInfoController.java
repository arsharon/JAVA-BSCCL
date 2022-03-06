/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class MinInfoController implements Initializable {

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
    private TextArea infoField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void readCoxLSinfoOnclick(ActionEvent event) {
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
