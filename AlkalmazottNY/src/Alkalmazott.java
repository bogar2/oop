
public class Alkalmazott {
   
    private String nev;
    private int kor;
    private long fizetes;
   
    private static int nyugdijkorhatar = 65;

    public Alkalmazott(String nev, int kor, long fizetes) {
        this.nev = nev;
        this.kor = kor;
        this.fizetes = fizetes;
    }
    public Alkalmazott(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
        this.fizetes = 10000*kor;
    }
    public int hanyev(){
        return nyugdijkorhatar-kor;
    }
    public String adatok(){
        return toString()+" hany ev van hatra: "+ hanyev();
    }
    @Override
    public String toString() {
        return "Alkalmazott nev=" + nev + ", kor=" + kor + ", fizetes="
                + fizetes + " hany ev van hatra nyugdijig "+ hanyev();
    }
    public static void setNyugdijkorhatar(int nyugdijkorhatar){
        Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
        
    }
    
    public static int getNyugdijkorhatar(){
        return nyugdijkorhatar;
        
    }
    
    
    public static Alkalmazott  tobbEveVanHatraNyugdijig(Alkalmazott elso, Alkalmazott masodik) {
        if(elso.hanyev()>masodik.hanyev()){
            return elso;
        }
        else{
            return masodik;
        }
    }
}