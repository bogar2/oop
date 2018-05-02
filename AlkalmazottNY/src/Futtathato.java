import java.util.Random;
import java.util.Scanner;

public class Futtathato {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner bemeneta = new Scanner(System.in);
         System.out.println("Kerem az alkalmazottak szamat: ");
         int meret  = bemeneta.nextInt();
         Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
         			alkalmazottak[i] = new Alkalmazott("XY" + (i+1), (int)(Math.random()* Alkalmazott.getNyugdijkorhatar()+1) );
			System.out.println(alkalmazottak[i]);
		}
         
         Alkalmazott.setNyugdijkorhatar(70);
         System.out.println("Valtoztattuk a nyugdijkorhatart.");
         
         for (Alkalmazott alkalmazott : alkalmazottak) {
        	 System.out.println(alkalmazott);
        	 
			
		}
         
         bemeneta.close();
         
         
         
         
    }
   
}