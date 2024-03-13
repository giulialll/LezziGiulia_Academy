package EsercizioElettronica;

public class Tablet extends DispositivoElettronico{
    private float punti;
    private int id=1;

    //costruttore Tablet
    public Tablet(String nomeApp) {
        super(nomeApp);
        id=this.id++;
    }

    public float getPunti() {
        return punti;
    }

    public void setPunti(float punti) {
        this.punti = punti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    // metodo sovrascritto con aggiunta di punti randomici
    @Override
    public String avviaApplicazione(String nomeApp){
        float punti = (float)Math.random();
        System.out.println("sei sul tuo tablet e hai questi punti: "+ punti);
        return super.avviaApplicazione(nomeApp);
    }
    
   
    
    
}
