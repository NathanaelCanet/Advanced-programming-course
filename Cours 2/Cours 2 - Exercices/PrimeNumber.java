//Écrire un programme qui lit un entier n au clavier, et qui détermine s’il s’agit d’un nombre premier.

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number : ");
            int n = input.nextInt();
            var check = checkPrime(n);
            System.out.println(check ? "Prime number" : "Not prime number");
        }

    }

    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
