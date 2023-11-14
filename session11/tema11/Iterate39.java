package tema11;
import java.util.HashMap;
import java.util.Map;
public class Iterate39 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("adina", 19);
        map.put("alex", 19);
        map.put("robert", 24);
        for(String key : map.keySet()){
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }
}
