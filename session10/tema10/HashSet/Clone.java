package tema10.HashSet;
import java.util.HashSet;
public class Clone {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        HashSet<String> newHashSet = new HashSet<>(hashSet);
        System.out.println(newHashSet);
    }
}
