public class Cliente {
    private String nome;
    private String cognome;
    private int età;
    


    public Cliente(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    public Cliente(Cliente that){
        this.nome = that.nome;
        this.cognome = that.cognome;
        this.età = that.età;
    }

    public Cliente(){
        this.nome = "Luigi";
        this.cognome = "Verdi";
        this.età = 45;
    }


    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public int getEtà(){
        return this.età;
    }


    public void setNome(){
        this.nome = nome;
    }

    public void setCognome(){
        this.cognome = cognome;
    }

    public void setEtà(){
        this.età = età;
    }
}
