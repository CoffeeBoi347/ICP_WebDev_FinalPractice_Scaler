public class MoneyValue {
    public static void main(String[] args) {
        System.out.println(solve(189505483));
    }

    public static String solve(int num){
        int[] arr = new int[] {500,100,50,20,10};

        System.out.println("Notes needed: ");
        String result = "";
        int totalNotes = 0;

        for (int i = 0; i < arr.length; i++){
            int n = arr[i];
            int count = num / n;
            num = num % n;

            result += n + " notes needed: " + count + "\n";
            totalNotes += count;
        }

        result += "Total Notes: " + totalNotes;
        return result;
    }
}
