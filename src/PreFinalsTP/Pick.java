package PreFinalsTP;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pick extends JFrame implements  ActionListener
{

	JPanel pickPanel = new JPanel();
	
	JPanel winlosePanel = new JPanel();
	JLabel winloseLabel = new JLabel();
	
	JButton bato = new JButton();
	JButton papel = new JButton();
	JButton gunting = new JButton();
	
	JLabel user = new JLabel();	
	JLabel tryAgainLabel = new JLabel();
	
	JLabel scissorIconLabel = new JLabel();
	JLabel paperIconLabel = new JLabel();
	JLabel stoneIconLabel = new JLabel();
	
	JLabel scissorrIconLabel = new JLabel();
	JLabel paperrIconLabel = new JLabel();
	JLabel stoneeIconLabel = new JLabel();
	
	JPanel randomPanel = new JPanel();
	JPanel userPanel = new JPanel();
	
	JButton tryAgainButton = new JButton();
	
	Pick()
	{
		
//ScissorImage		
		ImageIcon Scissor = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Scissor.png");
		Scissor.setImage(Scissor.getImage().getScaledInstance(90,90,90)); //set the size of the imageicon
				
//PaperImage		
		ImageIcon Paper = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Paper.png");
		Paper.setImage(Paper.getImage().getScaledInstance(90,90,90));  
				
//StoneImage		
		ImageIcon Stone = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Stone.png");
		Stone.setImage(Stone.getImage().getScaledInstance(90,90,90));  			
						
//ScissorrImage		
		ImageIcon Scissorr = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Scissorr.png");
	    Scissorr.setImage(Scissorr.getImage().getScaledInstance(90,90,90)); //set the size of the imageicon
						
//PaperrImage		
		ImageIcon Paperr = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Paperr.png");
		Paperr.setImage(Paperr.getImage().getScaledInstance(90,90,90));  
						
//StoneeImage		
		ImageIcon Stonee = new ImageIcon("C:\\School Files\\STI\\2nd Year\\1st Sem\\Computer Programming2\\PreFinal\\Activities\\TP\\Stonee.png");
		Stonee.setImage(Stonee.getImage().getScaledInstance(90,90,90)); 				
		
//Buttons added to pickPanel
		
		bato.setText("Bato");             
		bato.setFocusable(false);           
		bato.setForeground(Color.DARK_GRAY);
		bato.setBackground(new Color(0xFEBEBE));
		bato.addActionListener(this);
		
		gunting.setText("Gunting");             
		gunting.setFocusable(false);           
	    gunting.setForeground(Color.DARK_GRAY);
		gunting.setBackground(new Color(0xFEBEBE));
		gunting.addActionListener(this);
		
		papel.setText("Papel");             
		papel.setFocusable(false);           
		papel.setForeground(Color.DARK_GRAY);
		papel.setBackground(new Color(0xFEBEBE));
		papel.addActionListener(this);
		
		pickPanel.setBackground(new Color(0xFEFEBE));	                      //background color of the panel
		pickPanel.setBounds(310,400, 400,50); 	                              //Set dimensions to frame&panel
		pickPanel.setLayout(new GridLayout(1,1, 3,3));                        //set gridlayout
			
		pickPanel.add(bato);
		pickPanel.add(gunting);
		pickPanel.add(papel);
		
//randomPanel
		randomPanel.setBackground(new Color(0xFEBEBE));	                      //background color of the panel
		randomPanel.setBounds(150, 80, 200,200); 	                          //Set dimensions to frame&panel
		randomPanel.setLayout(null);
		randomPanel.add(scissorIconLabel);
		randomPanel.add(paperIconLabel);
		randomPanel.add(stoneIconLabel);
		
		
//userPanel
		userPanel.setBackground(new Color(0xFEBEBE));	                      //background color of the panel
		userPanel.setBounds(680, 80, 200,200); 	                              //Set dimensions to frame&panel
		userPanel.setLayout(null);
		userPanel.add(user);
		userPanel.add(stoneeIconLabel);
		userPanel.add(paperrIconLabel);
		userPanel.add(scissorrIconLabel);
		
//tryAgainButton		
		tryAgainButton.setText("Umulit");
		tryAgainButton.setFocusable(false);           
		tryAgainButton.setForeground(Color.DARK_GRAY);
		tryAgainButton.setBackground(new Color(0xFEBEBE));
		tryAgainButton.addActionListener(this);
		tryAgainButton.setBounds(460, 300, 100, 50);
		
		tryAgainButton.setEnabled(false);

//userlabel
		user.setText("User");
		user.setBounds(90,-20,100,100);
		user.setForeground(Color.GRAY);		
		
//scissorIcon Label		
		scissorIconLabel.setIcon(Scissor);	
		scissorIconLabel.setBounds(50,10, 500,200);
		scissorIconLabel.setVisible(false);
		
//paperIcon Label		
		paperIconLabel.setIcon(Paper);
		paperIconLabel.setBounds(50,10, 500,200);
		paperIconLabel.setVisible(false);
		
//stoneIcon Label		
		stoneIconLabel.setIcon(Stone);		
		stoneIconLabel.setBounds(50,10, 500,200);
		stoneIconLabel.setVisible(false);
				
//scissorrIcon Label		
		scissorrIconLabel.setIcon(Scissorr);	
		scissorrIconLabel.setBounds(50,10, 500,200);
		scissorrIconLabel.setVisible(false);
						
//paperrIcon Label		
		paperrIconLabel.setIcon(Paperr);
		paperrIconLabel.setBounds(50,10, 500,200);
		paperrIconLabel.setVisible(false);

//stoneeIcon Label		
		stoneeIconLabel.setIcon(Stonee);	
		stoneeIconLabel.setBounds(50,10, 500,200);
		stoneeIconLabel.setVisible(false);
		
//winlose Label		
		winloseLabel.setText("VS");
		winloseLabel.setFont(new Font("Calbri", Font.TRUETYPE_FONT, 16));      
		winloseLabel.setVerticalAlignment(JLabel.CENTER);               //Set Vertical position of text within titleLabel
		winloseLabel.setHorizontalAlignment(JLabel.CENTER);             //Set Horizontal position of text within titleLabel
		
//winlose Panel
		winlosePanel.setBackground(new Color(0xFEBEFE));	            //background color of the panel
		winlosePanel.setBounds(450, 190, 125,40); 	                    //Set dimensions to frame&panel
		winlosePanel.add(winloseLabel);
	
		
		

		
		this.add(pickPanel); 
		this.add(randomPanel);
		this.add(userPanel);
		this.add(tryAgainButton);
		this.add(winlosePanel);
		
		this.setTitle("BatoBatoPick");                                //Title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          //Close frame
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(1000,600);                                       //Size of the frame  
		this.setVisible(true);                                        //Make the this Visible
		
		this.getContentPane().setBackground(new Color(0xFEFEBE));	  //background color
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		Random  random = new Random();
		int num = 1 + random.nextInt(3);
		
		if(arg0.getSource() == bato) 
		{
			System.out.println("Bato");
			stoneeIconLabel.setVisible(true);
			
			bato.setEnabled(false);
			gunting.setEnabled(false);
			papel.setEnabled(false);
			
			tryAgainButton.setEnabled(true);
			
			if(num == 1) 
			{
			System.out.println("1");
			scissorIconLabel.setVisible(true);
			}
			else if(num == 2) 
			{
			System.out.println("2");
			paperIconLabel.setVisible(true);
			}
			else if(num == 3) 
			{
			System.out.println("3");
			stoneIconLabel.setVisible(true);
			}
			
			if(stoneIconLabel.isVisible() && stoneeIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("Draw");
			}
			else if(scissorIconLabel.isVisible() && stoneeIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("You Win");
			}
			else
			{
				winloseLabel.setText("You Lose");
			}

		}
		else if(arg0.getSource() == gunting) 
		{
			System.out.println("gunting");
			scissorrIconLabel.setVisible(true);
			
			bato.setEnabled(false);
			gunting.setEnabled(false);
			papel.setEnabled(false);
			
			tryAgainButton.setEnabled(true);
			
			if(num == 1) 
			{
			System.out.println("1");
			scissorIconLabel.setVisible(true);
			}
			else if(num == 2) 
			{
			System.out.println("2");
			paperIconLabel.setVisible(true);
			}
			else if(num == 3) 
			{
			System.out.println("3");
			stoneIconLabel.setVisible(true);
			}
			
			if(scissorIconLabel.isVisible() && scissorrIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("Draw");
			}
			else if(paperIconLabel.isVisible() && scissorrIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("You Win");
			}
			else
			{
				winloseLabel.setText("You Lose");
			}
		}
		else if(arg0.getSource() == papel)
		{
			System.out.println("papel");
			paperrIconLabel.setVisible(true);
			
			bato.setEnabled(false);
			gunting.setEnabled(false);
			papel.setEnabled(false);
			
			tryAgainButton.setEnabled(true);
			
			if(num == 1) 
			{
			System.out.println("1");
			scissorIconLabel.setVisible(true);
			}
			else if(num == 2) 
			{
			System.out.println("2");
			paperIconLabel.setVisible(true);
			}
			else if(num == 3) 
			{
			System.out.println("3");
			stoneIconLabel.setVisible(true);
			}
			
			if(paperIconLabel.isVisible() && paperrIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("Draw");
			}
			else if(stoneIconLabel.isVisible()&& paperrIconLabel.isVisible() == true) 
			{
				winloseLabel.setText("You Win");
			}
			else
			{
				winloseLabel.setText("You Lose");
			}
		}
		else if(arg0.getSource() == tryAgainButton) 
		{
			paperrIconLabel.setVisible(false);
			scissorrIconLabel.setVisible(false);
			stoneeIconLabel.setVisible(false);
			
			paperIconLabel.setVisible(false);
			scissorIconLabel.setVisible(false);
			stoneIconLabel.setVisible(false);
			
			winloseLabel.setText("VS");
			
			bato.setEnabled(true);
			gunting.setEnabled(true);
			papel.setEnabled(true);
			
			tryAgainButton.setEnabled(false);
			
			System.out.println("Deleted");
		}
		
			
		
	}
}
