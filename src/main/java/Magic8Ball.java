import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {


        // 2. Get the user to enter a question for the magic 8-ball to answer
        //    Scanner scanner = new Scanner(System.in);
        //    String userQuestion = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("The Magic 8 Ball knows all! Think of a question you would like answered.");
        System.out.print("Now, enter a number from 0 to 15 to learn your future: ");
        String userQuestion = scanner.nextLine();


        // 3. Make a variable and initialize it to a random number.
        //    // Get random a number from: [0, 1, 2, 3]
        //    int randNumber = new Random().nextInt(4);
        int randNumber = new Random().nextInt(16);
        String response = "";

        // create if statements for the responses
        if (randNumber == 0) {
            response = "It is certain";
        } else if (randNumber == 1) {
            response = "It is decidedly so";
        } else if (randNumber == 2) {
            response = "Reply is hazy, try again";
        }  else if (randNumber == 3) {
            response = "Yes, definitely";
        } else if (randNumber == 4) {
            response = "Don't count on it";
        } else if (randNumber == 5) {
            response = "My sources say no";
        }else if (randNumber == 6) {
            response = "Cannot predict now";
        } else if (randNumber == 7) {
            response = "Signs point to yes";
        } else if (randNumber == 8) {
            response = "You may rely on it";
        } else if (randNumber == 9) {
            response = "Better not tell you now";
        } else if (randNumber == 10) {
            response = "Ask again later";
        } else if (randNumber == 11) {
            response = "Very doubtful";
        } else if (randNumber == 12) {
            response = "Outlook is good";
        } else if (randNumber == 13) {
            response = "Concentrate and ask again";
        } else if (randNumber == 14) {
            response = "Most likely";
        } else if (randNumber == 15) {
            response = "Without a doubt";
        } else if (randNumber >= 16) {
            response = "8-BALL ERROR, Try again!";
        }
        System.out.println("Magic 8-Ball says: " + response);


    }
}


