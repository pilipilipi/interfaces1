package prueba1;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PruebaLayout4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaLayout4 frame = new PruebaLayout4();
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
	public PruebaLayout4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new FlowLayout());
		
		JButton boton = new JButton("boton");
		JTextField textField = new JTextField(10);
		JCheckBox checkbox = new JCheckBox("check box");
		JLabel etiqueta = new JLabel("etiqueta");
		
		contentPane.add(boton);
		contentPane.add(textField);
		contentPane.add(checkbox);
		contentPane.add(etiqueta);
		
		//v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
//		v.pack();
//		v.setVisible(true);

	}

}
