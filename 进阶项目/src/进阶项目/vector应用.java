package 进阶项目;
import java.util.*;
public class vector应用 {
	public static void main(String[] args){
		Vector cc=new Vector();
		Sp sp1=new Sp("001","巧克力",20f);
		Sp sp2=new Sp("002","蓝莓",15f);
		cc.add(sp1);
		cc.add(sp2);
		for(int i=0;i<cc.size();i++){
			System.out.println(((Sp)cc.get(i)).getMingcheng());
		}
	}
}
