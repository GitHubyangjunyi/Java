import java.util.*;

public class JavaUtilHashMap {
	public static void main(String[] args) {
		HashMap register=new HashMap();
		register.put("1","A");// ����put()���Գ�ʼ��Map���ϵĶ���
		register.put("2","B");// ����Map�ļ��������ظ�,���Կ�����Set���ݽṹ���洢
		register.put("3","C");// ��Map��ֵ�п����ظ�,������Collection���洢
		register.put("4","D");
		System.out.println("The HashMap holds"+register.size()+"elements");
		System.out.println(register);
		System.out.println("The keys are:");
		Set s=register.keySet();
		Iterator ikey=s.iterator();
		while (ikey.hasNext()) {
			System.out.println("\t"+ikey.next());
		}
		System.out.println("\n");
		System.out.println("The values are:");
		Collection sv=register.values();
		Iterator ivalue=sv.iterator();
		while (ivalue.hasNext()) {
			System.out.println("\t"+ivalue.next());
		}
	}

}
// ��.Map����
// Mapû�м̳�Collection�ӿ�,Map�ṩkey��value��ӳ��,һ��Map�в�������ͬ��key,ÿ��keyֻ��ӳ��һ��value
// Map�е�Ԫ���Ǽ�ֵ�ɶԵĶ���,��С�����ݿ�,����͵�Ӧ�þ��������ֵ�,����,Map���Է��������м���ɵ�Set��������ֵ��ɵ�Collection
// �����ֵ����ɵ�Set,���һ�����������һ����չ��άMap
// Map�����ֱȽϳ��õ�ʵ��:HashMap��TreeMap
// 1.HashMap
// �ڸ���Map��,HashMap���ڿ��ٲ���,�����е�ÿһ��Ԫ�ض��󶼰���һ�Լ���ֵ,������û���ظ��ļ�,��ֵ��������ظ�
// �������³�����䡣
// Map map = new HashMap();
// map.put("1","Mon");
// map.put("1","Monday");
// map.put("2","Monday");
// ���ڵ�һ�κ͵ڶ��μ��˵�Map�еļ�����1,���Ե�һ�μ��˵�ֵ��������
// ���ڶ��͵�����Ȼֵ��ͬ,���Ǽ���һ��,���Է����˲�ͬ�ĵ�ַ�ռ�,���ᷢ������