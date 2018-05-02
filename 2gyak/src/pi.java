
public class pi {
	public static void main(String[] args) {
		//Wallis-formula
		
		double pi = 1;
		int darab = 10000000 /2;
		
		for (int i = 1; i <= darab; i++) {
			pi *= 2.0 * i/ (2* i-1);
			pi *= 2.0 * i/ (2* i+1);
		}
		
		System.out.println("Wallis-formula");
		System.out.println("pi/2 erteke: " + pi);
		System.out.println("pi: " + pi*2);
	
		
		//Leibnitz-féle sor:
		pi = 0;
		darab *= 4;
		int elojel = 1;
		
		
		for (int i = 1; i <=darab; i+=2) {
			pi += elojel *1.0 / i;
			elojel *= -1;
		}
		
		System.out.println("Leibnitz-féle sor");
		System.out.println("pi/4 erteke: " + pi);
		System.out.println("pi: " + pi*4);
	}
	
	
	
	
}

