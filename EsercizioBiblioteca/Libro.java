package EsercizioBiblioteca;

public class Libro {
    private String nome;
    private String autore;
    private int copieDisponibili;
    private int copieInPrestito=0;
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setCopieDisponibili(int copieDisponibili) {
        this.copieDisponibili = copieDisponibili;
    }

    public void setCopieInPrestito(int copieInPrestito) {
        this.copieInPrestito = copieInPrestito;
    }

    public String getNome() {
        return nome;
    }

    public String getAutore() {
        return autore;
    }

    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public int getCopieInPrestito(){
        return copieInPrestito;
    }

   

    public Libro(String nome, String autore, int copieDisponibili) {
        this.nome = nome;
        this.autore = autore;
        this.copieDisponibili = copieDisponibili;
    }

    
    public String toString() {
        return "nome=" + nome + ", autore=" + autore + ", copieDisponibili=" + copieDisponibili;
    }

    


}
