package com.pboreg;

public class multipleobjects {

    int x = 5;

    public static void main(String[] args){
        multipleobjects myObj1 = new multipleobjects();
        multipleobjects myObj2 = new multipleobjects();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
