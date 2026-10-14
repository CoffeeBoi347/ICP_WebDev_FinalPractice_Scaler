import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        // Array list is a resizable collection 

        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr.set(1,99));
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
