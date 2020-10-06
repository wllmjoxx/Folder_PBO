package com.pboreg;

public class Main {
	static String[] cars = {"VOLVO", "BMW", "MERCEDES BENZ", "TOYOTA", "MITSUBISHI"};//jika ingin di atas public sttic void main deklarasinya maka harus ditambahkn static di belakangnya
    public static void main(String[] args) {
	for (int i = 0; i<=10; i = i + 2){
	    System.out.println(i);
	    }
	System.out.printf("\n\n");
	for (int i = 0;i < 5;i++){
		System.out.println(i);
		}
	System.out.printf("\n\n");
	String[] cars = {"VOLVO", "BMW", "MERCEDES BENZ", "TOYOTA", "MITSUBISHI"};
	for (String i : cars){
		System.out.println(i);
		}
    }
}
