package mydoc;
interface smoket{
	public static final String NAME="С��";
	public abstract void show();
}
interface Game{
	public abstract void show();
}
class Student implements smoket,Game{
	public void show(){
		System.out.println("������");
	}
	public void computerGame(){
		System.out.println("��Ϸ");
	}
}
public class �ӿ� {
	public static void main(String[] args){
		Game s=new Student();
		s.show();
	}
	

}
