public class Car extends Thread {
    private String name;
    private Parcheggio p;
    public Car(String name, Parcheggio p) {
        super(name);
        this.p = p;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " entra nel parcheggio");
        p.parcheggia();
       System.out.println(Thread.currentThread().getName() + "  esce");
    }
}