package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba1 {
	
	

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
					egeszTomb[i] = beolvasas.nextInt();
					rosszAdat = false;
					
				} catch (InputMismatchException  e) {
					System.out.println("elkaptuk a kivetelt");
					
				
				} catch ( Exception e) {
				System.out.println("elkaptuk a kivetelt");
				
				}
				finally{
					beolvasas.nextLine();
				}
				
			} while (rosszAdat);
			
			
		}
		System.out.println("A beolvasott ertekek: ");
		for (int i : egeszTomb) {
			
			System.out.println(i);
			
		}
	}

}
