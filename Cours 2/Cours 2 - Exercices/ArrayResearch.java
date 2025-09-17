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
        System.out.println(Arrays.toString(arrayOfIntInput(10)));
    }

    static int[] arrayOfIntInput(int n){
        int[] arrayOfInt = new int[n];
        try (Scanner input = new Scanner(System.in)) {
            for(int i = 0; i<n; i++){
                System.out.print("Nombre " + (i+1) + ": ");
                arrayOfInt[i] = input.nextInt();
            }
        }
        return arrayOfInt;
    }
}
