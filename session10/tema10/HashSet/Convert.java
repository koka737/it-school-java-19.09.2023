package tema10.HashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class Convert {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");

        // Convert HashSet to ArrayList
        List<String> arrayList = new ArrayList<>(hashSet);

        // Display the ArrayList
        System.out.println("ArrayList from HashSet: " + arrayList);
    }
    }

