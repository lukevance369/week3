import java.util.Scanner; // we have to input the scanner class to create a scanner
public class UserInputDemoString {
    // typing psvm will create out main method for us.
    public static void main(String[] args) {
       // to ask the user their name and print it out
        System.out.println("What is your name" + "?");

        Scanner userInput = new Scanner(System.in);

        String username = userInput.nextLine();
        System.out.println("User name is: " + username);

    } // ends out main method/driver
} // ends the UserInputDemoString
