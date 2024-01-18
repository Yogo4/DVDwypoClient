package com.example.dvdwypoclient;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    
    @FXML
    private TableView<DataModel> dvdTable;
    @FXML
    private Button issueButton;
    @FXML
    private TableColumn<DataModel, Integer> id_dvd;
    @FXML
    private TableColumn<DataModel, String> tytul;
    @FXML
    private TableColumn<DataModel, String> rezyser;
    @FXML
    private TableColumn<DataModel, String> aktor;
    @FXML
    private TableColumn<DataModel, String> typ;
    @FXML
    private TableColumn<DataModel, Integer> ilosc;
    @FXML
    private TextField id_dvd_input;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    private Client client;
    private ObservableList<DataModel> dataModel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            client = new Client(new Socket("localhost", 1234));
            System.out.println("Connected");
            dataModel = FXCollections.observableArrayList();
            client.run(dvdTable, dataModel);
            id_dvd.setCellValueFactory(new PropertyValueFactory<>("id_dvd"));
            tytul.setCellValueFactory(new PropertyValueFactory<>("tytul"));
            rezyser.setCellValueFactory(new PropertyValueFactory<>("rezyser"));
            aktor.setCellValueFactory(new PropertyValueFactory<>("aktor"));
            typ.setCellValueFactory(new PropertyValueFactory<>("typ"));
            ilosc.setCellValueFactory(new PropertyValueFactory<>("ilosc"));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Not Connected");
        }

    }

    public void handleBorrowDVD(ActionEvent actionEvent) {

    }

}