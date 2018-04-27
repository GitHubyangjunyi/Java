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
		// TreeMap会对四个String类型对象的键1234进行排序,尽管输入时没有排序,但是输出时自动排序
	}

}
// 三.Map集合
// Map没有继承Collection接口,Map提供key到value的映射,一个Map中不能有相同的key,每个key只能映射一个value
// Map中的元素是键值成对的对象,像小型数据库,最典型的应用就是数据字典,另外,Map可以返回其所有键组成的Set和其所有值组成的Collection
// 或其键值对组成的Set,并且还可以像数组一样扩展多维Map
// Map有两种比较常用的实现:HashMap和TreeMap
// 2.TreeMap
// TreeMap实现了SortedMap的接口,和TreeSet一样,能根据键的值进行自动排序