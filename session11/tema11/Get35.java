package tema11;
import java.util.TreeMap;
public class Get35 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
        treemap.put("adina",19);
        treemap.put("alex",19);
        treemap.put("robert",24);
        System.out.println(treemap.descendingMap());
    }
}
