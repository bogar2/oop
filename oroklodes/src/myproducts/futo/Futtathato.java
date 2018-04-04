package myproducts.futo;

import myproducts.*;

public class Futtathato {

	public static void main(String[] args) {
		Product aru_objektum = new Product("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termek adatai: ");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();
		
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
		
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + aru_objektum.bruttoar());
			
		}
	else if (melyik_dragabb > 0){
		System.out.println("kenyer a dragabb" + kenyer_objektum.bruttoar());
	}else{
		System.out.println("egyenlo az aruk");
	}
		
		Product aru2 = new Kenyer("kenyer2", 210, 15, 1);
		System.out.println("aru2.toString() eredmeny: ");
		System.out.println(aru2);
		System.out.println(((Kenyer) aru2).getMennyiseg());
	}
}