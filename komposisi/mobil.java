package komposisi;

public class mobil {
    public String merk;
    public Engine mesin;

public Mobil(String merkMesin, int cc)
{

mesin = new Engine();
mesin.merk = merkMesin
;

mesin.cc = cc;
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
