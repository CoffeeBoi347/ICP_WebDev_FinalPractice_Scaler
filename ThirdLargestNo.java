import java.util.Scanner;

public class ThirdLargestNo {
    static Integer ThirdLargestInteger(int[] arr){
        Integer first = null, second = null, third = null;
        for (int num : arr){
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third))
            {
                continue;
            }

            if (first == null || num > first){
                third = second;
                second = first;
                first = num;
            }
            else if (second == null || num > second){
                third = second;
                second = num;
            }
            else if (third == null || num > third){
                third = num;
            }
        }
        return third;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.print("Enter value for each integer: ");
        for (int k = 0; k < x; k++){
            arr[k] = sc.nextInt();
        }

        Integer res = ThirdLargestInteger(arr);
        if (res == null)
            System.out.println("Not enough distinct elements");
        else
            System.out.println("The third largest integer is " + res);

        sc.close();
    }
}