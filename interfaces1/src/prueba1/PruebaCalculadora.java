package prueba1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PruebaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaCalculadora frame = new PruebaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 255, 204));
		textField.setBounds(10, 11, 285, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 135, 63, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_1.setBounds(86, 135, 63, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setForeground(new Color(0, 128, 255));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_2.setBounds(159, 135, 63, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setForeground(new Color(0, 128, 255));
		btnNewButton_3.setBackground(new Color(0, 255, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_3.setBounds(10, 197, 63, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setForeground(new Color(0, 128, 255));
		btnNewButton_4.setBackground(new Color(0, 255, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_4.setBounds(86, 197, 63, 51);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(new Color(0, 128, 255));
		btnNewButton_5.setBackground(new Color(0, 255, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_5.setBounds(159, 197, 63, 51);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setForeground(new Color(0, 128, 255));
		btnNewButton_6.setBackground(new Color(0, 255, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_6.setBounds(10, 259, 63, 51);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setForeground(new Color(0, 128, 255));
		btnNewButton_7.setBackground(new Color(0, 255, 0));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_7.setBounds(86, 259, 63, 51);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setForeground(new Color(0, 128, 255));
		btnNewButton_8.setBackground(new Color(0, 255, 0));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_8.setBounds(159, 259, 63, 51);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setForeground(new Color(0, 128, 255));
		btnNewButton_10.setBackground(new Color(0, 255, 0));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_10.setBounds(86, 321, 63, 51);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(",");
		btnNewButton_11.setForeground(new Color(0, 128, 255));
		btnNewButton_11.setBackground(new Color(0, 255, 0));
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_11.setBounds(10, 321, 63, 51);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.setForeground(new Color(0, 128, 255));
		btnNewButton_12.setBackground(new Color(0, 255, 0));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_12.setBounds(232, 135, 63, 51);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.setForeground(new Color(0, 128, 255));
		btnNewButton_13.setBackground(new Color(0, 255, 0));
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_13.setBounds(232, 199, 63, 51);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.setForeground(new Color(0, 128, 255));
		btnNewButton_14.setBackground(new Color(0, 255, 0));
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_14.setBounds(232, 261, 63, 51);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.setBackground(new Color(0, 128, 255));
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_15.setBounds(159, 321, 136, 51);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("%");
		btnNewButton_16.setForeground(new Color(0, 128, 255));
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_16.setBackground(Color.GREEN);
		btnNewButton_16.setBounds(10, 73, 63, 51);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_1_1 = new JButton("CE");
		btnNewButton_1_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1.setBounds(86, 73, 63, 51);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("<-");
		btnNewButton_2_1.setForeground(new Color(0, 128, 255));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_2_1.setBackground(Color.GREEN);
		btnNewButton_2_1.setBounds(159, 73, 63, 51);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_12_1 = new JButton("*");
		btnNewButton_12_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_12_1.setForeground(new Color(0, 128, 255));
		btnNewButton_12_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_12_1.setBackground(Color.GREEN);
		btnNewButton_12_1.setBounds(232, 73, 63, 51);
		contentPane.add(btnNewButton_12_1);

	}
}
