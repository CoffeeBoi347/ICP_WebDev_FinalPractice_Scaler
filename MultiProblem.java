
import java.util.Scanner;

public class MultiProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int sumEven = 0;
        int digitCount = 0;
        int s = 0;

        while (x > 0) {
            int digit = x % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            }

            digitCount++;
            s = s * 10 + digit;
            x = x / 10;
        }

        System.out.println("Sum of even digits: " + sumEven);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Reversed number: " + s);
    }
}
