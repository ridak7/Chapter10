import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.graalvm.compiler.replacements.SnippetTemplate.AbstractTemplates;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BreakAPlate implements ActionListener {

	private JFrame frmBreakaplate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frmBreakaplate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public BreakAPlate() {
		initialize();
	}

	private void initialize() {
		
		ImageIcon platepic = new ImageIcon("C:\\Users\\905041004\\Desktop\\CS30\\Chapter10\\src\\plates.gif");
		ImageIcon twobroken = new ImageIcon("C:\\Users\\905041004\\Desktop\\CS30\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon allbroken = new ImageIcon("C:\\Users\\905041004\\Desktop\\CS30\\Chapter10\\src\\plates_all_broken.gif");
		
		
		
		frmBreakaplate = new JFrame();
		frmBreakaplate.setTitle("BreakAPlate");
		frmBreakaplate.setBounds(100, 100, 450, 300);
		frmBreakaplate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBreakaplate.getContentPane().setLayout(null);
		
		JLabel plates = new JLabel(platepic);
		plates.setBounds(74, 11, 269, 108);
		frmBreakaplate.getContentPane().add(plates);
		
		JButton play = new JButton("PLAY");
		play.setBounds(159, 166, 89, 23);
		frmBreakaplate.getContentPane().add(play);
		play.setActionCommand("PLAY");
		play.addActionListener(this);

		
		JLabel youWIN = new JLabel("");
		youWIN.setBounds(159, 200, 89, 14);
		frmBreakaplate.getContentPane().add(youWIN);
		
		
		
	}

	@Override
		public void actionPerformed(ActionEvent evt) {
			Random rand = new Random();
			int upperbound = 1;
			int int_random = rand.nextInt(upperbound);
			
			if (int_random == 0) {
				
				plates.setIcon(twobroken)
				
			}
			
		}
}
