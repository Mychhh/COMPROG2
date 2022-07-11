package prefinals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RunCheckerSwapper implements ActionListener
{
	JFrame frm = new JFrame();

	JLabel lbl3 = new JLabel("");
	JTextField tfcheck = new JTextField(15);
	JTextField tfswap = new JTextField(15);
	JButton btncheck = new JButton("CHECK");
	JButton btnswap = new JButton("SWAP");
	FlowLayout fl = new FlowLayout();
	Font bFont = new Font("Arial",Font.BOLD,16);


	public RunCheckerSwapper()
	{
	frm.setVisible(true);
	frm.setSize(280,180);
	frm.setLayout(fl);
	frm.setTitle("Checker And Swapper");
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	lbl3.setFont(bFont);

	frm.add(tfcheck);
	frm.add(btncheck);

	frm.add(lbl3);


	frm.add(tfswap);
	frm.add(btnswap);

	frm.add(lbl3);


	btncheck.addActionListener(this);
	btnswap.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==btncheck)	
		{
 
			tfcheck.getText();
			
			if (tfcheck.getText().equals(tfswap.getText())) {
				String result = "SAME";
				lbl3.setText(result);
			}
	
			else if (tfcheck != tfswap) 
			{	
		String RES = "NOT THE SAME";
		lbl3.setText(RES);	
			}
	
		}
	
		else if(e.getSource()==btnswap)
		{
			String temp = tfcheck.getText();
			tfcheck.setText(tfswap.getText());
			tfswap.setText(temp);    
		}
	}
	
	public static void main (String [] args)
	{
		RunCheckerSwapper os = new RunCheckerSwapper();
	}	
}
