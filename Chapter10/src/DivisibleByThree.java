import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;

public class DivisibleByThree implements ActionListener 
{

	private JFrame frmDivisiblebythree;
	private JTextField tf;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					DivisibleByThree window = new DivisibleByThree();
					window.frmDivisiblebythree.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleByThree() 
	{
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDivisiblebythree = new JFrame();
		frmDivisiblebythree.getContentPane().setBackground(Color.GRAY);
		frmDivisiblebythree.setBackground(Color.GRAY);
		frmDivisiblebythree.setTitle("DivisibleByThree");
		frmDivisiblebythree.setBounds(100, 100, 441, 168);
		frmDivisiblebythree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDivisiblebythree.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 405, 118);
		frmDivisiblebythree.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		tf = new JTextField();
		tf.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		tf.setBounds(185, 11, 183, 20);
		panel.add(tf);
		tf.setColumns(10);
		
		
		JLabel lb = new JLabel("Enter an integer:");
		lb.setForeground(Color.WHITE);
		lb.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lb.setBounds(56, 14, 103, 14);
		panel.add(lb);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnNewButton.setBounds(56, 59, 103, 29);
		panel.add(btnNewButton);
		
		output = new JTextField();
		output.setFont(new Font("Sitka Heading", Font.PLAIN, 13));
		output.setBounds(185, 63, 183, 20);
		panel.add(output);
		output.setColumns(10);
		btnNewButton.addActionListener(this);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = tf.getText();
		int i = Integer.parseInt(input);
		
		if (i % 3 >=1) {
			output.setText("Number is not divisble by three");
		}
		else
		{
			output.setText("Number is divisible by three");
			
		}
		
	}
}
