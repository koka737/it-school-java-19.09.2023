import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortKeys32 {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for sorting keys
        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                // Compare keys based on their lengths
                return Integer.compare(key1.length(), key2.length());
            }
        });

        // Add some key-value mappings to the map
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 8);
        treeMap.put("Grapes", 2);

        // Display the original TreeMap
        System.out.println("Original TreeMap: " + treeMap);

        // TreeMap automatically sorts keys using the custom comparator
        // Display the TreeMap after sorting
        System.out.println("Sorted TreeMap: " + treeMap);
    }
}
