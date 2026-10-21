import java.util.Scanner;

public class AccountHealthReport {
// A Linux system processes a numeric account ID N.

// Write a Java program that:
// 1. Rejects N if it is not positive.
// 2. Counts its digits.
// 3. Calculates the sum of its digits.
// 4. Counts its odd digits.
// 5. Reverses the number.
// 6. Prints SECURE if the digit sum is even AND the reversed number is greater than the original.
// 7. Otherwise prints STANDARD.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int og = n;
        int dc = 0; // digit count
        int sum = 0; // sum count
        int odd = 0; // odd count
        int reverse = 0; // reverse count

        while (n > 0){

            dc++;
            int digit = n % 10; // last number

            if (digit % 2 != 0){
                odd++;
            }

            sum += digit;
            reverse = reverse * 10 + digit;
            n = n/10;
        }

        System.out.println("Digit Count: " + dc);
        System.out.println("Sum Count: " + sum);
        System.out.println("Odd Digits: " + odd);
        System.out.println("Reverse: " + reverse);

        if (reverse > og && sum % 2 == 0){
            System.out.println("SECURE");
        }
        else{
            System.out.println("STANDARD");
        }
    }
}
