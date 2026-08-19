
class Counter {

    int count;

    Counter() {
        count = 1;
        System.out.println("No argument constructor called");
    }
}

public class NoArgumentConstructor {

    public static void main(String args[]) {
        Counter c1 = new Counter();
        System.out.println("Count: " + c1.count);
    }
}
