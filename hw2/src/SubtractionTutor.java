/*
    Luke Holmes
    CS2100
    A short program to help kids learn and practice subtraction.
 */

import java.util.Scanner;
import java.util.Random;

public class SubtractionTutor {
    public static void main(String[] args) {
        System.out.println("You will supply a low value and high value, defining the range\n" +
                "of values to be included in your quiz.\n" +
                "The values must be positive and no larger than 9999\n" +
                "I will give you 5 problems.");

        // initialize a scanner instance
        Scanner input = new Scanner(System.in);

        // initialize low and high values
        int low;
        int high;

        do {
            // validate range for lower number
            do {
                System.out.print("Low end of range : ");
                low = input.nextInt();
            }while (low < 1 || low > 9999);

            // validate range for higher number
            do {
                System.out.print("High end of range : ");
                high = input.nextInt();
            }while (high < 1 || high > 9999);
            // validate that a range is specified
        }while (low == high || high < low);



        // generate instance of random object
        Random rand = new Random();


        int correct = 0;
        final int NUMBER_OF_QUESTIONS = 5;

        //loop through to generate questions
        for (int i = 0; i<NUMBER_OF_QUESTIONS; i++){
            int num1 = rand.nextInt(high - low + 1) + low;
            int num2 = rand.nextInt(high - low + 1) + low;

            // validate that answer will be positive
            if(num2 > num1){
                int transfer;
                transfer = num2;
                num2 = num1;
                num1 = transfer;
            }

            //print formatted problems
            System.out.printf("%6d\n",num1);
            System.out.printf("-%5d\n",num2);
            System.out.println(" -----");

            //calculate correct answer
            int ans = num1-num2;

            System.out.print("Answer? ");
            int userAns = input.nextInt();

            //check for correctness
            if (userAns == ans){
                System.out.println("Correct!");
                correct++;
            }
            //if wrong print correct answer
            else{
                System.out.printf("Incorrect! The answer is %d",ans);
            }

            System.out.print("\n\n\n");
        }
        System.out.println("The quiz is over");
        //display correct end statement depending on how many answers were correct
        if (correct == NUMBER_OF_QUESTIONS){
            System.out.println("Excellent! You got all 5 problems correct.");
        }
        else if (((float)correct/NUMBER_OF_QUESTIONS)>0.5){
            System.out.println("You got over half correct, practice makes perfect!");
        }
        else {
            System.out.println("You got less than half correct, you need to spend more time practicing.");
        }
    }
}