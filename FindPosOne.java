public class FindPosOne {
    public static void main(String[] args) {
        System.out.print(calc("hello", "llo"));
    }

    public static int calc(String s, String w){
        if (s.isEmpty() || w.isEmpty()) {
            return -1;
        }

        return s.indexOf(w);
    }
}
