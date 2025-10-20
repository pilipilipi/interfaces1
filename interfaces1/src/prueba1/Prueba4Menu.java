package prueba1;

import java.awt.*;
//import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Prueba4Menu extends JFrame implements ActionListener {
	private JMenuBar mb;
	private JMenu menu1, menu2;
	private JMenuItem item1, item2, item3, item11, item22, item33;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba4Menu frame = new Prueba4Menu();
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
	public Prueba4Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu1 = new JMenu("opciones");
		mb.add(menu1);
		
		item1 = new JMenuItem("Rojo");
		item1.addActionListener(this);
		menu1.add(item1);

		item2 = new JMenuItem("Verde");
		item2.addActionListener(this);
		menu1.add(item2);
		
		item3 = new JMenuItem("Azul");
		item3.addActionListener(this);
		menu1.add(item3);
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		menu2 = new JMenu("opciones");
		mb.add(menu2);
		
		item11 = new JMenuItem("Rosa");
		item11.addActionListener(this);
		menu2.add(item11);

		item22 = new JMenuItem("Amarillo");
		item22.addActionListener(this);
		menu2.add(item22);
		
		item33 = new JMenuItem("Morado");
		item33.addActionListener(this);
		menu2.add(item33);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Container f = this.getContentPane();
		
		if (e.getSource() == item1) {
			f.setBackground(Color.red);
			
		} else if (e.getSource() == item2) {
			f.setBackground(Color.green);
			
		} else if (e.getSource() == item3) {
			f.setBackground(Color.blue);
			
		}else if (e.getSource() == item11) {
			f.setBackground(Color.pink);
			
		} else if (e.getSource() == item22) {
			f.setBackground(Color.yellow);
			
		} else if (e.getSource() == item33) {
			f.setBackground(Color.black);
			
		}
	}
}
