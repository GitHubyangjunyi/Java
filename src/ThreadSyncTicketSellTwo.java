
public class ThreadSyncTicketSellTwo implements Runnable {
    int num = 10;

    public void run() {
        while (true) {
            shell();
        }
    }

    public synchronized void shell() {
        if (num > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "��Ʊ:" + --num);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        ThreadSyncTicketSellTwo shell = new ThreadSyncTicketSellTwo();
        Thread t1 = new Thread(shell);
        Thread t2 = new Thread(shell);
        Thread t3 = new Thread(shell);
        Thread t4 = new Thread(shell);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}