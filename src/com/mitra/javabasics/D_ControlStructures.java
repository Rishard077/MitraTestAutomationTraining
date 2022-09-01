package com.mitra.javabasics;

import java.util.Scanner;

public class D_ControlStructures {

    int age, day, i, next;

    public void next() {
        Scanner scan = new Scanner(System.in);
        System.out.println("        Please type any number here to move forward");
        next = scan.nextInt();

    }

    public void enterAgeInConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your age :");
        age = scan.nextInt();
    }

    public void enterDateInConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter day (1 to 7) :");
        day = scan.nextInt();
    }

    public void ifElsStatement() {
        if (age > 15) {
            System.out.println("You are eligible to register to the website");
        } else {
            System.out.println("Sorry you are not allowed to register to the website");
        }
    }

    public void elseIf() {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }

    public void switchDay() {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

    }


    public void whileLoop() {
        i = 0;
        while (i < 5) {
            System.out.print(i);
            i++;
        }
    }

    public void doWhileLoop() {
        i = 0;
        do {
            System.out.print(i);
            i++;
        }
        while (i < 10);
    }

    public void forLoop() {

        for (i = 0; i > -10; i--) {
            System.out.print(i);
        }
    }



    public static void main(String[] args) {

        D_ControlStructures d = new D_ControlStructures();

        //if ,else statement
        System.out.println("______________________________if else______________");
        d.enterAgeInConsole();
        d.ifElsStatement();

        d.next();

        //if , else if , else statement
        System.out.println("___________________if,els if_____________");
        d.enterDateInConsole();
        d.elseIf();

        d.next();


        // switch
        System.out.println("__________________Switch_____________________");
        d.enterDateInConsole();
        d.switchDay();

        d.next();


        //for loop
        System.out.println("___________For Loop______________________");
        d.forLoop();

        d.next();


        //while loop
        System.out.println("_________While loop______________________");
        d.whileLoop();

        d.next();


        // Do while loop
        System.out.println("______________DO While Loop______________");
        d.doWhileLoop();


    }
}
