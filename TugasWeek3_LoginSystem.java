package com.pboreg;
import java.util.Scanner;
import java.lang.String;

public class TugasWeek3_LoginSystem {
    public static void main(String[] args){
        String pass_ok = "admin2", user_ok = "admin1";
        String userinput, passinput;

        Scanner keyboard = new Scanner(System.in);
        ulang:
        System.out.printf("            =======SELAMAT DATANG=======\n");
        System.out.printf("Silahkan masukan Username dan Password anda!\n");

        System.out.println("Username: ");
        userinput = keyboard.nextLine();

        System.out.println("Password: ");
        passinput = keyboard.nextLine();

        if((userinput == user_ok) && (passinput == pass_ok)){
            System.out.printf("Selamat datang di beranda");
            System.out.printf("1. Home");
            System.out.printf("2. Dashboard");
            System.out.printf("3. Callendar");
            System.out.printf("4. My profile");
        }else {
            System.out.println("Silahkan login kembali");
            goto ulang;
        }
    }
}
