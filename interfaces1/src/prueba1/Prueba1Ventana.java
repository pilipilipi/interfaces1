package prueba1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;

public class Prueba1Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1Ventana frame = new Prueba1Ventana();
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
	public Prueba1Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 128));
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new LineBorder(new Color(128, 0, 255), 13, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Guille BOBOBO");
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.setFont(new Font("Ink Free", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(124, 92, 166, 62);
		contentPane.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setForeground(new Color(255, 128, 255));
		spinner.setBackground(new Color(0, 0, 255));
		spinner.setFont(new Font("Ink Free", Font.BOLD, 23));
		spinner.setBounds(150, 165, 140, 57);
		contentPane.add(spinner);
		
		JLabel lblNewLabel = new JLabel("YIIIIYIYIYIYIYIY");
		lblNewLabel.setForeground(new Color(255, 128, 255));
		lblNewLabel.setBackground(new Color(255, 128, 255));
		lblNewLabel.setBounds(58, 32, 140, 30);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Eres guillermo?");
		rdbtnNewRadioButton.setForeground(new Color(255, 128, 255));
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 128));
		rdbtnNewRadioButton.setBounds(284, 36, 144, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Eres bobo?");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 0));
		chckbxNewCheckBox.setBackground(new Color(255, 128, 255));
		chckbxNewCheckBox.setBounds(284, 62, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(343, 165, 17, 48);
		contentPane.add(scrollBar);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(0, 255, 0));
		progressBar.setValue(37);
		progressBar.setBounds(26, 73, 146, 14);
		contentPane.add(progressBar);

	}
}
