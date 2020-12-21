package com.pboreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    public ListView<String> listViewPesan;
    public TextField inputNama;
    public TextField inputUmur;
    public TextField inputNIM;
    public TextField inputJurusan;
    public Label LabelNama;
    public Label LabelUmur;
    public Label LabelNIM;
    public Label LabelJurusan;

    private Koneksi koneksi = new Koneksi();

    public void tampilData() {
        try {
            String query = "SELECT * FROM biodatamahasiswa";
            ResultSet hasil = koneksi.getData(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            listViewPesan.setItems(items);

            while (hasil.next()){
                items.add(hasil.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buttonNama(ActionEvent actionEvent) {
        String nama = inputNama.getText();
        LabelNama.setText(nama);

        String query ="INSERT INTO biodatamahasiswa(DatabaseMHSW) VALUES('" + nama + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }

    public void buttonUmur(ActionEvent actionEvent) {
        String umur = inputUmur.getText();
        LabelUmur.setText(umur);

        String query ="INSERT INTO biodatamahasiswa(DatabaseMHSW) VALUES('" + umur + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }

    public void buttonNIM(ActionEvent actionEvent) {
        String NIM = inputNIM.getText();
        LabelNIM.setText(NIM);

        String query ="INSERT INTO biodatamahasiswa(DatabaseMHSW) VALUES('" + NIM + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }

    public void buttonJurusan(ActionEvent actionEvent) {
        String jurusan = inputJurusan.getText();
        LabelJurusan.setText(jurusan);

        String query ="INSERT INTO biodatamahasiswa(DatabaseMHSW) VALUES('" + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }

    public void buttonKlikAllIn(ActionEvent actionEvent) {
        String nama = inputNama.getText();
        LabelNama.setText(nama);
        String umur = inputUmur.getText();
        LabelUmur.setText(umur);
        String NIM = inputNIM.getText();
        LabelNIM.setText(NIM);
        String jurusan = inputJurusan.getText();
        LabelJurusan.setText(jurusan);

        String query ="INSERT INTO biodatamahasiswa(DatabaseMHSW) VALUES('" + nama + " " + umur + " "  + NIM + " "  + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }
}

