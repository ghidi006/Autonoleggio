public class Patente{
    private String scad_patente;
    

    public Patente (String scad_patente){
        this.scad_patente = scad_patente;
        
    }
    public Patente (Patente that){
        this.scad_patente = that.scad_patente;
        
    }
    public Patente (){
        this.scad_patente = "2001-01-01";
        
    }

    public String getScad_patente(){
        return this.scad_patente;
    }
    
    public void setScad_patente(){
        this.scad_patente = scad_patente;
    }


}
