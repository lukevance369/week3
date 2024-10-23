import java.util.Scanner; // we have to input the scanner class to create a scanner

public class Wednesday {
    public static void main(String[] args) {
        // typing psvm will create out main method for us.

        System.out.println("What is your name" + "?");

        Scanner userInput = new Scanner(System.in);

        String username = userInput.nextLine();
        System.out.println("Hello " + username + " we are in meeting 2 of week 3!");

    } // ends main method/driver
} // ends Wednesday class
