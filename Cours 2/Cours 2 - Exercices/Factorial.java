//Écrire un programme qui lit un entier n et qui calcule la factorielle de n, notée n! = 1×2×· · ·×n.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number : ");
            if (!input.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                return;
            }
            int n = input.nextInt();
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }
            long factorialOfN = factorialCalculator(n);
            System.out.println("Factorielle : " + factorialOfN);
        }
    }

    static long factorialCalculator(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
