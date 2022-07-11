package Final;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class draw 
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	draw()
	{
		panel.setSize(420,420);
		panel.setBackground(Color.gray);
		panel.setOpaque(true);
		
		frame.add(panel);
		
		frame.setTitle("Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null); //put frame in the middle of the screen
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		draw d = new draw();
	}

}
