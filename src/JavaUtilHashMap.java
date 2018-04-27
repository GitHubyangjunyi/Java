import java.util.*;

public class JavaUtilHashMap {
	public static void main(String[] args) {
		HashMap register=new HashMap();
		register.put("1","A");// 方法put()可以初始化Map集合的对象
		register.put("2","B");// 此外Map的键不可能重复,所以可以用Set数据结构来存储
		register.put("3","C");// 而Map的值有可能重复,所以用Collection来存储
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
// 三.Map集合
// Map没有继承Collection接口,Map提供key到value的映射,一个Map中不能有相同的key,每个key只能映射一个value
// Map中的元素是键值成对的对象,像小型数据库,最典型的应用就是数据字典,另外,Map可以返回其所有键组成的Set和其所有值组成的Collection
// 或其键值对组成的Set,并且还可以像数组一样扩展多维Map
// Map有两种比较常用的实现:HashMap和TreeMap
// 1.HashMap
// 在各种Map中,HashMap用于快速查找,集合中的每一个元素对象都包含一对键和值,集合中没有重复的键,但值对象可以重复
// 例如如下程序语句。
// Map map = new HashMap();
// map.put("1","Mon");
// map.put("1","Monday");
// map.put("2","Monday");
// 由于第一次和第二次加人到Map中的键都是1,所以第一次加人的值将被覆盖
// 而第二和第三虽然值相同,但是键不一样,所以分配了不同的地址空间,不会发生覆盖