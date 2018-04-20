import java.util.*;

public class JavaUtilVector {
    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<Object>(11);
        vector1.add("A");
        vector1.add("B");
        vector1.add("C");
        vector1.add("D");
        vector1.add("E");
        System.out.println(vector1);
        vector1.remove("C");
        System.out.println(vector1);
        System.out.println("vector1.size:" + vector1.size());
        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }
    }

}
//一.List集合(在各种List中,最好以ArrayList作为默认选择,插入或删除频繁时使用LinkedList,Vector总是比ArrayList慢)
//次序是List最重要的特点,它确保维护元素特定的顺序,List是有序的Collection,使用此接口能够精确地控制每个元素插入的位置
//用户能够使用索引(元素在List中的位置,类似数组下标)除了具有Collection接口必备iterator()方法外
//3.Vector
//向量类(Vector)具有实现类似动态数组的功能,在C/C++中所谓"动态数组"一般使用指针实现,在Java中是没有指针的概念的
//为了弥补这点缺陷,Java提供了Vector类
//创建一个向量类(Vector)的对象后,可以向其中随意地插入不同的类的对象后,既不需要顾及类型也不需要预先选定向量的容量
//对于预先不知或不愿预先定义数组大小,并需频繁进行查找,可以考虑使用向量类Vector
//虽然Vector与ArrayList非常类似,但是Vector是同步的,由Vector创建的Iterator接口虽然和ArrayList创建的Iterator接口是同一接口
//但是因为Vector是同步的,当一个Iterator被创建而且正在被使用,另一个线程改变Vector的状态(例如,添加或删除一些元素)
//这是若调用Iterator的方法将抛出ConcurrentModificationException异常,因此必须捕获该异常