package tema11;
import java.util.HashMap;
import java.util.Map;
public class Check29 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();

        if(map.isEmpty()){
            System.out.println("the map is empty");
        }else{
            System.out.println("the map is not empty");
        }

        map.put("hello",1);
        map.put("hi",2);
        map.put("hola",3);

        if(map.isEmpty()){
            System.out.println("the map is empty");
        }else{
            System.out.println("the map is not empty");
        }

    }
}
