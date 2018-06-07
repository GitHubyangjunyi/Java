// import java.lang.*;

public class ThreadSimple extends Thread {

    private int countdowm = 5;
    private static int threadCount = 0;
    private int threadNum = ++threadCount;

    public ThreadSimple() {
        System.out.println("正在构造" + threadNum);
    }

    public void run() {
        while (true) {
            System.out.println("线程" + threadNum + "(" + countdowm + ")");
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
        System.out.println("已经启动所有线程");
    }

}