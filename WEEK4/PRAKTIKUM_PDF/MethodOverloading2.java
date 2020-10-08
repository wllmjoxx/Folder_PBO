package com.pboreg;

public class MethodOverloading2 {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }
    static String plusMethod(String x, String y){
        String hasil = x + " " + y; //variable local

        return hasil;
    }
    static String plusMethod(String x, int y){
        String hasil = "Nama " + x + ", umur " + y + " tahun";
        return hasil;
    }
    public static void main(String[] args){

        int nilai1 = plusMethod(8,5);
        double nilai2 = plusMethod(4.3,6.26);
        String nilai3 = plusMethod("William", "Jonathan");
        String nilai4 = plusMethod("Andi", 17);
        System.out.println("Nilai int = " + nilai1);
        System.out.println("Nilai double = " + nilai2);
        System.out.println("Nilai string = " + nilai3);
        System.out.println("keterangan = " + nilai4);
    }
}