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
// 一.List集合(在各种List中,最好以ArrayList作为默认选择,插入或删除频繁时使用LinkedList,Vector总是比ArrayList慢)
// 次序是List最重要的特点,它确保维护元素特定的顺序,List是有序的Collection,使用此接口能够精确地控制每个元素插入的位置
// 用户能够使用索引(元素在List中的位置,类似数组下标)除了具有Collection接口必备iterator()方法外
// 2.LinkedList
// LinkedList实现了List接口并允许null元素,此外LinkedList也提供额外的add()/remove()等方法
// 这些操作使得LinkedList可以被用作堆栈stack/队列queue或双向队列deque