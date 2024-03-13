package EsercizioElettronica;

public class Smartphone extends DispositivoElettronico {
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //costruttore di smartphone
    public Smartphone(String username, String password,String nomeApp) {
        super(nomeApp);
        this.username = username;
        this.password = password;
    }

    //metodo del login che controlla se username e password sono corretti
    public void login(String usernameDato,String passwordData){
        if(usernameDato.equalsIgnoreCase(username) && passwordData.equals(password)){
            System.out.println("sei dentro");
        }
        // da completare
    }
    
    //metodo sovrascritto di avviaApplicazione
    @Override
    public String avviaApplicazione(String nomeApp){
        System.out.println("stai usando lo smartphone");
        return super.avviaApplicazione(nomeApp);
    }

    
}
