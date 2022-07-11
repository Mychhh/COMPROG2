package FinalsTP;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Font;

public class MyFrame extends JFrame implements KeyListener
{			
	JLabel label;
	JLabel anotherLabel;
	JLabel WinLoseLabel;
	
	ImageIcon rocketIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\rocket.png");
	ImageIcon anotherRocketIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\rocket.png");
	
	Random random = new Random();
	int x = random.nextInt(20)+10;
	
	MyFrame()
	{						
		rocketIcon.setImage(rocketIcon.getImage().getScaledInstance(100,80,0)); //set the size of the imageicon
		anotherRocketIcon.setImage(anotherRocketIcon.getImage().getScaledInstance(100,80,0)); //set the size of the imageicon
		
		label = new JLabel();
		anotherLabel = new JLabel();
		WinLoseLabel = new JLabel();

		label.setBounds(200,700, 100,100);
		anotherLabel.setBounds(400,700, 100,100);
		
		WinLoseLabel.setBounds(260,300,150,50);
		WinLoseLabel.setText("Hotdog");
		WinLoseLabel.setFont(new Font("MV Boli", Font.PLAIN, 26));
		WinLoseLabel.setBackground(Color.red);
		WinLoseLabel.setOpaque(true); 
		WinLoseLabel.setVisible(false);
		
//this two needs two be used at the same time if you want to set a background color		
		label.setBackground(Color.white);  //this will set what kind of background color you want
		label.setOpaque(true);           //this will make visible your desired background color
		
		label.setIcon(rocketIcon);
		
		anotherLabel.setBackground(Color.red);  
		anotherLabel.setOpaque(true);    
		
		anotherLabel.setIcon(anotherRocketIcon);


//Frame		
		this.add(label);
		this.add(anotherLabel);
		this.add(WinLoseLabel);

		this.addKeyListener(this);
		
		this.setTitle("Rocket Racing");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(700,1000);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setLocationRelativeTo(null); //put frame in the middle of the screen
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		//Invoked when a physical key is pressed down, Uses KeyCode, int output
		switch(arg0.getKeyCode()) 
		{
		
		case 37:
			label.setLocation(label.getX()-15, label.getY());
			break;
		
		case 38:
			label.setLocation(label.getX(), label.getY()-15);
			anotherLabel.setLocation(anotherLabel.getX(), anotherLabel.getY()-x);
		
			System.out.println(anotherLabel.getY()-x);
			
			int dim1 = anotherLabel.getY()-x;
			int dim2 = label.getY();
			
			if(dim1 < 0) 
			{
				anotherLabel.setVisible(false);
				label.setVisible(false);
				
				WinLoseLabel.setText("Enemy Win");
				WinLoseLabel.setVisible(true);
			}
			else if(dim2 < 0) 
			{
				anotherLabel.setVisible(false);
				label.setVisible(false);
				
				WinLoseLabel.setText("You Win");
				WinLoseLabel.setVisible(true);
			}

			break;
			
		case 39:
			label.setLocation(label.getX()+15, label.getY());
			break;
			
		case 40:
			label.setLocation(label.getX(), label.getY()+15);
			break;	
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		//called whenever the button is released
		System.out.println("You released key char " + arg0.getKeyChar());
		System.out.println("You released key code " + arg0.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		//Invoked when a key is typed. Uses KeyChar, char output	
		
		switch(arg0.getKeyChar()) 
		{
		
		case 'a':
			label.setLocation(label.getX()-15, label.getY());
			break;
		
		case 'w':
			label.setLocation(label.getX(), label.getY()-15);
			break;
			
		case 's':
			label.setLocation(label.getX(), label.getY()+15);
			break;
			
		case 'd':
			label.setLocation(label.getX()+15, label.getY());
			break;	
			
		}
	}
	
}

