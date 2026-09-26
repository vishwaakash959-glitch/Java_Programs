
import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // Autoboxing
        list.add(20);
        list.add(30);
        for (Integer num : list) {
            System.out.println("Boxed Integer: " + num);
        }
    }
}
