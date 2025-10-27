package prueba1;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
//import javax.swing.border.EmptyBorder;

public class PruebaLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PruebaLayout();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaLayout() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
		JFrame v = new JFrame();
		v.getContentPane().setLayout(new FlowLayout());
		
		JButton boton = new JButton("boton");
		JTextField textField = new JTextField(10);
		JCheckBox checkbox = new JCheckBox("check box");
		JLabel etiqueta = new JLabel("etiqueta");
		
		v.getContentPane().add(boton);
		v.getContentPane().add(textField);
		v.getContentPane().add(checkbox);
		v.getContentPane().add(etiqueta);
		
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		v.pack();
		v.setVisible(true);
	}

}
