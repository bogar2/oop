
public class AlkalmazottatHasznalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alkalmazott alkalmazottobj = new Alkalmazott();
		
		//private modosito meg nem volt 
		//alkalmazottobj.nev = "Kiss Istvan";
		//alkalmazottobj.fizetes = 10;
		
		alkalmazottobj.setNev("Kiss Istvan");
		alkalmazottobj.setFizetes(10);
		
		System.out.println(alkalmazottobj.toString());
		System.out.println(alkalmazottobj);
		
		alkalmazottobj.fizetesNovelese(5);
		System.out.println(alkalmazottobj);

		System.out.println("Alkalmazottam neve: " + alkalmazottobj.getNev());
		
		System.out.println(alkalmazottobj.fizetesIntervallumokKozott(10, 50));
		
		//System.out.println(alkalmazottobj.fizetesIntervallumokKozott(10, 14));
		
		System.out.println(alkalmazottobj.fizetendoAdo());
		
		//alkalmazottobj.fizetesNagyobbMint(masik)
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Kamilla");
		alkalmazott2.setFizetes(35);
		alkalmazott2.fizetesNovelese(11);
		
		System.out.println(alkalmazott2);
		
		System.out.println(alkalmazottobj.fizetesNagyobbMint(alkalmazott2));
		System.out.println(alkalmazott2.fizetesNagyobbMint(alkalmazottobj));
		
		
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("XY");
			alkalmazottak[i].setFizetes((long)(Math.random() *50));
			System.out.println(alkalmazottak[i]);
			
			
		}
		int maxfizetesualkindexe = 0;
		for (int i = 1; i < alkalmazottak.length; i++) {
			
			if (alkalmazottak[i].getFizetes() > alkalmazottak[maxfizetesualkindexe].getFizetes()) {
				maxfizetesualkindexe = i;
				
			}
			
		}
			System.out.println("Legnagyobb fizetes: " +alkalmazottak[maxfizetesualkindexe]);	
		
		
	}

}
