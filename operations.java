import javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer;

class operations {
    public static void main(String[] args) {
        // declare variables
        int a = 12, b = 5;

        // Arithmetic operators
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));

        // logical operators
        System.out.println((5 > 3) && (8 > 5));// (5 > 3) && (8 > 5) returns true because both (5 > 3) and (8 > 5) are
                                               // true.

        System.out.println((5 > 3) || (8 > 5)); // (5 < 3) || (8 > 5) returns true because the expression (8 > 5) is
                                                // true

        System.out.println(!(8 == 5));

        // Increment and decrement ops
        int c = 12, d = 12;
        int r1, r2;

        System.out.println("Value of a: " + c);// original value

        r1 = ++c;
        System.out.println("pre increment c=" + r1);

        r2 = d++;
        System.out.println("post incremrnt d=" + r2);

        // java instanceof Operator

        String str = "Programiz";
        boolean result;

        result = str instanceof String;
        System.out.println("Is str an object of string? " + result);

        // ternary operator: syntax: variable=Expression?exp1:exp2

        int februaryDays = 29;
        String result1;

        result1 = (februaryDays == 29) ? "Not a leap year" : "Leap year";
        System.out.println(result1);
    }
}