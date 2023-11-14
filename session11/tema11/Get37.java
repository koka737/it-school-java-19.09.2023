import java.util.NavigableMap;
import java.util.TreeMap;

public class Get37 {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value mappings to the map
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 2);

        // Get the portion of the map whose keys are strictly less than or equal to the given key
        String givenKey = "Mango";
        NavigableMap<String, Integer> headMap = treeMap.headMap(givenKey, true);

        // Display the original TreeMap
        System.out.println("Original TreeMap: " + treeMap);

        // Display the portion of the map
        System.out.println("Portion of the map whose keys are less than or equal to '" + givenKey + "': " + headMap);
    }
}
