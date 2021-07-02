package No2;
public class AntrianApp {
    public static void main(String args []){
        Antrian antrian = new Antrian (5);
        antrian.enqueue(8);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama Saya Adalah Putri Zulfiaturrizki");
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        
    }
}
