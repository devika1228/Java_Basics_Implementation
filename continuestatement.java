import java.util.Scanner;

public class continuestatement {

    public static void main(String[] args) {
        Double number, sum = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter number" + i + ": ");
            // take input
            number = sc.nextDouble();

            if (number <= 0.0) {
                continue;
            }
            sum += number;
        }
        System.out.println("Sum=" + sum);
        sc.close();
    }

}
