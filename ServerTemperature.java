import java.util.Scanner;

public class ServerTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        double C = (f-32) * 5.0/9;

        if (C >= 80){
            System.out.println("CRITICAL");
        }

        else if (C >= 60){
            System.out.println("WARNNG");
        }

        else{
            System.out.println("NORMAL");
        }

        sc.close();
    }
}
