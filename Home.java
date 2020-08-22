package TheEaSy18;

import javax.swing.*;
//import javax.swing.border.Border;

import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;


///HOME PAGE.....

public class Home implements ActionListener, MouseListener
{
	JFrame home, f;
	JButton b1, b2, b3, b4;
	JTextArea ta1, ta2;
//	Border br =BorderFactory .createCompoundBorder(BorderFactory.createLineBorder(Color.RED,5),
//			BorderFactory.createLineBorder(Color.BLUE,6));
	Home()
	{
		home=new JFrame("Home - The Easy18");
		
		Color color=new Color(238, 238, 238);
		f=new JFrame("Thanks Giving Page - the EaSy18");
		ta1=new JTextArea("Thank you Sir.....");
		ta2=new JTextArea("   For your....\n\nDedication\n\nHard Work\n\nKind Attention to us ");
		ta1.setBounds(180, 50, 400, 100);
		ta2.setBounds(200, 140, 450, 550);
		ta1.setFont(new Font("Arial", Font.BOLD, 50));
		ta2.setFont(new Font("Arial", Font.PLAIN, 50));
		f.add(ta1); f.add(ta2);
		ta1.setBackground(color); ta2.setBackground(color);
		f.setSize(750, 700);
		f.setLocationRelativeTo(null);
		f. setResizable(false);
//		//f.add(new JLabel(new ImageIcon("C:\\Emdad")));
//		JLabel ll=new JLabel();
//		ll.setIcon(new ImageIcon("C:\\emdad.png"));
//		//ll.setSize(200, 200); 
//		f.add(ll);
		f.setLayout(null);
		
		JLabel l=new JLabel("The EaSy18");
		l.setFont(new Font("Arial",Font.BOLD, 45));
		l.setBounds(240, 250,270, 120);
		l.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e)
			{
				f.setVisible(true);
			}
		});
		b1=new JButton("TIMES TABLE");
		//b1.setBorder(br);
		b2=new JButton("NUMBER CONVERTOR");
		b3=new JButton("Calculator");
		b4=new JButton("IQ QUIZ");
		b1.setFont(new Font("Arial",Font.BOLD, 20));
		b1.setBounds(270, 90, 200, 100);
		b2.setFont(new Font("Arial",Font.BOLD, 20));
		b2.setBounds(235, 440, 270, 100);
		b3.setFont(new Font("Arial",Font.BOLD, 28));
		b3.setBounds(20, 250, 200, 120);
		b4.setFont(new Font("Arial",Font.BOLD, 27));
		b4.setBounds(520, 250, 200, 120);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		home.add(b1); home.add(b2);home.add(b3); home.add(b4); home.add(l);
		home.setSize(750, 700);
		home.setLocationRelativeTo(null);
		home. setResizable(false);
		home.setLayout(null);
		home.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			home.setVisible(false);
			new TT();
		}
		if(e.getSource()==b2)
		{
			home.setVisible(false);
			new NC();
		}
		if(e.getSource()==b3)
		{
			home.setVisible(false);
			new Calc();
		}
		if(e.getSource()==b4)
		{
			home.setVisible(false);
			new IQ();
		}
	}
	
	public static void main(String [] args)
    {
		new Home();
        //new Calc();
    }
}







///TIMES TABLE.......

class TT implements ActionListener
{
	JFrame tt;
	JTextField t;
	JTextArea ta;
	JLabel l;
	JButton HOME,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,generate, bclr, bdel;
	TT()
	{
		tt=new JFrame("TIMES TABLE - The EaSy18");
		t=new JTextField();
		ta=new JTextArea();
		HOME=new JButton("..HOME..");
		b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
        generate=new JButton("Generate");
        
        l=new JLabel();
        
        ta.setBounds(440, 115, 320, 400);
        Color color=new Color(238, 238, 238);
        ta.setBackground(color);
        ta.setEditable(false);
        ta.setFont(new Font("Arial",Font.PLAIN, 25));
        
        tt.add(ta);
        t.setBounds(20,60,300,60);
        t.setFont(new Font("Arial", Font.BOLD, 24));
        b1.setBounds(20,140,90,50);
        b2.setBounds(125,140,90,50);
        b3.setBounds(230,140,90,50);
        
        b4.setBounds(20,210,90,50);
        b5.setBounds(125,210,90,50);
        b6.setBounds(230,210,90,50);
        
        b7.setBounds(20,280,90,50);
        b8.setBounds(125,280,90,50);
        b9.setBounds(230,280,90,50);
        
        bdel.setBounds(20,350,90, 50);
        b0.setBounds(125,350,90,50);
        bclr.setBounds(230,350, 90, 50);
        
        generate.setBounds(90, 420, 160, 50);
        generate.setFont(new Font("Arial", Font.BOLD, 22));
        
        HOME.setBounds(290,550,240,60);
        HOME.setFont(new Font("Arial", Font.PLAIN, 30));
        
        l.setBounds(400, 60, 300, 40);
        l.setFont(new Font("Arial", Font.BOLD, 30));
        
        tt.add(l);
        tt.add(t);
        tt.add(b1);
        tt.add(b2);
        tt.add(b3);
        tt.add(b4);
        tt.add(b5);
        tt.add(b6);
        tt.add(b7);
        tt.add(b8);
        tt.add(b9);
        tt.add(b0);
        tt.add(bclr);
        tt.add(bdel);
        tt.add(generate);
        tt.add(HOME);

        tt.setSize(785, 700);
        
		tt.setLocationRelativeTo(null);
		tt. setResizable(false);
		tt.setLayout(null);
		tt.setVisible(true);
		
		HOME.addActionListener(this);
		b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        generate.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==HOME)
		{
			tt.setVisible(false);
			new Home();
		}
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));
		if(e.getSource()==bclr)
			t.setText("");
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0; i<s.length()-1; i++)
				t.setText(t.getText()+s.charAt(i));
		}
		if(e.getSource()==generate)
		{
			int a=Integer.parseInt(t.getText());
			String S="";
			for(int i=1; i<=10; i++)
			{
				S+=Integer.toString(a)+"  *  "+Integer.toString(i);
				if(i<10) S+="  ";
				S+=" = "+Integer.toString(a*i)+"\n";	
			}
			l.setText("Times Table of "+a);
			ta.setText(S);
			t.setText("");
		}
	}
}







//CALCULATOR STARTED.......


class Calc implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton HOME,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calc()
    {
        f=new JFrame("Calculator - The EaSy18");
        t=new JTextField();
        HOME=new JButton("..HOME..");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
        
        t.setBounds(150,30,400,80);
        t.setFont(new Font("Arial", Font.BOLD, 24));
        b7.setBounds(150,130,90,50);
        b8.setBounds(253,130,90,50);
        b9.setBounds(356,130,90,50);
        bdiv.setBounds(460,130,90,50);
        
        b4.setBounds(150,200,90,50);
        b5.setBounds(253,200,90,50);
        b6.setBounds(356,200,90,50);
        bmul.setBounds(460,200,90,50);
        
        b1.setBounds(150,270,90,50);
        b2.setBounds(253,270,90,50);
        b3.setBounds(356,270,90,50);
        bsub.setBounds(460,270,90,50);
        
        bdec.setBounds(150,340,90,50);
        b0.setBounds(253,340,90,50);
        beq.setBounds(356,340,90,50);
        badd.setBounds(460,340,90,50);
        
        bdel.setBounds(150,410,198,50);
        bclr.setBounds(352,410,198,50);
        HOME.setBounds(240,525,230,60);
        HOME.setFont(new Font("Arial", Font.PLAIN, 30));
        
        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);
        f.add(HOME);
        
        f.setSize(690, 700);
		f.setLocationRelativeTo(null);
		f. setResizable(false);
		f.setLayout(null);
		f.setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        HOME.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==HOME)
    	{
    		f.setVisible(false);
    		new Home();
    	}
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            
            switch(operator)
            {
                case 1: result=a+b;
                    break;
                    
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        if(e.getSource()==bclr)
            t.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
    }
}
