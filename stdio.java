import java.util.Scanner;

class stdio {
    public static void main(String[] args) {
        // output: println,print,printf
        System.out.println("Println");
        System.out.print("print\n");
        System.out.printf("printf\n");

        // java input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        /*
         * Getting String input
         * System.out.print("Enter text: ");
         * String myString = input.next();
         * System.out.println("Text entered = " + myString);
         */
        input.close();
    }
}