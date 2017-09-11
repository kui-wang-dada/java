import java.util.*;
class fulei{
	void BX(){
		System.out.println("我要变形");
	}
}
class ztx extends fulei{
	void BX(){
		System.out.println("直条型在变形");
	}
}
class szx extends fulei{
	void BX(){
		System.out.println("山字形在变形");
	}
}
class tzx extends fulei{
	void BX(){
		System.out.println("田字形在变形");
	}
}
class lzx extends fulei{
	void BX(){
		System.out.println("L字形在变形");
	}
}
class zzx extends fulei{
	void BX(){
		System.out.println("Z字形在变形");
	}
}

public class 俄罗斯方块 {
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			Random A=new Random();
			int r=A.nextInt(4);
			fulei fk=null;
			switch(r){
			case 0:
				fk=new ztx();
				break;
			case 1:
				fk=new szx();
				break;
			case 2:
				fk=new tzx();
				break;
			case 3:
				fk=new lzx();
				break;
			case 4:
				fk=new zzx();
				break;
			}
			fk.BX();
	}
	}
}
