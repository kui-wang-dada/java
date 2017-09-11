package 进阶项目;
import java.util.*;
public class linkedlist方法应用 {
	public static void main(String[] args){
		LinkedList bb=new LinkedList();
		Sp sp1=new Sp("1号","方便面",15);
		Sp sp2=new Sp("2号","冰激凌",13);
		bb.addFirst(sp1);
		bb.addFirst(sp2);
		bb.addLast(sp1);
		bb.addLast(sp2);
		for(int i=0;i<bb.size();i++){
			System.out.println(((Sp)bb.getFirst()).getMingcheng());

		}
	}
}
