
class Box {

    double length, breadth, height;

    Box() {
        length = 10;
        breadth = 10;
        height = 10;
    }

    Box(double side) {
        length = breadth = height = side;
    }

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2, 3, 4);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
