import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class Get38 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value mappings to the map
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 2);

        // Get the key-value mapping associated with the greatest key strictly less than the given key
        String givenKey = "Mango";
        Map.Entry<String, Integer> lowerEntry = treeMap.lowerEntry(givenKey);

        if (lowerEntry != null) {
            System.out.println("Key: " + lowerEntry.getKey() + ", Value: " + lowerEntry.getValue());
        } else {
            System.out.println("No key strictly less than the given key found.");
        }
    }
}
