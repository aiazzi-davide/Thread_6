
public class Parcheggio {
    int occupati = 0;

    public void parcheggia() {
        String name = Thread.currentThread().getName();
        try {
            while (occupati >= 4) {
                System.out.println(name + " ha trovato occupato");
                long tempoAttesa = (int) (Math.random() * 5000) + 5000;
                wait(tempoAttesa);
            }
                occupati++;
                int tempoSosta = (int) (Math.random() * 3000) + 2000;
                System.out.println(name + " ha parcheggiato, tempoSosta previsto (s): " + (tempoSosta/1000));
                Thread.sleep(tempoSosta);
                occupati--;
                notifyAll();
        } catch (Exception e) {
        }
    }
}
