import java.util.*;

public class RemoveKFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            arr.add(sc.nextInt());
        }

        int k = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        for (int j = 0; j < arr.size(); j++) {
            int count = 0;
            int num = arr.get(j);

            for (int n = 1; n <= num; n++) {
                if (num % n == 0) {
                    count++;
                }
            }

            if (count != k) {
                result.add(num);
            }
        }

        System.out.println(result);
        sc.close();
    }
}