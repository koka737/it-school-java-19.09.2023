package tema11;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class Convert19 {
    public static void main(String[] args) {
        HashSet<String> clothes = new HashSet<String>();
        clothes.add("scarf");
        clothes.add("dress");
        clothes.add("skirt");
        clothes.add("jeans");
//convertim hash set in array list
        List<String> arrayList = new ArrayList<>(clothes);

        // Display the elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

    }
}
