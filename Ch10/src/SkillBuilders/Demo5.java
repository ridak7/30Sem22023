package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo5 {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo5 window = new Demo5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon chhs = new ImageIcon("..\\Ch10\\src\\images\\chhs.png");
		ImageIcon western = new ImageIcon("..\\Ch10\\src\\images\\wchs.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1130, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1092, 626);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Fn = new JTextField();
		Fn.setBounds(101, 68, 222, 41);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln2 = new JTextField();
		Ln2.setBounds(430, 68, 222, 41);
		Ln2.setColumns(10);
		panel.add(Ln2);
		
		JLabel lblNewLabel = new JLabel("FN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 66, 45, 41);
		panel.add(lblNewLabel);
		
		JLabel lblLn = new JLabel("LN");
		lblLn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLn.setBounds(390, 68, 45, 41);
		panel.add(lblLn);
		
		JComboBox Grd = new JComboBox();
		Grd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grd.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		Grd.setBounds(101, 196, 55, 41);
		panel.add(Grd);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGrade.setBounds(46, 194, 45, 41);
		panel.add(lblGrade);
		
		JComboBox Sch = new JComboBox();
		Sch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sch.setModel(new DefaultComboBoxModel(new String[] {"Western", "Crescent", "Pearson", "Mandela"}));
		Sch.setBounds(430, 196, 164, 51);
		panel.add(Sch);
		
		JLabel lblSchool = new JLabel("School");
		lblSchool.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSchool.setBounds(356, 196, 68, 41);
		panel.add(lblSchool);
		
		JTextArea out = new JTextArea();
		out.setBounds(46, 329, 692, 97);
		panel.add(out);
		
		JLabel dispL = new JLabel("");
		dispL.setIcon(null);
		dispL.setBounds(800, 146, 279, 230);
		panel.add(dispL);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade =  " ";
				String school = " ";
				String FN = Fn.getText();
				String LN = Ln2.getText();
				
				if(Grd.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				if(Grd.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				if(Sch.getSelectedItem().equals("Western"))
				{
					school = "Western";
					dispL.setIcon(western);
					
				}
				if(Sch.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
					dispL.setIcon(chhs);
					
				}
				
				out.setText
				(
					FN + " " + LN +
					"is in grade: "+
					grade + " "+ "and goes to: "+ school
						
				);
				
				
				
			}
		});
		submit.setBounds(400, 522, 194, 60);
		panel.add(submit);
	}
}
