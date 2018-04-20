
public class JavaUtil {
	public static void main(String[] args) {
		System.out.println("java.util包的介绍:");
	}

}
// 在java.util包中提供了一些实用的类及其方法,例如日期类(Data)/日历类(Calendar)用来产生和获取日期及时间
// 随机数类(Random)产生各种类型的随机数
// 还提供了堆栈(Stack)/向量(Vector)/集合框架(Collection)/位集合(Bitset)以及哈希表(Hashtable)
// 等类来表示相应的数据结构
// Collection是最基本的集合接口,一个Collection代表一组Object,即Collection的元素
// 一些Collection允许相同的元素而另一些不允许,一些能排序而另一些不能排序
// Java SDK不提供直接继承自Collection的类.Java SDK提供的类都继承自Collection的子接口,如List和Set
// 不论Collection的实际类型如何,它都支持一个iterator()的方法，该方法返回一个迭代子
// 使用该迭代子即可逐一遍历Collection中的每一个元素
// Iterator it=collection.iterator();//获得一个迭代子
// while(it.hasNext()){
// System.out.println(it.next());
// }
// 一.List集合(在各种List中,最好以ArrayList作为默认选择,插入或删除频繁时使用LinkedList,Vector总是比ArrayList慢)
// 次序是List最重要的特点,它确保维护元素特定的顺序,List是有序的Collection,使用此接口能够精确地控制每个元素插入的位置
// 用户能够使用索引(元素在List中的位置,类似数组下标)除了具有Collection接口必备iterator()方法外
// List还提供一个listIterator()方法返回一个ListIterator接口和标准的Iterator相比,ListIterator()多了一些add()之类的方法
// list.add(): 添加数据
// list.remove(): 删除数据
// list.removeAll(); 删除所有数据
// list.retainAll(): 保留交集
// list.subList(size1,size2):返回sizel~size2的数据
// 实现List接口的常用类有ArrayList/LinkedList和Vector
// 1.ArrayList
// ArrayList实现了可变大小的数组,它允许对元素进行快速随机访问,但是向它中间插入与移除元素的速度很慢
// 每个ArrayList实例都有一个容量(capacity)，即用于存储元素的数组的大小,这个容量可随着不断添加新元素而自动增加,但是增长算法并没有定义
// 当需要插入大量元素时,在插人前可以调用ensureCapacity()方法来增加ArrayList的容量以提高插入效率
// ListIterator只应该用来由后向前遍历ArrayList,而不是用来插入和删除元素,因为这比LinkedList开销要大很多
// 2.LinkedList
// LinkedList实现了List接口并允许null元素,此外LinkedList也提供额外的add()/remove()等方法
// 这些操作使得LinkedList可以被用作堆栈stack/队列queue或双向队列deque
// 3.Vector
// 向量类(Vector)具有实现类似动态数组的功能,在C/C++中所谓"动态数组"一般使用指针实现,在Java中是没有指针的概念的
// 为了弥补这点缺陷,Jave提供了Vector类
// 创建一个向量类(Vector)的对象后,可以向其中随意地插入不同的类的对象后,既不需要顾及类型也不需要预先选定向量的容量
// 对于预先不知或不愿预先定义数组大小,并需频繁进行查找,可以考虑使用向量类Vector
// 虽然Vector与ArrayList非常类似,但是Vector是同步的,由Vector创建的Iterator接口虽然和ArrayList创建的Iterator接口是同一接口
// 但是因为Vector是同步的,当一个Iterator被创建而且正在被使用,另一个线程改变Vector的状态(例如,添加或删除一些元素)
// 这是若调用Iterator的方法将抛出ConcurrentModificationException异常,因此必须捕获该异常
// 二.Set集合
// Set是一种不包含重复元素的Collection集合,即任意两个元素e1和e2都有e1.equals(e2)=false,Set最多只有一个mull元素
// Set与Collection有完全一样的接口,Set接口不保证维护元素的次序,实现Set接口的常用类有HashSet和TreeSet
// 1.HashSet
// HashSet是为快速查找而设计的,不保证存放元素有序
// 2.TreeSet
// TreeSet是保持特定次序的Set,底层为树结构,TreeSet类实现了SortedSet接口,具有排序功能
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
// 2.TreeMap
// TreeMap实现了SortedMap的接口,和TreeSet一样,能根据键的值进行自动排序