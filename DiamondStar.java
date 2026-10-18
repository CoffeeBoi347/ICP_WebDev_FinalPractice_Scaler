public class DiamondStar {
    public static void main(String[] args) {
        solve(4);
    }

    public static void solve(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = n-1; k >= 1; k--){
            for (int m = 1; m <= n - k; m++){
                System.out.print(" ");
            }

           for (int l = 1; l <= 2 * k - 1; l++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
