package com.pboreg;

public class MethodOverloading1 {
    /*belum method overloading
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }*/
    //SUDAH method overloading
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.3, 6.26);
        //double myNum2 = plusMethod(8, 6.26);
        /* WALAUPUN 8 ANGKA BULAT DIMASUKAN KE
        DOUBLE AKAN TETAP BISA DI PROSES TETAPI DI CONVERT JADI 8.0*/
        System.out.println("int = " + myNum1);
        System.out.println("double = " + myNum2);
    }


}
