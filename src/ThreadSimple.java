// import java.lang.*;

public class ThreadSimple extends Thread {

    private int countdowm = 5;
    private static int threadCount = 0;
    private int threadNum = ++threadCount;

    public ThreadSimple() {
        System.out.println("���ڹ���" + threadNum);
    }

    public void run() {
        while (true) {
            System.out.println("�߳�" + threadNum + "(" + countdowm + ")");
            if (--countdowm == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadSimple ts = new ThreadSimple();
            ts.run();
        }
        System.out.println("�Ѿ����������߳�");
    }

}