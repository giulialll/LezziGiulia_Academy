package EsercizioBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libri = new ArrayList<>();

    public Biblioteca(){
        
    }

    public Biblioteca(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void aggiungiLibro(Libro libroAggiunto) {
        libri.add(libroAggiunto);
        System.out.println("hai aggiunto il libro alla biblioteca");
    }

    public void rimuoviLibro(Libro libroDaTogliere) {
        libri.remove(libroDaTogliere);
        System.out.println("hai rimosso un libro nella biblioteca");
    }

    public void stampaLibriDisponibili() {

        for (int i = 0; i < libri.size(); i++) {
            System.out.println(libri.get(i).getCopieDisponibili()); 
        }
    }

    public void prestaLibro(String nomeLibroInPrestito) {
        int counterLibriPrestito = 0;
        int counterLibriDisponibili = 0;
        boolean flagPerCopieDisponibili = true;
        boolean flagPerLibroPresente = true;
        for (int i = 0; i < libri.size(); i++) {
            if (nomeLibroInPrestito.equalsIgnoreCase(libri.get(i).getNome())) {
                flagPerLibroPresente = false;
                if (libri.get(i).getCopieDisponibili() > 0) {
                    counterLibriPrestito = libri.get(i).getCopieInPrestito();
                    counterLibriPrestito++;
                    libri.get(i).setCopieInPrestito(counterLibriPrestito);
                    counterLibriDisponibili = libri.get(i).getCopieDisponibili();
                    counterLibriDisponibili--;
                    libri.get(i).setCopieDisponibili(counterLibriDisponibili);
                    flagPerCopieDisponibili = false;
                }
            }
        }
        if (flagPerLibroPresente) {
            System.out.println("libro non presente");
        }
        if (flagPerCopieDisponibili) {
            System.out.println("copie non disponibili");
        }
    }

    public void restituisciLibro(String nomeLibroInPrestito) {
        int counterLibriPrestito = 0;
        int counterLibriDisponibili = 0;
        boolean flagPerLibroPresente = true;
        for (int i = 0; i < libri.size(); i++) {
            if (nomeLibroInPrestito.equalsIgnoreCase(libri.get(i).getNome())) {
                counterLibriPrestito = libri.get(i).getCopieInPrestito();
                counterLibriPrestito--;
                libri.get(i).setCopieInPrestito(counterLibriPrestito);
                counterLibriDisponibili = libri.get(i).getCopieDisponibili();
                counterLibriDisponibili++;
                libri.get(i).setCopieDisponibili(counterLibriDisponibili);
                flagPerLibroPresente = false;
            }
        }
        if (flagPerLibroPresente) {
            System.out.println("libro già restituito");
        }
    }

}