package ѧ������ϵͳ;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Xsxx extends AbstractTableModel{
	Vector jilu,ziduan;
	PreparedStatement ps=null;
	Connection ct=null;
	ResultSet rs=null;
	public int getRowCount(){
		return this.jilu.size();
	}
	public int getColumnCount(){
		return this.ziduan.size();
	}
	public Object getValueAt(int hang,int lie){
		return((Vector)this.jilu.get(hang)).get(lie);
	}
	public Xsxx(){
		this.sqlyj("select * from xsxx");
	}
	public Xsxx(String ss){
		this.sqlyj(ss);
	}
	public String getColumnName(int e){
		return (String)this.ziduan.get(e);
	}
	public void sqlyj(String sql){
		ziduan=new Vector();
		ziduan.add("ѧ��");
		ziduan.add("����");
		ziduan.add("�Ա�");
		ziduan.add("����");
		ziduan.add("����");
		ziduan.add("Ժϵ");
		
		jilu=new Vector();
		
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			ct=DriverManager.getConnection("jdbc:odbc:sql server","sa","395487");
			ps=ct.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Vector hang=new Vector();
				hang.add(rs.getString(1));
				hang.add(rs.getString(2));
				hang.add(rs.getString(3));
				hang.add(rs.getInt(4));
				hang.add(rs.getString(5));
				hang.add(rs.getString(6));
				jilu.add(hang);
			}
		}catch(Exception e){}
		finally{
			try{
				if(ps!=null){
					ps.close();
				}
				if(ct!=null){
					ct.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch(Exception e2){}
		}
	}
}
