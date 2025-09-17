/*
 Écrire un programme qui :
— Demande à l’utilisateur de saisir 10 entiers et les stocke dans un tableau.
— Demande ensuite un entier à rechercher.
— Affiche un message indiquant si cet entier est présent dans le tableau ou non.
 */

import java.util.Scanner;
import java.util.Arrays;
public class ArrayResearch {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] array = arrayOfIntInput(10, input);
            System.out.println("Array: " + Arrays.toString(array));
            System.out.print("Enter a number to search: ");
            int searchNum = input.nextInt();
            if (containsNumber(array, searchNum)) {
                System.out.println(searchNum + " is present in the array.");
            } else {
                System.out.println(searchNum + " is NOT present in the array.");
            }
        }
    }

    static int[] arrayOfIntInput(int n, Scanner input){
        int[] arrayOfInt = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Nombre " + (i+1) + ": ");
            arrayOfInt[i] = input.nextInt();
        }
        return arrayOfInt;
    }

    static boolean containsNumber(int[] array, int num) {
        for (int value : array) {
            if (value == num) return true;
        }
        return false;
    }
}
