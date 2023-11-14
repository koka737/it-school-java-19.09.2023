package tema11;
import java.util.ArrayList;
public class Copy4 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"football");
        ArrayList<String> newSports = new ArrayList<String>(sports);
        System.out.println(newSports);
    }
}
