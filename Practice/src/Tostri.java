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
			System.out.println("��������ȷ������");
		}
	}
	public void setgender(char gender){
		if(gender=='��'||gender=='Ů'){
			this.gender=gender;
		}else{
			System.out.println("��������ȷ���Ա�");
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
		one.setname("����");
		one.setage(123);
		one.setgender('��');
		two.setname("����");
		two.setage(24);
		two.setgender('��');
		three=two;
		System.out.println(one.getage());
		System.out.println(two.getname());
		System.out.println(three.getname());
	}
}
