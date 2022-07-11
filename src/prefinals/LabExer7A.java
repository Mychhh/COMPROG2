package prefinals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class LabExer7A  extends JFrame implements MouseListener {

//flow layout		
		FlowLayout f1 = new FlowLayout();
		
		Font firstObject = new Font("Arial", Font.BOLD, 100);
		Font secondObject = new Font("Century", Font.BOLD, 20);
//label	
		JLabel number1 = new JLabel("1");
		JLabel number2 = new JLabel("2");
		JLabel number3 = new JLabel("3");
		JLabel number4 = new JLabel("4");
		JLabel number5 = new JLabel("5");
		JLabel number6 = new JLabel("6");
		JLabel number7 = new JLabel("7");
		JLabel number8 = new JLabel("8");
		JLabel number9 = new JLabel("9");
		JLabel result = new JLabel();

//random number for user to guess and counter for users attempt
		Random random = new Random();
		int num, counter;

		public LabExer7A() {
			super("Number Finder");
			
			setSize(600,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(f1);
			
			num = 1 + random.nextInt(9);
			
//adding all the labels			
			add(number1);
			add(number2);
			add(number3);
			add(number4);
			add(number5);
			add(number6);
			add(number6);
			add(number7);
			add(number8);
			add(number9);
			add(result);
			
//adding font to a label
//their font is based on what object			
			
			number1.setFont(firstObject);
			number2.setFont(firstObject);
			number3.setFont(firstObject);
			number4.setFont(firstObject);
			number5.setFont(firstObject);
			number6.setFont(firstObject);
			number7.setFont(firstObject);
			number8.setFont(firstObject);
			number9.setFont(firstObject);
			result.setFont(secondObject);
			
//adding mouse listener			
			number1.addMouseListener(this);
			number2.addMouseListener(this);
			number3.addMouseListener(this);
			number4.addMouseListener(this);
			number5.addMouseListener(this);
			number6.addMouseListener(this);
			number7.addMouseListener(this);
			number8.addMouseListener(this);
			number9.addMouseListener(this);
		}
		
		public static void main(String[] args) {
		new LabExer7A().setVisible(true);
		}
		
		public void mouseClicked (MouseEvent arg0) {
		
//nested and multiple if else statement to accomplish the program
		if (number1 == arg0.getSource ()) 
		{
			if (1 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText("Try again.");
				number1.setEnabled (false);
				counter++;
			}
		}
		
		else if (number2 == arg0.getSource ()) 
		{
			if (2 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number2.setEnabled(false);
				counter++;
			}
		}
		
		else if (number3 == arg0.getSource ()) 
		{
			if (3 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number3.setEnabled(false);
				counter++;
			}
		}
		
		else if (number4 == arg0.getSource ()) 
		{
			if (4 == num) {
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
		}
		
			else 
			{
				result.setText ("Try again.");
				number4.setEnabled(false);
				counter++;
			}
		}
		
		else if (number5 == arg0.getSource ()) 
		{
			if (5 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number5.setEnabled(false);
				counter++;
			}
		}
		
		else if (number6 == arg0.getSource ()) 
		{
			if (6 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number6.setEnabled(false);
				counter++;
			}
		}
		
		else if (number7 == arg0.getSource ()) 
		{
			if (7 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
	    	{
				result.setText ("Try again.");
				number7.setEnabled(false);
				counter++;
	    	}
		}
		
		else if (number8 == arg0.getSource ()) 
		{
			if (8 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number8.setEnabled(false);
				counter++;
			}
		}
		
		else if (number9 == arg0.getSource ()) 
		{
			if (9 == num) 
			{
				counter++;
				result.setText("Correct in " + counter + " attempt(s)");
			}
		
			else 
			{
				result.setText ("Try again.");
				number9.setEnabled(false);
				counter++;
			}
		}
	
		}	

		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
   }

