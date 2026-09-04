// 1. Define Interfaces

interface Printable {

    void print();
}

interface Showable {

    void show();
}

// 2. Implement the Interfaces in a Class
class Document implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void show() {
        System.out.println("Showing document...");
    }
}

// 3. Main Public Class (File must be named Test.java)
public class Test {

    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.show();
    }
}
