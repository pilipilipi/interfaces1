package prueba1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;

public class Prueba3Correo extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField paraTextField;
	private JTextField ccTextField;
	private JTextField ccoTextField;
	private JTextField AsuntoTextField;
	private JTextArea mensaje;
	private JButton enviar;
	private JButton palabraClave;
	private JComboBox<String> combo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba3Correo frame = new Prueba3Correo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == enviar) {

			paraTextField.setText("");
			ccTextField.setText("");
			ccoTextField.setText("");
			AsuntoTextField.setText("");
			mensaje.setText("");

		} else if (e.getSource() == palabraClave) {

			String palabraClave = JOptionPane.showInputDialog("Dime la palabra clave");

			if (palabraClave == null || palabraClave.trim().isEmpty()) {
				return;
			}

			String texto = mensaje.getText().toLowerCase();
			palabraClave = palabraClave.toLowerCase();

			int index = 0;
			int contador = 0;

			while ((index = texto.indexOf(palabraClave, index)) != -1) {
				contador++;
				index += palabraClave.length();
			}

			JOptionPane.showMessageDialog(null, "La palabra \"" + palabraClave + "\" aparece " + contador + " veces.");
		}
	}

	/**
	 * Create the frame.
	 */
	public Prueba3Correo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel para = new JLabel("Para");
		para.setHorizontalAlignment(SwingConstants.RIGHT);
		para.setBounds(20, 14, 46, 14);
		contentPane.add(para);

		JLabel cc = new JLabel("Cc");
		cc.setHorizontalAlignment(SwingConstants.RIGHT);
		cc.setBounds(20, 39, 46, 14);
		contentPane.add(cc);

		JLabel cco = new JLabel("Cco");
		cco.setHorizontalAlignment(SwingConstants.RIGHT);
		cco.setBounds(20, 64, 46, 14);
		contentPane.add(cco);

		JLabel asunto = new JLabel("Asunto");
		asunto.setHorizontalAlignment(SwingConstants.RIGHT);
		asunto.setBounds(20, 89, 46, 14);
		contentPane.add(asunto);

		paraTextField = new JTextField();
		paraTextField.setBounds(76, 11, 420, 20);
		contentPane.add(paraTextField);
		paraTextField.setColumns(10);

		ccTextField = new JTextField();
		ccTextField.setColumns(10);
		ccTextField.setBounds(76, 36, 420, 20);
		contentPane.add(ccTextField);

		ccoTextField = new JTextField();
		ccoTextField.setColumns(10);
		ccoTextField.setBounds(76, 61, 420, 20);
		contentPane.add(ccoTextField);

		AsuntoTextField = new JTextField();
		AsuntoTextField.setColumns(10);
		AsuntoTextField.setBounds(76, 86, 420, 20);
		contentPane.add(AsuntoTextField);

		mensaje = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(mensaje);
		scrollpane.setBounds(20, 114, 476, 227);
		// mensaje.setBounds(30, 114, 466, 227);
		contentPane.add(scrollpane);

		enviar = new JButton("Enviar");
		enviar.setBackground(new Color(0, 121, 255));
		enviar.setFont(new Font("Tahoma", Font.BOLD, 11));
		enviar.setBounds(407, 352, 89, 23);
		contentPane.add(enviar);
		enviar.addActionListener(this);

		palabraClave = new JButton("Buscar palabra clave");
		palabraClave.setBackground(new Color(255, 0, 128));
		palabraClave.setFont(new Font("Tahoma", Font.BOLD, 11));
		palabraClave.setBounds(248, 352, 149, 23);
		contentPane.add(palabraClave);

		combo = new JComboBox<String>();
		combo.setBounds(20, 352, 94, 22);
		contentPane.add(combo);
		combo.addItem("rojo");
		combo.addItem("verde");
		combo.addItem("azul");
		combo.addItem("amarillo");
		combo.addItem("negro");
		palabraClave.addActionListener(this);
		combo.addItemListener(this);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getSource() == combo) {
			String seleccionado = (String) combo.getSelectedItem();
			setTitle(seleccionado);
		}
	}
}
