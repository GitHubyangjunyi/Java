
public class ThrowsTest2 {
    static int x=0;
    static int y=0;
    public static void testEx() throws ArithmeticException {
        if (x!=0) {
            y=100/x;
        }
        else{
            throw new ArithmeticException("����Ϊ����쳣");
        }
    }
        public static void main(String[] args) {
            try {
                testEx();
                System.out.println("xxxx");//��һ��䲻��ִ��
            } catch (ArithmeticException e) {
                System.out.println("��������Ϊ��");
            }
        }
    }
//�ؼ���throws��������һ�����������׳����쳣,������쳣���������������׳��쳣�ķ�ʽ,throws�Ǳ��������쳣�ķ�ʽ
//�����׳����쳣��throws�Ӿ���ָ�����쳣������������
//��Error���RuntimeException���������������쳣����Ҫ�ڷ���������ָ��,�������쳣����Java������쳣,�޷���Ԥ
//Java������һ���쳣�Ǽ���쳣,���ڳ�����Ӧ�ñ�������쳣,���������ȫ������쳣,��������쳣
//��throws�쳣˵������ָ���п��ܷ�����Ҫ�����쳣
//testEx()��û�д����쳣,����ͨ��throws���쳣�׸�������,��Ϊ�����ߵ�main()���������쳣