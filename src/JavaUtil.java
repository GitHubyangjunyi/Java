
public class JavaUtil {
	public static void main(String[] args) {
		System.out.println("java.util���Ľ���:");
	}

}
// ��java.util�����ṩ��һЩʵ�õ��༰�䷽��,����������(Data)/������(Calendar)���������ͻ�ȡ���ڼ�ʱ��
// �������(Random)�����������͵������
// ���ṩ�˶�ջ(Stack)/����(Vector)/���Ͽ��(Collection)/λ����(Bitset)�Լ���ϣ��(Hashtable)
// ��������ʾ��Ӧ�����ݽṹ
// Collection��������ļ��Ͻӿ�,һ��Collection����һ��Object,��Collection��Ԫ��
// һЩCollection������ͬ��Ԫ�ض���һЩ������,һЩ���������һЩ��������
// Java SDK���ṩֱ�Ӽ̳���Collection����.Java SDK�ṩ���඼�̳���Collection���ӽӿ�,��List��Set
// ����Collection��ʵ���������,����֧��һ��iterator()�ķ������÷�������һ��������
// ʹ�øõ����Ӽ�����һ����Collection�е�ÿһ��Ԫ��
// Iterator it=collection.iterator();//���һ��������
// while(it.hasNext()){
// System.out.println(it.next());
// }
// һ.List����(�ڸ���List��,�����ArrayList��ΪĬ��ѡ��,�����ɾ��Ƶ��ʱʹ��LinkedList,Vector���Ǳ�ArrayList��)
// ������List����Ҫ���ص�,��ȷ��ά��Ԫ���ض���˳��,List�������Collection,ʹ�ô˽ӿ��ܹ���ȷ�ؿ���ÿ��Ԫ�ز����λ��
// �û��ܹ�ʹ������(Ԫ����List�е�λ��,���������±�)���˾���Collection�ӿڱر�iterator()������
// List���ṩһ��listIterator()��������һ��ListIterator�ӿںͱ�׼��Iterator���,ListIterator()����һЩadd()֮��ķ���
// list.add(): �������
// list.remove(): ɾ������
// list.removeAll(); ɾ����������
// list.retainAll(): ��������
// list.subList(size1,size2):����sizel~size2������
// ʵ��List�ӿڵĳ�������ArrayList/LinkedList��Vector
// 1.ArrayList
// ArrayListʵ���˿ɱ��С������,�������Ԫ�ؽ��п����������,���������м�������Ƴ�Ԫ�ص��ٶȺ���
// ÿ��ArrayListʵ������һ������(capacity)�������ڴ洢Ԫ�ص�����Ĵ�С,������������Ų��������Ԫ�ض��Զ�����,���������㷨��û�ж���
// ����Ҫ�������Ԫ��ʱ,�ڲ���ǰ���Ե���ensureCapacity()����������ArrayList����������߲���Ч��
// ListIteratorֻӦ�������ɺ���ǰ����ArrayList,���������������ɾ��Ԫ��,��Ϊ���LinkedList����Ҫ��ܶ�
// 2.LinkedList
// LinkedListʵ����List�ӿڲ�����nullԪ��,����LinkedListҲ�ṩ�����add()/remove()�ȷ���
// ��Щ����ʹ��LinkedList���Ա�������ջstack/����queue��˫�����deque
// 3.Vector
// ������(Vector)����ʵ�����ƶ�̬����Ĺ���,��C/C++����ν"��̬����"һ��ʹ��ָ��ʵ��,��Java����û��ָ��ĸ����
// Ϊ���ֲ����ȱ��,Jave�ṩ��Vector��
// ����һ��������(Vector)�Ķ����,��������������ز��벻ͬ����Ķ����,�Ȳ���Ҫ�˼�����Ҳ����ҪԤ��ѡ������������
// ����Ԥ�Ȳ�֪��ԸԤ�ȶ��������С,����Ƶ�����в���,���Կ���ʹ��������Vector
// ��ȻVector��ArrayList�ǳ�����,����Vector��ͬ����,��Vector������Iterator�ӿ���Ȼ��ArrayList������Iterator�ӿ���ͬһ�ӿ�
// ������ΪVector��ͬ����,��һ��Iterator�������������ڱ�ʹ��,��һ���̸߳ı�Vector��״̬(����,��ӻ�ɾ��һЩԪ��)
// ����������Iterator�ķ������׳�ConcurrentModificationException�쳣,��˱��벶����쳣
// ��.Set����
// Set��һ�ֲ������ظ�Ԫ�ص�Collection����,����������Ԫ��e1��e2����e1.equals(e2)=false,Set���ֻ��һ��mullԪ��
// Set��Collection����ȫһ���Ľӿ�,Set�ӿڲ���֤ά��Ԫ�صĴ���,ʵ��Set�ӿڵĳ�������HashSet��TreeSet
// 1.HashSet
// HashSet��Ϊ���ٲ��Ҷ���Ƶ�,����֤���Ԫ������
// 2.TreeSet
// TreeSet�Ǳ����ض������Set,�ײ�Ϊ���ṹ,TreeSet��ʵ����SortedSet�ӿ�,����������
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
// 2.TreeMap
// TreeMapʵ����SortedMap�Ľӿ�,��TreeSetһ��,�ܸ��ݼ���ֵ�����Զ�����