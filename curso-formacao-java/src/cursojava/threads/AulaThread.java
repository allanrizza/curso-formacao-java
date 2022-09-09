package cursojava.threads;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) {
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();
        Thread threadNotificacao = new Thread(thread2);
        threadNotificacao.start();

        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private final static Runnable thread1 = () -> {
        //Código da rotina
        // Código da rotina que quero executar em paralelo
        for(int pos = 1; pos <= 10; pos++) {
            System.out.println("Thread para envio de e-mail " + pos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

    private final static Runnable thread2 = () -> {
        //Código da rotina
        // Código da rotina que quero executar em paralelo
        for(int pos = 1; pos <= 10; pos++) {
            System.out.println("Thread para envio de notificação " + pos);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

}
