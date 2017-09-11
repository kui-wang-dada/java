class DOG{
	private String name;
	private int age;
	private char gender;
	public void setname(String name){
		this.name=name;
	}
	public void setage(int age){
		if(age<100&&age>0){
			this.age=age;
		}else{
			System.out.println("请输入正确的年龄");
		}
	}
	public void setgender(char gender){
		if(gender=='男'||gender=='女'){
			this.gender=gender;
		}else{
			System.out.println("请输入正确的性别");
		}
		
	}
	public String getname(){
		return this.name;
	}
	public int getage(){
		return this.age;
	}
	public char getgender(){
		return this.gender;
	}
	
}
public class Tostri {
	public static void main(String[] args){
		DOG one=new DOG();
		DOG two=new DOG();
		DOG three=new DOG();
		one.setname("王逵");
		one.setage(123);
		one.setgender('男');
		two.setname("王迪");
		two.setage(24);
		two.setgender('男');
		three=two;
		System.out.println(one.getage());
		System.out.println(two.getname());
		System.out.println(three.getname());
	}
}
