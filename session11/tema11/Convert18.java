package tema11;
import java.util.HashSet;

public class Convert18 {
    public static void main(String[] args) {
        HashSet<String> clothes = new HashSet<String>();
        clothes.add("scarf");
        clothes.add("dress");
        clothes.add("skirt");
        clothes.add("jeans");
        // Convert HashSet to array
        String[] array = new String[clothes.size()];
        clothes.toArray(array);

        // Display the elements in the array
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
