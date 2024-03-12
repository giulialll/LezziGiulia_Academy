package EsercizioPanificio;

import java.util.ArrayList;

public class PiattoSpeciale {
    private final String [] tipiPane = {"pane sesamo","pane arabo","pane bianco"}; 
    private final String[] tipiRipieni = {"marmellata","cioccolato","crema"};
    private final float [] prezzoPane = {2f,1.50f,1f};
    private final float [] prezzoRipieni = {1f,1.50f,2f};
    private ArrayList<String> aggiunteUtente = new ArrayList<>();
    private final int prezzoAggiunta = 5;
    private final int baseFissa = 1;

 

    public PiattoSpeciale(String[] tipiPane,String[]tipiRipieni,float[] prezzoPane,float[] prezzoRipieni,ArrayList<String> aggiunteUtente,int prezzoAggiunta,int baseFissa) {
        tipiPane=this.tipiPane;
        tipiRipieni=this.tipiRipieni;
        prezzoPane=this.prezzoPane;
        prezzoRipieni=this.prezzoRipieni;
        aggiunteUtente = this.aggiunteUtente;
        prezzoAggiunta = this.prezzoAggiunta;
        baseFissa = this.baseFissa;

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

    public int getPrezzoAggiunta() {
        return prezzoAggiunta;
    }

    public int getBaseFissa() {
        return baseFissa;
    }

   

    
    

    

    

}
