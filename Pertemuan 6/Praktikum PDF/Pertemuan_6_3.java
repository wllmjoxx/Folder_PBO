package com.pboreg;
//harusnya nama classnya Vehicle
class Pertemuan_6_3{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Pertemuan_6_3 {
    private String modelName = "Mustang";   //car attribute
    public static void main(String[] args){

        //Create a myCar object
        Car myCar = new Car();

        //Call the honk() method (from the Pertemuan_6_3/Vehicle class) on the myCar object
        myCar.honk();

        //Display the value of the brand attribute (from the Pertemuan_6_3/Vehicle class) and the
        System.out.println(myCar.brand + " " + myCar.modelName);
    }

}
