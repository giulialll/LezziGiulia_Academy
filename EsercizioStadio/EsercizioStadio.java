package EsercizioStadio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioStadio {
    public static void main(String[] args) {
        // creazione Scanner
        Scanner myScanStringhe = new Scanner(System.in);
        Scanner myScanInteri = new Scanner(System.in);
        // creazioni di array
        ArrayList<Integer> personeSabato = new ArrayList<>();
        ArrayList<Integer> personeDomeniche = new ArrayList<>();
        ArrayList<Integer> soldiSabato = new ArrayList<>();
        ArrayList<Integer> soldiDomenica = new ArrayList<>();
        // creazione oggetto random
        Random rand = new Random();
        // variabili max e min incasso per sabato
        int maxIncassoSabato = Integer.MIN_VALUE;
        int minIncassoSabato = Integer.MAX_VALUE;
        // variabili max e min affluenza per sabato
        int maxPersoneSabato = Integer.MIN_VALUE;
        int minPersoneSabato = Integer.MAX_VALUE;
        // variabili max e min incasso per domenica
        int maxIncassoDomenica = Integer.MIN_VALUE;
        int minIncassoDomenica = Integer.MAX_VALUE;
        // variabili max e min affluenza per domenica
        int maxPersoneDomenica = Integer.MIN_VALUE;
        int minPersoneDomenica = Integer.MAX_VALUE;
        // variabili totale incassi per giorno
        int totIncassiSabato = 0;
        int totIncassiDomenica = 0;
        // variabile totale incassi per tutti
        int totaleIncassi = 0;
        // inizialmente c'è un massimo di 50 weekend,l'utente ne può aggiungere altri a
        // gruppi di 50
        System.out.println("Ci sono 50 weekend, ne vuoi aggiungere altri 50? S/N");
        String rispostaAggiungi = myScanStringhe.nextLine();
        if (rispostaAggiungi.equalsIgnoreCase("N")) {
            // aggiunta persone nel sabato randomizzato
            for (int i = 0; i < 50; i++) {
                personeSabato.add(rand.nextInt(10000));// massimo 10.000 persone nello stadio
            }
            // vendita biglietti del sabato
            for (int i = 0; i < personeSabato.size(); i++) {
                soldiSabato.add((personeSabato.get(i) * 20));
            }

            // aggiunta persone nella domenica randomizzato
            for (int i = 0; i < 50; i++) {
                personeDomeniche.add(rand.nextInt(10000));// massimo 10.000 persone nello stadio
            }
            // vendita biglietti della domenica
            for (int i = 0; i < personeDomeniche.size(); i++) {
                soldiDomenica.add((personeDomeniche.get(i) * 15));
            }

        } else if (rispostaAggiungi.equalsIgnoreCase("S")) {
            System.out.println("Quanti ne vuoi aggiungere?");
            int sceltaAggiunta = myScanInteri.nextInt();
            // sabato
            for (int i = 0; i < (sceltaAggiunta * 50); i++) {
                personeSabato.add(rand.nextInt(10000));// massimo 10.000 persone nello stadio
            }
            for (int i = 0; i < personeSabato.size(); i++) {
                soldiSabato.add((personeSabato.get(i) * 20));
            }
            System.out.println(soldiSabato);
            // domenica
            for (int i = 0; i < (sceltaAggiunta * 50); i++) {
                personeDomeniche.add(rand.nextInt(10000));// massimo 10.000 persone nello stadio
            }
            System.out.println(personeDomeniche);
            for (int i = 0; i < personeDomeniche.size(); i++) {
                soldiDomenica.add((personeDomeniche.get(i) * 15));
            }

        }
        // scelta dell'utente, sceglie che risultato visualizzare
        String scelta = "";
        do {
            System.out.println("Cosa vuoi vedere?");
            scelta = myScanStringhe.nextLine();
            switch (scelta) {
                case "massimo incasso sabato":
                    for (int i = 0; i < soldiSabato.size(); i++) {
                        if (soldiSabato.get(i) > maxIncassoSabato) {
                            maxIncassoSabato = soldiSabato.get(i);
                        }
                    }
                    System.out.println(maxIncassoSabato);
                    break;
                case "minimo incasso sabato":
                    for (int i = 0; i < soldiSabato.size(); i++) {
                        if (soldiSabato.get(i) < minIncassoSabato) {
                            minIncassoSabato = soldiSabato.get(i);
                        }
                    }
                    System.out.println(minIncassoSabato);
                    break;
                case "massima affluenza sabato":
                    for (int i = 0; i < personeSabato.size(); i++) {
                        if (personeSabato.get(i) > maxPersoneSabato) {
                            maxPersoneSabato = personeSabato.get(i);
                        }
                    }
                    System.out.println(maxPersoneSabato);
                    break;
                case "minima affluenza sabato":
                    for (int i = 0; i < personeSabato.size(); i++) {
                        if (personeSabato.get(i) < minPersoneSabato) {
                            minPersoneSabato = personeSabato.get(i);
                        }
                    }
                    System.out.println(minPersoneSabato);
                    break;
                case "massimo incasso domenica":
                    for (int i = 0; i < soldiDomenica.size(); i++) {
                        if (soldiDomenica.get(i) > maxIncassoDomenica) {
                            maxIncassoDomenica = soldiDomenica.get(i);
                        }
                    }
                    System.out.println(maxIncassoDomenica);
                    break;
                case "minimo incasso domenica":
                    for (int i = 0; i < soldiDomenica.size(); i++) {
                        if (soldiDomenica.get(i) < minIncassoDomenica) {
                            minIncassoDomenica = soldiDomenica.get(i);
                        }
                    }
                    System.out.println(minIncassoDomenica);
                    break;
                case "massima affluenza domenica":
                    for (int i = 0; i < personeDomeniche.size(); i++) {
                        if (personeDomeniche.get(i) > maxPersoneDomenica) {
                            maxPersoneDomenica = personeDomeniche.get(i);
                        }
                    }
                    System.out.println(maxPersoneDomenica);
                    break;
                case "minima affluenza domenica":
                    for (int i = 0; i < personeDomeniche.size(); i++) {
                        if (personeDomeniche.get(i) < minPersoneDomenica) {
                            minPersoneDomenica = personeDomeniche.get(i);
                        }
                    }
                    System.out.println(minPersoneDomenica);
                    break;
                case "totale incassi sabato":
                    for (int i = 0; i < soldiSabato.size(); i++) {
                        totIncassiSabato += soldiSabato.get(i);
                    }
                    System.out.println(totIncassiSabato);
                    break;
                case "totale incassi domenica":
                    for (int i = 0; i < soldiDomenica.size(); i++) {
                        totIncassiDomenica += soldiDomenica.get(i);
                    }
                    System.out.println(totIncassiDomenica);
                    break;
                case "totale incassi di tutto":
                    totaleIncassi = totIncassiDomenica + totIncassiSabato;
                    System.out.println(totaleIncassi);
                    break;
                case "esci":
                    System.out.println("fine, arrivederci");
                    break;
                default:
                    System.out.println("operazione non valida");
                    break;
            }
        } while (!(scelta.equalsIgnoreCase("esci")));

    }
}
