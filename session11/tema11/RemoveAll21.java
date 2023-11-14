package tema11;
import java.util.HashSet;
public class RemoveAll21 {
    public static void main(String[] args) {
        HashSet<String> clothes = new HashSet<String>();
        clothes.add("scarf");
        clothes.add("dress");
        clothes.add("skirt");
        clothes.add("jeans");
        clothes.clear();
        System.out.println(clothes);

    }
}
