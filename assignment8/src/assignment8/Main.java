package assignment8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class Main {

	private JFrame frmPAC;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmPAC.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPAC = new JFrame();
		frmPAC.getContentPane().setBackground(new Color(248, 248, 255));
		frmPAC.getContentPane().setForeground(Color.CYAN);
		frmPAC.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmPAC.setBackground(Color.BLUE);
		frmPAC.setForeground(Color.BLUE);
		frmPAC.setFont(new Font("Dialog", Font.BOLD, 12));
		frmPAC.setTitle("P A C E    C A L C U L A T O R");
		frmPAC.setBounds(100, 100, 556, 338);
		frmPAC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPAC.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(0, 0, 86, 299);
		frmPAC.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Time");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 43, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Distance");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 107, 74, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Pace");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(10, 204, 46, 14);
		panel.add(label_2);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(85, 0, 455, 100);
		frmPAC.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_3 = new JLabel("hours");
		label_3.setBounds(20, 42, 46, 14);
		panel_1.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 57, 56, 20);
		panel_1.add(textField);

		
		JLabel label_4 = new JLabel("mins");
		label_4.setBounds(90, 42, 46, 14);
		panel_1.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(84, 57, 38, 20);
		panel_1.add(textField_1);

		
		JLabel label_5 = new JLabel("secs");
		label_5.setBounds(158, 42, 46, 14);
		panel_1.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 57, 74, 20);
		panel_1.add(textField_2);

		
		
		JLabel label_6 = new JLabel("To calculate you time, fill in your");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(242, 29, 211, 14);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("distance and pace then click here:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(242, 42, 200, 14);
		panel_1.add(label_7);
		
		JButton button = new JButton("Calculate Time");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(273, 57, 129, 20);
		panel_1.add(button);
		button.addActionListener( new ActionListener()
		{
	
			  public void actionPerformed(ActionEvent e)
			  {
				  int a = textField_3.getText().length();
				  int b = textField_4.getText().length();
				  int c = textField_5.getText().length();
				  int d = textField_6.getText().length();

				  if(a==0||b==0){
					  JOptionPane.showMessageDialog(frmPAC, "To calculate Time, enter a Distance and Pace",
							  "information", JOptionPane.INFORMATION_MESSAGE);
				  }
			  
				  else{
					  String f = textField_3.getText();
					  System.out.println(Integer.parseInt(f));
				  }
			  }
			});


		Panel panel_2 = new Panel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(85, 98, 455, 100);
		frmPAC.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(63, 11, 86, 20);
		panel_2.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(52, 30, 109, 20);
		comboBox.addItem("Miles");
		comboBox.addItem("Kilometers");
		panel_2.add(comboBox);
		
		JLabel label_8 = new JLabel("or");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(103, 47, 46, 14);
		panel_2.add(label_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(40, 61, 129, 20);
		comboBox_1.addItem("Pick Event");
		comboBox_1.addItem("5K");
		comboBox_1.addItem("5-Mile");
		comboBox_1.addItem("10K");
		comboBox_1.addItem("Half-Marathon");
		panel_2.add(comboBox_1);
		comboBox_1.addActionListener( new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  String sec = comboBox_1.getSelectedItem().toString();
			if(sec=="5K"){
				textField_3.setText("5");
				comboBox.setSelectedItem("Kilometers");
			}
			if(sec=="5-Mile"){
				textField_3.setText("5");
				comboBox.setSelectedItem("Miles");
			}
			if(sec=="10K"){
			  textField_3.setText("10");
			  comboBox.setSelectedItem("Kilometers");
			}
			if(sec=="Half-Marathon") {
			  textField_3.setText("13.109375");
			  comboBox.setSelectedItem("Kilometers");
			}
		  }
		});
		
		JLabel label_9 = new JLabel("To calculate your distance, fill in");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(245, 17, 190, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("your time and pace then click");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(255, 32, 190, 14);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("here:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(316, 47, 46, 14);
		panel_2.add(label_11);
		
		JButton button_1 = new JButton("Calculate Distance");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(265, 61, 157, 23);
		panel_2.add(button_1);
		//String hour;
		textField.addActionListener( new ActionListener()
		{

		  public void actionPerformed(ActionEvent e)
		  {
			  String hour = textField.getText();
			  System.out.println(hour);
			  
		  }
		});
		button_1.addActionListener( new ActionListener()
		{
	
			  public void actionPerformed(ActionEvent e)
			  {
				  
				  int b = textField_4.getText().length();
				  int c = textField_5.getText().length();
				  int d = textField_6.getText().length();
				  int x = textField.getText().length();
				  int y = textField_1.getText().length();
				  int z = textField_2.getText().length();
				  if(b==0&&x==0){
					  JOptionPane.showMessageDialog(frmPAC, "To calculate Distance, enter a Time and Pace",
							  "information", JOptionPane.INFORMATION_MESSAGE);
				  }
			  //else parse to int and pass Parse and Pace fields into Time (int, int, int, int, int...)
				  else{
					  String f = textField.getText();
					  System.out.println(Integer.parseInt(f));
				  }
			  }
			});
		Panel panel_3 = new Panel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(85, 199, 455, 100);
		frmPAC.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 26, 56, 20);
		panel_3.add(textField_4);
		
		JLabel label_12 = new JLabel("hr");
		label_12.setBounds(20, 11, 46, 14);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("mins");
		label_13.setBounds(90, 11, 46, 14);
		panel_3.add(label_13);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(84, 26, 38, 20);
		panel_3.add(textField_5);
		
		JLabel label_14 = new JLabel("secs");
		label_14.setBounds(158, 11, 46, 14);
		panel_3.add(label_14);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 26, 74, 20);
		panel_3.add(textField_6);
		
		JLabel label_15 = new JLabel("Per");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_15.setBounds(10, 57, 46, 14);
		panel_3.add(label_15);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(76, 57, 109, 20);
		comboBox_2.addItem("Mile");
		comboBox_2.addItem("Kilometer");
		panel_3.add(comboBox_2);
		
		JLabel label_16 = new JLabel("To calculate your pace, fill in your");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_16.setBounds(231, 12, 200, 14);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("time and distance, then click here:");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_17.setBounds(231, 29, 200, 14);
		panel_3.add(label_17);
		
		JButton button_2 = new JButton("Calculate Pace");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(273, 42, 129, 23);
		panel_3.add(button_2);
		button_2.addActionListener( new ActionListener()
		{
	
			  public void actionPerformed(ActionEvent e)
			  {
				  int a = textField_3.getText().length();
				  int x = textField.getText().length();
				  int y = textField_1.getText().length();
				  int z = textField_2.getText().length();
				  if(a==0&&x==0){
					  JOptionPane.showMessageDialog(frmPAC, "To calculate Time, enter a Distance and Pace",
							  "information", JOptionPane.INFORMATION_MESSAGE);
				  }
			  
				  else{
					  String f = textField.getText();
					  System.out.println(Integer.parseInt(f));
				  }
			  }
			});

	}
}
