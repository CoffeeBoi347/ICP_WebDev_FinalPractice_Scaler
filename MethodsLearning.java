public class MethodsLearning {
    public static void main(String[] args) {
        greet();
        System.out.println(add(10, 30));
        System.out.println(add(10.50, 30.50));
        System.out.println(sum(10,30,45,50));
        System.out.println(factorial(7));
    }

    static void greet(){
        System.out.println("Namaste!");
    }

    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    static int sum(int... nums){
        int total = 0;
        for (int n : nums) total += n;
        return total;
    }

    static int factorial(int n){
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
}