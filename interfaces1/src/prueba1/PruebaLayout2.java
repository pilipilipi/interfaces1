package prueba1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PruebaLayout2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PruebaLayout2();
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
	public PruebaLayout2() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
		
		JPanel barraHerramientas = new JPanel();
		barraHerramientas.setLayout(new FlowLayout());
		barraHerramientas.add(new JButton("boton n"));
		barraHerramientas.add(new JButton("boton 1"));
		
		
		JFrame ventana = new JFrame();
		ventana.getContentPane().setLayout(new BorderLayout()); 
		ventana.add(barraHerramientas, BorderLayout.NORTH);
		ventana.add(new JButton(), BorderLayout.CENTER);
		ventana.add(new JButton(), BorderLayout.SOUTH);
		ventana.add(new JButton(), BorderLayout.EAST);
		ventana.add(new JButton(), BorderLayout.WEST);
		ventana.pack();
		ventana.setVisible(true);

	}

}
