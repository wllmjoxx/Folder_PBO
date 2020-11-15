package com.pboreg;
//Class Abstract
import java.util.Scanner;

abstract class ProgramLdanS{
    public double inpAlasSegi, inpTinggiSegi, inpDiameter;
    //Abstract Method (tidak memiliki body atau tidak memiliki isi dari method)

    public abstract double rumus();

    //Regular Method
    public void setInpAlasSegi(double inpAlasSegi){
            this.inpAlasSegi = inpAlasSegi;
    }
    public double getInpAlasSegi(){
        return inpAlasSegi;
    }
    public void setInpTinggiSegi(double inpTinggiSegi){
        this.inpTinggiSegi = inpTinggiSegi;
    }
    public double getInpTinggiSegi() {
        return inpTinggiSegi;
    }



    public void setInpDiameter(double inpDiameter){
        this.inpDiameter = inpDiameter;
    }
    public double getInpDiameter() {
        return inpDiameter;
    }
}

//Subclass (turunan dari Class Hewan)
class segi extends ProgramLdanS{


    public double rumus(){
        double resultS = this.inpAlasSegi * this.inpTinggiSegi / 2;
        return resultS;
    }

}


class lingka extends ProgramLdanS{
    public double rumus(){
        double resultL = (3.14 * ((this.inpDiameter/2) * (this.inpDiameter/2)));
        return resultL;
    }
}


public class Main {

    public static void main(String[] args) {

        segi segitigaMy = new segi();

        Scanner inputLuasTinggiDia = new Scanner(System.in);
        System.out.println("Masukan alas Segitiga : ");
        segitigaMy.inpAlasSegi = inputLuasTinggiDia.nextDouble();
        segitigaMy.setInpAlasSegi(segitigaMy.inpAlasSegi);

        System.out.println("Masukan tinggi Segitiga : ");
        segitigaMy.inpTinggiSegi = inputLuasTinggiDia.nextDouble();
        segitigaMy.setInpTinggiSegi(segitigaMy.inpTinggiSegi);

        segitigaMy.rumus();

        System.out.println("Luas segitiga dengan data : " + " \nAlas : " + segitigaMy.getInpAlasSegi() + " & " + "Tinggi : " + segitigaMy.getInpTinggiSegi() + " \nAdalah : " + segitigaMy.rumus());







        lingka lingkaranMy = new lingka();
        System.out.println("Masukan diameter lingkaran : ");
        lingkaranMy.inpDiameter = inputLuasTinggiDia.nextDouble();
        lingkaranMy.setInpDiameter(lingkaranMy.inpDiameter);

        lingkaranMy.rumus();

        System.out.println("Luas lingkaran dengan data :" + "\nDiameter : " + lingkaranMy.getInpDiameter() + " \nAdalah : " + lingkaranMy.rumus());

    }
}
