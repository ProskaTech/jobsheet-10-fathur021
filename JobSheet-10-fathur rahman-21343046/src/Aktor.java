
/**
 *
 * Created by 21343046_fathur rahman
 */

public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n,int u){ //aktor adalah constructor
        nama=n;
        umur=u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : "+ nama);
        System.out.println("Umurku : "+ umur +" tahun");
    }
    
    public static void main(String[] args){
        Aktor a;
        a = new Aktor("Crhis Evan",33);
        a.tampilAktor();
        System.out.println("==========");
        
        a = new Aktor("Tom Holand",23);
        a.tampilAktor();
        System.out.println("==========");
    }
}
