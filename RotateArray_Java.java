import java.util.*;

public class RotateArray_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // array
        int y = sc.nextInt(); // cycles

        int[] arr = new int[x];
        for (int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
        }

        if (x > 0){
            for (int i = 0; i < y; i++){
                int temp = arr[x - 1];
                
                for (int j = x-1; j > 0; j--){
                    arr[j] = arr[j-1];
                }

                arr[0] = temp;
            }
        }

        for (int k = 0; k < x; k++){
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}
