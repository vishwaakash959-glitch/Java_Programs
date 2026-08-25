public class ArmstrongNumber {
    public static void main(String args[]) {
        int n = 153; // Input value
        int arg = n; // Store original value to check at the end
        int sum = 0;
        int r;

        // Process each digit exactly once
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        // Compare the final sum with the original number
        if (arg == sum) {
            System.out.println("Given number is armstrong number: " + arg);
        } else {
            System.out.println("Given number is not armstrong number: " + arg);
        }
    }
}
