
public class OuterClass {
    private int count = 6;

    public void doInner(final int finalint) {
        int size = 33;//��ʱ�ֲ�����size
        class InnerClass {
            public String output() {//�Ծֲ�����size���ʷǷ�
                return ("�ⲿ��count=" + count + "\n" + "�ֲ�����size=" + size + "\n" +"����finalint=" + finalint);//�ֲ������ܷ��ʵ�����˵���ʲ���???
            }
        }
        InnerClass inner = new InnerClass();
        System.out.println(inner.output());
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.doInner(9);
    }
}
//�ⲿ�������ж�����ڲ�����������еľֲ�����ʾ��
//�ڲ���������ⲿ���һ���������ж���,��ʱ�ڲ�����Է��ʷ������еľֲ�����
//��ֻ�����ڸ�������������,���÷�����������ʱ,�ڲ���Ķ��󽫲��ܷ���
//���ⲿ�෽�����ж�����ڲ���ֻ�����ڶ������������д����ڲ���Ķ���
//��Ӧ�ڲ�����������ܳ����ڶ��������﷨��֮��