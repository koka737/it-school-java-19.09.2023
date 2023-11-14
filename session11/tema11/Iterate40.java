package tema11;

import java.util.HashMap;
import java.util.Map;

public class Iterate40 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("adina", 19);
        map.put("alex", 19);
        map.put("robert", 24);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
