package com.pboreg;

import java.util.Scanner;

public class Pertemuan_6_2_1 {

    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age, and salary : ");

    //String input
    String name = myObj.nextLine();

    //Numerical input
    int age = myObj.nextLine();
    double salary = myObj.nextLine();

    //Output input by user
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Salary : " + salary);
}
