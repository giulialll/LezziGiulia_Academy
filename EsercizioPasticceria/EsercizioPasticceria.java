package EsercizioPasticceria;


import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioPasticceria {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Scanner myScan2 = new Scanner(System.in);
        // inizializzazione e assegnamento degli array
        String[] basi = {"Pan di Spagna","Biscotto","Pasta sfoglia"};
        String [] ripieni = {"Crema","Marmellata","Cioccolato"};
        String [] frutte = {"Fragole", "Banana","Mela"};
        String [] decorazioni = {"Glassa","Zucchero a velo","Gocce di cioccolato"};
        ArrayList<String> scelteUtente = new ArrayList<>();
        //scelta iniziale con switch
        System.out.println("Vuoi la scelta manuale scegli 1 oppure scelta randomica scegli 2");
        

        // scelta della base
        System.out.println("Scegli la base tra le seguenti: ");
        for(int i=0;i<basi.length;i++){
            System.out.println(basi[i]);
        }
        String baseScelta = myScan.nextLine();
        // controllo sulla risposta dell'utente
        boolean controlloBase = true; 
        for(int i=0;i<basi.length;i++){
            if(baseScelta.equalsIgnoreCase(basi[i])){
                controlloBase = false;
            }
        }
        // con una variabile booleana controllo se l'utente ha inserito un elemento presente nella lista
        if(controlloBase){
            System.out.println("errore questo elemento non è presente nella lista");
            baseScelta = myScan.nextLine();
        }else{
            scelteUtente.add(baseScelta);
        }
        //scelta dei ripieni
        System.out.println("Scegli i ripieni tra i seguenti: ");
        for(int i=0;i<ripieni.length;i++){
            System.out.println(ripieni[i]);
        }
        String ripienoScelto = myScan.nextLine();
        // controllo sulla risposta dell'utente
        boolean controlloRipieno = true; 
        for(int i=0;i<ripieni.length;i++){
            if(ripienoScelto.equalsIgnoreCase(ripieni[i])){
                controlloRipieno = false;
            }
        }
         // con una variabile booleana controllo se l'utente ha inserito un elemento presente nella lista
         if(controlloRipieno){
            System.out.println("errore questo elemento non è presente nella lista");
            ripienoScelto = myScan.nextLine();
        }else{
            scelteUtente.add(ripienoScelto);
        }
        //scelta delle frutte
        System.out.println("Scegli le frutte tra i seguenti: ");
        for(int i=0;i<frutte.length;i++){
            System.out.println(frutte[i]);
        }
        String fruttaScelta = myScan.nextLine();
        // controllo sulla risposta dell'utente
        boolean controlloFrutta = true; 
        for(int i=0;i<frutte.length;i++){
            if(fruttaScelta.equalsIgnoreCase(frutte[i])){
                controlloFrutta = false;
            }
        }
         // con una variabile booleana controllo se l'utente ha inserito un elemento presente nella lista
         if(controlloFrutta){
            System.out.println("errore questo elemento non è presente nella lista");
            fruttaScelta = myScan.nextLine();
        }else{
            scelteUtente.add(fruttaScelta);
        }
        //scelta delle decorazioni
        System.out.println("Scegli le decorazioni tra i seguenti: ");
        for(int i=0;i<decorazioni.length;i++){
            System.out.println(decorazioni[i]);
        }
        String decorazioneScelta = myScan.nextLine();
        // controllo sulla risposta dell'utente
        boolean controlloDecorazione = true; 
        for(int i=0;i<decorazioni.length;i++){
            if(decorazioneScelta.equalsIgnoreCase(decorazioni[i])){
                controlloDecorazione = false;
            }
        }
         // con una variabile booleana controllo se l'utente ha inserito un elemento presente nella lista
         if(controlloDecorazione){
            System.out.println("errore questo elemento non è presente nella lista");
            decorazioneScelta = myScan.nextLine();
        }else{
            scelteUtente.add(decorazioneScelta);
        }
        myScan.close();



    }
}
