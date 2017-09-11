package shujuku;
import java.util.*;
import java.sql.*;
public class Shujuku 
{
	Connection ct=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	String a="sun.jdbc.odbc.JdbcOdbcDriver";
	String b="jdbc:odbc:sql server";
	String c="sa";
	String d="395487";
	public Shujuku()
	{
		try
		{
			Class.forName(a);
			ct=DriverManager.getConnection(b,c,d);
		}catch(Exception e){}
	}
	public ResultSet query(String sql,String[] paras)
	{
		try
		{
			ps=ct.prepareStatement(sql);
			for(int i=0;i<paras.length;i++)
			{
				ps.setString(i+1, paras[i]);
			}
			rs=ps.executeQuery();
		}catch(Exception e){}
		return rs;
	}
	public void close()
	{
		try
		{
			if(ps!=null) ps.close();
			if(rs!=null) rs.close();
			if(ct!=null) ct.close();
	
		}catch(Exception e){}
	}
}
