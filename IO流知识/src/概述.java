import java.io.*;
public class 概述 {
	public static void main(String[] args)throws Exception{
		FileInputStream fz=new FileInputStream("G:/k.mp3");
		FileOutputStream zt=new FileOutputStream("E:/k.mp3");
		int aa;
		aa=fz.read();
		while(aa!=-1){
			zt.write(aa);
			aa=fz.read();
		}
		zt.flush();//将流中残留的内容全部输出；
		fz.close();
		zt.close();
	}
}
