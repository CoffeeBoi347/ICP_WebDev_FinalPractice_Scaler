public class DiamondStarInnerSpace {

    public static void main(String[] args) {
        solve(4);
    }

    public static void solve(int n) {

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int k = n - 1; k >= 1; k--) {

            for (int m = 1; m <= n - k; m++) {
                System.out.print(" ");
            }

            for (int e = 1; e <= 2 * k - 1; e++) {
                if (e == 1 || e == 2 * k - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}