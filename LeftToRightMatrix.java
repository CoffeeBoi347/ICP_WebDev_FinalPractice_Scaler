import java.util.Scanner;

public class LeftToRightMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for no of rows * columns: ");
        int x = sc.nextInt();

        int[][] m = new int[x][x];

        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++){
            if (i % 2 == 0){
                for (int k = 0; k < x; k++){
                    System.out.print(m[i][k] + " ");
                }
            }

            else{
                for (int r = x - 1; r >= 0; r--)
                    System.out.print(m[i][r] + " ");
                }
            }

            sc.close();
        }
    }
