import java.util.Scanner; // we have to input the scanner class to create a scanner
public class Main {
    public static void main(String[] args) {

        int x=9;

        System.out.println("Good morning today is September " + x + "th");
        // 1 we need to create a new scanner object
        Scanner kbInput = new Scanner(System.in);
        //2 we need to ask the user a question.
        System.out.println("Enter the calendar day: ");
        //3 create int variable that will hold the day the user types in.
        int userDay = kbInput.nextInt();
        String ending;
        if (userDay == 1 || userDay== 21 || userDay ==31) {
            ending = "st";
        } // ends if date ends with 1
        else if (userDay == 2 || userDay== 22 || userDay == 32) {
            ending = "nd";
        } // ends 2nd
        else if (userDay == 3 || userDay== 23 || userDay == 33) {
            ending = "rd";
        }// ends 3rd
        else {
            ending = "th";
        }



        System.out.println("Good morning you typed in September " + userDay + ending);
        // ask user age and print it out
        System.out.println("What is your age?");
        int userAge = kbInput.nextInt();
        System.out.println("User age is: " + userAge);

    } // ends out mean method/driver
} // ends our main class