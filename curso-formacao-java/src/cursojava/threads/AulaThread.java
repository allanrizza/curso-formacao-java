package cursojava.threads;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {
        for(int pos = 0; pos <= 10; pos++) {
            Thread.sleep(1000);
            System.out.println("Teste sleep " + pos);
        }
    }
}
