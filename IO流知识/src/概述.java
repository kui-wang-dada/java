import java.io.*;
public class ���� {
	public static void main(String[] args)throws Exception{
		FileInputStream fz=new FileInputStream("G:/k.mp3");
		FileOutputStream zt=new FileOutputStream("E:/k.mp3");
		int aa;
		aa=fz.read();
		while(aa!=-1){
			zt.write(aa);
			aa=fz.read();
		}
		zt.flush();//�����в���������ȫ�������
		fz.close();
		zt.close();
	}
}
