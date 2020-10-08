package com.pboreg;

public class IF_ELSEMethod {
    static void checkage(int age){
        if(age<18){
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args){
        checkage(12);
        checkage(20);
        checkage(18);
    }
}
