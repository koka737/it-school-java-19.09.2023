package tema11;
import java.util.HashSet;
public class Compare20 {
    public static void main(String[] args) {
        HashSet<String> clothes = new HashSet<String>();
        clothes.add("scarf");
        clothes.add("dress");
        clothes.add("skirt");
        clothes.add("jeans");

        HashSet<String> newWardrobe = new HashSet<String>();
        newWardrobe.add("hat");
        newWardrobe.add("dress");
        newWardrobe.add("T-shirt");
        newWardrobe.add("jeans");

        clothes.retainAll(newWardrobe);
        System.out.println("common elements in both sets: " + clothes);


    }
}
