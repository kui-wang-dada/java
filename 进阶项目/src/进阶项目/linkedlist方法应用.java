package ������Ŀ;
import java.util.*;
public class linkedlist����Ӧ�� {
	public static void main(String[] args){
		LinkedList bb=new LinkedList();
		Sp sp1=new Sp("1��","������",15);
		Sp sp2=new Sp("2��","������",13);
		bb.addFirst(sp1);
		bb.addFirst(sp2);
		bb.addLast(sp1);
		bb.addLast(sp2);
		for(int i=0;i<bb.size();i++){
			System.out.println(((Sp)bb.getFirst()).getMingcheng());

		}
	}
}
