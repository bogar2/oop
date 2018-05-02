package sajat.proba;

import sajat.*;

public class Futtathato {

	public static void main(String[] args) {
		Henger henger1 = new Henger(1, 2);
		Hasáb henger2 = new Henger(3,4);
		
		System.out.println(henger1);
		System.out.println(henger1.getTerfogat());
		
		Teglatest teglatest = new Teglatest(5,6,7);
		System.out.println(teglatest);
		
		if (henger1.nagyobbE(teglatest)) {
			System.out.println("henger1 nagyobb terfogatu ");
			
		} else {
			System.out.println("teglat. nagyobb terfogatu");

		}
		
	}

}
