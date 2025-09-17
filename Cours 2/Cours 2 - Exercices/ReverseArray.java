/*
Écrire une méthode inverse qui prend un tableau d’entiers en paramètre et retourne un
nouveau tableau contenant les mêmes éléments mais dans l’ordre inverse. Initialisez le tableau en
dur dans le programme principal.
*/
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int size = input.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = input.nextInt();
            }
            int[] reversed = reverseArray(array);
            System.out.println("Reversed array: " + Arrays.toString(reversed));
        }
    }

    static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversed[i] = array[j];
        }
        return reversed;
    }
}
