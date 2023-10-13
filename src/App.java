import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente ("Mario", "Rossi", 45);
        
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Inserire la data di scadenza della patente"); //input scadenza
        
	    
        System.out.println("anno (aaaa):"); //input anno
	    int anno = scanner.nextInt();
        System.out.println("mese (mm):"); //input mese
	    int mese = scanner.nextInt();
        System.out.println("giorno (gg):"); //input giorno
	    int giorno = scanner.nextInt();

        LocalDate scad_patente= LocalDate.of(anno, mese, giorno);
        LocalDate oggi = LocalDate.now();
        // System.out.println("oggi: " + oggi);

        scad_patente.compareTo(oggi);
        if(scad_patente.compareTo(oggi) >= 0){
            System.out.println("patente valida.");

            System.out.println("-------------------------");
            System.out.println("-    1 - automobile     -");
            System.out.println("-   2 - motocicletta    -");
            System.out.println("-------------------------");           

	        int scelta = scanner.nextInt();

            switch (scelta){
                case 1: {
                    System.out.println("targa:");
	                String targa = scanner.nextLine();

                    System.out.println("modello:");
	                String modello = scanner.nextLine();

                    System.out.println("colore:");
	                String colore = scanner.nextLine();

                    System.out.println("velocità:");
	                int spid = scanner.nextInt();

                    System.out.println("cilindrata:");
	                int cilindrata = scanner.nextInt();

                    System.out.println("porte:");
	                int porte = scanner.nextInt();

                    System.out.println("cavalli:");
	                int cavalli = scanner.nextInt();

                    System.out.println("giorni di noleggio:");
	                int tempo = scanner.nextInt();
                    

                    System.out.println("-------------------------");
                    int prezzo = cavalli * tempo;
                    System.out.println("Prezzo: " + prezzo + "€");

                    break;  
                }
                
                case 2: {
                    System.out.println("targa:");
	                String targa = scanner.nextLine();

                    System.out.println("modello:");
	                String modello = scanner.nextLine();

                    System.out.println("colore:");
	                String colore = scanner.nextLine();

                    System.out.println("velocità:");
	                int spid = scanner.nextInt();

                    System.out.println("cilindrata:");
	                int cilindrata = scanner.nextInt();

                    System.out.println("categoria:");
	                String categoria = scanner.nextLine();

                    System.out.println("tempi:");
	                int tempi = scanner.nextInt();

                    System.out.println("giorni di noleggio:");
	                int tempo = scanner.nextInt();
                    

                    System.out.println("-------------------------");
                    int prezzo = cilindrata / tempi * tempo;
                    System.out.println("Prezzo: " + prezzo + "€");
                    

                    break;
                }

                default: {
                    System.out.println("numero inserito non valido");
                    break;
                }

            }

            System.out.println("Automobile (1) o motociclo (2)?");
        }
        else {System.out.println("patente scaduta.");}

    }
}
