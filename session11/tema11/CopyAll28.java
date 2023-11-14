package tema11;
import java.util.HashMap;
import java.util.Map;

public class CopyAll28 {
    public static void main(String[] args) {

        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("One", 1);
        sourceMap.put("Two", 2);
        sourceMap.put("Three", 3);

        Map<String, Integer> destinationMap = new HashMap<>();

        destinationMap.putAll(sourceMap);

        System.out.println("Original Map: " + sourceMap);
        System.out.println("Copied Map: " + destinationMap);
    }
}

