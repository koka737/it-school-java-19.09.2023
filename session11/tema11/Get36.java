package tema11;
import java.util.TreeMap;
import java.util.Map;
public class Get36 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value mappings to the map
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 2);

        // Get the greatest key less than or equal to the given key
        String givenKey = "Mango";
        Map.Entry<String, Integer> floorEntry = treeMap.floorEntry(givenKey);

        if (floorEntry != null) {
            System.out.println("Key: " + floorEntry.getKey() + ", Value: " + floorEntry.getValue());
        } else {
            System.out.println("No key less than or equal to the given key found.");
        }
    }
}
