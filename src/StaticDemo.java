
class StaticTest {
    static int a = 23;
    static int b = 27;
    static int y = returny();
    public int publicint = 1;
    static private int privateint = 2;

    static int returny() {
        System.out.println("returny()ִ��!");
        return 55;
    }

    static void displaya() {
        System.out.println("a=" + a);
    }

    static void displayy() {
        System.out.println("y=" + y);
    }

    public void displayprivateint() {
        System.out.println("privateint=" + privateint);//���ڿɼ�
    }

    static {//staticģ��
        System.out.println("static blockִ��");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        //�����ǵ�һ�ֲ��Է���
        StaticTest.displaya();
        System.out.println("b=" + StaticTest.b);
        StaticTest.displayy();
        StaticTest sc = new StaticTest();//������ǰ��staticҲ��������ҽ��е�һ�γ�ʼ��
        sc.publicint = 10;
        sc.displayprivateint();
        //sc.privateint=20;//���ɼ�
        //�����ǵڶ��ֲ��Է���
        //StaticTest sc=new StaticTest();
        //���²��Կ���ʵ���������
        NetConnection nc1 = NetConnection.getNetConnection();
        System.out.println("nc1 " + nc1.getClass());
        NetConnection nc2 = NetConnection.getNetConnection();
        System.out.println("nc2 " + nc2.getClass());
        NetConnection nc3 = NetConnection.getNetConnection();
        System.out.println("nc3 " + nc3.getClass());
        NetConnection nc4 = NetConnection.getNetConnection();
        System.out.println("nc4 " + nc4.getClass());
        NetConnection nc5 = NetConnection.getNetConnection();
        System.out.println("nc5 " + nc5.getClass());
        NetConnection nc6 = NetConnection.getNetConnection();
        System.out.println("nc6 " + nc6.getClass());
        NetConnection nc7 = NetConnection.getNetConnection();
        System.out.println("nc7 " + nc7.getClass());
        NetConnection nc8 = NetConnection.getNetConnection();
        System.out.println("nc8 " + nc8.getClass());
        NetConnection nc9 = NetConnection.getNetConnection();
        System.out.println("nc9 " + nc9.getClass());
        NetConnection nc10 = NetConnection.getNetConnection();
        System.out.println("nc10 " + nc10.getClass());
        //NetConnection nc11 = NetConnection.getNetConnection();
        //System.out.println("nc11 " + nc11.getClass());
        //NetConnection nc12 = NetConnection.getNetConnection();
        //System.out.println("nc12 " + nc12.getClass());
    }
}

//ʹ��static������ĳ�Աʹ���ǳ�Ϊ��̬��Ա
//��̬��Ա�洢����Ĵ洢��,���������಻���ھ���������
//�����и���Ķ���������,�ڲ�ͬ��������з��ʾ�̬��Ա,���ʵ�ʱͬһ��
//��̬��Ա������:
//1.ֻ�ܵ�������static����������
//2.����ʹ��this��super�ؼ���
//3.static����齫ֻ��ִ��һ��
//����������,�ڷ���static��Աʱ�ᷢ��static��Ա��ʼ������,�����ڽ�������ʱ��ʼ�����̲����ظ�
//Ҳ����˵�����κη�ʽ��һ��ʹ����ʱ���ʼ�����̽��ᷢ����ֻ����һ��
//��ʱ�����ʼ��������Ҫ��ʼ����̬��Ա����ִ��һЩ��������,������ڹ��캯������ֻ���ڴ�������ʱ�Ż�ִ��
//��ÿ��ʵ�������󶼻�ִ��һ��,û��Ҫ,���Բ�ȡ����staticģ�����ַ�ʽ
//��ʱ����ͼ����ĳ����Ķ������,���԰ѹ��췽������Ϊprivate����
//����ֻ���ڵ�ǰ���д�������
class NetConnection {
    private final static int MAX_CONNECTION_NUM = 10;
    private static int connectionNum = 0;

    private NetConnection() {
        connectionNum++;
    }

    public static NetConnection getNetConnection() {
        if (connectionNum >= MAX_CONNECTION_NUM) {
            return null;
        } else {
            return new NetConnection();
        }
    }

    public void release() {
        connectionNum--;
    }
}