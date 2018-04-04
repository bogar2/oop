package mypersons;

public class Adult extends Person {
	private String munkahely;

	public Adult(String nev, int kor, String munkahely) {
		super(nev, kor);
		this.munkahely = munkahely;
	}

	public String getMunkahely() {
		return munkahely;
	}

	public void setMunkahely(String munkahely) {
		this.munkahely = munkahely;
	}
	
	

}
