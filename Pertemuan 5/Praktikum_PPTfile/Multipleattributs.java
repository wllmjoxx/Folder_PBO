package com.pboreg;

public class Multipleattributs {

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Multipleattributs myObj = new Multipleattributs();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
