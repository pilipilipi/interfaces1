package prueba1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class VentaOrdenadores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField escribirNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaOrdenadores frame = new VentaOrdenadores();
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
	public VentaOrdenadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nombreCliente = new JLabel("Nombre del Cliente");
		nombreCliente.setHorizontalAlignment(SwingConstants.LEFT);
		nombreCliente.setBounds(6, 11, 100, 14);
		contentPane.add(nombreCliente);
		
		escribirNombre = new JTextField();
		escribirNombre.setBounds(106, 8, 86, 20);
		contentPane.add(escribirNombre);
		escribirNombre.setColumns(10);
		
		JLabel lblListaDeClientes = new JLabel("Lista de Clientes");
		lblListaDeClientes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblListaDeClientes.setBounds(208, 14, 109, 14);
		contentPane.add(lblListaDeClientes);
		
		JTextArea textLista = new JTextArea();
		textLista.setBounds(327, 11, 170, 69);
		contentPane.add(textLista);
		
		JLabel Localidad = new JLabel("Localidad");
		Localidad.setHorizontalAlignment(SwingConstants.LEFT);
		Localidad.setBounds(6, 40, 68, 14);
		contentPane.add(Localidad);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(106, 36, 75, 22);
		contentPane.add(comboBox);
		comboBox.addItem("Madrid");
        comboBox.addItem("Barcelona");
        comboBox.addItem("Valencia");
        comboBox.addItem("Sevilla");
        comboBox.addItem("Bilbao");
        comboBox.addActionListener(this);
		
		JLabel procesador = new JLabel("Procesador");
		procesador.setFont(new Font("Tahoma", Font.BOLD, 11));
		procesador.setHorizontalAlignment(SwingConstants.LEFT);
		procesador.setBounds(10, 104, 64, 14);
		contentPane.add(procesador);
		
		JLabel memoria = new JLabel("Memoria");
		memoria.setHorizontalAlignment(SwingConstants.LEFT);
		memoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		memoria.setBounds(120, 104, 54, 14);
		contentPane.add(memoria);
		
		JLabel monitor = new JLabel("Monitor");
		monitor.setHorizontalAlignment(SwingConstants.LEFT);
		monitor.setFont(new Font("Tahoma", Font.BOLD, 11));
		monitor.setBounds(218, 104, 44, 14);
		contentPane.add(monitor);
		
		JLabel discoDuro = new JLabel("Disco Duro");
		discoDuro.setHorizontalAlignment(SwingConstants.LEFT);
		discoDuro.setFont(new Font("Tahoma", Font.BOLD, 11));
		discoDuro.setBounds(304, 104, 64, 14);
		contentPane.add(discoDuro);
		
		JLabel opciones = new JLabel("Opciones");
		opciones.setHorizontalAlignment(SwingConstants.LEFT);
		opciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		opciones.setBounds(411, 104, 64, 14);
		contentPane.add(opciones);
		
		JRadioButton p1 = new JRadioButton("P4 3.0 Gb");
		p1.setBounds(6, 128, 75, 23);
		contentPane.add(p1);
		
		JRadioButton p2 = new JRadioButton("P4 3.2 Gb");
		p2.setBounds(6, 154, 86, 23);
		contentPane.add(p2);

		JRadioButton p3 = new JRadioButton("P4 Celeron");
		p3.setBounds(6, 180, 86, 23);
		contentPane.add(p3);
		
		JRadioButton p4 = new JRadioButton("AMD 650");
		p4.setBounds(6, 206, 75, 23);
		contentPane.add(p4);
		
		ButtonGroup grupoProcesadores = new ButtonGroup();
		grupoProcesadores.add(p1);
		grupoProcesadores.add(p2);
		grupoProcesadores.add(p3);
		grupoProcesadores.add(p4);
		
		JRadioButton m1 = new JRadioButton("128 Mb");
		m1.setBounds(106, 128, 69, 23);
		contentPane.add(m1);
		
		JRadioButton m2 = new JRadioButton("P4 3.2 Gb");
		m2.setBounds(106, 154, 75, 23); // +26 píxeles en Y
		contentPane.add(m2);

		JRadioButton m3 = new JRadioButton("P4 Celeron");
		m3.setBounds(106, 180, 77, 23); // +26 píxeles en Y
		contentPane.add(m3);

		JRadioButton m4 = new JRadioButton("AMD 650");
		m4.setBounds(106, 206, 75, 23); // +26 píxeles en Y
		contentPane.add(m4);
		
		ButtonGroup grupoMemoria = new ButtonGroup();
		grupoMemoria.add(m1);
		grupoMemoria.add(m2);
		grupoMemoria.add(m3);
		grupoMemoria.add(m4);
		
		JRadioButton mn1 = new JRadioButton("15\"");
		mn1.setBounds(197, 128, 69, 23);
		contentPane.add(mn1);
		
		JRadioButton mn2 = new JRadioButton("17\"");
		mn2.setBounds(197, 154, 75, 23);
		contentPane.add(mn2);
		
		JRadioButton mn3 = new JRadioButton("TFT 15\"");
		mn3.setBounds(197, 180, 77, 23);
		contentPane.add(mn3);
		
		JRadioButton mn4 = new JRadioButton("TFT 17\"");
		mn4.setBounds(197, 206, 75, 23);
		contentPane.add(mn4);
		
		ButtonGroup grupoMonitor = new ButtonGroup();
		grupoMonitor.add(mn1);
		grupoMonitor.add(mn2);
		grupoMonitor.add(mn3);
		grupoMonitor.add(mn4);
		
		JRadioButton d1 = new JRadioButton("60 Gb");
		d1.setBounds(304, 125, 69, 23);
		contentPane.add(d1);
		
		JRadioButton d2 = new JRadioButton("80 Gb");
		d2.setBounds(304, 151, 75, 23);
		contentPane.add(d2);
		
		JRadioButton d3 = new JRadioButton("120 Gb");
		d3.setBounds(304, 177, 64, 23);
		contentPane.add(d3);
		
		JRadioButton d4 = new JRadioButton("200 Gb");
		d4.setBounds(304, 203, 64, 23);
		contentPane.add(d4);
		
		ButtonGroup grupoDisco = new ButtonGroup();
		grupoDisco.add(d1);
		grupoDisco.add(d2);
		grupoDisco.add(d3);
		grupoDisco.add(d4);
		
		JCheckBox o1 = new JCheckBox("Grabadora DVD");
		o1.setBounds(375, 125, 126, 23);
		contentPane.add(o1);
		
		JCheckBox o2 = new JCheckBox("Wifi");
		o2.setBounds(375, 154, 126, 23);
		contentPane.add(o2);
		
		JCheckBox o3 = new JCheckBox("Sincronizador TV");
		o3.setBounds(375, 180, 126, 23);
		contentPane.add(o3);
		
		JCheckBox o4 = new JCheckBox("Grabadora DVD");
		o4.setBounds(375, 206, 126, 23);
		contentPane.add(o4);
		
		JButton añadir = new JButton("Añadir");
		añadir.setForeground(new Color(255, 0, 128));
		añadir.setBounds(6, 251, 89, 23);
		contentPane.add(añadir);
		
		JButton buscar = new JButton("Buscar");
		buscar.setForeground(new Color(0, 128, 255));
		buscar.setBounds(106, 251, 89, 23);
		contentPane.add(buscar);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setForeground(new Color(0, 255, 64));
		eliminar.setBounds(218, 251, 89, 23);
		contentPane.add(eliminar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setForeground(new Color(200, 73, 254));
		cancelar.setBounds(408, 251, 89, 23);
		contentPane.add(cancelar);
		
		JButton salir = new JButton("Salir");
		salir.setForeground(new Color(255, 128, 0));
		salir.setBounds(408, 285, 89, 23);
		contentPane.add(salir);
		
		
		//escribir lo del textfield al textarea
		ActionListener añade = e -> {
		    String texto = escribirNombre.getText();
		    if (!texto.isEmpty()) {
		        textLista.append(texto + "\n");
		        escribirNombre.setText("");
		    }
		};
		
		escribirNombre.addActionListener(añade);
		añadir.addActionListener(añade);
		
//		activar y desactivar con setenabled
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
}
