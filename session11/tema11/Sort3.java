package tema11;
import java.util.ArrayList;
import java.util.Collections;
public class Sort3 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("gymnastics");
        sports.add("dancing");
        sports.set(0,"football");
        Collections.sort(sports);//sorteaza alfabetic
        for(String i : sports){
            System.out.println(i);
        }

    }
}
