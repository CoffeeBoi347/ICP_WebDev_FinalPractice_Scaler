import java.util.Scanner;

public class OccurencesN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // arr size
        int c = 0; // count
        int target = 5;
        int[] arr = new int[x]; // arr

        for (int i = 0; i < x; i ++){
            arr[i] = sc.nextInt(); // fill array
        }

        for (int m = 0; m < x; m++){
            for (int n = m + 1; n < x; n++){
                if (arr[m] + arr[n] == target){
                    c += 1;
                }
            }
        }

        System.out.println(c);
    }
}
