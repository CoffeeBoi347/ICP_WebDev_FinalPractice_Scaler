public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10,30,60,8,9};
        System.out.print(solve(arr));
    }

    public static int solve(int[] arr){
        Integer first = null;
        Integer second = null;

        for (int num : arr){
            if ((first != null && num == first) || (second != null && num == second))
                continue;

            if (first == null || num > first){
                second = first;
                first = num;
            }

            else if (second == null || num > second){
                second = num;
            }
        }

        return second;
    }
}
