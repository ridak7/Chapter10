							Header?

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class BreakAPlate implements ActionListener 
{

	private JFrame frmBreakaplate;
	private JButton play;
	private JLabel plates;
	private JLabel youWIN;
	private JLabel winText;
	
	ImageIcon platepic = new ImageIcon("..\\Chapter10\\src\\plates.gif");
	ImageIcon twobroken = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
	ImageIcon allbroken = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
	ImageIcon tigerplush = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
	ImageIcon sticker = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
	private JLabel studentName;

		public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BreakAPlate window = new BreakAPlate();
					window.frmBreakaplate.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public BreakAPlate() 
	{
		initialize();
	}

	private void initialize() 
	{
		frmBreakaplate = new JFrame();
		frmBreakaplate.getContentPane().setBackground(Color.WHITE);
		frmBreakaplate.setFont(new Font("Agency FB", Font.BOLD, 12));
		frmBreakaplate.setTitle("BreakAPlate");
		frmBreakaplate.setBounds(100, 100, 450, 300);
		frmBreakaplate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBreakaplate.getContentPane().setLayout(null);
		
		plates = new JLabel(platepic);
		plates.setBounds(42, 11, 344, 123);
		frmBreakaplate.getContentPane().add(plates);
		
		youWIN = new JLabel("");
		youWIN.setBounds(165, 190, 152, 60);
		frmBreakaplate.getContentPane().add(youWIN);
	
		play = new JButton("PLAY");
		play.setBackground(Color.WHITE);
		play.setForeground(Color.BLACK);
		play.setFont(new Font("Tahoma", Font.BOLD, 13));
		play.setBounds(134, 166, 152, 23);
		frmBreakaplate.getContentPane().add(play);
		
		winText = new JLabel("YOU WON !");
		winText.setBackground(Color.BLACK);
		winText.setForeground(Color.BLACK);
		winText.setFont(new Font("Tahoma", Font.BOLD, 13));
		winText.setVisible(false);
		winText.setBounds(176, 145, 100, 23);
		frmBreakaplate.getContentPane().add(winText);
		
		studentName = new JLabel("Surkhab Mundi ");
		studentName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		studentName.setBounds(163, 11, 142, 23);
		frmBreakaplate.getContentPane().add(studentName);
		play.addActionListener(this);
	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		Random rand = new Random();
		int upperbound = 2;
		int int_random = rand.nextInt(upperbound);
		
		if (int_random == 0) 
		{
			
			plates.setIcon(twobroken);
			youWIN.setIcon(sticker);
			play.setText("PLAY AGAIN");
			winText.setVisible(false);
			
		}
		
		if (int_random == 1) 
		{
			
			plates.setIcon(allbroken);
			youWIN.setIcon(tigerplush);
			play.setText("PLAY AGAIN");
			winText.setVisible(true);
			
			
			}
		}
	}
	
	

