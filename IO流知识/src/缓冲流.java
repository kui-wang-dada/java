import java.io.*;
public class ������ {
	public static void main(String[] args) throws Exception
	{
		BufferedInputStream hcfz=new BufferedInputStream(new FileInputStream("G:/k.mp3"));
		BufferedOutputStream hczt=new BufferedOutputStream(new FileOutputStream("F:/k.mp3"));
		byte[] hc=new byte[2048];
		int ff;
		ff=hcfz.read(hc);
		while(ff!=(-1))
		{
			hczt.write(hc,0,ff);//Ϊ�˷�ֹ���һ��д�����ݳ����뻺������ͬ
			ff=hcfz.read(hc);
		}
		hczt.flush();
		hczt.close();
		hcfz.close();
		
	}
}
