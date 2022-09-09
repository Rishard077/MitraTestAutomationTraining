package com.mitra.javabasics;

public class B_Cars {
     String make = "Toyota";
     String model ="Vios";
     String color ="Black";
     int year = 2002;
     public void moveForward(){
         System.out.println("I am moving forward in my "+color+" "+make);
     }

     public void moveBackward(){
         System.out.println("I am moving back word in my "+model+" which was manufactured on "+year);
     }

     public void stop(){
         System.out.println("Please Stop your "+color+" car");
     }

     public void turnRight(){
         System.out.println("I am turning right");
     }

     public void turnLeft(){
         System.out.println("I am turning left");
     }

     public void honk(){
        System.out.println("It is too loud because it is a "+make+" car");
     }



    public static void main(String[] args){

        B_Cars car = new B_Cars(); // creating object of the class

        car.turnLeft();
        car.moveBackward();
        car.moveForward();
        car.turnRight();
        car.honk();
        car.stop();





    }


}
