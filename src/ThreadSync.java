
class Station {// ģ�⳵վ
    int num = 10;// Ĭ��10��Ʊ

    public Station(int num) {// ��ʼ����վʱ������Ʊ������
        this.num = num;
        System.out.println("������վ��ʼ��,��Ʊ��=" + this.num);
    }

    public void StartSell() {
        TicketSell shell = new TicketSell(this.num);
        Thread t1 = new Thread(shell);
        Thread t2 = new Thread(shell);
        System.out.println("����������׼������");
        System.out.println("���������ѿ�ʼ��Ʊ");
        t1.start();
        t2.start();
    }
}

class TicketSell implements Runnable {// ģ����Ʊ���ڣ���Ʊ���ɳ�վ�ṩ
    int num;

    public TicketSell(int num) {
        this.num = num;
    }

    public void run() {// ��Ʊ����
        while (true) {
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(
                            "��Ʊ����" + Thread.currentThread().getName() + " sell ticket:1,left ticket: " + --num);
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
