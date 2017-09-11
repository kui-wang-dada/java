import java.io.*;
public class 缓冲流 {
	public static void main(String[] args) throws Exception
	{
		BufferedInputStream hcfz=new BufferedInputStream(new FileInputStream("G:/k.mp3"));
		BufferedOutputStream hczt=new BufferedOutputStream(new FileOutputStream("F:/k.mp3"));
		byte[] hc=new byte[2048];
		int ff;
		ff=hcfz.read(hc);
		while(ff!=(-1))
		{
			hczt.write(hc,0,ff);//为了防止最后一次写入数据长度与缓冲区不同
			ff=hcfz.read(hc);
		}
		hczt.flush();
		hczt.close();
		hcfz.close();
		
	}
}
