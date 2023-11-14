package tema11;
import java.util.ArrayList;
import java.util.Collections;
public class Swap5 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"football");
        System.out.println(sports);//before swapping
        Collections.swap(sports,0,1);
        System.out.println(sports);//after swapping

    }
}
