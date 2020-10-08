package com.pboreg;

public class Parameter {
    static void myMethod(String lname) {
        System.out.println(lname + " " + "Jeora");
    }
    static void myMethod(String lname, int umur) {
        System.out.println(lname + " Jeora" + " is " + umur);
    }
    static void enterbutton(){
        System.out.print("\n");
    }


    public static void main(String[] args){
        myMethod("Clarissa");
        myMethod("Hanna");
        myMethod("Reys");
        enterbutton();
        myMethod("Clarissa", 5);
        myMethod("Hanna", 6);
        myMethod("Reys", 10);
    }

}
