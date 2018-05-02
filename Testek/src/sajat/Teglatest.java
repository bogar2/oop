package sajat;

public class Teglatest extends Hasáb {
	
	private int a;
	private int b;
	
	

	public Teglatest(int magassag, int a, int b) {
		super(magassag);
		this.a = a;
		this.b = b;
	}
	

	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ", getMagassag()="
				+ getMagassag() + "]";
	}



	@Override
	public int getAlapterulet() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
