import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConversion implements ActionListener 
{
	
	private JFrame frmMetricconversion;
	private JTextField tf;


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
					MetricConversion window = new MetricConversion();
					window.frmMetricconversion.setVisible(true);
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
	public MetricConversion() 
	{
		initialize();
	}

	
	private void initialize() 
	{
		frmMetricconversion = new JFrame();
		frmMetricconversion.getContentPane().setBackground(Color.GRAY);
		frmMetricconversion.setTitle("MetricConversion");
		frmMetricconversion.setBounds(100, 100, 440, 222);
		frmMetricconversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetricconversion.getContentPane().setLayout(null);
		
		String[] names = {"inch to centimeters", "feet to meters", "gallon to liters", "pound to kilograms"};
		JComboBox<String> comboBox = new JComboBox<>(names);
		
		comboBox.setBounds(10, 61, 364, 22);
		frmMetricconversion.getContentPane().add(comboBox);
		comboBox.addActionListener(this);
		
		JLabel lb = new JLabel("Select a conversion type");
		lb.setForeground(Color.WHITE);
		lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb.setBounds(10, 35, 192, 22);
		frmMetricconversion.getContentPane().add(lb);
		
		tf = new JTextField();
		tf.setBounds(10, 137, 234, 20);
		frmMetricconversion.getContentPane().add(tf);
		tf.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		JComboBox comboBox = (JComboBox)e.getSource();
		String name = (String)comboBox.getSelectedItem();
		
		if (name == "inch to centimeters") 
		{
			tf.setText("1 inch = 2.54 centimeters");
		} else if (name == "feet to meters") 
		{
			tf.setText("1 foot = 0.3048 meters"); 
		} else if (name == "gallon to liters") 
		{
			tf.setText("1 gallon = 4.5461 liters"); 
		} else if (name == "pound to kilograms") 
		{
			tf.setText("1 pound = 0.4536 kilograms");
		}
	}
			
			
		
		
		
		
		
	}

