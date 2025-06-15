public class RecursionProblems {

    // Problem 1: Find Minimum in Array
    public static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
    // Time: O(n), Space: O(n)

    // Problem 2: Average of Array
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static double average(int[] arr, int n) {
        return (double) sum(arr, n) / n;
    }
    // Time: O(n), Space: O(n)

    // Problem 3: Check if Prime
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }
    // Time: O(n), Space: O(n)

    // Problem 4: Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    // Time: O(n), Space: O(n)

    // Problem 5: Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Time: O(2^n), Space: O(n)

    // Problem 6: Power a^n
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    // Time: O(n), Space: O(n)

    // Problem 7: Permutations of String
    public static void permutations(String prefix, String rest) {
        if (rest.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < rest.length(); i++) {
            permutations(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1));
        }
    }
    // Time: O(n!), Space: O(n!)

    // Problem 8: Check if All Digits
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
    // Time: O(n), Space: O(n)

    // Problem 9: Binomial Coefficient C(n, k)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    // Time: O(2^n), Space: O(n)

    // Problem 10: GCD using Recursion
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    // Time: O(log(min(a, b))), Space: O(log(min(a, b)))

    // Main method to test all functions
    public static void main(String[] args) {
        // Problem 1
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("Problem 1 (Min): " + findMin(arr1, arr1.length)); // 1

        // Problem 2
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Problem 2 (Average): " + average(arr2, arr2.length)); // 2.5

        // Problem 3
        System.out.println("Problem 3 (7 is prime?): " + isPrime(7, 6)); // true
        System.out.println("Problem 3 (10 is prime?): " + isPrime(10, 9)); // false

        // Problem 4
        System.out.println("Problem 4 (Factorial 5): " + factorial(5)); // 120

        // Problem 5
        System.out.println("Problem 5 (Fibonacci 5): " + fibonacci(5)); // 5
        System.out.println("Problem 5 (Fibonacci 17): " + fibonacci(17)); // 1597

        // Problem 6
        System.out.println("Problem 6 (2^10): " + power(2, 10)); // 1024

        // Problem 7
        System.out.println("Problem 7 (Permutations of 'IOX'):");
        permutations("", "IOX");

        // Problem 8
        System.out.println("Problem 8 (Is all digits '123456'): " + isAllDigits("123456", 0)); // true
        System.out.println("Problem 8 (Is all digits '123a12'): " + isAllDigits("123a12", 0)); // false

        // Problem 9
        System.out.println("Problem 9 (C(2,1)): " + binomialCoefficient(2, 1)); // 2
        System.out.println("Problem 9 (C(7,3)): " + binomialCoefficient(7, 3)); // 35

        // Problem 10
        System.out.println("Problem 10 (GCD(32,48)): " + gcd(32, 48)); // 16
        System.out.println("Problem 10 (GCD(10,7)): " + gcd(10, 7)); // 1
    }
}
