import java.util.*;

public class JavaUtilVector {
    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<Object>(11);
        vector1.add("A");
        vector1.add("B");
        vector1.add("C");
        vector1.add("D");
        vector1.add("E");
        System.out.println(vector1);
        vector1.remove("C");
        System.out.println(vector1);
        System.out.println("vector1.size:" + vector1.size());
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }
    }

}
//һ.List����(�ڸ���List��,�����ArrayList��ΪĬ��ѡ��,�����ɾ��Ƶ��ʱʹ��LinkedList,Vector���Ǳ�ArrayList��)
//������List����Ҫ���ص�,��ȷ��ά��Ԫ���ض���˳��,List�������Collection,ʹ�ô˽ӿ��ܹ���ȷ�ؿ���ÿ��Ԫ�ز����λ��
//�û��ܹ�ʹ������(Ԫ����List�е�λ��,���������±�)���˾���Collection�ӿڱر�iterator()������
//3.Vector
//������(Vector)����ʵ�����ƶ�̬����Ĺ���,��C/C++����ν"��̬����"һ��ʹ��ָ��ʵ��,��Java����û��ָ��ĸ����
//Ϊ���ֲ����ȱ��,Java�ṩ��Vector��
//����һ��������(Vector)�Ķ����,��������������ز��벻ͬ����Ķ����,�Ȳ���Ҫ�˼�����Ҳ����ҪԤ��ѡ������������
//����Ԥ�Ȳ�֪��ԸԤ�ȶ��������С,����Ƶ�����в���,���Կ���ʹ��������Vector
//��ȻVector��ArrayList�ǳ�����,����Vector��ͬ����,��Vector������Iterator�ӿ���Ȼ��ArrayList������Iterator�ӿ���ͬһ�ӿ�
//������ΪVector��ͬ����,��һ��Iterator�������������ڱ�ʹ��,��һ���̸߳ı�Vector��״̬(����,��ӻ�ɾ��һЩԪ��)
//����������Iterator�ķ������׳�ConcurrentModificationException�쳣,��˱��벶����쳣