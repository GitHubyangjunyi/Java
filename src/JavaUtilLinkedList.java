import java.util.*;

public class JavaUtilLinkedList {
	public static void main(String[] args) {
		LinkedList<Object> linkedList1 = new LinkedList<Object>();
		linkedList1.add("B");
		linkedList1.add("C");
		linkedList1.add("D");
		linkedList1.add("E");
		linkedList1.add("G");
		linkedList1.add("F");
		linkedList1.addLast("Z");
		linkedList1.addFirst("A");
		linkedList1.remove(2);
		linkedList1.removeFirst();
		System.out.println("Original contents of linkedList1: " + linkedList1);
	}

}
// һ.List����(�ڸ���List��,�����ArrayList��ΪĬ��ѡ��,�����ɾ��Ƶ��ʱʹ��LinkedList,Vector���Ǳ�ArrayList��)
// ������List����Ҫ���ص�,��ȷ��ά��Ԫ���ض���˳��,List�������Collection,ʹ�ô˽ӿ��ܹ���ȷ�ؿ���ÿ��Ԫ�ز����λ��
// �û��ܹ�ʹ������(Ԫ����List�е�λ��,���������±�)���˾���Collection�ӿڱر�iterator()������
// 2.LinkedList
// LinkedListʵ����List�ӿڲ�����nullԪ��,����LinkedListҲ�ṩ�����add()/remove()�ȷ���
// ��Щ����ʹ��LinkedList���Ա�������ջstack/����queue��˫�����deque