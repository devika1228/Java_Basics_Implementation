import java.util.Scanner;

class methods {

    // create a method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enterntwo numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        methods obj = new methods();

        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

    }
}