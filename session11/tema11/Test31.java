package tema11;
import java.util.HashMap;
import java.util.Map;
public class Test31 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("hello",1);
        map.put("hi",2);
        map.put("hola",3);
        Integer valueToCheck = 3;
        if(map.containsValue(valueToCheck)){
            System.out.println("the map contains this value");
        }else{
            System.out.println("the map does not contain this value");
        }
        Integer nonExistentValue = 31;
        if(map.containsValue(nonExistentValue)){
            System.out.println("the map contains this value");
        }else{
            System.out.println("the map does not contain this value");
        }
    }
}

