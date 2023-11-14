package tema11;
import java.util.HashMap;

public class Iterate16 {
    public static void main(String[] args) {
        HashMap<String,Integer> person =new HashMap<String, Integer>();
        person.put("Adina",19);
        person.put("Alex",19);
        person.put("Robert",24);
        for(String i : person.keySet()){
            System.out.println(i);
        }

    }
}
