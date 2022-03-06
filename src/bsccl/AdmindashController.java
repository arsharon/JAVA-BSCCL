/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsccl;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author Adnan Rahman Sharon
 */
public class AdmindashController implements Initializable {

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
    private MenuItem tracking;
    @FXML
    private ImageView dashimage;
    @FXML
    private TextArea dashtext;
    @FXML
    private Button logout;
    @FXML
    private MenuItem adminInfo;
    @FXML
    private MenuItem approvePackages;
    @FXML
    private MenuItem reqUsers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Image image = new Image("/images/1.jpg");
        dashimage.setImage(image);
        
        String text = new String("Company History :::\n" +
"Bangladesh Submarine Cable Company Limited (BSCCL) is a Core Telecommunications service provider and International \n Submarine Cable Operator of Bangladesh.It is also an IIG (International Internet Gateway). The service provided by BSCCL represents the \n Long-haul communication between Bangladesh and the rest of the world. The Company \n emerged in July 2008 as a public limited company under the Posts and Telecommunications Division of Posts, Telecommunications, and Information \n Technology Ministry, Government of Bangladesh. BSCCL is a party \n in both SMW-4 and SMW-5 Consortiums \n that provide more capacity and redundancy in Submarine Cables for Bangladesh. BSCCL-IIG is helping the \n  people of the Country to get broadband Internet at a cheaper rate \n and better quality of service. BSCCL is one of the growing companies in the Telecom sector of Bangladesh.\n It is a leading company for the implementation of National ILDTS & ICT policies to develop modern tele-network and high-speed Broadband \n Internet in Bangladesh. The submarine cable network is expected to be the main telecommunications infrastructure for “Digital Bangladesh” by the year 2021 and BSCCL is \n certainly going to play a major role. By providing high capacity fiber optic submarine cable bandwidth and state of the art Internet Transit facilities, BSCCL is effectively \n connecting the people to the “Information Super Highway”.\n" +
"\n" +
"During the visit of Honorable Prime Minister of India, Shri Narendra Modi to \n Bangladesh on 6th June 2015, in the presence of Honorable Prime Ministers \n of India and Bangladesh, Managing Director of BSCCL and BSNL signed the 10Gbps IP bandwidth export agreement for Tripura State, India and under this agreement, \n BSCCL has started to export 10Gbps IP Bandwidth to Tripura from 8th February,2016. On 23rd March, 2016, Honorable Prime Minister of India and \n Bangladesh inaugurated the program through video conferencing.\n" +
"\n" +
"The Bangladesh Submarine Cable Company signed the agreement with SMW-5 Consortium in 2014 \n and ensures the ownership of the country's second submarine \n cable, which on 10th September-2017, Honorable Prime Minister of Bangladesh, Sheikh Hasina inaugurated the \n SEA-ME-WE-5 cable system through video conferencing.");
           dashtext.setText(text);
    }    
    

    


    @FXML
    private void comWithMin(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("adminComMin.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        
        
    }

    @FXML
    private void comWithCus(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("adminComCus.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void comCox(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("adminComLS.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void comKKT(ActionEvent event) throws IOException  {
        Parent root = FXMLLoader.load(getClass().getResource("adminComLS.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void approveSupp(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("adminApprovesSupp.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void approveCus(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("adminApprovesCus.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void trackingOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("adminViewWork.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void logoutOnclick(ActionEvent event) throws IOException {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation Alert");
        a.setHeaderText("Confirm your opinion...");
        a.setContentText("Are you sure to LOGOUT ?");
                
        Optional<ButtonType> result = a.showAndWait();
        if(result.get() == ButtonType.OK){
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        }
        else{
            //show appropriate cancellation message
            showCustomInformationAlert("The task is cancelled!"); 
        }
    }

    @FXML
    private void adminInfoOnclick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("admininfo.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void approvePackages(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("adminPacks.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        
    }

   

    @FXML
    private void adminHomeOnclick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("admindash.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
        
    }

    private void showCustomInformationAlert(String str) {
         Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(str);
        a.showAndWait();   
    }

    @FXML
    private void reqUsersOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("requestedCusSuppList.fxml"));
        
        Scene scene2 = new Scene(root);
        //stage.setScene(scene2);
        Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }


    
}
