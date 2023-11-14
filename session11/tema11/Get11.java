package tema11;
import java.util.LinkedList;
public class Get11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("apple");
        linkedList.add("grape");
        linkedList.add("apple");

        String targetElement = "apple";

        // Find the first occurrence
        int firstIndex = linkedList.indexOf(targetElement);
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + targetElement + "' at index: " + firstIndex);
        } else {
            System.out.println("'" + targetElement + "' not found in the linked list.");
        }

        // Find the last occurrence
        int lastIndex = linkedList.lastIndexOf(targetElement);
        if (lastIndex != -1) {
            System.out.println("Last occurrence of '" + targetElement + "' at index: " + lastIndex);
        } else {
            System.out.println("'" + targetElement + "' not found in the linked list.");
        }
    }
}
