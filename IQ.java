package TheEaSy18;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
public class IQ implements ActionListener
{
	JFrame f;
	JTextArea[] ta=new JTextArea[5];
	JRadioButton [] jb=new JRadioButton[4];
	ButtonGroup bg;
	JButton HOME, next, submit, start;
	JLabel l;
	int i, j, k=320, c=1, score=0, perform;
	IQ()
	{
		f=new JFrame("IQ QUIZ - The EaSy18");
//		t=new JTextField();
		bg=new ButtonGroup();
		Color color=new Color(238, 238, 238);
		//String S="";
		//System.out.println(a+48);
		j=310;
		for(i=0; i<5; i++)
		{
			if(i<4)
			{
				if(i>0) j+=35;
				jb[i]= new JRadioButton();
				jb[i].setFont(new Font("Arial", Font.BOLD, 25));
				jb[i].setBounds(130, j, 100, 30);
				bg.add(jb[i]); f.add(jb[i]); jb[i].setVisible(false);
			}
			ta[i]=new JTextArea();
			ta[i].setEditable(false);
			ta[i].setFont(new Font("Arial", Font.BOLD, 30));
			ta[i].setBounds(130, 100, 500, 200);
			ta[i].setBackground(color);
			f.add(ta[i]); ta[i].setVisible(false);
		}
		//t.setFont(new Font("Arial", Font.BOLD, 30));
		ta[0].setText("Question 1:\n\nWhat is the missing number?\n\n4,  6,  9,  6,  14,  6, ____");
		ta[1].setText("Question 2:\n\nWhat is the missing number?\n\n144,  121,  100,  ___,  64");
		ta[2].setText("Question 3:\n\nWhat is the missing number?\n\n8,  27,  64,  ___,  216,  343");
		ta[3].setText("Question 4:\n\nWhat is the missing number?\n\n2,  3,  4,  12,  ____,  23, 8");
		ta[4].setText("Question 5:\n\nWhat is the missing number?\n\n243, 162, 108,  72, ____, 32");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HOME=new JButton("..HOME..");
		HOME.setFont(new Font("Arial", Font.PLAIN, 30));
		
		l=new JLabel("The EaSy IQ");
		l.setFont(new Font("Arial", Font.BOLD, 50));
        next=new JButton("NEXT");
        next.setFont(new Font("Arial", Font.BOLD, 30));
        submit=new JButton("SUBMIT");
        submit.setFont(new Font("Arial", Font.BOLD, 30));
        start=new JButton("START");
        start.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        //t.setBounds(20, 45, 340, 70);
        l.setBounds(235, 130, 340, 120);
        next.setBounds(350, 480, 180, 60);
        submit.setBounds(160, 480, 180, 60);
        start.setBounds(260, 280, 240, 80);
        HOME.setBounds(260, 380, 240, 80);
        addlistener();

        
        f.add(HOME); f.add(start); f.add(l);
        f.add(next); f.add(submit); 
        next.setVisible(false); submit.setVisible(false);
        
        f.setSize(750,700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
	}
	private void addlistener()
	{
		HOME.addActionListener(this);
        next.addActionListener(this);
        start.addActionListener(this);
        submit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==HOME)
		{
			//f.dispose();
			f.setVisible(false);
			new Home();
		}
		if(e.getSource()==start)
		{
			HOME.setVisible(false);
			start.setVisible(false);
			ta[0].setVisible(true);
			submit.setVisible(true);
			jb[0].setText("15"); jb[1].setText("17"); jb[2].setText("19"); jb[3].setText("21");
			for(int i=0; i<4; i++) 
				jb[i].setVisible(true);
			perform=1;
		}
		if(e.getSource()==submit)
		{

			int x=0,y=0;
			if(c==1)
			{
				if(jb[2].isSelected())
				{
					x=1; y=1; score+=10;
				}
				for(int i=0; i<4; i++)
					if(jb[i].isSelected()) x=1;
				if(x==0)
					JOptionPane.showMessageDialog(new JFrame(), "Please, select an answer");
				else if(y==1)
					JOptionPane.showMessageDialog(new JFrame(), "Correct Answer");
				else
					JOptionPane.showMessageDialog(new JFrame(),"Wrong Answer");    
			}
			else if(c==2)
			{
				if(jb[3].isSelected())
				{
					x=1; y=1; score+=10;
				}
				for(int i=0; i<4; i++)
					if(jb[i].isSelected()) x=1;
				if(x==0)
					JOptionPane.showMessageDialog(new JFrame(), "Please, select an answer");
				else if(y==1)
					JOptionPane.showMessageDialog(new JFrame(), "Correct Answer");
				else
					JOptionPane.showMessageDialog(new JFrame(),"Wrong Answer");    
			}
			else if(c==3)
			{
				if(jb[1].isSelected())
				{
					x=1; y=1; score+=10;
				}
				for(int i=0; i<4; i++)
					if(jb[i].isSelected()) x=1;
				if(x==0)
					JOptionPane.showMessageDialog(new JFrame(), "Please, select an answer");
				else if(y==1)
					JOptionPane.showMessageDialog(new JFrame(), "Correct Answer");
				else
					JOptionPane.showMessageDialog(new JFrame(),"Wrong Answer");    
			}
			else if(c==4)
			{
				if(jb[0].isSelected())
				{
					x=1; y=1; score+=10;
				}
				for(int i=0; i<4; i++)
					if(jb[i].isSelected()) x=1;
				if(x==0)
					JOptionPane.showMessageDialog(new JFrame(), "Please, select an answer");
				else if(y==1)
					JOptionPane.showMessageDialog(new JFrame(), "Correct Answer");
				else
					JOptionPane.showMessageDialog(new JFrame(),"Wrong Answer");    
			}
			else if(c==5)
			{
				if(jb[1].isSelected())
				{
					x=1; y=1; score+=10;
				}
				for(int i=0; i<4; i++)
					if(jb[i].isSelected()) x=1;
				if(x==0)
					JOptionPane.showMessageDialog(new JFrame(), "Please, select an answer");
				else if(y==1)
					JOptionPane.showMessageDialog(new JFrame(), "Correct Answer");
				else
					JOptionPane.showMessageDialog(new JFrame(),"Wrong Answer");
			}
			if(x==1)
			{
				submit.setVisible(false);
				next.setVisible(true);
			}
		}
		if(e.getSource()==next)
		{
			next.setVisible(false);
			if(c==5)
			{
				for(int i=0; i<4; i++) jb[i].setVisible(false);
				HOME.setBounds(260, 520, 240, 80);
				ta[4].setBounds(200, 280, 350, 220);
				ta[4].setText("Correct Answer: "+(score/10)+"\n\nScore         : "+score+"\n\nAccuracy      : "+((double)(((double)(score))/50)*100)+"%");
				HOME.setVisible(true); //l.setVisible(false);
			}
			else
			{
				ta[c-1].setVisible(false);
				ta[c].setVisible(true); 
				if(c==1) 
				{
					jb[0].setText("90"); jb[1].setText("85"); jb[2].setText("75"); jb[3].setText("81");
				}
				else if(c==2)
				{
					jb[0].setText("129"); jb[1].setText("125"); jb[2].setText("117"); jb[3].setText("112");
				}
				else if(c==3) 
				{
					jb[0].setText("6"); jb[1].setText("5"); jb[2].setText("7"); jb[3].setText("10");
				}
				else  
				{
					jb[0].setText("40"); jb[1].setText("48"); jb[2].setText("56"); jb[3].setText("60");
				}
				submit.setVisible(true); c++; perform=1;
			}
		}
	}
}
