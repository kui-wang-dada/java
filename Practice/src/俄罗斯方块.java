import java.util.*;
class fulei{
	void BX(){
		System.out.println("��Ҫ����");
	}
}
class ztx extends fulei{
	void BX(){
		System.out.println("ֱ�����ڱ���");
	}
}
class szx extends fulei{
	void BX(){
		System.out.println("ɽ�����ڱ���");
	}
}
class tzx extends fulei{
	void BX(){
		System.out.println("�������ڱ���");
	}
}
class lzx extends fulei{
	void BX(){
		System.out.println("L�����ڱ���");
	}
}
class zzx extends fulei{
	void BX(){
		System.out.println("Z�����ڱ���");
	}
}

public class ����˹���� {
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
