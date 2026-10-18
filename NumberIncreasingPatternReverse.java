public class NumberIncreasingPatternReverse {
    public static void main(String[] args) {
        solve(6);
    }

    public static void solve(int n){
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
