import java.util.*;

public class JavaUtilTreeSet {
	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add("justin");
		set.add("caterpillar");
		set.add("momor");
		set.add("justin");
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
		System.out.println();
	}
	//���ڼ�����ʽString���͵�Ԫ��,������������Unicode�����Զ�����

}
// ��.Set����
// Set��һ�ֲ������ظ�Ԫ�ص�Collection����,����������Ԫ��e1��e2����e1.equals(e2)=false,Set���ֻ��һ��mullԪ��
// Set��Collection����ȫһ���Ľӿ�,Set�ӿڲ���֤ά��Ԫ�صĴ���,ʵ��Set�ӿڵĳ�������HashSet��TreeSet
// 2.TreeSet
// TreeSet�Ǳ����ض������Set,�ײ�Ϊ���ṹ,TreeSet��ʵ����SortedSet�ӿ�,����������