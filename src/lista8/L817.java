/*
Desafio 2. Pesquise e implemente o algoritmo de ordenação conhecido como Bubble-sort
*/

package lista8;

public class L817 {
    public static void main(String[] args) {

        int array[] = {1,3,5,7,9,2,4,6,8,10,15,17,19};
        
        bubbleSort(array);

        for ( int i : array) {
            System.out.print(i + " ");
        }
    }
        
    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for ( int j = 0; j < array.length - 1; j++) {
                if ( array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}