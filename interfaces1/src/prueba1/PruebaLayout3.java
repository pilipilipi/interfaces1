package prueba1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PruebaLayout3 extends JFrame {

	private boolean turno = true;
	private JButton botones[] = new JButton[9];

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaLayout3 frame = new PruebaLayout3();
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
	public PruebaLayout3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		ActionListener cambia = e -> {
			JButton boton = (JButton) e.getSource();

			if (boton.getBackground() != Color.gray) {
				return;

			} else if (turno) {
				boton.setBackground(Color.cyan);

			} else {
				boton.setBackground(Color.magenta);
			}

			if (ganador()) {
				if (!turno) {
					JOptionPane.showMessageDialog(null, "Rosa gana!");
					System.exit(0);

				} else {
					JOptionPane.showMessageDialog(null, "Azul gana!");
					System.exit(0);
				}
			}

			turno = !turno;
		};

		for (int i = 0; i < 9; i++) {
			botones[i] = new JButton();
			botones[i].setBackground(Color.gray);
		}

		contentPane.setLayout(new GridLayout(3, 3));

		for (int i = 0; i < 9; i++) {
			botones[i].addActionListener(cambia);
			contentPane.add(botones[i]);
		}

	}

	public boolean ganador() {

		int combinaciones[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
				{ 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] x : combinaciones) {

			Color a = botones[x[0]].getBackground();
			Color b = botones[x[1]].getBackground();
			Color c = botones[x[2]].getBackground();

			if (!a.equals(Color.gray) && a.equals(b) && a.equals(c)) {
				return true;
			}
		}

		return false;
	}

}
