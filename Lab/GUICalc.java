package lab1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class GUICalc extends JFrame implements ActionListener {
	JFrame f;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclr,beql;
	static int num1=0,num2=0;
	static double result =0;
	static String op = "";
	GUICalc(){
		f = new JFrame("Calculator");
		t1 = new JTextField();
		t1.setBounds(100, 100, 200, 30);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bclr = new JButton("C");
		beql = new JButton("=");
		b1.setBounds(100, 140, 50, 30);
		b2.setBounds(150, 140, 50, 30);
		b3.setBounds(200, 140, 50, 30);
		badd.setBounds(250, 140, 50, 30);
		b4.setBounds(100, 180, 50, 30);
		b5.setBounds(150, 180, 50, 30);
		b6.setBounds(200, 180, 50, 30);
		bsub.setBounds(250, 180, 50, 30);
		b7.setBounds(100, 220, 50, 30);
		b8.setBounds(150, 220, 50, 30);
		b9.setBounds(200, 220, 50, 30);
		bmul.setBounds(250, 220, 50, 30);
		b0.setBounds(100, 260, 50, 30);
		bclr.setBounds(150, 260, 50, 30);
		beql.setBounds(200, 260, 50, 30);
		bdiv.setBounds(250, 260, 50, 30);
		f.add(t1);
		f.add(b0);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(badd);f.add(bclr);
		f.add(bdiv);f.add(beql);f.add(bmul);f.add(bsub);
		t1.addActionListener(this);b0.addActionListener(this);b1.addActionListener(this);
		b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
		b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);
		b8.addActionListener(this);b9.addActionListener(this);badd.addActionListener(this);
		bsub.addActionListener(this);bdiv.addActionListener(this);bclr.addActionListener(this);
		bmul.addActionListener(this);beql.addActionListener(this);
		f.setSize(420, 420);
		f.setResizable(false);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUICalc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)t1.setText(t1.getText()+"1");
		if(e.getSource()==b2)t1.setText(t1.getText()+"2");
		if(e.getSource()==b3)t1.setText(t1.getText()+"3");
		if(e.getSource()==b4)t1.setText(t1.getText()+"4");
		if(e.getSource()==b5)t1.setText(t1.getText()+"5");
		if(e.getSource()==b6)t1.setText(t1.getText()+"6");
		if(e.getSource()==b7)t1.setText(t1.getText()+"7");
		if(e.getSource()==b8)t1.setText(t1.getText()+"8");
		if(e.getSource()==b9)t1.setText(t1.getText()+"9");
		if(e.getSource()==b0)t1.setText(t1.getText()+"0");
		
		
		if(e.getSource()==badd) {
			num1 = Integer.parseInt(t1.getText());
			op="+";
			t1.setText("");
		}
		if(e.getSource()==bsub) {
			num1 = Integer.parseInt(t1.getText());
			op="-";
			t1.setText("");
		}
		if(e.getSource()==bmul) {
			num1 = Integer.parseInt(t1.getText());
			op="*";
			t1.setText("");
		}
		if(e.getSource()==bdiv) {
			num1 = Integer.parseInt(t1.getText());
			op="/";
			t1.setText("");
		}
		if(e.getSource()==beql) {
			num2 = Integer.parseInt(t1.getText());
			
			switch(op) {
			case "+":
				result=num1+num2;
				num2=0;num1=0;
				break;
			case "-":
				result=num1-num2;
				num2=0;num1=0;
				break;
			case "*":
				result=num1*num2;
				num2=0;num1=0;
				break;
			case "/":
				if(num2==0) {
					try {
						result=num1/num2;
						throw new ArithmeticException("Cannot divide by 0");
						
					}catch(ArithmeticException ex) {
						t1.setText("Error:"+ex.getMessage());
						return;
					}
				}else {
					
					num1=0;num2=0;
				}
				
				break;
				
		}t1.setText(""+result);
			
		}
		if(e.getSource()==bclr) {
			t1.setText("");
		}
		
		
	}

}
