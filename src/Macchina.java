public class Macchina extends Veicolo{
    private int porte;
    private int cavalli;


    public Macchina (int porte, int cavalli, int cilindrata){
        this.porte = porte;
        this.cavalli = cavalli;
    }

    public Macchina (Macchina that){
        this.porte = that.porte;
        this.cavalli = that.cavalli;
    }

    public Macchina (){
        this.porte = 70;
        this.cavalli = 69;
    }


    public int getPorte(){
        return this.porte;
    }

    public int getCavalli(){
        return this.cavalli;
    }


    public void setPorte(){
        this.porte = porte;
    }

    public void setCavalli(){
        this.cavalli = cavalli;
    }

}