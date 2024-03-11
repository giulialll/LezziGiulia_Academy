package EsercizioOtto;

import java.util.Scanner;

public class EsercizioOtto {
    public static void main(String[] args) {
        // creazione scanner
        Scanner myScan = new Scanner(System.in);
        // numeri da utilizzare per i calcoli
        int num1 = 4;
        int num2 = 6;
        // creazione contatore
        int counter = 0;
        // ciclo for
        for (int i = 1; i<=1;){
            System.out.println("Vuoi fare un calcolo con questi numeri? S/N");
            String sceltaIniziale = myScan.nextLine();
            // se l'utente dice di no il ciclo termina
            if (sceltaIniziale.equals("N")) {
                System.out.println("fine");
                i--;
                System.out.println("Hai eseguito " + counter + " operazioni");
                // se l'utente dice di si,partirà il menu delle operazioni
            } else {
                System.out.println("Che operazione vuoi fare?");
                String sceltaOperazione = myScan.nextLine();
                switch (sceltaOperazione) {
                    case "somma":
                        int somma = num1 + num2;
                        counter++;
                        System.out.println(somma);
                        break;
                    case "sottrazione":
                        int sottrazione = num1 - num2;
                        counter++;
                        System.out.println(sottrazione);
                        break;
                    case "moltiplicazione":
                        int moltiplicazione = num1 * num2;
                        counter++;
                        System.out.println(moltiplicazione);
                        break;
                    case "divisione":
                        float divisione = num1 / num2;
                        counter++;
                        System.out.println(divisione);
                        break;
                    default:
                        System.out.println("operazione non valida");
                        break;

                }
            }
        }
        myScan.close();

    }
}
