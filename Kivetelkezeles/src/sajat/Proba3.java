package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Proba3 {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int meret = 5;
		int egeszTomb[] = new int[meret];
		@SuppressWarnings("resource")
		
		
		
		for (int i = 0; i < egeszTomb.length; i++) {
			

			try{
				
				InputStreamReader bemenetOlvaso = new InputStreamReader(System.in);
				BufferedReader beolvasas = new BufferedReader(bemenetOlvaso);
				BufferedReader beolvasas2 = new BufferedReader(bemenetOlvaso);
				String sztring = beolvasas.readLine();
				
				
			}catch (IOException e){
			
			}
			
			
			boolean rosszAdat= true;
			
			do {
				System.out.println("Kerem adja meg a(z)" + (i+1) + ". egesz szamot!");
				System.out.println("szam:");
				
				try {
					egeszTomb[i] = Integer.valueOf(beolvasas.nextLine());
					rosszAdat = false;
					
				} catch (InputMismatchException  e) {
					System.out.println("nem egesz szamot kaptunk");
					System.out.println("Inp.Mis.");
				}
				catch (NumberFormatException  e) {
					System.out.println("nem egesz szamot kaptunk");
					
			
				} 
				
			} while (rosszAdat);
			
			
		}
		System.out.println("A beolvasott ertekek: ");
		for (int i : egeszTomb) {
			
			System.out.println(i);
			
		}
	}

}
