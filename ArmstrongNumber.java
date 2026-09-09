public class ArmstrongNumber{
    public static void main(String args[]) {
        int n = 153; 
        int arg = n; 
        int sum = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (arg == sum) {
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
    }
}
