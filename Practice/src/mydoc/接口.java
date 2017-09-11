package mydoc;
interface smoket{
	public static final String NAME="小李";
	public abstract void show();
}
interface Game{
	public abstract void show();
}
class Student implements smoket,Game{
	public void show(){
		System.out.println("在吸烟");
	}
	public void computerGame(){
		System.out.println("游戏");
	}
}
public class 接口 {
	public static void main(String[] args){
		Game s=new Student();
		s.show();
	}
	

}
