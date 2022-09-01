package com.mitra.javabasics;

public class B_Cars {
    private String make,model,color;
    private int year;
//getters
    public String getMake(){return make;}
    public String getModel(){return model;}
    public String getColor(){return color;}
    public int getYear(){return year;}

//setters
    public void setMake(String m){make=m;}
    public void setModel(String md){ model=md;  }
    public void setColor(String c){ color=c; }
    public void setYear(int y){ year=y; }

     public void moveForward(){
         System.out.println("I am moving forward");
     }
     public void moveBackward(){
         System.out.println("I am moving back word");
     }
     public void stop(){
         System.out.println("Stop");
     }
     public void turnRight(){
         System.out.println("I am turning right");
     }
     public void turnLeft(){
         System.out.println("I am turning left");
     }
     public void honk(){
        System.out.println("It is too loud");
     }



    public static void main(String[] args){

        B_Cars car = new B_Cars(); // creating object of the class


        car.setColor("Black");
        car.setMake("Toyota");
        car.setModel("Vios");
        car.setYear(2002);

        System.out.println("I have a "+car.getColor()+" "+car.getMake()+" car. "+"It was made on "+car.getYear());

        car.turnLeft();
        car.moveBackward();
        car.moveForward();
        car.turnRight();
        car.honk();
        car.stop();





    }


}
