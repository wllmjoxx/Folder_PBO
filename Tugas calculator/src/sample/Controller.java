package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField nilaiA;
    public TextField nilaiB;
    public Label hasilAkhir;

    public void tambah(ActionEvent actionEvent) {
        double hasil;
        double nilai1= Double.parseDouble(nilaiA.getText());
        double nilai2= Double.parseDouble(nilaiB.getText());
        hasil = nilai1 + nilai2;
        hasilAkhir.setText(nilai1 + " + " + nilai2 + " = " + hasil);
    }

    public void kurang(ActionEvent actionEvent) {
        double hasil;
        double nilai1= Double.parseDouble(nilaiA.getText());
        double nilai2= Double.parseDouble(nilaiB.getText());
        hasil = nilai1 - nilai2;
        hasilAkhir.setText(nilai1 + " - " + nilai2 + " = " + hasil);
    }

    public void kali(ActionEvent actionEvent) {
        double hasil;
        double nilai1= Double.parseDouble(nilaiA.getText());
        double nilai2= Double.parseDouble(nilaiB.getText());
        hasil = nilai1 * nilai2;
        hasilAkhir.setText(nilai1 + " x " + nilai2 + " = " + hasil);
    }

    public void bagi(ActionEvent actionEvent) {
        double hasil;
        double nilai1= Double.parseDouble(nilaiA.getText());
        double nilai2= Double.parseDouble(nilaiB.getText());
        hasil = nilai1 / nilai2;
        hasilAkhir.setText(nilai1 + " / " + nilai2 + " = " + hasil);
    }
}
