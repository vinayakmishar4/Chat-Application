package org.chatapp.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame
{
	int count;
	public UserView()
	{
		count=0;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Login");
		JLabel login=new JLabel("Login");
		login.setFont(new Font("Times New Roman",Font.BOLD,40));
		Container con=this.getContentPane();
		// with this function label is add to container
		con.add(login);
		login.setBounds(150, 70, 200, 60);
		con.setLayout(null);
		JButton b1=new JButton("Login");
		b1.setFont(new Font("Times New Roman",Font.ITALIC,20));
	    b1.setBounds(150, 325, 150, 50);
	    // it is used to perfom action when button is clicked
	    b1.addActionListener(new ActionListener() 
	    { 
	    	@Override
	       public void actionPerformed(ActionEvent Event)
	       {
	    	   count=count+1;
	    	   login.setText("Count " + count);
	       }
	    });
	    con.add(b1);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\VINAYAKMISHRA\\Downloads\\login-icon-in-trendy-flat-style-isolated-on-white-background-approach-symbol-for-your-web-site-design-logo-app-ui-illustration-eps10-flat-style-for-graphic-design-vector.jpg"));
	}
    public static void main(String []args)
    {
    	UserView user=new UserView();
    	
    }
}
