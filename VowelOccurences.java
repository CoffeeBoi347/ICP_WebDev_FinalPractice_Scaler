import java.util.ArrayList;

public class VowelOccurences {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("Java Programming");
        A.add("Virtual Reality");
        A.add("Augmented Reality");
        
        ArrayList<ArrayList<Character>> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++){
            String s = A.get(i);
            ArrayList<Character> vowels = new ArrayList<>();

            for (int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                )
                {
                    vowels.add(ch);
                }
            }

            result.add(vowels);
        }

        System.out.println(result);
    }
}
