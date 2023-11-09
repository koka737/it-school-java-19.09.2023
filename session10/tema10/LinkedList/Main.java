package tema10.LinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Element to be inserted at the front
        int elementToInsert = 1;

        // Insert the element at the front of the LinkedList
        linkedList.addFirst(elementToInsert);

        // Display the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

