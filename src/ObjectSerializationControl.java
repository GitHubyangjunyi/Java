import java.io.*;

class UserTransient implements Serializable {
	private static final long serialVersionUID = 8590877962809615004L;
	private int id;
	private String name;
	private transient String password;// 增加transient(瞬时)关键字,不序列密码

	public UserTransient(int id, String name, String password) {
		super();
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

public class ObjectSerializationControl {
	public static void main(String[] args) {
		UserTransient u = new UserTransient(100, "Jason", "Nosaj");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./ObjectSerializationDir/ser.dat"));
			out.writeObject(u);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("./ObjectSerializationDir/ser.dat"));
			Object obj = in.readObject();
			in.close();
			UserTransient user = (UserTransient) obj;
			user.show();
		} catch (Exception e) {

		}
	}

}
// 为了有效控制序列化信息,可以使用transient(瞬时)关键字逐个字段地关闭序列化
// password虽然没有值,但经过+运算符连接后,null引用会自动被转换成字符串"null"