package ventas;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VentaOrdenadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField txtNombre;
    private JComboBox<String> comboLocalidad;
    private JList<String> listaClientes;
    private DefaultListModel<String> modeloLista;
    private JButton btnAñadir, btnBuscar, btnEliminar, btnCancelar, btnSalir;

    private JRadioButton p1, p2, p3, p4;
    private JRadioButton m1, m2, m3, m4;
    private JRadioButton mo1, mo2, mo3, mo4;
    private JRadioButton dd1, dd2, dd3, dd4;

    private JCheckBox o1, o2, o3, o4;

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

        JLabel lblNombre = new JLabel("Nombre del cliente");
        lblNombre.setBounds(20, 20, 150, 20);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(160, 20, 150, 20);
        txtNombre.setColumns(15);
        contentPane.add(txtNombre);

        JLabel lblLista = new JLabel("Lista de clientes");
        lblLista.setBounds(350, 20, 120, 20);
        contentPane.add(lblLista);

        modeloLista = new DefaultListModel<>();
        listaClientes = new JList<>(modeloLista);
        listaClientes.setBounds(350, 45, 200, 100);
        contentPane.add(listaClientes);

        JLabel lblLocalidad = new JLabel("Localidad");
        lblLocalidad.setBounds(20, 50, 100, 20);
        contentPane.add(lblLocalidad);

        comboLocalidad = new JComboBox<>(new String[]{"Villalba", "Alpedrete", "Galapagar", "Guadarrama", "Moralzarzal"});
        comboLocalidad.setBounds(160, 50, 150, 20);
        contentPane.add(comboLocalidad);

        JLabel lblProc = new JLabel("Procesador");
        lblProc.setBounds(20, 90, 100, 20);
        contentPane.add(lblProc);
        p1 = new JRadioButton("P4 3.0 Gb");
        p2 = new JRadioButton("P4 3.2 Gb");
        p3 = new JRadioButton("P4 Celeron");
        p4 = new JRadioButton("AMD 650");
        ButtonGroup grpProc = new ButtonGroup();
        p1.setBounds(20, 110, 100, 20);
        p2.setBounds(20, 130, 100, 20);
        p3.setBounds(20, 150, 100, 20);
        p4.setBounds(20, 170, 100, 20);
        grpProc.add(p1); grpProc.add(p2); grpProc.add(p3); grpProc.add(p4);
        contentPane.add(p1); contentPane.add(p2); contentPane.add(p3); contentPane.add(p4);

        JLabel lblMem = new JLabel("Memoria");
        lblMem.setBounds(130, 90, 100, 20);
        contentPane.add(lblMem);
        m1 = new JRadioButton("128 Mb");
        m2 = new JRadioButton("256 Mb");
        m3 = new JRadioButton("512 Mb");
        m4 = new JRadioButton("1024 Mb");
        ButtonGroup grpMem = new ButtonGroup();
        m1.setBounds(130, 110, 100, 20);
        m2.setBounds(130, 130, 100, 20);
        m3.setBounds(130, 150, 100, 20);
        m4.setBounds(130, 170, 100, 20);
        grpMem.add(m1); grpMem.add(m2); grpMem.add(m3); grpMem.add(m4);
        contentPane.add(m1); contentPane.add(m2); contentPane.add(m3); contentPane.add(m4);

        JLabel lblMon = new JLabel("Monitor");
        lblMon.setBounds(240, 90, 100, 20);
        contentPane.add(lblMon);
        mo1 = new JRadioButton("15\"");
        mo2 = new JRadioButton("17\"");
        mo3 = new JRadioButton("TFT 15\"");
        mo4 = new JRadioButton("TFT 17\"");
        ButtonGroup grpMon = new ButtonGroup();
        mo1.setBounds(240, 110, 100, 20);
        mo2.setBounds(240, 130, 100, 20);
        mo3.setBounds(240, 150, 100, 20);
        mo4.setBounds(240, 170, 100, 20);
        grpMon.add(mo1); grpMon.add(mo2); grpMon.add(mo3); grpMon.add(mo4);
        contentPane.add(mo1); contentPane.add(mo2); contentPane.add(mo3); contentPane.add(mo4);

        JLabel lblDisco = new JLabel("Disco Duro");
        lblDisco.setBounds(350, 160, 100, 20);
        contentPane.add(lblDisco);
        dd1 = new JRadioButton("60 Gb");
        dd2 = new JRadioButton("80 Gb");
        dd3 = new JRadioButton("120 Gb");
        dd4 = new JRadioButton("200 Gb");
        ButtonGroup grpDisco = new ButtonGroup();
        dd1.setBounds(350, 180, 80, 20);
        dd2.setBounds(350, 200, 80, 20);
        dd3.setBounds(350, 220, 80, 20);
        dd4.setBounds(350, 240, 80, 20);
        grpDisco.add(dd1); grpDisco.add(dd2); grpDisco.add(dd3); grpDisco.add(dd4);
        contentPane.add(dd1); contentPane.add(dd2); contentPane.add(dd3); contentPane.add(dd4);

        JLabel lblOpt = new JLabel("Opciones");
        lblOpt.setBounds(450, 160, 100, 20);
        contentPane.add(lblOpt);
        o1 = new JCheckBox("Grabadora DVD");
        o2 = new JCheckBox("Wifi");
        o3 = new JCheckBox("Sintonizador TV");
        o4 = new JCheckBox("Backup/Restore");
        o1.setBounds(450, 180, 130, 20);
        o2.setBounds(450, 200, 100, 20);
        o3.setBounds(450, 220, 130, 20);
        o4.setBounds(450, 240, 130, 20);
        contentPane.add(o1); contentPane.add(o2); contentPane.add(o3); contentPane.add(o4);

        btnAñadir = new JButton("Añadir");
        btnBuscar = new JButton("Buscar");
        btnEliminar = new JButton("Eliminar");
        btnCancelar = new JButton("Cancelar");
        btnSalir = new JButton("Salir");
        btnAñadir.setBounds(20, 300, 100, 25);
        btnBuscar.setBounds(130, 300, 100, 25);
        btnEliminar.setBounds(240, 300, 100, 25);
        btnCancelar.setBounds(350, 300, 100, 25);
        btnSalir.setBounds(460, 300, 100, 25);
        contentPane.add(btnAñadir); contentPane.add(btnBuscar);
        contentPane.add(btnEliminar); contentPane.add(btnCancelar); contentPane.add(btnSalir);

        setEstadoInicial();

        txtNombre.addActionListener(e -> {
            if (!txtNombre.getText().trim().isEmpty()) activarControles();
        });
        
        

        btnAñadir.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            if (!nombre.isEmpty()) {
                String localidad = comboLocalidad.getSelectedItem().toString();

                String procesador = getSelectedButtonText(new JRadioButton[]{p1, p2, p3, p4});
                String memoria = getSelectedButtonText(new JRadioButton[]{m1, m2, m3, m4});
                String monitor = getSelectedButtonText(new JRadioButton[]{mo1, mo2, mo3, mo4});
                String disco = getSelectedButtonText(new JRadioButton[]{dd1, dd2, dd3, dd4});
                
                Venta v = new Venta(nombre, localidad, procesador, memoria, monitor, disco,
                        o1.isSelected(), o2.isSelected(), o3.isSelected(), o4.isSelected());

                ventas.add(v);
                modeloLista.addElement(nombre);
                JOptionPane.showMessageDialog(this, "Venta añadida correctamente");

                setEstadoInicial();
            }
        });

        btnBuscar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            boolean encontrado = ventas.stream().anyMatch(v -> v.getNombre().equalsIgnoreCase(nombre));
            if (!encontrado)
                JOptionPane.showMessageDialog(this, "No se encontró ninguna venta para este cliente");
            else
                JOptionPane.showMessageDialog(this, "Venta encontrada para " + nombre);
        });

        listaClientes.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && listaClientes.getSelectedValue() != null) {
                txtNombre.setText(listaClientes.getSelectedValue());
                btnEliminar.setEnabled(true);
                btnAñadir.setEnabled(false);
                btnBuscar.setEnabled(false);
            }
        });

        btnEliminar.addActionListener(e -> {
            String nombre = listaClientes.getSelectedValue();
            if (nombre != null && JOptionPane.showConfirmDialog(this,
                    "¿Eliminar venta de " + nombre + "?", "Confirmar", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                modeloLista.removeElement(nombre);
                ventas.removeIf(v -> v.getNombre().equals(nombre));
                setEstadoInicial();
            }
        });

        btnCancelar.addActionListener(e -> setEstadoInicial());
        btnSalir.addActionListener(e -> dispose());
    }

    private void setEstadoInicial() {
        txtNombre.setText("");
        txtNombre.setEnabled(true);
        txtNombre.requestFocus();
        comboLocalidad.setEnabled(false);
        setEnabledControles(false);
        btnAñadir.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    private void activarControles() {
        comboLocalidad.setEnabled(true);
        setEnabledControles(true);
        p2.setSelected(true);
        m4.setSelected(true);
        mo4.setSelected(true);
        dd4.setSelected(true);
        o1.setSelected(true);
        o2.setSelected(true);
        btnAñadir.setEnabled(true);
        btnBuscar.setEnabled(true);
        comboLocalidad.requestFocus();
    }

    private void setEnabledControles(boolean estado) {
        p1.setEnabled(estado); p2.setEnabled(estado);
        p3.setEnabled(estado); p4.setEnabled(estado);
        m1.setEnabled(estado); m2.setEnabled(estado);
        m3.setEnabled(estado); m4.setEnabled(estado);
        mo1.setEnabled(estado); mo2.setEnabled(estado);
        mo3.setEnabled(estado); mo4.setEnabled(estado);
        dd1.setEnabled(estado); dd2.setEnabled(estado);
        dd3.setEnabled(estado); dd4.setEnabled(estado);
        o1.setEnabled(estado); o2.setEnabled(estado);
        o3.setEnabled(estado); o4.setEnabled(estado);
    }
    
    private String getSelectedButtonText(JRadioButton[] botones) {
        for (JRadioButton b : botones) {
            if (b.isSelected()) return b.getText();
        }
        return "";
    }
}
