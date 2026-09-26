
public class BasicAutobox {

    public static void main(String[] args) {
        int a = 25;
        Integer boxed = a; // Autoboxing
        int unboxed = boxed; // Unboxing 
        System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer: " + boxed);
        System.out.println("Unboxed int: " + unboxed);
    }
}
