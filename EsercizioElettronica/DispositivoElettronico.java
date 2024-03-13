package EsercizioElettronica;

public class DispositivoElettronico {
    String nomeApp;

    public DispositivoElettronico(String nomeApp){
        nomeApp=this.nomeApp;
    }

    //metodo della classe madre che avvia l'applicazione
    public String avviaApplicazione(String nomeApp){
        System.out.println("l'applicazione si sta avviando e si chiama:");
        return nomeApp;
    }
}
