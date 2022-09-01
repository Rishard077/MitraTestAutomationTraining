package com.mitra.javabasics;

public class C_DataTypes {

    String letters= "abcd";
    int numbers= 1234;
    double decimals =1.99;
    char letter= 'a';
    boolean male= true;
    boolean female= false;
    String firstName,lastName,address;
    static int age;
    double height;
    char initial;
    boolean isSriLankan;

    public String getFirstName() {
        return firstName;}
    public String getLastName() {
        return  lastName;}
    public String getAddress() {
        return address; }
    public int getAge(){return age;}
    public double getHeight(){return height;}
    public char getInitial(){return initial;}
    public boolean isSriLankan(){return isSriLankan;}


    public void setAge(int a){age=a;}
    public void setFirstName(String fn){firstName=fn;}
    public void setLastName(String ln){lastName=ln;}
    public void setAddress(String a){address=a;}
    public void setIsSrilankan(boolean is){ isSriLankan=is;
    }
    public void setInitial(char i){initial=i;}
    public void setHeight(double h){height=h;}



    public static void main(String[] args){

        C_DataTypes d= new C_DataTypes();


        d.setFirstName("Jhone");
        d.setLastName("Doe");
        d.setAge(25);
        d.setAddress("Colombo 10");
        d.setIsSrilankan(true);
        d.setInitial('M');
        d.setHeight(167.67);


        System.out.println("My name is "+d.getFirstName()+" "+d.getLastName());
        System.out.println("I am "+d.getAge()+" years old");
        System.out.println("I live in "+d.getAddress());
        System.out.println("My grand father's name starts with "+d.getInitial());
        System.out.println("I am "+d.getHeight()+"CM tall");

        if (d.isSriLankan==true){
            System.out.println("Yes I am a Sri Lankan");
        }
        else { System.out.println("Sorry I am Not");}




    }



}
