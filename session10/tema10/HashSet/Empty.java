package tema10.HashSet;
import java.util.HashSet;
public class Empty {
    public static void main(String[] args) {
        HashSet<String> humans = new HashSet<String>();
        humans.add("Adina");
        humans.add("Andreea");
        humans.add("Anca");
        humans.add("Sofia");
        System.out.println("original hash set: " + humans);
        humans.clear();
        System.out.println("empty hash set: " + humans);
    }
}
