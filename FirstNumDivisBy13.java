import java.util.Scanner;

public class FirstNumDivisBy13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(solve(x,y));
    }

    public static int solve(int num1, int num2){
        for (int i = num1; i <= num2; i++){
            if (i % 13 == 0){
                return i;
            }
        }

        return -1;
    }
}
