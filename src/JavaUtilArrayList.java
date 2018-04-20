import java.util.*;

public class JavaUtilArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList1 = new ArrayList<Object>(11);
        for (int i = 0; i < 5; i++) {
            arrayList1.add("object" + (i + 1));
        }
        printList(arrayList1);
        arrayList1.remove(0);
        arrayList1.remove(2);//��ʱ����2ָ��Ĳ���object3��,����object4
        Iterator<Object> it = arrayList1.listIterator();
        while (it.hasNext()) {
            String a = (String) it.next();
            System.out.println(a + " ");
        }
    }

    public static void printList(ArrayList<Object> al) {
        System.out.println("curren list:");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }
    }

}
//<Object>�����������Ϊ�˽��IDE������ʾ,����Ҳ�ǿ������е�
//һ.List����(�ڸ���List��,�����ArrayList��ΪĬ��ѡ��,�����ɾ��Ƶ��ʱʹ��LinkedList,Vector���Ǳ�ArrayList��)
//������List����Ҫ���ص�,��ȷ��ά��Ԫ���ض���˳��,List�������Collection,ʹ�ô˽ӿ��ܹ���ȷ�ؿ���ÿ��Ԫ�ز����λ��
//�û��ܹ�ʹ������(Ԫ����List�е�λ��,���������±�)���˾���Collection�ӿڱر�iterator()������
//1.ArrayList
//ArrayListʵ���˿ɱ��С������,�������Ԫ�ؽ��п����������,���������м�������Ƴ�Ԫ�ص��ٶȺ���
//ÿ��ArrayListʵ������һ������(capacity)�������ڴ洢Ԫ�ص�����Ĵ�С,������������Ų��������Ԫ�ض��Զ�����,���������㷨��û�ж���
//����Ҫ�������Ԫ��ʱ,�ڲ���ǰ���Ե���ensureCapacity()����������ArrayList����������߲���Ч��
//ListIteratorֻӦ�������ɺ���ǰ����ArrayList,���������������ɾ��Ԫ��,��Ϊ���LinkedList����Ҫ��ܶ�