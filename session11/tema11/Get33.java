package tema11;
import java.util.Map;
import java.util.TreeMap;
public class Get33 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value mappings to the map
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 2);

        // Get the key-value mapping associated with the least key
        Map.Entry<String, Integer> leastEntry = treeMap.firstEntry();
        System.out.println("Least Key: " + leastEntry.getKey() + ", Value: " + leastEntry.getValue());

        // Get the key-value mapping associated with the greatest key
        Map.Entry<String, Integer> greatestEntry = treeMap.lastEntry();
        System.out.println("Greatest Key: " + greatestEntry.getKey() + ", Value: " + greatestEntry.getValue());
    }
}
