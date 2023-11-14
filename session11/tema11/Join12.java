package tema11;
import java.util.LinkedList;
public class Join12 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        LinkedList<String> legumes = new LinkedList<String>();
        legumes.add("tomato");
        legumes.add("cucumber");
        legumes.add("onion");

        fruits.addAll(legumes);
        System.out.println("the 2 joined lists are: " + fruits);

    }
}
