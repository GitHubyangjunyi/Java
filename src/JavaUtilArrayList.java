import java.util.*;

public class JavaUtilArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList1 = new ArrayList<Object>(11);
        for (int i = 0; i < 5; i++) {
            arrayList1.add("object" + (i + 1));
        }
        printList(arrayList1);
        arrayList1.remove(0);
        arrayList1.remove(2);//这时索引2指向的不是object3了,而是object4
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
//<Object>加这个泛型是为了解决IDE问题提示,不加也是可以运行的
//一.List集合(在各种List中,最好以ArrayList作为默认选择,插入或删除频繁时使用LinkedList,Vector总是比ArrayList慢)
//次序是List最重要的特点,它确保维护元素特定的顺序,List是有序的Collection,使用此接口能够精确地控制每个元素插入的位置
//用户能够使用索引(元素在List中的位置,类似数组下标)除了具有Collection接口必备iterator()方法外
//1.ArrayList
//ArrayList实现了可变大小的数组,它允许对元素进行快速随机访问,但是向它中间插入与移除元素的速度很慢
//每个ArrayList实例都有一个容量(capacity)，即用于存储元素的数组的大小,这个容量可随着不断添加新元素而自动增加,但是增长算法并没有定义
//当需要插入大量元素时,在插人前可以调用ensureCapacity()方法来增加ArrayList的容量以提高插入效率
//ListIterator只应该用来由后向前遍历ArrayList,而不是用来插入和删除元素,因为这比LinkedList开销要大很多