/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterngui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author apurvdeshpande
 */

/*
 * CardLayoutDemo.java
 *
 */

public class PatternGUI implements ItemListener {
	JPanel cards; 
	final static String DesignPattern = "Design Pattern";
	final static String AWSPattern = "AWS Pattern";
	final static String AzurePattern = "Azure Pattern";
        final static String ScoreComparison= "Score Comparison";
        
	CardLayout cl;
	public void addComponentToPane(Container pane) throws IOException {
		
		JPanel comboBoxPane = new JPanel(); 
		String comboBoxItems[] = { DesignPattern, AWSPattern, AzurePattern, ScoreComparison };
		JComboBox cb = new JComboBox(comboBoxItems);
		cb.setEditable(false);
		cb.addItemListener(this);
		comboBoxPane.add(cb);

		// Create the "cards".
		JPanel card1 = new JPanel();
		JButton btn1 = new JButton("Observer Pattern");
		BufferedImage image1 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/Designpatterns/Observer.png"));
		card1.add(btn1);
		btn1.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image1));
			    imagelabel.setVisible(true);    
			    card1.add(imagelabel);	
			    cards.updateUI();
			  }
			});
               JButton btn2 = new JButton("Protoype Pattern");
		BufferedImage image2 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/Designpatterns/Prototype.png"));
		card1.add(btn2);
		btn2.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image2));
			    imagelabel.setVisible(true);    
			    card1.add(imagelabel);	
			    cards.updateUI();
			  }
			});

		
		JPanel card2 = new JPanel();
		
                JButton btn3 = new JButton("Scale Out Pattern");
		BufferedImage image3 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/Scale Out Pattern.png"));
		card2.add(btn3);
		btn3.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image3));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});
                JButton btn4 = new JButton("Queueing Chain Pattern");
		BufferedImage image4 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/Queueing Chain Pattern.png"));
		card2.add(btn4);
		btn4.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image4));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});
		
		JButton btn5 = new JButton("Priority Queue Pattern");
		BufferedImage image5 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/Priority Queue Pattern.png"));
		card2.add(btn5);
		btn5.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image5));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});
              JButton btn6 = new JButton("Inmemory DBCache pattern");
		BufferedImage image6 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/Imd.png"));
            
		card2.add(btn6);
		btn6.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image6));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});
                JButton btn7 = new JButton("Deep Health Check Pattern");
		BufferedImage image7 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/Deep Health Check Pattern.png"));
		card2.add(btn7);
		btn7.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image7));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});
 JButton btn8 = new JButton("Multi Data Center Pattern");
		BufferedImage image8 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AWSPatterns/MSCP.png"));
		card2.add(btn8);
		btn8.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image8));
			    imagelabel.setVisible(true);    
			    card2.add(imagelabel);	
			    cards.updateUI();
			  }
			});


		JPanel card3 = new JPanel();
		
JButton btn9 = new JButton("Autoscaling Pattern");
		BufferedImage image9 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/Autoscaling.png"));
		card3.add(btn9);
		btn9.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image9));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
              JButton btn10 = new JButton("Queue based Load Levelling Pattern");
		BufferedImage image10 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/QBLL.png"));
		card3.add(btn10);
		btn10.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image10));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
               JButton btn11 = new JButton("Priority Queue Pattern");
		BufferedImage image11 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/PQP.png"));
		card3.add(btn11);
		btn11.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			   
			    JLabel imagelabel =new JLabel(new ImageIcon(image11));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
                JButton btn12 = new JButton("Cache Aside Pattern");
		BufferedImage image12 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/CAP.png"));
		card3.add(btn12);
		btn12.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image12));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
               JButton btn13 = new JButton("Health End Point Monitoring Pattern");
		BufferedImage image13 = ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/HEPM.png"));
		card3.add(btn13);
		btn13.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    // display/center the jdialog when the button is pressed
			    JLabel imagelabel =new JLabel(new ImageIcon(image13));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
               JButton btn14 = new JButton("Multi Datacenter Deployment Pattern");
		BufferedImage image14= ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/AzurePatterns/MDDP.png"));
		card3.add(btn14);
		btn14.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image14));
			    imagelabel.setVisible(true);    
			    card3.add(imagelabel);	
			    cards.updateUI();
			  }
			});
                
              JPanel card4 = new JPanel();
                JButton btn15 = new JButton("ObserverScores");
		BufferedImage image15= ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUIdiagrams/ScoreComparison/OS.png"));
		card4.add(btn15);
		btn15.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image15));
			    imagelabel.setVisible(true);    
			    card4.add(imagelabel);	
			    cards.updateUI();
			  }
			});
                JButton btn16 = new JButton("PrototypeScores");
		BufferedImage image16= ImageIO.read(new File("/Users/apurvdeshpande/Desktop/GUidiagrams/ScoreComparison/PS.png"));
		card4.add(btn16);
		btn16.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
			    
			    JLabel imagelabel =new JLabel(new ImageIcon(image16));
			    imagelabel.setVisible(true);    
			    card4.add(imagelabel);	
			    cards.updateUI();
			  }
			}); 
                
		cards = new JPanel(new CardLayout());
		cards.add(card1, DesignPattern);
		cards.add(card2, AWSPattern);
		cards.add(card3, AzurePattern);
              cards.add(card4, ScoreComparison);
                
                

		pane.add(comboBoxPane, BorderLayout.PAGE_START);
		pane.add(cards, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent evt) {
		cl = (CardLayout) (cards.getLayout());
		cl.show(cards, (String) evt.getItem());
	}

	
	private static void createAndShowGUI() throws IOException {
		
		JFrame frame = new JFrame("Pattern Properties and Comparison");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		PatternGUI demo = new PatternGUI();
		demo.addComponentToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		try {
			
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					createAndShowGUI();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		});
	}
}

