
class Station {// 模拟车站
    int num = 10;// 默认10张票

    public Station(int num) {// 初始化车站时可设置票的数量
        this.num = num;
        System.out.println("北京西站初始化,总票数=" + this.num);
    }

    public void StartSell() {
        TicketSell shell = new TicketSell(this.num);
        Thread t1 = new Thread(shell);
        Thread t2 = new Thread(shell);
        System.out.println("两个窗口已准备就绪");
        System.out.println("两个窗口已开始售票");
        t1.start();
        t2.start();
    }
}

class TicketSell implements Runnable {// 模拟售票窗口，总票数由车站提供
    int num;

    public TicketSell(int num) {
        this.num = num;
    }

    public void run() {// 售票动作
        while (true) {
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(
                            "售票窗口" + Thread.currentThread().getName() + " sell ticket:1,left ticket: " + --num);
                } else {
                    return;
                }
            }
        }
    }
}

/**
 * ThreadSync
 */
public class ThreadSync {

    public static void main(String[] args) {
        Station s = new Station(10);
        s.StartSell();
    }
}
