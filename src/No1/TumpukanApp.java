package No1;
public class TumpukanApp {
        public static void main(String args[]){
        Tumpukan tumpukan = new Tumpukan (5);
        tumpukan.push(8);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println("Nama Saya Adalah Putri Zulfiatuttizki");
      
        System.out.println("nilai yang dihapus = " + tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        tumpukan.push(5);
        tumpukan.baca();
    }
       
}
