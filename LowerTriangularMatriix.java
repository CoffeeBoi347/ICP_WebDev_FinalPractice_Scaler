import java.util.Scanner;

public class LowerTriangularMatriix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt(); // rows
        int y = sc.nextInt(); // cols

        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // lower triangular matrix

        boolean isLowerTriangular = true;

        for (int m = 0; m < x; m++){
            for (int n = 0; n < x; n++){
                if (m < n && arr[m][n] != 0)
                {
                    isLowerTriangular = false;
                    break;
                }
            }

            if (!isLowerTriangular){
                break;
            }
        }

        System.out.println(isLowerTriangular);
    }
}
