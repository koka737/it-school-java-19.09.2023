package tema10.LinkedList;

import java.util.LinkedList;

public class GetFirtsandLast {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);


        // Display the updated LinkedList
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("First element: " + linkedList.getLast());
    }
}
