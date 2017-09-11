class person{
	String name="张三";
	int age=12;
	void sing(){
		System.out.println("唱歌");
	}
}
class Student extends person{
	String name="李四";
	int age=15;
	void show(){
		System.out.println(super.name);
	}
	void sing(){
		System.out.println("在课堂上唱歌");
	}
}
class mate extends person{
	void sing(){
		System.out.println("纯爷们在唱歌");
	}
}
public class fuzi {
	public static void main(String[] args){
		Student stu=new Student();
		System.out.println(stu.name);
		stu.show();
		Student c=new Student();
		function(c);
		mate d=new mate();
		function(d);
		
	}
	public static void function(person A){
		A.sing();
	}
}
