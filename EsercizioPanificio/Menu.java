package EsercizioPanificio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // creazione scanner
        Scanner myScanIntero = new Scanner(System.in);
        Scanner myScannerStringa = new Scanner(System.in);
        //oggetto iniziale
        PiattoSpeciale piattoSpecialeIniziale = new PiattoSpeciale();
        // scelta dell'utente
        int sceltaPaneUtente = 0;
        int sceltaRipienoUtente=0;
        String aggiunteUtente=" ";
        String risposta="";
        //array con scelta finale utente e importo da pagare
        ArrayList<String> paninoScelto = new ArrayList<>();
        ArrayList<Float> ImportoPerPanino = new ArrayList<>(); 
        // scelta del panino
        do {
            //scelta della base
            System.out.println("Questi sono i tipi di panino presenti "
                    + "-1)pane al sesamo"
                    + "-2)pane arabo"
                    + "-3)pane bianco");
                    sceltaPaneUtente=myScanIntero.nextInt();
                    paninoScelto.add(piattoSpecialeIniziale.getTipiPane()[sceltaPaneUtente-1]);
                    ImportoPerPanino.add(piattoSpecialeIniziale.getPrezzoPane()[sceltaPaneUtente-1]);
            //scelta del ripieno
            System.out.println("ripieni");
            sceltaRipienoUtente=myScanIntero.nextInt();
            paninoScelto.add(piattoSpecialeIniziale.getTipiRipieni()[sceltaRipienoUtente-1]);
            ImportoPerPanino.add(piattoSpecialeIniziale.getPrezzoPane()[sceltaPaneUtente-1]);
            //eventuali aggiunte
            System.out.println("aggiunte");
            aggiunteUtente = myScannerStringa.nextLine();
            //if no aggiunte
            System.out.println(" ");
            risposta=myScannerStringa.nextLine();
        } while(risposta.equalsIgnoreCase("Si"));
        myScanIntero.close();
        myScannerStringa.close();
        System.out.println("i tuoi panini sono: " +paninoScelto);
        System.out.println("l'importo di ogni ingrediente: "+ImportoPerPanino);
    }
}
