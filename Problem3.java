import java.util.Scanner;

/**
 * This class contains a method to determine whether a given number is prime or composite.
 * It takes an integer input from the user and checks whether it is prime or composite.
 */
public class Problem3 {

    /**
     * Main method to take user input and call the findPrime method to determine if the number is prime or composite.
     * Time Complexity: O(sqrt(n))
     * - The for loop runs from 2 to the square root of the input number.
     * - The worst-case time complexity occurs when the input number is a prime number.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(findPrime(number));
    }

    /**
     * Method to determine whether a given number is prime or composite.
     * Time Complexity: O(sqrt(n))
     * - The for loop runs from 2 to the square root of the input number.
     * - The worst-case time complexity occurs when the input number is a prime number.
     *
     * @param x The input number to be checked.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String findPrime(int x) {
        if (x <= 1) {
            return "Composite";
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}
