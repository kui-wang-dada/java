package ������;
import java.net.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.*;
public class �ͻ��� extends JFrame implements ActionListener{
	JTextArea jta;
	JScrollPane jsp;
	JButton jb;
	JTextField jtf;
	JPanel jp;
	PrintWriter pw;
	public static void main(String [] args)
	{
		�ͻ��� l1=new �ͻ���();
	}
	public �ͻ���()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jb=new JButton("����");
		jb.addActionListener((ActionListener) this);
		jtf=new JTextField(20);
		jp=new JPanel();
		jp.add(jtf);jp.add(jb);
		this.add(jsp);this.add(jp,"South");
		
		this.setTitle("�ͻ���");
		this.setSize(350,250);
		this.setLocation(500,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		try
		{
			Socket s=new Socket("127.0.0.1",9999);
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			pw=new PrintWriter(s.getOutputStream(),true);
			while(true)
			{
				String xinxi=br.readLine();
				jta.append("������˵��"+xinxi+"\r\n");
			}
		}catch(Exception e){}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
		{
			String xinxi=jtf.getText();
			jta.append("�ͻ���˵��"+xinxi+"\r\n");
			pw.println(xinxi);
			jtf.setText("");
		}
	}
}
