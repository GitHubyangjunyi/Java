
public class ClassDestory {
    public static void fun(){
        ClassDestory cd=new ClassDestory();
        cd.getClass();
        System.out.println("fun方法中清理内存");
        System.gc();
    }
    public void finalize(){
        System.out.println("对象被清理");
    }
    public static void main(String[] args) {
        fun();
        System.out.println("离开fun方法后清理内存");
        System.gc();//加上这句finalize()才会执行,finalize()是Object类中的方法 
    }
    
}