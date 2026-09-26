
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter your CGPA: ");
        double cgpa = Double.parseDouble(br.readLine());
        System.out.println("\n ---Student Record---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}
