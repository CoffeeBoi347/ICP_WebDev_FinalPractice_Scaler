import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // rows
        int y = sc.nextInt(); // cols
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isUpperTriangular = true;

        for (int m = 0; m < x; m++){
            for (int n = 0; n < y; n++){
                if (m > n && arr[m][n] != 0){
                    isUpperTriangular = false;
                    break;
                }
            }

            if (!isUpperTriangular){
                break;
            }
        }

        sc.close();

        System.out.println(isUpperTriangular);
    }
}
