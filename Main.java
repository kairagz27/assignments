import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Task 1 (Digits) ---");
        printDigits(5481);

        System.out.println("\n--- Task 2 (Average) ---");
        int[] myArr = {3, 2, 4, 1};
        int arraySize = 4;
        System.out.println((double) findSum(myArr, arraySize) / arraySize);

        System.out.println("\n--- Task 3 (Prime) ---");
        System.out.println(isPrime(7, 2));
        System.out.println(isPrime(10, 2));

        System.out.println("\n--- Task 4 (Factorial) ---");
        System.out.println(factorial(5));

        System.out.println("\n--- Task 5 (Fibonacci) ---");
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(17));

        System.out.println("\n--- Task 6 (Power) ---");
        System.out.println(power(2, 10));

        System.out.println("\n--- Task 7 (Reverse Output) ---");
        System.out.print("Enter number of elements: ");
        int count = sc.nextInt();
        System.out.println("Enter numbers:");
        reverseOutput(sc, count);
        System.out.println();

        System.out.println("\n--- Task 8 (Check Digits) ---");
        System.out.println(isAllDigits("123456"));
        System.out.println(isAllDigits("123a12"));

        System.out.println("\n--- Task 9 (Count Characters) ---");
        System.out.println(countChars("hello"));
        System.out.println(countChars("recursion"));

        System.out.println("\n--- Task 10 (GCD) ---");
        System.out.println(findGCD(32, 48));
        System.out.println(findGCD(10, 7));
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    public static int findSum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static String isPrime(int n, int i) {
        if (n <= 1) return "Composite";
        if (i * i > n) return "Prime";
        if (n % i == 0) return "Composite";
        return isPrime(n, i + 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void reverseOutput(Scanner sc, int n) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverseOutput(sc, n - 1);
        System.out.print(num + " ");
    }

    public static String isAllDigits(String s) {
        if (s.isEmpty()) return "Yes";
        if (!Character.isDigit(s.charAt(0))) return "No";
        return isAllDigits(s.substring(1));
    }

    public static int countChars(String s) {
        if (s.isEmpty()) return 0;
        return 1 + countChars(s.substring(1));
    }

    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}