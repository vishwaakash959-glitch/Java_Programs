
class point {

    int x, y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    point(point p) {
        this.x = p.x;
        this.y = p.y;
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        point p1 = new point(10, 20);
        point p2 = new point(p1);
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
    }
}
