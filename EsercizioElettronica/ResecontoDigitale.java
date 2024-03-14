package EsercizioElettronica;

import java.util.Scanner;

public class ResecontoDigitale {
    public static void main(String[] args) {
        // creazione scanner per le credenziali
        Scanner myScan = new Scanner(System.in);
        System.out.println("Inserire il nome dell'app che vuoi far partire");
        String nomeApp = myScan.nextLine();
        //dispositivo elettronico generale 
        DispositivoElettronico dispositivoElettronico = new DispositivoElettronico(nomeApp);
        dispositivoElettronico.avviaApplicazione(nomeApp);
        // smartphone
        System.out.println("Smartphone:");
        String username = "giulia";
        String password = "pass";
        Smartphone smartphone = new Smartphone(nomeApp,username,password);
        System.out.println("Inserire le credenziali");
        String usernameUtente = myScan.nextLine();
        String passwordUtente = myScan.nextLine();
        if(smartphone.login(usernameUtente, passwordUtente)){
            smartphone.avviaApplicazione(nomeApp);
        }else{
            System.out.println("credenziali errate");
        }
        System.out.println("Vuoi vedere le tue credenziali?S/N");
        String rispostaCredenziali = myScan.nextLine();
        if(rispostaCredenziali.equalsIgnoreCase("S")){
            System.out.println(smartphone.getUsername());
            System.out.println(smartphone.getPassword()); 
        }
        //tablet
        System.out.println("Tablet:");
        Tablet tablet = new Tablet(nomeApp);
        tablet.avviaApplicazione(nomeApp);
        System.out.println("Vuoi vedere i tuoi punti e il tuo id?S/N");
        String rispostaTablet = myScan.nextLine();
        if(rispostaTablet.equalsIgnoreCase("S")){
            System.out.println(tablet.getIdDaIncrementare());
            System.out.println(tablet.getPunti()); 
        }
        myScan.close();
        System.out.println("Fine applicazione");

        
    }
}
