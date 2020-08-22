package TheEaSy18;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

//NUMBER CONVERTER...

public class NC implements ActionListener
{
	JFrame f;
	JButton[] jb=new JButton[16];
	JButton HOME,generate,binary, octal, hexa, decimal,bdel,bclr;
	JTextField t;
	JTextArea ta;
	JLabel l;
	JLabel[] jl=new JLabel[4];
	int i,j=48, c;
	NC()
	{
		f=new JFrame("NUMBER CONVERTOR - The EaSy18");
		t=new JTextField();
		ta=new JTextArea();
		ta.setEditable(false);
		ta.setFont(new Font("Arial", Font.PLAIN, 25));
		Color color=new Color(238, 238, 238);
		ta.setBackground(color);
		String S="";
		//System.out.println(a+48);
		for(i=0; i<16; i++)
		{
			if(i>9) j=55;
			jb[i]=new JButton(S+(char)(j+i));
			jb[i].setFont(new Font("Arial", Font.BOLD, 15));
			f.add(jb[i]);     jb[i].addActionListener(this);
		}
		
		t.setFont(new Font("Arial", Font.BOLD, 30));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HOME=new JButton("..HOME..");
		HOME.setFont(new Font("Arial", Font.PLAIN, 30));
		
		l=new JLabel("From Which Base:");
		l.setFont(new Font("Arial", Font.BOLD, 30));
        bdel=new JButton("Delete");
        bdel.setFont(new Font("Arial", Font.BOLD, 30));
        bclr=new JButton("Clear");
        bclr.setFont(new Font("Arial", Font.BOLD, 30));
        generate=new JButton("Generate");
        generate.setFont(new Font("Arial", Font.BOLD, 30));
        
        binary=new JButton("Bin");
        octal=new JButton("Oct");
        hexa=new JButton ("Hex");
        decimal=new JButton ("Deci");
        addlistener();
        
        t.setBounds(20, 45, 340, 70);
        l.setBounds(420, 30, 280, 60);
        binary.setBounds(500, 100, 120, 60);
        binary.setFont(new Font("Arial", Font.BOLD, 20));
        octal.setBounds(390, 180, 120, 60);
        octal.setFont(new Font("Arial", Font.BOLD, 20));
        decimal.setBounds(610, 180, 120, 60);
        decimal.setFont(new Font("Arial", Font.BOLD, 20));
        hexa.setBounds(500, 260, 120, 60);
        hexa.setFont(new Font("Arial", Font.BOLD, 20));
        ta.setBounds(380, 370, 455, 200);
        HOME.setBounds(260, 580, 240, 60);

        
        f.add(HOME); f.add(l); f.add(binary); f.add(decimal); f.add(hexa); f.add(octal);
        f.add(t); f.add(ta); f.add(bdel); f.add(bclr); f.add(generate);
        
        f.setSize(850,700);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
    }
	private void addlistener()
	{
		HOME.addActionListener(this);
        generate.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        binary.addActionListener(this);
        octal.addActionListener(this);
        hexa.addActionListener(this);
        decimal.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==HOME)
		{
			//f.dispose();
			f.setVisible(false);
			new Home();
		}
		if(e.getSource()==binary)
		{
			t.setText(""); c=2;
			jb[0].setBounds(20, 140, 165, 70); 
			jb[1].setBounds(195, 140, 165, 70);
			
			bdel.setBounds(20,  230, 165, 70); 
			bclr.setBounds(195, 230, 165, 70);
			generate.setBounds(90, 320, 200, 70);
			
			jb[0].setVisible(true); jb[1].setVisible(true);
			for(int i=2; i<16; i++) 
				jb[i].setVisible(false);
		}
		if(e.getSource()==decimal)
		{
			t.setText(""); c=10;
			for(int i=10; i<16; i++)
				jb[i].setVisible(false);
			
			jb[1].setBounds(20, 140, 110, 60);
			jb[2].setBounds(135, 140, 110, 60);
			jb[3].setBounds(250, 140, 110, 60);
			
			jb[4].setBounds(20, 210, 110, 60);
			jb[5].setBounds(135, 210, 110, 60);
			jb[6].setBounds(250, 210, 110, 60);
			
			jb[7].setBounds(20, 280, 110, 60);
			jb[8].setBounds(135, 280, 110, 60);
			jb[9].setBounds(250, 280, 110, 60);
			
			bdel.setBounds(20, 350, 110, 60);
			jb[0].setBounds(135, 350, 110, 60);
			bclr.setBounds(250, 350, 110, 60);
			generate.setBounds(90, 420, 200, 70);
			
			for(int i=0; i<10; i++)
				jb[i].setVisible(true);
		}
		if(e.getSource()==hexa)
		{
			t.setText(""); c=16;
			jb[1].setBounds(20, 140, 80, 60);
			jb[2].setBounds(107, 140, 80, 60);
			jb[3].setBounds(194, 140, 80, 60);
			jb[4].setBounds(280, 140, 80, 60);
			
			jb[5].setBounds(20, 210, 80, 60);
			jb[6].setBounds(107, 210, 80, 60);
			jb[7].setBounds(194, 210, 80, 60);
			jb[8].setBounds(280, 210, 80, 60);
			
			jb[9].setBounds(20, 280, 80, 60);
			jb[10].setBounds(107, 280, 80, 60);
			jb[11].setBounds(194, 280, 80, 60);
			jb[12].setBounds(280, 280, 80, 60);
			
			jb[13].setBounds(20, 350, 80, 60);
			jb[14].setBounds(107, 350, 80, 60);
			jb[15].setBounds(194, 350, 80, 60);
			jb[0].setBounds(280, 350, 80, 60);
			
			bdel.setBounds(20, 420, 165, 60);
			bclr.setBounds(195, 420, 165, 60);
			generate.setBounds(90, 490, 200, 70);
			
			for(int i=0; i<16; i++)
				jb[i].setVisible(true);
		}
		if(e.getSource()==octal)
		{
			t.setText(""); c=8;
			for(int i=8; i<16; i++)
				jb[i].setVisible(false);
			
			jb[1].setBounds(20, 140, 80, 70);
			jb[2].setBounds(107, 140, 80, 70);
			jb[3].setBounds(194, 140, 80, 70);
			jb[4].setBounds(280, 140, 80, 70);
			
			jb[5].setBounds(20, 220, 80, 70);
			jb[6].setBounds(107, 220, 80, 70);
			jb[7].setBounds(194, 220, 80, 70);
			jb[0].setBounds(280, 220, 80, 70);
			
			bdel.setBounds(20, 310, 165, 70);
			bclr.setBounds(195, 310, 165, 70);
			generate.setBounds(90, 390, 200, 70);
			
			for(int i=0; i<8; i++)
				jb[i].setVisible(true);
		}
		if(e.getSource()==bclr)
			t.setText("");
		if(e.getSource()==bdel)
		{
			String S=t.getText();
			t.setText("");
			for(i=0; i<S.length()-1; i++)
				t.setText(t.getText()+S.charAt(i));
		}
		if(e.getSource()==generate)
		{
			String S=t.getText(); 
			t.setText("");
			if(S.length()==0) S="0";
			String S_bin, S_deci, S_hex, S_oct, S_out;
			S_deci=Integer.toString((int)Integer.parseInt(S,c));
			S_bin=Integer.toBinaryString((int)Integer.parseInt(S,c));
			S_oct=Integer.toOctalString((int)Integer.parseInt(S,c));
			S_hex=Integer.toHexString((int)Integer.parseInt(S,c));
			S_out="In Decimal : "+S_deci+"\n"+"In Binary    : "+S_bin+"\n"+"In Octal      : "+S_oct+"\n"+"In Hexadec: "+S_hex;
			ta.setText(S_out);
		}
		for(int i=0; i<16; i++)
			if(e.getSource()==jb[i])
				t.setText(t.getText().concat(jb[i].getText()));
	}
	
}
