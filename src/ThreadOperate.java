
public class ThreadOperate {

	public static int i = 0;

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("�߳�1����");
				for (int j = 0; j < 10000000; j++) {
					i = 1;
				}
				i = 1000;
				System.out.println("�߳�1i��ֵΪ: " + i);
				System.out.println("�߳�1��������˳�");
			}

		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("�߳�2����");
				for (int j = 0; j < 10000000; j++) {
					i = 2;
				}
				i = 2000;
				System.out.println("�߳�2i��ֵΪ: " + i);
				System.out.println("�߳�2��������˳�");
			}

		};
		t1.start();
		t2.start();
		try {
			// ��t1���2��,���2���t1ûִ����,��main�̼߳���ִ��
			t2.join(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ��Ȼt1�̲߳��ִ��,iΪ0,��Ӻ�mian�߳��õ�t1�̵߳Ľ��Ϊ 5
		System.out.println("i��ֵΪ: " + i);
	}

}
// i������ÿ�����ж�����ȷ��