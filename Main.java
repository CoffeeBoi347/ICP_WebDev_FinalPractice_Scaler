public class Main {
    public static void main(String[] args) {
        System.out.print(calc("Hello World", 'l'));
    }

    public static int calc(String s, char c){
        if (s.trim().isEmpty()){
            return -1;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
