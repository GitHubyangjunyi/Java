
public class ThreadOperate {

    public static int i = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程1启动");
                i += 5;
                System.out.println("线程1完成任务退出");
            }

        };
        t1.start();
        try {
            // 让t1插队2秒,如果2秒后t1没执行完,则main线程继续执行
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 不然t1线程插队执行,i为0,插队后mian线程拿到t1线程的结果为 5
        System.out.println("i的值为: " + i);
    }

}