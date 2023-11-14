package tema11;
import java.util.TreeSet;
public class AddAll22 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(12);
        numbers.add(2003);
        numbers.add(11);

        TreeSet<Integer> newList = new TreeSet<Integer>();
        newList.add(12);
        newList.add(13);
        newList.add(14);
        newList.addAll(numbers);
        System.out.println(newList);

    }
}
