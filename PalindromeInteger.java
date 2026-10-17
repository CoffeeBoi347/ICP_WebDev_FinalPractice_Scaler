import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;

        while (n > 0){
            int modulo = n % 100;
            reversed *= 10 + modulo;
            n /= 10;
        }

        if (original == reversed){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
    }
}
