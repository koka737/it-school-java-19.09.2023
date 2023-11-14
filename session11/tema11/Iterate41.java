package tema11;
import java.util.HashMap;
import java.util.Map;
public class Iterate41 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("adina", 19);
        map.put("alex", 19);
        map.put("robert", 24);

        System.out.println("Iterating through the map using forEach():");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
