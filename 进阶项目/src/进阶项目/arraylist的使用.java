package 进阶项目;
import java.util.*;
public class arraylist的使用 {
	public static void main(String[] args){
		ArrayList aa1=new ArrayList();
		System.out.println("大小为"+aa1.size());
		Xs xs1=new Xs("悟空",500,99);
		Xs xs2=new Xs("八戒",300,78);
		Xs xs3=new Xs("沙僧",200,62);
		Xs xs4=new Xs("小白龙",150,43);
		aa1.add(xs1);
		aa1.add(xs2);
		aa1.add(xs3);
		aa1.add(xs4);
		System.out.println("大小为"+aa1.size());
		for(int i=0;i<aa1.size();i++){
			Xs tv=(Xs)aa1.get(i);
			System.out.println("第"+(i+1)+"个学员的姓名是"+tv.getName());
		}
		System.out.println();
		Xs xs5=new Xs("唐僧",1000,200);
		aa1.add(0,xs5);
		for(int i=0;i<aa1.size();i++){
			Xs tv=(Xs)aa1.get(i);
			System.out.println("第"+(i+1)+"个学员的姓名是"+tv.getName());
		}
		System.out.println();
		aa1.remove(2);
		for(int i=0;i<aa1.size();i++){
			Xs tv=(Xs)aa1.get(i);
			System.out.println("第"+(i+1)+"个学员的姓名是"+tv.getName());
		}
	}
	
}
class Xs{
	private String name;
	private int age;
	private int chengji;
	Xs(String name,int age,int chengji){
		this.name=name;
		this.age=age;
		this.chengji=chengji;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getChengji(){
		return chengji;
	}
}