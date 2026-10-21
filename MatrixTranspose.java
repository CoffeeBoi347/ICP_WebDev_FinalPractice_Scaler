import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // rows
        int y = sc.nextInt(); // cols

        int[][] arr = new int[x][y];
        int[][] transpose = new int[y][x];
        
        // Input Matrix
        
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Traverse

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        // Loop 

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                
            }
        }
    }
}
