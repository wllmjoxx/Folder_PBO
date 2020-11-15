package com.pboreg;

import java.util.Scanner;
interface rumusall {

    public void setSisi(double... sisi);
    public double formula();
}
class segitiga implements rumusall{

    private double inputAlasSegi, inputTinggiSegi;

    @Override
    public void setSisi(double... sisi) {
        this.inputAlasSegi = sisi[0];
        this.inputTinggiSegi = sisi[1];
    }

    @Override
    public double formula() {
        double resultS = this.inputAlasSegi * this.inputTinggiSegi / 2;
        return resultS;
    }

    public double getInputAlasSegi() {
        return inputAlasSegi;
    }

    public double getInputTinggiSegi() {
        return inputTinggiSegi;
    }
}
class lingkaran implements rumusall{

    public double inputDiameter;

    @Override
    public void setSisi(double... sisi) {
        this.inputDiameter = sisi[0];
    }

    @Override
    public double formula() {
        double resultL = (3.14 * ((this.inputDiameter/2) * (this.inputDiameter/2)));
        return resultL;
    }

    public double getInputDiameter() {
        return inputDiameter;
    }
}
public class Main1 {

    public static void main(String[] args){
        segitiga segi = new segitiga();
        segi.setSisi(10.20);
        System.out.println("Luas segitiga = 0.5 x " + segi.getInputAlasSegi() + " x " + segi.getInputTinggiSegi() + " = ");

        lingkaran lingka = new lingkaran();
        lingka.setSisi(10);
        System.out.println("Luas lingkaran = " + lingka.getInputDiameter());
    }
}

