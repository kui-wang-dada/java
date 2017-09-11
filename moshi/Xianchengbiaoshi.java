package moshi;
import java.util.*;
public class Xianchengbiaoshi {
	public static HashMap hm=new HashMap<String,Xiancheng>();
	public static void addXiancheng(String uid,Xiancheng xc)
	{
		hm.put(uid, xc);
	}
	public static Xiancheng getXiancheng(String uid)
	{
		return (Xiancheng)hm.get(uid);
	}
	public static String getZaixianyonghu()
	{
		Iterator it=hm.keySet().iterator();
		String res="";
		while(it.hasNext())
		{
			res+=it.next().toString()+" ";
		}
		return res;
	}
	
}
