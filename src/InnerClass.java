
public class InnerClass {

	private int count;
	public class Student{
		String name;
	 	public Student(String str) {
	 		name=str;
			count++;
	 	}
		public void introduce(){
			 System.out.println("我的名字是"+this.name);
		 }
	 }
	public void recognize(){
			Student stu=new Student("xxx");
			stu.introduce();
			System.out.println("count="+this.count);
			}
	public static void main(String[] args) {
		InnerClass depart=new InnerClass();
		depart.recognize();
	}
}