class person{
	String name="����";
	int age=12;
	void sing(){
		System.out.println("����");
	}
}
class Student extends person{
	String name="����";
	int age=15;
	void show(){
		System.out.println(super.name);
	}
	void sing(){
		System.out.println("�ڿ����ϳ���");
	}
}
class mate extends person{
	void sing(){
		System.out.println("��ү���ڳ���");
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
