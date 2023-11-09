package tema10.ArrayList.Update;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("pink");
        colours.add("purple");
        colours.add("red");
        colours.add("yellow");

        int indexToUpdate = 2;
        String newValue = "white";

        if (indexToUpdate >= 0 && indexToUpdate < colours.size()) {
            colours.set(indexToUpdate, newValue);
            System.out.print("Updated array: ");
            for (int i = 0; i < colours.size(); i++) {
                System.out.print(colours.get(i));
                if (i < colours.size() - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("Invalid index. The array does not have an element at index " + indexToUpdate);
        }
    }
}
