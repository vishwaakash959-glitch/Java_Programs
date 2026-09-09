
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
