package factura;

import java.awt.EventQueue;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
//import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private int indice;
	private JPanel contentPane;
	private JTextField asuntoTxt;
	private JTextField cantTxt;
	private DefaultListModel<FacturaClase> modeloLista = new DefaultListModel<>();
	private JList<FacturaClase> lista = new JList<>(modeloLista);
	JComboBox<String> tipoOp = new JComboBox<>(new String[] { "Empresas", "Particulares" });

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura frame = new Factura();
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
	public Factura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel asunto = new JLabel("Asunto:");
		asunto.setHorizontalAlignment(SwingConstants.LEFT);
		asunto.setBounds(23, 11, 46, 14);
		contentPane.add(asunto);

		JLabel fecha = new JLabel("Fecha:");
		fecha.setHorizontalAlignment(SwingConstants.LEFT);
		fecha.setBounds(23, 36, 46, 14);
		contentPane.add(fecha);

		JLabel cant = new JLabel("Cantidad:");
		cant.setHorizontalAlignment(SwingConstants.LEFT);
		cant.setBounds(23, 61, 93, 14);
		contentPane.add(cant);

		JLabel tipo = new JLabel("Tipo:");
		tipo.setHorizontalAlignment(SwingConstants.LEFT);
		tipo.setBounds(23, 86, 46, 14);
		contentPane.add(tipo);

		asuntoTxt = new JTextField();
		asuntoTxt.setBounds(114, 8, 86, 20);
		contentPane.add(asuntoTxt);
		asuntoTxt.setColumns(10);

		JSpinner dia = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
		dia.setBounds(114, 33, 86, 20);
		contentPane.add(dia);

		JSpinner mes = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
		mes.setBounds(210, 33, 86, 20);
		contentPane.add(mes);

		JSpinner anyo = new JSpinner(new SpinnerNumberModel(2020, 2020, 2025, 1));
		anyo.setBounds(306, 33, 86, 20);
		contentPane.add(anyo);

		cantTxt = new JTextField();
		cantTxt.setBounds(114, 58, 86, 20);
		contentPane.add(cantTxt);
		cantTxt.setColumns(10);

		tipoOp.setBounds(114, 83, 86, 20);
		contentPane.add(tipoOp);

		lista.setBounds(23, 111, 273, 139);
		contentPane.add(lista);

		JButton anyadir = new JButton("Añadir/Actualizaer");
		anyadir.setBounds(306, 111, 118, 39);
		contentPane.add(anyadir);

		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(306, 211, 118, 39);
		contentPane.add(eliminar);

		JButton editar = new JButton("Editar");
		editar.setBounds(306, 161, 118, 39);
		contentPane.add(editar);

		JLabel maxCaracteres = new JLabel("El asunto debe tener entre 1 y 10 caracteres");
		maxCaracteres.setForeground(new Color(255, 6, 94));
		maxCaracteres.setFont(new Font("Tahoma", Font.BOLD, 11));
		maxCaracteres.setHorizontalAlignment(SwingConstants.CENTER);
		maxCaracteres.setBounds(23, 271, 401, 14);
		contentPane.add(maxCaracteres);

		anyadir.addActionListener(e -> {

			if (!validarAsunto(asuntoTxt.getText())) {
				return;
			}

			if (!validarFecha((int) dia.getValue(), (int) mes.getValue(), (int) anyo.getValue())) {
				return;
			}

			try {
				if (!validarCantidad(Double.parseDouble(cantTxt.getText()))) {
					return;
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Introduce un número válido en la cantidad.");
		        return;
			}

			FacturaClase f = new FacturaClase(asuntoTxt.getText(), (int) dia.getValue(), (int) mes.getValue(),
					(int) anyo.getValue(), Double.parseDouble(cantTxt.getText()), (String) tipoOp.getSelectedItem());

			indice = lista.getSelectedIndex();
			
			if (indice != -1) {
				if (!validarRepetido2(f)) {
					return;
				}

				modeloLista.setElementAt(f, indice);
				lista.clearSelection();
				JOptionPane.showMessageDialog(null, "Elemento actualizado");

			} else {
				if (!validarRepetido(f)) {
					return;
				}
				modeloLista.addElement(f);
			}
		});

		editar.addActionListener(e -> {
			indice = lista.getSelectedIndex();
			
		    if (indice == -1) {
				JOptionPane.showMessageDialog(null, "No has seleccionado ningún item");
		    	return;
		    }
		    
		    FacturaClase seleccionada = modeloLista.getElementAt(lista.getSelectedIndex());
		    asuntoTxt.setText(seleccionada.getAsunto());
		    dia.setValue(seleccionada.getDia());
		    mes.setValue(seleccionada.getMes());
		    anyo.setValue(seleccionada.getAnyo());
		    cantTxt.setText(String.valueOf(seleccionada.getCantidad()));
		    tipoOp.setSelectedItem(seleccionada.getTipo());
		});
		
		eliminar.addActionListener(e -> {
			indice = lista.getSelectedIndex();
		
			if (indice == -1) {
				JOptionPane.showMessageDialog(null, "No has seleccionado ningún item");
		    	return;
		    }
			
			modeloLista.removeElementAt(lista.getSelectedIndex());
		});
	}

	private boolean validarAsunto(String asunto) {
		if (asuntoTxt.getText().length() > 10 || asuntoTxt.getText().length() < 1) {
			JOptionPane.showMessageDialog(null, "El asunto debe tener entre 1 y 10 caracteres");
			return false;
		}
		return true;
	}

	private boolean validarFecha(int dia, int mes, int anyo) {
		int diasC = 1;

		if (anyo < 2020 || anyo > 2025) {
			JOptionPane.showMessageDialog(null, "Año incorrecto");
			return false;
		}

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Mes incorrecto");
			return false;
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> diasC = 31;

		case 4, 6, 9, 11 -> diasC = 30;

		case 2 -> diasC = 28;
		}

		if (dia < 1 || dia > diasC) {
			JOptionPane.showMessageDialog(null, "Fecha incorrecta");
			return false;
		}

		return true;
	}

	private boolean validarCantidad(double c) {

		if (c < 0 || cantTxt.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0");
			return false;
		}
		return true;
	}

	private boolean validarRepetido(FacturaClase f) {

		for (int i = 0; i < modeloLista.getSize(); i++) {
			if (f.getAsunto().equals(modeloLista.getElementAt(i).getAsunto())) {
				JOptionPane.showMessageDialog(null, "Asunto repetido");
				return false;
			}
		}
		return true;
	}

	private boolean validarRepetido2(FacturaClase f) {

		for (int i = 0; i < modeloLista.getSize(); i++) {
			if (f.getAsunto().equals(modeloLista.getElementAt(i).getAsunto()) && i != lista.getSelectedIndex()) {
				JOptionPane.showMessageDialog(null, "Asunto repetido");
				return false;
			}
		}
		return true;
	}
}
