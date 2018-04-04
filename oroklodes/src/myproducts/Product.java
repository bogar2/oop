package myproducts;

public class Product {
	private String nev;
	private int ar;
	private int afakulcs;
	
	public Product(String nev, int ar, int afakulcs) {
		this.nev = nev;
		this.ar = ar;
		this.afakulcs = afakulcs;
	}
	
	public int bruttoar(){
		return this.ar*(100 + afakulcs)/100 ;
		
	}

	@Override
	public String toString() {
		return "Az aru neve: " + nev  + " , Bruttoar " + bruttoar();
	}
	public void netto_arat_novel(int szazalek){
		ar =(int)(ar * (1+ szazalek /100.0));
		
	}
	 public int dragabb_e(Product masik_aru){
		 if (bruttoar() > masik_aru.bruttoar()) {
			return 1;
		}else if (bruttoar() < masik_aru.bruttoar()){
			return 0;
		}else {
			return -1; 
		}
	 }
	
	 
	 
}
