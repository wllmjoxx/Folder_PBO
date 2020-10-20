package com.pboreg;

import jdk.swing.interop.SwingInterOpUtils;

public class modiffyatt {

    int x = 10;

    public static void main(String[] args){
        modiffyatt myObj = new modiffyatt();
        myObj.x = 25;
        System.out.println(myObj.x);
    }

}