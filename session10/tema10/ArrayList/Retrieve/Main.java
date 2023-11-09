package tema10.ArrayList.Retrieve;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("pink");
        colours.add("purple");
        colours.add("red");
        colours.add("yellow");
        colours.set(0,"green");
        System.out.println(colours.get(0));



    }
}
