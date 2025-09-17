/*
Écrire une méthode inverse qui prend un tableau d’entiers en paramètre et retourne un
nouveau tableau contenant les mêmes éléments mais dans l’ordre inverse. Initialisez le tableau en
dur dans le programme principal.
*/
import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {
        int[] arrayOfInt = {1, 2, 3, 4};
        int[] reversedArrayOfInt = arrayReverser(arrayOfInt);
        System.out.println(Arrays.toString(reversedArrayOfInt));
    }

    static int[] arrayReverser(int[] arrayOfInt) {
        int[] reversedArrayOfInt = new int[arrayOfInt.length];
        int index = 0;
        for (int i = arrayOfInt.length - 1; i >= 0; i--) {
            reversedArrayOfInt[index] = arrayOfInt[i];
            index ++;
        }
        return reversedArrayOfInt;
    }
}
