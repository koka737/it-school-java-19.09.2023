package tema11;
import java.util.HashSet;
public class Test17 {
    public static void main(String[] args) {
        HashSet<String> sports = new HashSet<String>();
        sports.add("calisthenics");
        sports.add("acro yoga");
        sports.add("dancing");
        sports.add("swimming");
        if(sports.isEmpty()){
            System.out.println("the hash set is empty.");
        }else {
            System.out.println("the hash set is not empty.");
        }
    }
}
