package EsercizioElettronica;

public class Smartphone extends DispositivoElettronico {
    private String username;
    private String password;

    //costruttore di smartphone
    public Smartphone(String nomeApp,String username,String password) {
        super(nomeApp);
        username=this.username;
        password=this.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    

    //metodo del login che controlla se username e password sono corretti
    public boolean login(String usernameDato,String passwordData){
        boolean flag=false;
        if(usernameDato.equalsIgnoreCase(username) && passwordData.equals(password)){
            flag=true;
        }
        return flag;
    }
    
    //metodo sovrascritto di avviaApplicazione con login
    @Override
    public void avviaApplicazione(String nomeApp){
        super.avviaApplicazione(nomeApp);
        System.out.println("stai usando lo smartphone e sei loggato dentro");
    }

    
}
