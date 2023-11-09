package tema10.ArrayList.Remove;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("pink");
        colours.add("purple");
        colours.add("red");
        colours.add("yellow");
        colours.remove(2);
        System.out.println(colours);

    }
}
