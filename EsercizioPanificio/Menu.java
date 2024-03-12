package EsercizioPanificio;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // creazione scanner
        Scanner myScanIntero = new Scanner(System.in);
        // scelta dell'utente tra gli ingredienti già impostati
        int sceltaIngredientiFissi = 0;
        // scelta del panino
        do {
            //scelta della base
            System.out.println("Questi sono i tipi di panino presenti "
                    + "-1)pane al sesamo"
                    + "-2)pane arabo"
                    + "-3)pane bianco"
                    + "-4)voglio terminare");
        } while(sceltaIngredientiFissi!=4);

    }

}
