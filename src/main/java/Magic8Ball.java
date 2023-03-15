import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The Magic 8 Ball knows all! Think of a question you would like answered (Yes or No Questions Only Please).");
        System.out.print("Ask your question:");
        String userQuestion = scanner.nextLine();

        int randNumber = new Random().nextInt(16);
        String response = "";

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
        } else {
            response = "8-BALL ERROR, Try again!";
        }
        System.out.println();
        System.out.println("Your question was: " + userQuestion);
        System.out.println("Magic 8-Ball says: " + response);


    }
}


