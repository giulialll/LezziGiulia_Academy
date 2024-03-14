package EsercizioElettronica;

public class Tablet extends DispositivoElettronico{
    private float punti;
    private int idDaIncrementare;
    private int idIniziale=1;

    //costruttore Tablet,ogni volta che verrà creato un oggetto di tipoTablet
    //l'id incrementerà di 1 e punti sarà creato randomico 
    public Tablet(String nomeApp){
        super(nomeApp);
        idDaIncrementare=this.idIniziale++;
        punti = (float)Math.random();
    }

    public float getPunti() {
        return punti;
    }

    public int getIdDaIncrementare() {
        return idDaIncrementare;
    }


    // metodo sovrascritto con aggiunta di punti randomici
    @Override
    public void avviaApplicazione(String nomeApp){
        super.avviaApplicazione(nomeApp);
        System.out.println("stai utilizzando un tablet");
    }
    
   
    
    
}
