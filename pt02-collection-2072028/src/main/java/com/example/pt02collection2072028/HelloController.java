package com.example.pt02collection2072028;

import com.example.pt02collection2072028.model.DataMahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    public TextField inputNRP1;
    public TextField inputNama;
    public Button btnInsert;
    public TextField inputNRP2;
    public Button btnDelete;
    public TableView table;
    public TableColumn column1;
    public TableColumn column2;

    private ObservableList<DataMahasiswa> oList;

    public void initialize() {
        oList = FXCollections.observableArrayList(
                new DataMahasiswa(1, "Shriek"),
                new DataMahasiswa(2, "Spiderman"),
                new DataMahasiswa(3, "Venom"),
                new DataMahasiswa(4, "Carnage"),
                new DataMahasiswa(5, "Green Goblin"),
                new DataMahasiswa(6, "Black Cat"),
                new DataMahasiswa(7, "Shocker"),
                new DataMahasiswa(8, "Mysterio")
        );
        table.setItems(oList);
        column1.setText("NRP");
        column1.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, Integer>("nrp"));
        column2.setText("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, String>("nama"));
    }

    @FXML
    protected void onHelloButtonClick() {

    }

    public void insertStudent(ActionEvent actionEvent) {
        oList.add(new DataMahasiswa(Integer.parseInt(inputNRP1.getText()),
                inputNama.getText()));
    }

    public void deleteStudent(ActionEvent actionEvent) {
        oList.forEach((data) -> {
            if(data.getNrp() == Integer.parseInt(inputNRP2.getText())) {
                int idx = oList.indexOf(data);
                oList.remove(oList.get(idx));
                table.setItems(oList);
            }
        });
    }
}