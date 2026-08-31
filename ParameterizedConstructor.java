
class student {

    String name;
    int marks;

    student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + "scored" + marks);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
        student s1 = new student("John", 85);
        student s2 = new student("Alice", 92);
        s1.display();
        s2.display();
    }
}
