package tema11;
import java.util.ArrayList;
public class Trim6 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"football");
        sports.trimToSize();
        System.out.println(sports);
    }
}
