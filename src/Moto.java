public class Moto extends Veicolo{
    private String categoria;
    private int tempi;


    public Moto(String categoria, int tempi){
        this.tempi = tempi;
        this.categoria = categoria;
    }

    public Moto(Moto that){
        this.tempi = that.tempi;
        this.categoria = that.categoria;
    }

    public Moto(){
        this.tempi = 4;
        this.categoria = "Strada";
    }


    public String getCategoria(){
        return this.categoria;
        
    }

    public int getTempi(){
        return this.tempi;
    }


    public void setCategoria(){
        this.categoria = categoria;
    }

    public void setTempi(){
        this.tempi = tempi;
    }
}