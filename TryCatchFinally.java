public class TryCatchFinally {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5] / 0);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } 
        finally {
            System.out.println("Cleanup: execution finished.");
        }
    }
}
