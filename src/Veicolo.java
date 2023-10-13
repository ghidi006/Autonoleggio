public class Veicolo {
    private String targa;
    private String modello;
    private String colore;
    private int prezzo_noleggio;
    private int spid;
    private int cilindrata;

    public Veicolo (String targa, String modello, String colore, int prezzo_noleggio, int spid, int cilindrata){
        this.targa = targa;
        this.modello = modello;
        this.colore = colore;
        this.prezzo_noleggio = prezzo_noleggio;
        this.spid = spid;
        this.cilindrata = cilindrata;
    }

    public Veicolo (Veicolo that){
        this.targa = that.targa;
        this.modello = that.modello;
        this.colore = that.colore;
        this.prezzo_noleggio = that.prezzo_noleggio;
        this.spid = that.spid;
        this.cilindrata = that.cilindrata;
    }

    public Veicolo (){
        this.targa = "AA000AA";
        this.modello = "Giocomo";
        this.colore = "Blallo";
        this.prezzo_noleggio = 69420;
        this.spid = 130;
        this.cilindrata = 420;
    }


    public String getTarga(){
        return this.targa;
    }

    public String getModello(){
        return this.modello;
    }

    public String getColore(){
        return this.colore;
    }

    public int getPrezzo_noleggio(){
        return this.prezzo_noleggio;
    }

    public int getSpid(){
        return this.spid;
    }

    public int getCilindrata(){
        return this.cilindrata;
    }


    public void setTarga(){
        this.targa = targa;
    }

    public void setModello(){
        this.modello = modello;
    }

    public void setColore(){
        this.colore = colore;
    }

    public void setPrezzo_noleggio(){
        this.prezzo_noleggio = prezzo_noleggio;
    }

    public void setSpid(){
        this.spid = spid;
    }

    public void setCilindrata(){
        this.cilindrata = cilindrata;
    }

}
