public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("Factorial Calculation");

        int number = 5; 
        int result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive call to calculate factorial
        return n * factorial(n - 1);
    }
}
