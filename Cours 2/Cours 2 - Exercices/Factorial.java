//Écrire un programme qui lit un entier n et qui calcule la factorielle de n, notée n! = 1×2×· · ·×n.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number : ");
            int n = input.nextInt();
            var factorialOfN = factorialCalculator(n);
            System.out.print("Factorielle : " + factorialOfN);

        }
    }

    static int factorialCalculator(int n) {
        int number = 1;
        for (int i = 2; i <= n; i++) {
            number *= i;
        }
        return number;
    }
}
