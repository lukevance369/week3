import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args) {

        /*
        the program asks for the user's age and uses an if statement to categorize them
        as either a child, teenager, adult, or senior
         */

        // create a new scanner object

        Scanner scnr = new Scanner(System.in);


        // TODO: include a new condition if the user is exactly 19
        // TODO: print (wellcome to adult hood
        // ask the user their age
        System.out.println("How old are you?");
        int age = scnr.nextInt();

        // Now that I have user age, lets do some logic

        if (age < 13 && age >=0){
            System.out.println("You are a child");
        } // Ends if age <13

        else if (age >= 13 && age < 18){
            System.out.println("You are an teenager");
        } // Ends our teenage

        else if (age == 18) {
            System.out.println("Welcome to Adulthood!");

        }

        else if (age >18 && age <65){
            System.out.println("You are an adult");
        } // Ends our adult

        else if (age >=65) {

            System.out.println("You are an senior");
        } // Ends our else

        else {
            System.out.println("your gave an invalid input, ERROR< ERROR< ERROR< ");
        }


    }// ends main method/driver
} // ends AgeChecker class
