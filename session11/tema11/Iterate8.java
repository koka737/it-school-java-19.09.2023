package tema11;
import java.util.LinkedList;
public class Iterate8 {
    public static void main(String[] args) {
        LinkedList<String> sports = new LinkedList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"football");
        int specifiedPosition = 3;
        for (int i = specifiedPosition; i < sports.size(); i++) {
            System.out.println(sports.get(i));
            
        }

    }
}
