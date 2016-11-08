package assignment8;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PaceCalculator extends JFrame {
	private JFrame frmPAC;
	private JTextField textFieldTimeHours; // hrs - time
	private JTextField textFieldTimeMinutes; // min - time
	private JTextField textFieldTimeSeconds; // sec - time
	private JTextField textFieldDistance; // distance
	private JTextField textFieldPaceHours; // hrs - pace
	private JTextField textFieldPaceMinutes; // mins - pace
	private JTextField textFieldPaceSeconds; // seconds pace

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaceCalculator frame = new PaceCalculator();
					frame.frmPAC.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PaceCalculator() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public final void initialize() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		// contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setLayout(new BorderLayout(0, 0));
		// setContentPane(contentPane);
		frmPAC = new JFrame();
		frmPAC.setResizable(false);
		frmPAC.getContentPane().setBackground(new Color(248, 248, 255));
		frmPAC.getContentPane().setForeground(Color.CYAN);
		frmPAC.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmPAC.setBackground(new Color(0, 0, 255));
		frmPAC.setForeground(new Color(0, 0, 255));
		frmPAC.setFont(new Font("Dialog", Font.BOLD, 12));
		frmPAC.setTitle("P A C E    C A L C U L A T O R");
		frmPAC.setBounds(100, 100, 583, 353);
		frmPAC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPAC.getContentPane().setLayout(null);

		ImageIcon img = new ImageIcon("pace10.png");
		frmPAC.setIconImage(img.getImage());

		Panel panel = new Panel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 86, 324);
		frmPAC.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel b2 = new JLabel(new ImageIcon("pace5.png"));
		b2.setBounds(0, 0, 84, 47);
		panel.add(b2);

		JLabel labelTime = new JLabel("Time");
		labelTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelTime.setBounds(10, 56, 46, 14);
		panel.add(labelTime);

		JLabel labelDistance = new JLabel("Distance");
		labelDistance.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelDistance.setBounds(10, 134, 74, 14);
		panel.add(labelDistance);

		JLabel labelPace = new JLabel("Pace");
		labelPace.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPace.setBounds(10, 236, 46, 14);
		panel.add(labelPace);

		Panel panel_1 = new Panel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(85, 0, 492, 100);
		frmPAC.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel label_3 = new JLabel("hours");
		label_3.setBounds(20, 42, 46, 14);
		panel_1.add(label_3);

		textFieldTimeHours = new JTextField();
		textFieldTimeHours.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textFieldTimeHours.selectAll();
			}
		});
		textFieldTimeHours.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldTimeHours.getText().length() >= 2) {
					arg0.consume();
				}
				if (arg0.getKeyChar() == '.') {
					JOptionPane.showMessageDialog(frmPAC, "Decimal Not Allowed.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
				} else if (arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_DELETE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_ENTER) {
					// JOptionPane.showMessageDialog(frmPAC, "You Pressed
					// Enter.",
					// "Information", JOptionPane.INFORMATION_MESSAGE);
					textFieldTimeMinutes.requestFocus();
					textFieldTimeMinutes.selectAll();
					;
				} else if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					JOptionPane.showMessageDialog(frmPAC, "That key was not a number.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});
		textFieldTimeHours.setColumns(10);
		textFieldTimeHours.setBounds(10, 57, 56, 20);
		panel_1.add(textFieldTimeHours);

		JLabel label_4 = new JLabel("mins");
		label_4.setBounds(90, 42, 46, 14);
		panel_1.add(label_4);

		textFieldTimeMinutes = new JTextField();
		textFieldTimeMinutes.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textFieldTimeMinutes.selectAll();
			}
		});
		textFieldTimeMinutes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldTimeMinutes.getText().length() >= 2) {
					arg0.consume();
				}
				if (arg0.getKeyChar() == '.') {
					JOptionPane.showMessageDialog(frmPAC, "Decimal Not Allowed.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				} else if (arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_DELETE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_ENTER) {
					// JOptionPane.showMessageDialog(frmPAC, "You Pressed
					// Enter.",
					// "Information", JOptionPane.INFORMATION_MESSAGE);
					textFieldTimeSeconds.requestFocus();
					textFieldTimeSeconds.selectAll();
					;
				} else if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					JOptionPane.showMessageDialog(frmPAC, "That key was not a number.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});
		textFieldTimeMinutes.setColumns(10);
		textFieldTimeMinutes.setBounds(84, 57, 38, 20);
		panel_1.add(textFieldTimeMinutes);

		JLabel label_5 = new JLabel("secs");
		label_5.setBounds(158, 42, 46, 14);
		panel_1.add(label_5);

		textFieldTimeSeconds = new JTextField();
		textFieldTimeSeconds.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textFieldTimeSeconds.selectAll();
			}
		});
		textFieldTimeSeconds.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldTimeSeconds.getText().length() > 3) {
					arg0.consume();
				}
				if (arg0.getKeyChar() == '.') {
					if (textFieldTimeSeconds.getText().contains(".")) {
						JOptionPane.showMessageDialog(frmPAC, "Only one Decimal Allowed.", "Information",
								JOptionPane.INFORMATION_MESSAGE);
						arg0.setKeyChar((char) 0);
						;
					}
				} else if (arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_DELETE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_ENTER) {
					// JOptionPane.showMessageDialog(frmPAC, "You Pressed
					// Enter.",
					// "Information", JOptionPane.INFORMATION_MESSAGE);
					textFieldTimeHours.requestFocus();
					;
					textFieldTimeHours.selectAll();
					;
				} else if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					JOptionPane.showMessageDialog(frmPAC, "That key was not a number.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});
		textFieldTimeSeconds.setColumns(10);
		textFieldTimeSeconds.setBounds(133, 57, 74, 20);
		panel_1.add(textFieldTimeSeconds);

		JLabel label_6 = new JLabel("To calculate you time, fill in your");
		label_6.setVisible(false);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_6.setBounds(242, 29, 211, 14);
		panel_1.add(label_6);

		JLabel label_7 = new JLabel("distance and pace then click here:");
		label_7.setVisible(false);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_7.setBounds(242, 42, 200, 14);
		panel_1.add(label_7);

		JButton button = new JButton("Calculate Time");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(273, 57, 129, 20);
		panel_1.add(button);
		
		JButton timeClear = new JButton("Clear");
		timeClear.setBounds(400, 56, 67, 21);
		panel_1.add(timeClear);
		timeClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTimeHours.setText("");
				textFieldTimeMinutes.setText("");
				textFieldTimeSeconds.setText("");
			}
		});

		Panel panel_2 = new Panel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(85, 98, 492, 100);
		frmPAC.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setVisible(false);
		comboBox.setBounds(1, 11, 52, 20);
		comboBox.addItem("Miles");
		comboBox.addItem("Kilometers");
		panel_2.add(comboBox);

		Panel panel_3 = new Panel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(85, 199, 492, 125);
		frmPAC.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setVisible(false);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Mile" }));
		comboBox_2.setBounds(10, 92, 109, 20);
		// comboBox_2.addItem("Kilometer");
		panel_3.add(comboBox_2);

		button.addActionListener(new ActionListener() {
			private double distance;
			private double timeHr;
			private double timeMin;
			private double timeSec;
			private double paceHr;
			private double paceMin;
			private double paceSec;
			private double paceTotal;
			private String time;
			private String time2;
			private String time3;

			public void actionPerformed(ActionEvent e) {
				if (textFieldDistance.getText().equals("")) {
					textFieldDistance.setText("0");
				}
				if (textFieldPaceHours.getText().equals("")) {
					textFieldPaceHours.setText("0");
				}
				if (textFieldPaceMinutes.getText().equals("")
						|| Double.parseDouble(textFieldPaceMinutes.getText()) <= 0) {
					textFieldPaceMinutes.setText("0");
				}
				if (textFieldPaceSeconds.getText().equals("")
						|| Double.parseDouble(textFieldPaceSeconds.getText()) <= 0) {
					textFieldPaceSeconds.setText("0");
				}
				DecimalFormat df = new DecimalFormat("0.000000");
				DecimalFormat df2 = new DecimalFormat("0.000000");
				df.setRoundingMode(RoundingMode.DOWN);
				df2.setRoundingMode(RoundingMode.DOWN);

				distance = Double.parseDouble(textFieldDistance.getText());
				paceHr = Double.parseDouble(textFieldPaceHours.getText());
				paceMin = Double.parseDouble(textFieldPaceMinutes.getText());
				paceSec = Math.round(Double.parseDouble(textFieldPaceSeconds.getText()));

				paceTotal = (paceHr) + (paceMin / 60) + (paceSec / 60 / 60);
				// System.out.println(paceTotal);

				Time timeClass = new Time();
				UnitConverter unitConvert = new UnitConverter();

				if (distance <= 0 || paceHr <= 0 && paceMin <= 0 && paceSec <= 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Time, enter a Distance and Pace", "information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (distance < 0 || paceHr < 0 || paceMin < 0 || paceSec < 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Time, enter a Distance and Pace", "information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Mile"
						|| comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Kilometer") {
					time = df2.format(timeClass.calculate(paceTotal, distance));
					time2 = df.format(timeClass.calculate(paceTotal, distance));
					time3 = df.format(timeClass.calculate(paceTotal, distance));

					time = unitConvert.asHours(Double.parseDouble(time));
					textFieldTimeHours.setText(time);

					time2 = unitConvert.asMinutes(Double.parseDouble(time2));
					textFieldTimeMinutes.setText(time2);

					time3 = unitConvert.asSeconds(Double.parseDouble(time3));
					textFieldTimeSeconds.setText(time3);
				}
				if (comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Mile") {
					time = df2.format(timeClass.calculate(paceTotal, distance / 1.60934));
					time2 = df.format(timeClass.calculate(paceTotal, distance / 1.60934));
					time3 = df.format(timeClass.calculate(paceTotal, distance / 1.60934));

					time = unitConvert.asHours(Double.parseDouble(time));
					textFieldTimeHours.setText(time);

					time2 = unitConvert.asMinutes(Double.parseDouble(time2));
					textFieldTimeMinutes.setText(time2);

					time3 = unitConvert.asSeconds(Double.parseDouble(time3));
					textFieldTimeSeconds.setText(time3);
					// textField_1.setText(Double.toString(distance*paceMin/1.60934/60));
					// textField_2.setText(Double.toString(distance*paceSec/1.60934/3600));
				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Kilometer") {
					time = df.format(timeClass.calculate(paceTotal, distance * 1.60934));
					time2 = df.format(timeClass.calculate(paceTotal, distance * 1.60934));
					time3 = df.format(timeClass.calculate(paceTotal, distance * 1.60934));

					time = unitConvert.asHours(Double.parseDouble(time));
					textFieldTimeHours.setText(time);

					time2 = unitConvert.asMinutes(Double.parseDouble(time2));
					textFieldTimeMinutes.setText(time2);

					time3 = unitConvert.asSeconds(Double.parseDouble(time3));
					textFieldTimeSeconds.setText(time3);
					// textField_1.setText(Double.toString(distance*paceMin*1.60934/60));
					// textField_2.setText(Double.toString(distance*paceSec*1.60934/3600));
				}
			}
		});

		textFieldDistance = new JTextField();
		textFieldDistance.setColumns(10);
		textFieldDistance.setBounds(85, 16, 46, 20);
		panel_2.add(textFieldDistance);

		textFieldDistance.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldTimeHours.getText().length() >= 0) {
					arg0.consume();
				}
				if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});

		JLabel label_8 = new JLabel("or");
		label_8.setVisible(false);
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
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sec = comboBox_1.getSelectedItem().toString();
				// add user input from event to miles
				if (sec == "5K") {
					textFieldDistance.setText("3.1");
					comboBox.setSelectedItem("Miles");
				}
				if (sec == "5-Mile") {
					textFieldDistance.setText("5");
					comboBox.setSelectedItem("Miles");
				}
				if (sec == "10K") {
					textFieldDistance.setText("6.2");
					comboBox.setSelectedItem("Miles");
				}
				if (sec == "Half-Marathon") {
					textFieldDistance.setText("13.1");
					comboBox.setSelectedItem("Miles");
				}
			}
		});

		JLabel label_9 = new JLabel("To calculate your distance, fill in");
		label_9.setVisible(false);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_9.setBounds(183, 13, 52, 14);
		panel_2.add(label_9);

		JLabel label_10 = new JLabel("your time and pace then click");
		label_10.setVisible(false);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_10.setBounds(193, 38, 27, 14);
		panel_2.add(label_10);

		JLabel label_11 = new JLabel("here:");
		label_11.setVisible(false);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_11.setBounds(183, 63, 27, 14);
		panel_2.add(label_11);

		JButton button_1 = new JButton("Calculate Distance");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(248, 34, 157, 23);
		panel_2.add(button_1);

		JLabel lblMiles = new JLabel("miles");
		lblMiles.setBounds(138, 19, 46, 14);
		panel_2.add(lblMiles);
		
		JButton distanceClear = new JButton("Clear");
		distanceClear.setBounds(402, 34, 68, 23);
		panel_2.add(distanceClear);
		distanceClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDistance.setText("");
			}
		});

		button_1.addActionListener(new ActionListener() {
			private double timeHr;
			private double timeMin;
			private double timeSec;
			private double paceHr;
			private double paceMin;
			private double paceSec;
			private double timeTotal;
			private double paceTotal;
			private String distance;

			public void actionPerformed(ActionEvent e) {

				if (textFieldTimeHours.getText().equals("") || Double.parseDouble(textFieldTimeHours.getText()) <= 0) {
					textFieldTimeHours.setText("0");
				}
				if (textFieldTimeMinutes.getText().equals("")
						|| Double.parseDouble(textFieldTimeMinutes.getText()) <= 0) {
					textFieldTimeMinutes.setText("0");
				}
				if (textFieldTimeSeconds.getText().equals("")
						|| Double.parseDouble(textFieldTimeSeconds.getText()) <= 0) {
					textFieldTimeSeconds.setText("0");
				}
				if (textFieldPaceHours.getText().equals("")) {
					textFieldPaceHours.setText("0");
				}
				if (textFieldPaceMinutes.getText().equals("")
						|| Double.parseDouble(textFieldPaceMinutes.getText()) <= 0) {
					textFieldPaceMinutes.setText("0");
				}
				if (textFieldPaceSeconds.getText().equals("")
						|| Double.parseDouble(textFieldPaceSeconds.getText()) <= 0) {
					textFieldPaceSeconds.setText("0");
				}

				DecimalFormat df = new DecimalFormat("0.0");
				DecimalFormat df2 = new DecimalFormat("0");
				df.setRoundingMode(RoundingMode.DOWN);
				df2.setRoundingMode(RoundingMode.DOWN);

				timeHr = Double.parseDouble(textFieldTimeHours.getText());
				timeMin = Double.parseDouble(textFieldTimeMinutes.getText());
				timeSec = Double.parseDouble(textFieldTimeSeconds.getText());
				paceHr = Double.parseDouble(textFieldPaceHours.getText());
				paceMin = Double.parseDouble(textFieldPaceMinutes.getText());
				paceSec = Double.parseDouble(textFieldPaceSeconds.getText());

				timeTotal = (timeHr) + (timeMin / 60) + (timeSec / 60 / 60);
				paceTotal = (paceHr) + (paceMin / 60) + (paceSec / 60 / 60);

				Distance dist = new Distance();

				if (timeHr <= 0 && timeMin <= 0 && timeSec <= 0 || paceHr <= 0 && paceMin <= 0 && paceSec <= 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Distance, enter a Time and Pace", "information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (timeHr < 0 || timeMin < 0 || timeSec < 0 || paceHr < 0 || paceMin < 0 || paceSec < 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Distance, enter a Time and Pace", "information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Mile"
						|| comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Kilometer") {
					if (paceTotal != 0 || timeTotal != 0) {
						distance = df.format(dist.calculate(paceTotal, timeTotal));
						textFieldDistance.setText("  "+distance);
					}
				}
				if (comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Mile") {
					if (paceTotal != 0 || timeTotal != 0) {
						distance = df.format(dist.calculate(paceTotal, timeTotal) * 1.60934);
						textFieldDistance.setText("  "+distance);
					}
				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Kilometer") {
					if (paceTotal != 0 || timeTotal != 0) {
						distance = df2.format(dist.calculate(paceTotal, timeTotal) / 1.60934);
						textFieldDistance.setText("  "+distance);
					}
				}
			}
		});

		textFieldPaceHours = new JTextField();
		textFieldPaceHours.setVisible(false);
		textFieldPaceHours.setColumns(10);
		textFieldPaceHours.setBounds(10, 45, 56, 20);
		panel_3.add(textFieldPaceHours);

		JLabel label_12 = new JLabel("hr");
		label_12.setVisible(false);
		label_12.setBounds(20, 27, 46, 14);
		panel_3.add(label_12);

		JLabel label_13 = new JLabel("mins");
		label_13.setBounds(89, 27, 46, 14);
		panel_3.add(label_13);

		textFieldPaceMinutes = new JTextField();
		textFieldPaceMinutes.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textFieldPaceMinutes.selectAll();
			}
		});
		textFieldPaceMinutes.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldPaceMinutes.getText().length() >= 2) {
					arg0.consume();
				}
				if (arg0.getKeyChar() == '.') {
					JOptionPane.showMessageDialog(frmPAC, "Decimal Not Allowed.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				} else if (arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_DELETE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_ENTER) {
					// JOptionPane.showMessageDialog(frmPAC, "You Pressed
					// Enter.",
					// "Information", JOptionPane.INFORMATION_MESSAGE);
					textFieldPaceMinutes.requestFocus();
					textFieldPaceMinutes.selectAll();
				} else if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					JOptionPane.showMessageDialog(frmPAC, "That key was not a number.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});
		textFieldPaceMinutes.setColumns(10);
		textFieldPaceMinutes.setBounds(81, 45, 38, 20);
		panel_3.add(textFieldPaceMinutes);

		JLabel label_14 = new JLabel("secs");
		label_14.setBounds(158, 27, 46, 14);
		panel_3.add(label_14);

		textFieldPaceSeconds = new JTextField();
		textFieldPaceSeconds.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textFieldPaceSeconds.selectAll();
			}
		});
		textFieldPaceSeconds.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (textFieldPaceSeconds.getText().length() > 3) {
					arg0.consume();
				}
				if (arg0.getKeyChar() == '.') {
					if (textFieldPaceSeconds.getText().contains(".")) {
						JOptionPane.showMessageDialog(frmPAC, "Only one Decimal Allowed.", "Information",
								JOptionPane.INFORMATION_MESSAGE);
						arg0.setKeyChar((char) 0);
						;
					}
				} else if (arg0.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_DELETE) {
				} else if (arg0.getKeyChar() == KeyEvent.VK_ENTER) {

					textFieldPaceSeconds.requestFocus();
					textFieldPaceSeconds.selectAll();
					;
				} else if (arg0.getKeyChar() > '9' | arg0.getKeyChar() < '0') {
					JOptionPane.showMessageDialog(frmPAC, "That key was not a number.", "Information",
							JOptionPane.INFORMATION_MESSAGE);
					arg0.setKeyChar((char) 0);
					;
				}
			}
		});
		textFieldPaceSeconds.setColumns(10);
		textFieldPaceSeconds.setBounds(132, 45, 74, 20);
		panel_3.add(textFieldPaceSeconds);

		JLabel lblPerMile = new JLabel("Per Mile");
		lblPerMile.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerMile.setBounds(116, 78, 87, 14);
		panel_3.add(lblPerMile);

		JLabel label_16 = new JLabel("To calculate your pace, fill in your");
		label_16.setVisible(false);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_16.setBounds(231, 10, 87, 14);
		panel_3.add(label_16);

		JLabel label_17 = new JLabel("time and distance, then click here:");
		label_17.setVisible(false);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_17.setBounds(231, 26, 82, 14);
		panel_3.add(label_17);

		JButton button_2 = new JButton("Calculate Pace");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(273, 42, 129, 25);
		panel_3.add(button_2);
		
		JButton clearAll = new JButton("Clear All");
		clearAll.setBounds(387, 91, 82, 23);
		panel_3.add(clearAll);
		clearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTimeHours.setText("");
				textFieldTimeMinutes.setText("");
				textFieldTimeSeconds.setText("");
				textFieldDistance.setText("");
				textFieldPaceHours.setText("");
				textFieldPaceMinutes.setText("");
				textFieldPaceSeconds.setText("");
			}
		});
		
		JButton paceClear = new JButton("Clear");
		paceClear.setBounds(400, 43, 69, 23);
		panel_3.add(paceClear);
		paceClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPaceHours.setText("");
				textFieldPaceMinutes.setText("");
				textFieldPaceSeconds.setText("");
			}
		});
		
		button_2.addActionListener(new ActionListener() {

			double distance;
			double timeHr;
			double timeMin;
			double timeSec;
			double timeTotal;
			double paceTotal;
			String pace;
			String time;
			String time2;
			String time3;

			public void actionPerformed(ActionEvent e) {

				if (textFieldTimeHours.getText().equals("") || Double.parseDouble(textFieldTimeHours.getText()) <= 0) {
					textFieldTimeHours.setText("0");
				}
				if (textFieldTimeMinutes.getText().equals("")
						|| Double.parseDouble(textFieldTimeMinutes.getText()) <= 0) {
					textFieldTimeMinutes.setText("0");
				}
				if (textFieldTimeSeconds.getText().equals("")
						|| Double.parseDouble(textFieldTimeSeconds.getText()) <= 0) {
					textFieldTimeSeconds.setText("0");
				}
				if (textFieldDistance.getText().equals("")) {
					textFieldDistance.setText("0");
				}
				if (textFieldPaceHours.getText().equals("")) {
					textFieldPaceHours.setText("0");
				}
				if (textFieldPaceMinutes.getText().equals("")
						|| Double.parseDouble(textFieldPaceMinutes.getText()) <= 0) {
					textFieldPaceMinutes.setText("0");
				}
				if (textFieldPaceSeconds.getText().equals("")
						|| Double.parseDouble(textFieldPaceSeconds.getText()) <= 0) {
					textFieldPaceSeconds.setText("0");
				}

				DecimalFormat df = new DecimalFormat("0.000000");
				DecimalFormat df2 = new DecimalFormat("0.000000");
				df.setRoundingMode(RoundingMode.DOWN);
				df2.setRoundingMode(RoundingMode.DOWN);

				distance = Double.parseDouble(textFieldDistance.getText());
				timeHr = Double.parseDouble(textFieldTimeHours.getText());
				timeMin = Double.parseDouble(textFieldTimeMinutes.getText());
				timeSec = Math.round(Double.parseDouble(textFieldTimeSeconds.getText()));
				paceTotal = (timeHr) + (timeMin / 60) + (timeSec / 60 / 60);

				Pace paceClass = new Pace();
				UnitConverter unitConvert = new UnitConverter();

				if (timeHr == 0 && timeMin == 0 && timeSec == 0 || distance == 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Pace, enter a Distance and Time", "information",
							JOptionPane.INFORMATION_MESSAGE);
				}
				if (timeHr < 0 || timeMin < 0 || timeSec < 0 || distance < 0) {
					JOptionPane.showMessageDialog(frmPAC, "To calculate Pace, enter a Distance and Time", "information",
							JOptionPane.INFORMATION_MESSAGE);

				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Mile"
						|| comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Kilometer") {
					if (paceTotal != 0 && distance != 0) {
						time = df2.format(paceClass.calculate(paceTotal, distance));
						time2 = df.format(paceClass.calculate(paceTotal, distance));
						time3 = df.format(paceClass.calculate(paceTotal, distance));
						time = unitConvert.asHours(Double.parseDouble(time));
						textFieldPaceHours.setText(time);

						time2 = unitConvert.asMinutes(Double.parseDouble(time2));
						textFieldPaceMinutes.setText(time2);

						time3 = unitConvert.asSeconds(Double.parseDouble(time3));
						textFieldPaceSeconds.setText(time3);

					}

				}
				if (comboBox.getSelectedItem() == "Miles" && comboBox_2.getSelectedItem() == "Kilometer") {
					if (paceTotal != 0 && distance != 0) {
						time = df2.format(paceClass.calculate(paceTotal, distance * 1.60934));
						time2 = df.format(paceClass.calculate(paceTotal, distance * 1.60934));
						time3 = df.format(paceClass.calculate(paceTotal, distance * 1.60934));

						time = unitConvert.asHours(Double.parseDouble(time));
						textFieldPaceHours.setText(time);

						time2 = unitConvert.asMinutes(Double.parseDouble(time2));
						textFieldPaceMinutes.setText(time2);

						time3 = unitConvert.asSeconds(Double.parseDouble(time3));
						textFieldPaceSeconds.setText(time3);

					}

				}
				if (comboBox.getSelectedItem() == "Kilometers" && comboBox_2.getSelectedItem() == "Mile") {
					if (paceTotal != 0 && distance != 0) {
						time = df2.format(paceClass.calculate(paceTotal, distance / 1.60934));
						time2 = df.format(paceClass.calculate(paceTotal, distance / 1.60934));
						time3 = df.format(paceClass.calculate(paceTotal, distance / 1.60934));

						time = unitConvert.asHours(Double.parseDouble(time));
						textFieldPaceHours.setText(time);

						time2 = unitConvert.asMinutes(Double.parseDouble(time2));
						textFieldPaceMinutes.setText(time2);

						time3 = unitConvert.asSeconds(Double.parseDouble(time3));
						textFieldPaceSeconds.setText(time3);

					}
				}
			}
		});
	}
}
