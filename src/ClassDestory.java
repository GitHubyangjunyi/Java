
public class ClassDestory {
    public static void fun(){
        ClassDestory cd=new ClassDestory();
        cd.getClass();
        System.out.println("fun�����������ڴ�");
        System.gc();
    }
    public void finalize(){
        System.out.println("��������");
    }
    public static void main(String[] args) {
        fun();
        System.out.println("�뿪fun�����������ڴ�");
        System.gc();//�������finalize()�Ż�ִ��,finalize()��Object���еķ��� 
    }
    
}