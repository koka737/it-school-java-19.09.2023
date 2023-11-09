package tema10.HashSet;
import java.util.HashSet;
public class Append {
    public static void main(String[] args) {
        HashSet<String> humans = new HashSet<String>();
        humans.add("Adina");
        humans.add("Andreea");
        humans.add("Anca");
        humans.add("Sofia");
        String elementToAppend = "Pufi";
        humans.add(elementToAppend);
        System.out.println("updated hash set: " + humans);

    }
}
