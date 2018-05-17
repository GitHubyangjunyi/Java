import java.io.*;

class User implements Serializable {
	private static final long serialVersionUID = 8590877962809615004L;
	private int id;
	private String name;
	private String password;

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void show() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("password=" + password);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}

public class ObjectSerialization {
	public static void main(String[] args) {
		User u = new User(100, "Jason", "Nosaj");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./ObjectSerializationDir/user.dat"));
			out.writeObject(u);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("./ObjectSerializationDir/user.dat"));
			Object obj = in.readObject();
			in.close();
			User user = (User) obj;
			user.show();
		} catch (Exception e) {

		}
	}

}
// ��ĳЩӦ�ó�����,��Ҫ������״̬��������,������һ��Ӧ�ó�������ʱ�������ñ��������Ϣ
// ����I/O��������ʵ����������,������԰ѹؼ���Ϣ����һ��˳�򱣴浽�ļ���,�´�����ʱ��˳�����
// Java�����л����Խ��κ�һ��ʵ����Serialization�ӿڵĶ����Զ�ת����һ���ֽ�����
// �����ܹ����������ֽ����������ָ�Ϊԭ���Ķ���
// �����κζ�����˵,ֻҪʵ����Serialization�ӿ�(����ӿڽ�����һ����ǽӿ�,û���κη���,���������͹���)
// ���л�����Ĳ���:
// 1.��Ҫһ�����Ŀ��,�����Ҫ����ĳЩOutputStream����,���OutputStream�������ָ��Ӳ���ϵ�һ���ļ�,Ҳ�����������ϵ�һ������
// 2.��OutputStream��װ��һ��ObjectOutputStream������,ObjectOutputStream��һ��ר�����ڶ������л�����
// 3.����ObjectOutputStream�ṩ��writeObject()�������ɽ��������л�,ת�����ֽ�����,�����䷢�͵�OutputStream��ָ����ý����
//// ��ԭ�ɶ���Ĳ���:
// 1.��ĳ��InputStream��Ӳ���ϵ��ļ�,���ߴ������ϻ�ȡһ��InputStreamʵ��,��ʵ�����ӵķ����������ֽ����з��͵��ͻ���
// 2.��InputStream��װ��һ��ObjectInputStream��,ObjectInputStream��һ��ר�����ڻ�ԭ�������
// 3.����ObjectInputStream���ṩ��readObject()����,ϵͳ����һ������,����һ��Object���͵�����,��ָ��ոջ�������Ķ���
// ��Ҫ�Ը�����ǿ������ת����������ʹ��
// User�಻����������������,������������String���͵ĳ�Ա����,����ϵͳ��,User���������������������String���������
// Ҫ��ȷ���л�,����Ҫ���л�User����,��Ҫ��ȷ�����л�����String����
// �������л����������˶����ȫ��ͼ,���ܹ����ٶ���������������,������������ָ��Ķ���(������)