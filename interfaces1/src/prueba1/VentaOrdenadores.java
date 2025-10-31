package windowBuilder;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentaOrdenadores extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField escribirNombre;
	private JComboBox<String> comboBox;
	private JList<String> listaClientes;
	private DefaultListModel<String> modeloLista;

	// Grupos de radio buttons
	private ButtonGroup grupoProcesadores, grupoMemoria, grupoMonitor, grupoDisco;
	private JRadioButton p1, p2, p3, p4, m1, m2, m3, m4, mn1, mn2, mn3, mn4, d1, d2, d3, d4;
	private JCheckBox o1, o2, o3, o4;
	private JButton añadir, buscar, eliminar, cancelar, salir;

	// Vector de ventas
	private ArrayList<Venta> ventas = new ArrayList<>();

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				VentaOrdenadores frame = new VentaOrdenadores();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public VentaOrdenadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ventas de ordenadores");
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel nombreCliente = new JLabel("Nombre del cliente:");
		nombreCliente.setBounds(10, 10, 150, 20);
		contentPane.add(nombreCliente);

		escribirNombre = new JTextField();
		escribirNombre.setBounds(140, 10, 150, 22);
		escribirNombre.setColumns(15);
		contentPane.add(escribirNombre);

		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(10, 40, 80, 20);
		contentPane.add(lblLocalidad);

		comboBox = new JComboBox<>();
		comboBox.addItem("Villalba");
		comboBox.addItem("Alpedrete");
		comboBox.addItem("Galapagar");
		comboBox.addItem("Guadarrama");
		comboBox.addItem("Moralzarzal");
		comboBox.setBounds(140, 40, 120, 22);
		contentPane.add(comboBox);

		JLabel lblLista = new JLabel("Lista de clientes:");
		lblLista.setBounds(350, 10, 120, 20);
		contentPane.add(lblLista);

		modeloLista = new DefaultListModel<>();
		listaClientes = new JList<>(modeloLista);
		JScrollPane scroll = new JScrollPane(listaClientes);
		scroll.setBounds(450, 10, 120, 100);
		contentPane.add(scroll);

		// Secciones
		JLabel procesador = new JLabel("Procesador");
		procesador.setFont(new Font("Tahoma", Font.BOLD, 11));
		procesador.setBounds(10, 80, 100, 14);
		contentPane.add(procesador);

		p1 = new JRadioButton("P4 3.0 Gb");
		p2 = new JRadioButton("P4 3.2 Gb");
		p3 = new JRadioButton("P4 Celeron");
		p4 = new JRadioButton("AMD 650");
		grupoProcesadores = new ButtonGroup();
		grupoProcesadores.add(p1);
		grupoProcesadores.add(p2);
		grupoProcesadores.add(p3);
		grupoProcesadores.add(p4);
		p1.setBounds(10, 100, 100, 23);
		p2.setBounds(10, 120, 100, 23);
		p3.setBounds(10, 140, 100, 23);
		p4.setBounds(10, 160, 100, 23);
		contentPane.add(p1);
		contentPane.add(p2);
		contentPane.add(p3);
		contentPane.add(p4);

		JLabel memoria = new JLabel("Memoria");
		memoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		memoria.setBounds(120, 80, 100, 14);
		contentPane.add(memoria);

		m1 = new JRadioButton("128 Mb");
		m2 = new JRadioButton("256 Mb");
		m3 = new JRadioButton("512 Mb");
		m4 = new JRadioButton("1024 Mb");
		grupoMemoria = new ButtonGroup();
		grupoMemoria.add(m1);
		grupoMemoria.add(m2);
		grupoMemoria.add(m3);
		grupoMemoria.add(m4);
		m1.setBounds(120, 100, 100, 23);
		m2.setBounds(120, 120, 100, 23);
		m3.setBounds(120, 140, 100, 23);
		m4.setBounds(120, 160, 100, 23);
		contentPane.add(m1);
		contentPane.add(m2);
		contentPane.add(m3);
		contentPane.add(m4);

		JLabel monitor = new JLabel("Monitor");
		monitor.setFont(new Font("Tahoma", Font.BOLD, 11));
		monitor.setBounds(230, 80, 100, 14);
		contentPane.add(monitor);

		mn1 = new JRadioButton("15\"");
		mn2 = new JRadioButton("17\"");
		mn3 = new JRadioButton("TFT 15\"");
		mn4 = new JRadioButton("TFT 17\"");
		grupoMonitor = new ButtonGroup();
		grupoMonitor.add(mn1);
		grupoMonitor.add(mn2);
		grupoMonitor.add(mn3);
		grupoMonitor.add(mn4);
		mn1.setBounds(230, 100, 100, 23);
		mn2.setBounds(230, 120, 100, 23);
		mn3.setBounds(230, 140, 100, 23);
		mn4.setBounds(230, 160, 100, 23);
		contentPane.add(mn1);
		contentPane.add(mn2);
		contentPane.add(mn3);
		contentPane.add(mn4);

		JLabel disco = new JLabel("Disco duro");
		disco.setFont(new Font("Tahoma", Font.BOLD, 11));
		disco.setBounds(340, 80, 100, 14);
		contentPane.add(disco);

		d1 = new JRadioButton("60 Gb");
		d2 = new JRadioButton("80 Gb");
		d3 = new JRadioButton("120 Gb");
		d4 = new JRadioButton("200 Gb");
		grupoDisco = new ButtonGroup();
		grupoDisco.add(d1);
		grupoDisco.add(d2);
		grupoDisco.add(d3);
		grupoDisco.add(d4);
		d1.setBounds(340, 100, 100, 23);
		d2.setBounds(340, 120, 100, 23);
		d3.setBounds(340, 140, 100, 23);
		d4.setBounds(340, 160, 100, 23);
		contentPane.add(d1);
		contentPane.add(d2);
		contentPane.add(d3);
		contentPane.add(d4);

		JLabel opciones = new JLabel("Opciones");
		opciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		opciones.setBounds(450, 120, 100, 14);
		contentPane.add(opciones);

		o1 = new JCheckBox("Grabadora DVD");
		o2 = new JCheckBox("Wifi");
		o3 = new JCheckBox("Sintonizador TV");
		o4 = new JCheckBox("Backup/Restore");
		o1.setBounds(450, 140, 150, 23);
		o2.setBounds(450, 160, 150, 23);
		o3.setBounds(450, 180, 150, 23);
		o4.setBounds(450, 200, 150, 23);
		contentPane.add(o1);
		contentPane.add(o2);
		contentPane.add(o3);
		contentPane.add(o4);

		añadir = new JButton("Añadir");
		añadir.setBounds(50, 250, 100, 25);
		buscar = new JButton("Buscar");
		buscar.setBounds(160, 250, 100, 25);
		eliminar = new JButton("Eliminar");
		eliminar.setBounds(270, 250, 100, 25);
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(380, 250, 100, 25);
		salir = new JButton("Salir");
		salir.setBounds(490, 250, 80, 25);

		contentPane.add(añadir);
		contentPane.add(buscar);
		contentPane.add(eliminar);
		contentPane.add(cancelar);
		contentPane.add(salir);

		// Acciones
		escribirNombre.addActionListener(this);
		añadir.addActionListener(this);
		buscar.addActionListener(this);
		eliminar.addActionListener(this);
		cancelar.addActionListener(this);
		salir.addActionListener(e -> System.exit(0));
		listaClientes.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting())
				activarEliminar();
		});

		estadoInicial();
	}

	private void estadoInicial() {
		escribirNombre.setText("");
		escribirNombre.requestFocus();
		comboBox.setEnabled(false);
		setGrupoEnabled(false);
		añadir.setEnabled(false);
		buscar.setEnabled(false);
		eliminar.setEnabled(false);
		cancelar.setEnabled(true);
	}

	private void setGrupoEnabled(boolean enabled) {
		for (Component c : contentPane.getComponents()) {
			if (c instanceof JRadioButton || c instanceof JCheckBox || c == comboBox)
				c.setEnabled(enabled);
		}
	}

	private void activarEliminar() {
		if (!listaClientes.isSelectionEmpty()) {
			eliminar.setEnabled(true);
			añadir.setEnabled(false);
			buscar.setEnabled(false);
		}
	}

	private void configurarEstandar() {
		p2.setSelected(true);
		m4.setSelected(true);
		mn4.setSelected(true);
		d4.setSelected(true);
		o1.setSelected(true);
		o2.setSelected(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == escribirNombre) {
			String nombre = escribirNombre.getText().trim();
			if (!nombre.isEmpty()) {
				comboBox.setEnabled(true);
				setGrupoEnabled(true);
				configurarEstandar();
				añadir.setEnabled(true);
				buscar.setEnabled(true);
				comboBox.requestFocus();
			}
		} else if (src == añadir) {
			String nombre = escribirNombre.getText().trim();
			if (!nombre.isEmpty()) {
				modeloLista.addElement(nombre);
				ventas.add(crearVenta(nombre));
				estadoInicial();
			}
		} else if (src == buscar) {
			String nombre = escribirNombre.getText().trim();
			boolean encontrado = false;
			for (Venta v : ventas) {
				if (v.getNombre().equalsIgnoreCase(nombre)) {
					mostrarVenta(v);
					encontrado = true;
					break;
				}
			}
			if (!encontrado)
				JOptionPane.showMessageDialog(this, "No se encontró ninguna venta para ese cliente.");
		} else if (src == eliminar) {
			String nombre = listaClientes.getSelectedValue();
			if (nombre != null) {
				int r = JOptionPane.showConfirmDialog(this, "¿Eliminar la venta de " + nombre + "?", "Confirmar",
						JOptionPane.YES_NO_OPTION);
				if (r == JOptionPane.YES_OPTION) {
					modeloLista.removeElement(nombre);
					ventas.removeIf(v -> v.getNombre().equalsIgnoreCase(nombre));
					estadoInicial();
				}
			}
		} else if (src == cancelar) {
			estadoInicial();
		}
	}

	private Venta crearVenta(String nombre) {
		String localidad = (String) comboBox.getSelectedItem();
		String proc = getSeleccionado(grupoProcesadores);
		String mem = getSeleccionado(grupoMemoria);
		String mon = getSeleccionado(grupoMonitor);
		String dd = getSeleccionado(grupoDisco);
		boolean dvd = o1.isSelected(), wifi = o2.isSelected(), tv = o3.isSelected(), backup = o4.isSelected();
		return new Venta(nombre, localidad, proc, mem, mon, dd, dvd, wifi, tv, backup);
	}

	private void mostrarVenta(Venta v) {
		escribirNombre.setText(v.getNombre());
		comboBox.setSelectedItem(v.getLocalidad());
		seleccionarRadio(grupoProcesadores, v.getProcesador());
		seleccionarRadio(grupoMemoria, v.getMemoria());
		seleccionarRadio(grupoMonitor, v.getMonitor());
		seleccionarRadio(grupoDisco, v.getDisco());
		o1.setSelected(v.isDvd());
		o2.setSelected(v.isWifi());
		o3.setSelected(v.isTv());
		o4.setSelected(v.isBackup());
	}

	private String getSeleccionado(ButtonGroup g) {
		for (Enumeration<AbstractButton> e = g.getElements(); e.hasMoreElements();) {
			AbstractButton b = e.nextElement();
			if (b.isSelected())
				return b.getText();
		}
		return "";
	}

	private void seleccionarRadio(ButtonGroup g, String texto) {
		for (Enumeration<AbstractButton> e = g.getElements(); e.hasMoreElements();) {
			AbstractButton b = e.nextElement();
			if (b.getText().equals(texto)) {
				b.setSelected(true);
				break;
			}
		}
	}
}
