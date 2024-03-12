package EsercizioPanificio;

import java.util.ArrayList;

public class PiattoSpeciale {
    private final String [] tipiPane = {"pane sesamo","pane arabo","pane bianco"}; 
    private final String[] tipiRipieni = {"marmellata","cioccolato","crema"};
    private final float [] prezzoPane = {2f,1.50f,1f};
    private final float [] prezzoRipieni = {1f,1.50f,2f};
    private ArrayList<String> aggiunteUtente = new ArrayList<>();

    public PiattoSpeciale(String[] tipiPane,String[]tipiRipieni,float[] prezzoPane,float[] prezzoRipieni,ArrayList<String> aggiunteUtente) {
        tipiPane=this.tipiPane;
        tipiRipieni=this.tipiRipieni;
        prezzoPane=this.prezzoPane;
        prezzoRipieni=this.prezzoRipieni;
        aggiunteUtente = this.aggiunteUtente;
    }

    public String[] getTipiPane() {
        return tipiPane;
    }

    public String[] getTipiRipieni() {
        return tipiRipieni;
    }

    public float[] getPrezzoPane() {
        return prezzoPane;
    }

    public float[] getPrezzoRipieni() {
        return prezzoRipieni;
    }

    public ArrayList<String> getAggiunteUtente() {
        return aggiunteUtente;
    }

   

    
    

    

    

}
