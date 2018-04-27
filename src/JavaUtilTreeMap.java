import java.util.*;

public class JavaUtilTreeMap {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("1", "Monday");
		map.put("3", "Wednesday");
		map.put("4", "Thursday");
		map.put("2", "Tuesday");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
		// TreeMap����ĸ�String���Ͷ���ļ�1234��������,��������ʱû������,�������ʱ�Զ�����
	}

}
// ��.Map����
// Mapû�м̳�Collection�ӿ�,Map�ṩkey��value��ӳ��,һ��Map�в�������ͬ��key,ÿ��keyֻ��ӳ��һ��value
// Map�е�Ԫ���Ǽ�ֵ�ɶԵĶ���,��С�����ݿ�,����͵�Ӧ�þ��������ֵ�,����,Map���Է��������м���ɵ�Set��������ֵ��ɵ�Collection
// �����ֵ����ɵ�Set,���һ�����������һ����չ��άMap
// Map�����ֱȽϳ��õ�ʵ��:HashMap��TreeMap
// 2.TreeMap
// TreeMapʵ����SortedMap�Ľӿ�,��TreeSetһ��,�ܸ��ݼ���ֵ�����Զ�����