/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author sofia
 */
public class FXMLMainMenuController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void Home(MouseEvent event) {
        this.bp.setCenter(ap);
    }

    @FXML
    private void Exit(MouseEvent event) {
        System.exit(0); //FORMA VALIDA
    }
    
    @FXML
    private void bubbleSortOnAction(ActionEvent event) {
        loadPage(getClass().getResource("FXMLBubbleSort.fxml"),bp);
    }

    @FXML
    private void elementarySortingOnAction(ActionEvent event) {
        loadPage(getClass().getResource("FXMLElementary.fxml"), bp);
    }

    @FXML
    private void quickSortOnAction(ActionEvent event) {
    }

    @FXML
    private void complexSortingOnAction(ActionEvent event) {
        loadPage(getClass().getResource("FXMLComplex.fxml"), bp);
    }
    
    @FXML
    private void improvedBubbleSortOnAction(ActionEvent event) {
         loadPage(getClass().getResource("FXMLImprovedBubbleSort.fxml"),bp);
    }

    @FXML
    private void selectionSortOnAction(ActionEvent event) {
    }

    @FXML
    private void countingSortOnAction(ActionEvent event) {
    }
    
    public static void loadPage(URL ui, BorderPane bp){
        Parent root = null;
        try {
            root = FXMLLoader.load(ui); 
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainMenuController.class.getName());
        }
        //cleaning nodes
        bp.setTop(null); bp.setCenter(null); bp.setBottom(null); 
        //bp.setLeft(null);
        bp.setRight(null);
        bp.setCenter(root);
    }
}
