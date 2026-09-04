
public class TryCatchFinally {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // 1. Evaluation starts here (throws ArrayIndexOutOfBoundsException first)
            System.out.println(arr[5] / 0);
        } // 2. Specific catch block 1
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } // 3. Specific catch block 2
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } // 4. General fallback catch block (Must always be placed last)
        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } // 5. Always executes after the try-catch blocks
        finally {
            System.out.println("Cleanup: execution finished.");
        }
    }
}
