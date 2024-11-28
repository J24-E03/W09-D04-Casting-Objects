package casting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Primitive data type conversion
        int intNum = 1000;


        long longNum = intNum;

        long longNum2;


        int intNum2 = (int)longNum;

//        Wrapper classes

        List<Integer> myNums = new ArrayList<>();

        Integer convertedNumber = Integer.parseInt("1233");

        System.out.println(convertedNumber.getClass().getSimpleName());

        String convertedBack = Integer.toString(convertedNumber);

        System.out.println(convertedBack.getClass().getSimpleName());

        System.out.println(Integer.MAX_VALUE);

//        find the heighest number in an array


        int[] nums = {10,2,3,7,100,20};
        int highestNumber = Integer.MIN_VALUE;


        for(int num : nums){
            if(highestNumber<num){
                highestNumber = num;
            }
        }

        System.out.println(highestNumber);



//        non-primitive data types

//        upcasting & downcasting

//        upcasting: done implicitly

        ArrayList<String> myStrings = new ArrayList<>();
        LinkedList<String> myLinkedList = new LinkedList<>();

        List<String> myList = myLinkedList;

        myList.add("first");
        myList.add("Second");
        myList.add("Third");
        myList.add("Fourth");

        System.out.println(myList.size());



        Object obj = myList;


//        downcasting

        Animal animal = new Cat();


//        Dog dog;
//
//        dog = (Dog)animal;
//
//        Cat cat =(Cat) ((Animal)dog);



//        System.out.println(dog);

        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            System.out.println("Animal is instance of Dog");
        }
        else if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            System.out.println("Animal is instance of Cat");
        }

        Dog dog2 = (Dog)animal;

    }
}