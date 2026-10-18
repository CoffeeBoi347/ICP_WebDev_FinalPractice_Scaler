public class ReplaceAndFindCharOccurences {
    public static void main(String[] args) {
        System.out.print(solve("Hello world", 'l', 'r'));
    }

    public static String solve(String original, char occ, char newOcc){
        String newStr = "";
        char charAdd;

        for (int i = 0; i < original.length(); i++){
            charAdd = ' ';

            if (original.charAt(i) == occ){
                charAdd = newOcc;
                newStr += charAdd;
            }

            else{
                newStr += original.charAt(i);
            }
        }

        return newStr;
    }
}
