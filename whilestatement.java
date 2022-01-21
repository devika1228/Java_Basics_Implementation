import java.util.Scanner;

public class whilestatement {

    public static void main(String[] args) {
        // java program to find the sum of positive numbers

        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }
        System.out.println("Sum= " + sum);
        input.close();

    }

}
