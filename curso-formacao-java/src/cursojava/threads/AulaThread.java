package cursojava.threads;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            public void run() {
                //Código da rotina
                // Código da rotina que quero executar em paralelo
                for(int pos = 0; pos <= 10; pos++) {
                    System.out.println("Teste sleep " + pos);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }.start(); /* Start liga a thread que fica processando paralelamente */



        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }
}
