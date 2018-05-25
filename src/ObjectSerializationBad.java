import java.io.*;

public class ObjectSerializationBad {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("./ObjectSerializationDir/user.dat"));
			Object obj = in.readObject();
			System.out.println(obj.getClass());
			in.close();
		} catch (Exception e) {
			System.out.println(e.toString());// java.lang.ClassNotFoundException: User
		}
	}

}
// 事实上Java的对象序列化还不是很完美,例如
// 现在将一个对象序列化,并通过网络传送到另一台计算机上
// 先序列化,然后删除User.class文件
// 如果在执行之前不删除User.class文件,程序将会输出class User,这里没有使用User类型,所以不会有编译错误
// 如果删除了User.class文件,就会出现错误
// Java序列化与还原都需要被操作的类的class文件,并且要把class文件放在类路径中,以保证Java虚拟机找得到相关的类文件