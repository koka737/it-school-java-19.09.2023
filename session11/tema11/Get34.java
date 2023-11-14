package tema11;
import java.util.TreeMap;

public class Get34 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
        treemap.put("adina",19);
        treemap.put("alex",19);
        treemap.put("robert",24);
        String firstKey= treemap.firstKey();
        System.out.println("first key: " + firstKey);
        String lastKey = treemap.lastKey();
        System.out.println("last key: " + lastKey);
    }
}
