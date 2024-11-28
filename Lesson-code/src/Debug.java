import java.util.ArrayList;
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println();


//    methodCallingItself();
//    overloadHeapMemory();

        Scanner scanner = new Scanner(System.in);



        int[] myNums = {1,2,3,4,5};

        System.out.println("Please pick a number between 0-4: ");

        int userValue = scanner.nextInt();

        String name = scanner.nextLine();
        System.out.println("name " + name);

//        try catch block

        try{
            System.out.println(myNums[userValue]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Issue: please make sure the number is between 0-4");
        }

        System.out.println("After exception");





        String myName = null;

//        System.out.println(myName.charAt(0));

        ArrayList<String> myStrings = null;

//        System.out.println(myStrings.add("VAlue"));
    }


    public static void overloadHeapMemory(){
        ArrayList<String> myStrings = new ArrayList<>();

        while(true){
            myStrings.add("String keeps getting added to ArrayList");
        }
    }
    public static void methodCallingItself(){
        methodCallingItself();
    }
}
