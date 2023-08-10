import java.util.Scanner;

public class Anything {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;

        System.out.println("\n\nWelcome To the largest Number\n\n");

              Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number .
        System.out.println("\n\nPlease enter the first number\n\n");
        num1 = scanner.nextInt();
        System.out.println("\n You Entered " + num1);

        // Prompt the user for the second number .
        System.out.println("\n\nPlease enter the second number\n\n");
        num2 = scanner.nextInt();
        System.out.println("\n You Entered " + num2);

        // Prompt the user for the third number .
        System.out.println("\n\nPlease enter the third number\n\n");
        num3 = scanner.nextInt();
        System.out.println("\n You Entered " + num3);

        System.out.println("\n The Numbers Are " + num1 + " and " + num2 + " and " + num3 );

        //Find the largest number
        largestNum =num1;

        if (num2 > largestNum) {
            largestNum = num2;
        }

        if (num3 > largestNum) {
            largestNum = num3;
        }

        //Display the largest number
        System.out.println("\nThe Largest Number Is: " + largestNum);

    }
}
