import java.util.Arrays;

public class cpyrangemethod {

    public static void main(String[] args) {

        int[] source = { 2, 3, 12, 4, 12, -2 };

        // copying entire source arr to destination
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1=" + Arrays.toString(destination1));

        // copying from index 2 to 5(5 is not included)

    }

}
