package tema11;
import java.util.HashMap;
import java.util.Map;
public class Test30 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("hello",1);
        map.put("hi",2);
        map.put("hola",3);
        String keyToCheck = "hi";
        if(map.containsKey(keyToCheck)){
            System.out.println("the map contains this key");
        }else{
            System.out.println("the map does not contain this key");
        }
        String nonExistentKey = "adina";
        if(map.containsKey(nonExistentKey)){
            System.out.println("the map contains this key");
        }else{
            System.out.println("the map does not contain this key");
        }
    }
}
