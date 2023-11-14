package tema11;
import java.util.ArrayList;
public class Iterate {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        for (int i = 0; i < sports.size(); i++) {
            System.out.println(sports.get(i));

        }

    }
}
