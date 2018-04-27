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
	//由于集合中式String类型的元素,所以输出结果按Unicode编码自动排序

}
// 二.Set集合
// Set是一种不包含重复元素的Collection集合,即任意两个元素e1和e2都有e1.equals(e2)=false,Set最多只有一个mull元素
// Set与Collection有完全一样的接口,Set接口不保证维护元素的次序,实现Set接口的常用类有HashSet和TreeSet
// 2.TreeSet
// TreeSet是保持特定次序的Set,底层为树结构,TreeSet类实现了SortedSet接口,具有排序功能