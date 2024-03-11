package EsercizioStadio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        // creazioni di array
        ArrayList<Integer> personeSabato = new ArrayList<>();
        ArrayList<Integer> personeDomeniche = new ArrayList<>();
        ArrayList<Integer> soldiSabato = new ArrayList<>();
        ArrayList<Integer> soldiDomenica = new ArrayList<>();
        // creazione oggetto random
        Random rand = new Random();
        // creazione contatore
        int counterSabato = 0;
        int counterDomenica = 0;
        // randomizzazione persone nel sabato max 10.000 persone
        while (counterSabato <= 10000) {
            personeSabato.add(rand.nextInt(10000));
            counterSabato++;
        }
        // vendita biglietti del sabato
        for (int i = 0; i < personeSabato.size(); i++) {
            soldiSabato.add(personeSabato.get(i) * 20);
        }
        // randomizzazione persone nella domenica max 10.000 persone
        while (counterDomenica <= 10000) {
            personeDomeniche.add(rand.nextInt(10000));
            counterDomenica++;
        }
        // vendita biglietti della domenica
        for (int i = 0; i < personeDomeniche.size(); i++) {
            soldiDomenica.add(personeDomeniche.get(i) * 15);
        }
        // scelta dell'utente, sceglie che risultato visualizzare
        String scelta = "";
        do {
            System.out.println("Cosa vuoi vedere?");
            scelta = myScan.nextLine();
        } while (!(scelta.equalsIgnoreCase("esci")));

    }
}
