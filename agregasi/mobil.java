package agregasi;

public class mobil {
    public String merk;
    public Engine mesin;

public Mobil(Engine e) {
mesin = e;
}

    public void start() {
        mesin.start();
    }

    public void stop() {
        mesin.stop();
    }

    public void run() {
        System.out.println("Mobil running... ");
    }
}
