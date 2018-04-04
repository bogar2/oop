package mypersons;

public class Person {
	private String nev;
	private int kor;
		
	public Person(String nev, int kor){
		this.nev =nev;
		this.kor = kor;
	}
	public String getNev(){
		return nev;
	}
	public int getKor(){
		return kor;
	}
	public boolean koraNagyobbMint(Person masikszemely){
		return kor > masikszemely.kor;
	}
}