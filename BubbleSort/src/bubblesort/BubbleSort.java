package bubblesort;

import java.util.Arrays;



public class BubbleSort {
	
	/**
	 * 
	 * @author giulia
	 * @param ArrayDaScambiare
	 * @return ArrayDaScambiare
	 * <p>Questo metodo serve per organizzare l'array partendo dal più piccolo al più grande </p>
	 *
	 */

	public static int[] bubbleSort(int[] ArrayDaScambiare) {
		int temp;//variabile temporanea per conservare il numero da scambiare
		for (int i = 0; i < ArrayDaScambiare.length; i++) { // ciclo for esterno per gestire la ripetizione del ciclo interno
			for (int j = 1; j < (ArrayDaScambiare.length - i); j++) {// ciclo interno per fare i paragani tra le celle dell'array
				if (ArrayDaScambiare[j - 1] > ArrayDaScambiare[j]) {// se la cella precedente è maggiore allora si scambia
					temp = ArrayDaScambiare[j - 1];// salva il valore della cella nella variabile temp
					ArrayDaScambiare[j - 1] = ArrayDaScambiare[j];// inserisce il valore della casella j nella sua precedente
					ArrayDaScambiare[j] = temp;// nella cella di j andrà il valore salvato nella variabile temp
				} 
			} 
		} 
		return ArrayDaScambiare;
	}

	public static void main(String[] args) {
		int [] arr = {8,4,9,1,3,5};
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

}
