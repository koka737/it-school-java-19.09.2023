package tema11;
import java.util.TreeSet;
public class Find24 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(12);
        numbers.add(2003);
        numbers.add(5);
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.println(num);
            }

        }

    }
}