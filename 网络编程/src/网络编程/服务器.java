package ������;
import java.net.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.*;
public class ������ extends JFrame implements ActionListener{
	JTextArea jta;
	JScrollPane jsp;
	JButton jb;
	JTextField jtf;
	JPanel jp;
	PrintWriter pw;
	public static void main(String [] args)
	{
		������ l1=new ������();
	}
	public ������()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jb=new JButton("����");
		jb.addActionListener((ActionListener) this);
		jtf=new JTextField(20);
		jp=new JPanel();
		jp.add(jtf);jp.add(jb);
		this.add(jsp);this.add(jp,"South");
		
		this.setTitle("��������");
		this.setSize(350,250);
		this.setLocation(400,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		try
		{
			ServerSocket ss=new ServerSocket(9999);
			Socket s=ss.accept();
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			pw=new PrintWriter(s.getOutputStream(),true);
			while(true)
			{
				String xinxi=br.readLine();
				jta.append("�ͻ���˵��"+xinxi+"\r\n");
			}
		}catch(Exception e){}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
		{
			String xinxi=jtf.getText();
			jta.append("������˵��"+xinxi+"\r\n");
			pw.println(xinxi);
			jtf.setText("");
		}
	}
}
