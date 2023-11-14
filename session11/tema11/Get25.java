package tema11;
import java.util.TreeSet;
public class Get25 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(31);
        numbers.add(12);
        numbers.add(2003);
        numbers.add(5);
        Integer givenElement=12;
        for(Integer num : numbers){
            if(num <= givenElement){
                System.out.println(num);
            }
        }
    }
}
