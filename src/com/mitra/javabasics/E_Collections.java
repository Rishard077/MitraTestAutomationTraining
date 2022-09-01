package com.mitra.javabasics;

import java.util.*;

public class E_Collections {
    // Arrays: It can store multiple values in on e single variable


    public static void main(String[] args) {

        int[] ages = new int[5]; //- Declared an array of integers and allocated memory to store 5 elements in it
        ages[0] = 24;
        ages[1] = 30;
        ages[2] = 33;
        ages[3] = 45;
        ages[4] = 60;

        int[] ages1 = {30, 24, 33, 45, 60}; // Declare an array of integers directly assigning the values to the variables

        // Both ways of declaring can be used depending on the condition


        String[] names = new String[3];
        names[0] = "Quincy";
        names[1] = "Abbey";
        names[2] = "Kolade";

        String[] names2 = {"Jhone", "Harry", "Tom"};

        // for loop to iterate over the arrays
        System.out.println("_________print all element of ages1 using for loop______");
        for (int i = 0; i < ages1.length; i++) {
            System.out.println(ages1[i]);
        }

        System.out.println("_________print all element of names2 using for loop______");
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }

        // enhanced for loop declaration
        System.out.println("_________print all element of ages using enhanced for loop______");
        for (int a : ages) {
            System.out.println(a);
        }
        System.out.println("_________print all element of names using enhanced for loop______");
        for (String n : names) {
            System.out.println(n);
        }


        // conditional for loops
        //printing all the elements of ages array which are multiples of 2
        System.out.println("printing all the elements of ages array which is multiples of 2");
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0) {
                System.out.println(ages[i]);
            } else {
                System.out.println(ages[i] + " is not a multiple of two");
            }
        }


        //printing  the first elements of ages array which is multiples of 2
        System.out.println("printing the first element of ages array which is multiples of 2");

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] % 2 == 0) {
                System.out.println(ages[i]);
                break;
            }

        }

        // arrayList : Dynamic form of array, you can grow the size of the array dynamically
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(25);
        myNumbers.add(18);
        myNumbers.add(15);
        myNumbers.add(22);


        System.out.println("_________________Print the elements of array list myNumbers_______");
        for (int i : myNumbers) {
            System.out.println(i);
        }


        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Honda");
        car.add("Suzuki");
        car.add("Benz");

        System.out.println("_________________Print the elements of array list car_______");
        for (String c:car){
            System.out.println(c);
        }

        // Sort arrayList
        Collections.sort(myNumbers);
        System.out.println("_________________Print the elements of array list myNumbers after sorting_______");
        for (int i : myNumbers) {
            System.out.println(i);
        }

        // delete elements from array list
        System.out.println("_________________Print the elements of array list myNumbers after removing an element_______");
        myNumbers.remove(2);
        System.out.println(myNumbers);

        //access an item from the array list
        System.out.println("_________________access an item from the array list_______");
        myNumbers.get(2);
        System.out.println(myNumbers);

        // Array list vs linked List
        ArrayList<Integer> arrayList= new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // adding element to both
        for(int i=0;i<1000;i++){
            arrayList.add(i);
            linkedList.add(i);
        }

            final long startTimeLL= System.nanoTime();
            linkedList.get(100);
            final long endTimeLL=System.nanoTime();

            final long startTimeAL =System.nanoTime();
            arrayList.get(100);
            final long endTimeAL=System.nanoTime();

            long totalTimeLL =endTimeLL-startTimeLL;
            long totalTimeAL= endTimeAL-startTimeAL;
            System.out.println("Difference between Array List and Linked List when adding elements to it");
            System.out.println("Total time of execution time for Linked List: "+totalTimeLL);
            System.out.println("Total time of execution time for Array List: "+totalTimeAL);

            // Hash map
        HashMap<String,Integer> empID= new HashMap();

        empID.put("Jhone",24325);
        empID.put("Doe",12345);
        empID.put("Mark", 87654);
        empID.put("Martine", 89765);

        System.out.println(empID);

        System.out.println(empID.get("Doe"));

        System.out.println(empID.containsKey("Jhone"));





    }
}


