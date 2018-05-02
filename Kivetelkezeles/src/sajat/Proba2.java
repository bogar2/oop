package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba2 {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int meret = 5;
		int egeszTomb[] = new int[meret];
		@SuppressWarnings("resource")
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			boolean rosszAdat= true;
			
			do {
				System.out.println("Kerem adja meg a(z)" + (i+1) + ". egesz szamot!");
				System.out.println("szam:");
				
				try {
					egeszTomb[i] = Integer.parseInt(beolvasas.nextLine());
					rosszAdat = false;
					
				} catch (InputMismatchException  e) {
					System.out.println("nem egesz szamot kaptunk");
					System.out.println("Inp.Mis.");
				}
				catch (NumberFormatException  e) {
					System.out.println("nem egesz szamot kaptunk");
					
				
				} catch ( Exception e) {
				System.out.println("elkaptuk a kivetelt");
				
				}
				
				
			} while (rosszAdat);
			
			
		}
		System.out.println("A beolvasott ertekek: ");
		for (int i : egeszTomb) {
			
			System.out.println(i);
			
		}
	}

}
