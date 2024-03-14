package EsercizioElettronica;

public class DispositivoElettronico {
    String nomeApp;

    public DispositivoElettronico(String nomeApp){
        nomeApp=this.nomeApp;
    }

    //metodo della classe madre che avvia l'applicazione
    public void avviaApplicazione(String nomeApp){
        System.out.println("l'applicazione " + nomeApp + " si sta avviando");
    }
}
