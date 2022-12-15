package komposisi;

public class mainprogram {
    public static void main(String[] args) {
        // Membuat object mobil
        Mobil odyssey = new Mobil("Honda F23A", 2300);
        /* memanggil atribut dan nilai */
        odyssey.merk = "Honda Odyssey";
        odyssey.start();
        odyssey.run();
        odyssey.stop();
    }
}
