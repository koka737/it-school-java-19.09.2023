package tema11;
import java.util.LinkedList;
public class Insert10 {
    public static void main(String[] args) {
        LinkedList<String> sports = new LinkedList<>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"fitness");
        sports.set(1, "baseball");
        System.out.println(sports);
    }
}
