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
// ��ʵ��Java�Ķ������л������Ǻ�����,����
// ���ڽ�һ���������л�,��ͨ�����紫�͵���һ̨�������
// �����л�,Ȼ��ɾ��User.class�ļ�
// �����ִ��֮ǰ��ɾ��User.class�ļ�,���򽫻����class User,����û��ʹ��User����,���Բ����б������
// ���ɾ����User.class�ļ�,�ͻ���ִ���
// Java���л��뻹ԭ����Ҫ�����������class�ļ�,����Ҫ��class�ļ�������·����,�Ա�֤Java������ҵõ���ص����ļ�