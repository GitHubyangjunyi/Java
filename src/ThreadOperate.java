
public class ThreadOperate {

    public static int i = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("�߳�1����");
                i += 5;
                System.out.println("�߳�1��������˳�");
            }

        };
        t1.start();
        try {
            // ��t1���2��,���2���t1ûִ����,��main�̼߳���ִ��
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ��Ȼt1�̲߳��ִ��,iΪ0,��Ӻ�mian�߳��õ�t1�̵߳Ľ��Ϊ 5
        System.out.println("i��ֵΪ: " + i);
    }

}