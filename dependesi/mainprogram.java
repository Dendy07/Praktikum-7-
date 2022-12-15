public class mainprogram {
    public static void main(String[] args) {
        // Membuat object engine
        Engine mesin = new Engine();
        /* memanggil atribut dan nilai */
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        Mobil odyssey = new Mobil();
        odyssey.merk = "Honda Odyssey";
        odyssey.start(mesin);
        odyssey.run();
        odyssey.stop(mesin);
    }
}
