import java.io.*;

class User implements Serializable{
    private int id;
    private String name;
    private String password;
    public User(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public void show(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("password="+password);
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        User u=new User(100,"Jason","Nosaj");
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./ObjectSerializationDir/user.dat"));
        
    }

}
//在某些应用场景中,需要将对象状态保存下来,并在下一次应用程序启动时重新启用被保存的信息
//利用I/O操作可以实现这种需求,例如可以把关键信息按照一定顺序保存到文件中,下次启动时按顺序读入
//Java的序列化可以将任何一个实现了Serialization接口的对象自动转换成一个字节序列
//并且能够在其后将这个字节序列完整恢复为原来的对象
//对于任何对象来说,只要实现了Serialization接口(这个接口仅仅是一个标记接口,没有任何方法,仅仅声明就够了)
//序列化对象的步骤:
//1.需要一个输出目的,因此需要创建某些OutputStream对象,这个OutputStream对象可以指向硬盘上的一个文件,也可以是网络上的一个服务
//2.将OutputStream封装到一个ObjectOutputStream对象内,ObjectOutputStream是一个专门用于对象序列化的类
//3.调用ObjectOutputStream提供的writeObject()方法即可将对象序列化,转换成字节序列,并将其发送到OutputStream所指代的媒介中
////还原成对象的步骤:
//1.用某个InputStream打开硬盘上的文件,或者从网络上获取一个InputStream实例,该实例连接的服务器负责将字节序列发送到客户端
//2.将InputStream封装到一个ObjectInputStream中,ObjectInputStream是一个专门用于还原对象的类
//3.调用ObjectInputStream类提供的readObject()方法,系统构造一个对象,返回一个Object类型的引用,它指向刚刚获得新生的对象
//需要对该引用强制类型转换才能正常使用