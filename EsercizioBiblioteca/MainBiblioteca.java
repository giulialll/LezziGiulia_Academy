package EsercizioBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(
                "Cosa vuoi fare?\n1)Aggiungere un libro\n2)Prendere in prestito un libro\n3)Restituire un libro\n4)Rimuovere un libro");
        String ripostaUtente = myScan.nextLine();
        switch (ripostaUtente) {
            case "aggiungere libro":
            System.out.println("inserire libro da aggiungere");
            String nomeLibro = myScan.nextLine();
            String autoreLibro = myScan.nextLine();
            int copieDisponibili = myScan.nextInt();
            Libro libro1 = new Libro(nomeLibro, autoreLibro, copieDisponibili);
            biblioteca.aggiungiLibro(libro1);
            break;
        
            default:
                break;
        }

    }
}
