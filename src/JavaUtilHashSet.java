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
        set1.add(str2);//��Ȼ����str1��str2ʵ�������õ���������ͬ���ڴ��ַ��ͬ���ַ�������
        //��������str1.equals(str2)�ıȽϽ��Ϊtrue,���Set��Ϊ��������ȵĶ���,����ֻ�ӽ�ȥһ������
        Iterator<Object> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
//Set��һ�ֲ������ظ�Ԫ�ص�Collection����,����������Ԫ��e1��e2����e1.equals(e2)=false,Set���ֻ��һ��mullԪ��
//Set��Collection����ȫһ���Ľӿ�,Set�ӿڲ���֤ά��Ԫ�صĴ���,ʵ��Set�ӿڵĳ�������HashSet��TreeSet
//1.HashSet
//HashSet��Ϊ���ٲ��Ҷ���Ƶ�,����֤���Ԫ������