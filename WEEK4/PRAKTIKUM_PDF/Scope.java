package com.pboreg;

public class Scope {
    public static void main(String[] args){
        // code here cannot use x

        {   // this  is a block

            // code here cannot use x

            int x=100;

            // code here can use x
            System.out.println(x);

        } // the blocks ends here

        // code here cannot use x
    }
}
