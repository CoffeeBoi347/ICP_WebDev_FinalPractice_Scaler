import java.util.ArrayList;
import java.util.List;

public class MaxVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("malayalam");
        words.add("scaler school of technology");
        
        System.out.println(maxVowels(words));
    }

    static int countVowels(String s){
        if (s.trim() == ""){
            return 0;
        }

        int count = 0;
        for (char c : s.toLowerCase().toCharArray()){
            if ("aeiou".indexOf(c) != -1){
                count++;
            }
        }

        return count;
    }

    static String maxVowels(List<String> words){
        if (words == null || words.isEmpty()) return null;

        String best = words.get(0);
        int bestCount = countVowels(best);

        for (String s : words){
            int c = countVowels(s);
            if (c > bestCount){
                bestCount = c;
                best =  s;
            }
        }

        return best;
    }
}
