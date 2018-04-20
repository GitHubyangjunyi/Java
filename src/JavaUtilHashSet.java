import java.util.*;

public class JavaUtilHashSet {
    public static void main(String[] args) {
        Set<Object> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        String str1 = new String("xxxx");
        String str2 = new String("xxxx");
        set1.add(str1);
        set1.add(str2);//虽然变量str1和str2实际上引用的是两个不同的内存地址不同的字符串对象
        //但是由于str1.equals(str2)的比较结果为true,因此Set认为他们是相等的对象,所以只加进去一个对象
        Iterator<Object> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
//Set是一种不包含重复元素的Collection集合,即任意两个元素e1和e2都有e1.equals(e2)=false,Set最多只有一个mull元素
//Set与Collection有完全一样的接口,Set接口不保证维护元素的次序,实现Set接口的常用类有HashSet和TreeSet
//1.HashSet
//HashSet是为快速查找而设计的,不保证存放元素有序