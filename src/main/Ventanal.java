package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;

public class Ventanal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelOperarioYMesa;
	private JPanel panelPromociones;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panelOperarioABM;
	private JPanel panelMesaABM;
	private JPanel panelOperarioCreacion;
	private JTextField textFieldOperarioUsuarioAlta;
	private JLabel lblOperarioUsuarioAlta;
	private JTextField textFieldOperarioContraseniaAlta;
	private JLabel lblOperarioContraseniaAlta;
	private JLabel lblOperarioNyAAlta;
	private JTextField textFieldOperarioNyAAlta;
	private JButton btnOperarioAlta;
	private JList listOperarios;
	private JButton btnOperarioBaja;
	private JPanel panelOperarioModif;
	private JLabel lblOperarioUsuarioModif;
	private JTextField textFieldOperarioUsuarioModif;
	private JLabel lblOperarioContraseniaModif;
	private JLabel lblOperarioNyAModif;
	private JLabel lblOperarioEstadoModif;
	private JTextField textFieldOperarioContraseniaModif;
	private JTextField textFieldOperarioNyAModif;
	private JComboBox comboBoxOperarioEstadoModif;
	private JButton btnNewButton;
	private JPanel panelMesaCreacion;
	private JTextField textFieldMesaNumeroAlta;
	private JLabel lblMesaNumeroAlta;
	private JTextField textFieldMesaCantidadComensalesAlta;
	private JLabel lblMesaCantidadComensalesAlta;
	private JButton btnMesaAlta;
	private JList listMesas;
	private JButton btnMesaBaja;
	private JPanel panelMesaModif;
	private JLabel lblMesaNumeroModif;
	private JTextField textFieldMesaNumeroModif;
	private JLabel lblMesaCantidadComensalesModif;
	private JLabel lblMesaEstadoModif;
	private JTextField textFieldMesaCantidadComensalesModif;
	private JButton btnNewButton_1;
	private JPanel panelPromPerm;
	private JPanel panelPromTemp;
	private JPanel panelPromPermAlta;
	private JComboBox comboBoxPromPermDiasAlta;
	private JLabel lblPromPermDiasAlta;
	private JComboBox comboBoxPromPermDosPorUnoAlta;
	private JLabel lblPromPermDosPorUnoAlta;
	private JLabel lblPromPermDtoPorCantAlta;
	private JComboBox comboBoxPromPermDtoPorCantAlta;
	private JButton btnPromPermAlta;
	private JTextField textFieldPromPermDtoPorCantMinimoAlta;
	private JTextField textFieldPromPermDtoPorCantPrecioUnitarioAlta;
	private JLabel lblPromPermDtoPorCantMinimoAlta;
	private JLabel lblPromPermDtoPorCantPrecioUnitarioAlta;
	private JList listPromPerm;
	private JButton btnPromPermBaja;
	private JPanel panelPromPermModif;
	private JComboBox comboBoxPromPermDiasModif;
	private JLabel lblPromPermDiasModif;
	private JComboBox comboBoxPromPermDosPorUnoAltaModif;
	private JLabel lblPromPermDosPorUnoModif;
	private JLabel lblPromPermDtoPorCantModif;
	private JComboBox comboBoxPromPermDtoPorCantModif;
	private JButton btnPromPermModif;
	private JTextField textFieldPromPermDtoPorCantMinimoModif;
	private JTextField textFieldPromPermDtoPorCantPrecioUnitarioModif;
	private JLabel lblPromPermDtoPorCantMinimoModif;
	private JLabel lblPromPermDtoPorCantPrecioUnitarioModif;
	private JLabel lblPromPermProductoAlta;
	private JComboBox comboBoxPromPermProductoAlta;
	private JComboBox comboBoxPromPermProductoModif;
	private JLabel lblPromPermProductoModif;
	private JComboBox comboBoxPromPermEstadoModif;
	private JLabel lblPromPermEstadoModif;
	private JPanel panelPromTempAlta;
	private JComboBox comboBoxPromTempDiasAlta;
	private JLabel lblPromTempDiasAlta;
	private JTextField textFieldPromTempPorcentajeDtoAlta;
	private JLabel lblPromTempPorcentajeDtoAlta;
	private JLabel lblPromTempAcumulableAlta;
	private JComboBox comboBoxPromTempAcumulableAlta;
	private JButton btnPromTempAlta;
	private JComboBox comboBoxPromTempMetodoPagoAlta;
	private JLabel lblPromTempMetodoPagoAlta;
	private JLabel lblPromTempNombreAlta;
	private JTextField textFieldPromTempNombreAlta;
	private JList listPromTemp;
	private JButton btnPromTempBaja;
	private JPanel panelPromTempModif;
	private JComboBox comboBoxPromTempDiasModif;
	private JLabel lblPromTempDiasModif;
	private JTextField textFieldPromTempPorcentajeDtoModif;
	private JLabel lblPromTempPorcentajeDtoModif;
	private JLabel lblPromTempAcumulableModif;
	private JComboBox comboBoxPromTempAcumulableModif;
	private JButton btnPromTempModif;
	private JComboBox comboBoxPromTempMetodoPagoModif;
	private JLabel lblPromTempMetodoPagoModif;
	private JLabel lblPromTempNombreModif;
	private JTextField textFieldPromTempNombreModif;
	private JComboBox comboBoxPromTempEstadoModif;
	private JLabel lblPromTempEstadoModif;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanal frame = new Ventanal();
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
	public Ventanal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1367, 796);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.contentPane.add(this.tabbedPane, BorderLayout.CENTER);
		
		this.panelOperarioYMesa = new JPanel();
		this.tabbedPane.addTab("Operarios y Mesas", null, this.panelOperarioYMesa, null);
		this.panelOperarioYMesa.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panelOperarioABM = new JPanel();
		this.panelOperarioABM.setBorder(new TitledBorder(null, "Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOperarioYMesa.add(this.panelOperarioABM);
		this.panelOperarioABM.setLayout(null);
		
		this.panelOperarioCreacion = new JPanel();
		this.panelOperarioCreacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alta de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelOperarioCreacion.setBounds(36, 36, 364, 278);
		this.panelOperarioABM.add(this.panelOperarioCreacion);
		this.panelOperarioCreacion.setLayout(null);
		
		this.textFieldOperarioUsuarioAlta = new JTextField();
		this.textFieldOperarioUsuarioAlta.setBounds(183, 43, 122, 20);
		this.panelOperarioCreacion.add(this.textFieldOperarioUsuarioAlta);
		this.textFieldOperarioUsuarioAlta.setColumns(10);
		
		this.lblOperarioUsuarioAlta = new JLabel("Usuario");
		this.lblOperarioUsuarioAlta.setBounds(44, 46, 61, 14);
		this.panelOperarioCreacion.add(this.lblOperarioUsuarioAlta);
		
		this.textFieldOperarioContraseniaAlta = new JTextField();
		this.textFieldOperarioContraseniaAlta.setColumns(10);
		this.textFieldOperarioContraseniaAlta.setBounds(183, 95, 122, 20);
		this.panelOperarioCreacion.add(this.textFieldOperarioContraseniaAlta);
		
		this.lblOperarioContraseniaAlta = new JLabel("Contraseña");
		this.lblOperarioContraseniaAlta.setBounds(44, 98, 61, 14);
		this.panelOperarioCreacion.add(this.lblOperarioContraseniaAlta);
		
		this.lblOperarioNyAAlta = new JLabel("Nombre y Apellido");
		this.lblOperarioNyAAlta.setBounds(44, 151, 96, 14);
		this.panelOperarioCreacion.add(this.lblOperarioNyAAlta);
		
		this.textFieldOperarioNyAAlta = new JTextField();
		this.textFieldOperarioNyAAlta.setColumns(10);
		this.textFieldOperarioNyAAlta.setBounds(183, 148, 122, 20);
		this.panelOperarioCreacion.add(this.textFieldOperarioNyAAlta);
		
		this.btnOperarioAlta = new JButton("Crear");
		this.btnOperarioAlta.addActionListener(this);
		this.btnOperarioAlta.setBounds(117, 214, 89, 23);
		this.panelOperarioCreacion.add(this.btnOperarioAlta);
		
		this.panelOperarioModif = new JPanel();
		this.panelOperarioModif.setBounds(898, 36, 402, 278);
		this.panelOperarioABM.add(this.panelOperarioModif);
		this.panelOperarioModif.setBorder(new TitledBorder(null, "Modificaci\u00F3n de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOperarioModif.setLayout(null);
		
		this.lblOperarioUsuarioModif = new JLabel("Usuario");
		this.lblOperarioUsuarioModif.setBounds(65, 38, 61, 14);
		this.panelOperarioModif.add(this.lblOperarioUsuarioModif);
		
		this.textFieldOperarioUsuarioModif = new JTextField();
		this.textFieldOperarioUsuarioModif.setColumns(10);
		this.textFieldOperarioUsuarioModif.setBounds(216, 35, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioUsuarioModif);
		
		this.lblOperarioContraseniaModif = new JLabel("Contraseña");
		this.lblOperarioContraseniaModif.setBounds(65, 76, 61, 14);
		this.panelOperarioModif.add(this.lblOperarioContraseniaModif);
		
		this.lblOperarioNyAModif = new JLabel("Nombre y Apellido");
		this.lblOperarioNyAModif.setBounds(65, 115, 102, 17);
		this.panelOperarioModif.add(this.lblOperarioNyAModif);
		
		this.lblOperarioEstadoModif = new JLabel("Estado");
		this.lblOperarioEstadoModif.setBounds(65, 155, 61, 14);
		this.panelOperarioModif.add(this.lblOperarioEstadoModif);
		
		this.textFieldOperarioContraseniaModif = new JTextField();
		this.textFieldOperarioContraseniaModif.setColumns(10);
		this.textFieldOperarioContraseniaModif.setBounds(216, 73, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioContraseniaModif);
		
		this.textFieldOperarioNyAModif = new JTextField();
		this.textFieldOperarioNyAModif.setColumns(10);
		this.textFieldOperarioNyAModif.setBounds(216, 112, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioNyAModif);
		
		this.comboBoxOperarioEstadoModif = new JComboBox();
		this.comboBoxOperarioEstadoModif.setBounds(216, 152, 122, 20);
		this.panelOperarioModif.add(this.comboBoxOperarioEstadoModif);
		
		this.btnNewButton = new JButton("Modificar");
		this.btnNewButton.setBounds(156, 217, 89, 23);
		this.panelOperarioModif.add(this.btnNewButton);
		
		this.listOperarios = new JList();
		this.listOperarios.setBounds(463, 36, 364, 280);
		this.panelOperarioABM.add(this.listOperarios);
		this.listOperarios.setBorder(new TitledBorder(null, "Lista de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		this.btnOperarioBaja = new JButton("Eliminar");
		this.btnOperarioBaja.setBounds(592, 327, 89, 23);
		this.panelOperarioABM.add(this.btnOperarioBaja);
		
		this.panelMesaABM = new JPanel();
		this.panelMesaABM.setBorder(new TitledBorder(null, "Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOperarioYMesa.add(this.panelMesaABM);
		this.panelMesaABM.setLayout(null);
		
		this.panelMesaCreacion = new JPanel();
		this.panelMesaCreacion.setLayout(null);
		this.panelMesaCreacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alta de Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelMesaCreacion.setBounds(31, 36, 364, 278);
		this.panelMesaABM.add(this.panelMesaCreacion);
		
		this.textFieldMesaNumeroAlta = new JTextField();
		this.textFieldMesaNumeroAlta.setColumns(10);
		this.textFieldMesaNumeroAlta.setBounds(183, 43, 122, 20);
		this.panelMesaCreacion.add(this.textFieldMesaNumeroAlta);
		
		this.lblMesaNumeroAlta = new JLabel("Numero de Mesa");
		this.lblMesaNumeroAlta.setBounds(44, 46, 96, 14);
		this.panelMesaCreacion.add(this.lblMesaNumeroAlta);
		
		this.textFieldMesaCantidadComensalesAlta = new JTextField();
		this.textFieldMesaCantidadComensalesAlta.setColumns(10);
		this.textFieldMesaCantidadComensalesAlta.setBounds(183, 131, 122, 20);
		this.panelMesaCreacion.add(this.textFieldMesaCantidadComensalesAlta);
		
		this.lblMesaCantidadComensalesAlta = new JLabel("Cantidad de comensales");
		this.lblMesaCantidadComensalesAlta.setBounds(44, 134, 122, 14);
		this.panelMesaCreacion.add(this.lblMesaCantidadComensalesAlta);
		
		this.btnMesaAlta = new JButton("Crear");
		this.btnMesaAlta.setBounds(117, 214, 89, 23);
		this.panelMesaCreacion.add(this.btnMesaAlta);
		
		this.listMesas = new JList();
		this.listMesas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listMesas.setBounds(463, 35, 364, 280);
		this.panelMesaABM.add(this.listMesas);
		
		this.btnMesaBaja = new JButton("Eliminar");
		this.btnMesaBaja.setBounds(599, 326, 89, 23);
		this.panelMesaABM.add(this.btnMesaBaja);
		
		this.panelMesaModif = new JPanel();
		this.panelMesaModif.setLayout(null);
		this.panelMesaModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelMesaModif.setBounds(899, 36, 402, 278);
		this.panelMesaABM.add(this.panelMesaModif);
		
		this.lblMesaNumeroModif = new JLabel("Numero de Mesa");
		this.lblMesaNumeroModif.setBounds(65, 38, 102, 14);
		this.panelMesaModif.add(this.lblMesaNumeroModif);
		
		this.textFieldMesaNumeroModif = new JTextField();
		this.textFieldMesaNumeroModif.setColumns(10);
		this.textFieldMesaNumeroModif.setBounds(216, 35, 122, 20);
		this.panelMesaModif.add(this.textFieldMesaNumeroModif);
		
		this.lblMesaCantidadComensalesModif = new JLabel("Cantidad de comensales");
		this.lblMesaCantidadComensalesModif.setBounds(65, 76, 122, 14);
		this.panelMesaModif.add(this.lblMesaCantidadComensalesModif);
		
		this.lblMesaEstadoModif = new JLabel("Estado");
		this.lblMesaEstadoModif.setBounds(65, 115, 102, 17);
		this.panelMesaModif.add(this.lblMesaEstadoModif);
		
		this.textFieldMesaCantidadComensalesModif = new JTextField();
		this.textFieldMesaCantidadComensalesModif.setColumns(10);
		this.textFieldMesaCantidadComensalesModif.setBounds(216, 73, 122, 20);
		this.panelMesaModif.add(this.textFieldMesaCantidadComensalesModif);
		
		JComboBox comboBoxMesaEstadoModif = new JComboBox();
		comboBoxMesaEstadoModif.setBounds(216, 112, 122, 20);
		this.panelMesaModif.add(comboBoxMesaEstadoModif);
		
		this.btnNewButton_1 = new JButton("Modificar");
		this.btnNewButton_1.setBounds(156, 217, 89, 23);
		this.panelMesaModif.add(this.btnNewButton_1);
		
		this.panelPromociones = new JPanel();
		this.tabbedPane.addTab("Promociones", null, this.panelPromociones, null);
		this.panelPromociones.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panelPromPerm = new JPanel();
		this.panelPromPerm.setBorder(new TitledBorder(null, "Promociones Permanentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelPromociones.add(this.panelPromPerm);
		this.panelPromPerm.setLayout(null);
		
		this.panelPromPermAlta = new JPanel();
		this.panelPromPermAlta.setLayout(null);
		this.panelPromPermAlta.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alta de Promociones permanentes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPromPermAlta.setBounds(30, 24, 364, 287);
		this.panelPromPerm.add(this.panelPromPermAlta);
		
		this.comboBoxPromPermDiasAlta = new JComboBox();
		this.comboBoxPromPermDiasAlta.setBounds(183, 41, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermDiasAlta);
		
		this.lblPromPermDiasAlta = new JLabel("Dias de promo");
		this.lblPromPermDiasAlta.setBounds(44, 41, 77, 14);
		this.panelPromPermAlta.add(this.lblPromPermDiasAlta);
		
		this.comboBoxPromPermDosPorUnoAlta = new JComboBox();
		this.comboBoxPromPermDosPorUnoAlta.setBounds(183, 103, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermDosPorUnoAlta);
		
		this.lblPromPermDosPorUnoAlta = new JLabel("Dos por uno");
		this.lblPromPermDosPorUnoAlta.setBounds(44, 106, 77, 14);
		this.panelPromPermAlta.add(this.lblPromPermDosPorUnoAlta);
		
		this.lblPromPermDtoPorCantAlta = new JLabel("Descuento por cantidad");
		this.lblPromPermDtoPorCantAlta.setBounds(44, 137, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDtoPorCantAlta);
		
		this.comboBoxPromPermDtoPorCantAlta = new JComboBox();
		this.comboBoxPromPermDtoPorCantAlta.setBounds(183, 134, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermDtoPorCantAlta);
		
		this.btnPromPermAlta = new JButton("Crear");
		this.btnPromPermAlta.setBounds(117, 227, 89, 23);
		this.panelPromPermAlta.add(this.btnPromPermAlta);
		
		this.textFieldPromPermDtoPorCantMinimoAlta = new JTextField();
		this.textFieldPromPermDtoPorCantMinimoAlta.setColumns(10);
		this.textFieldPromPermDtoPorCantMinimoAlta.setBounds(183, 165, 122, 20);
		this.panelPromPermAlta.add(this.textFieldPromPermDtoPorCantMinimoAlta);
		
		this.textFieldPromPermDtoPorCantPrecioUnitarioAlta = new JTextField();
		this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setColumns(10);
		this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setBounds(183, 196, 122, 20);
		this.panelPromPermAlta.add(this.textFieldPromPermDtoPorCantPrecioUnitarioAlta);
		
		this.lblPromPermDtoPorCantMinimoAlta = new JLabel("Cantidad minima");
		this.lblPromPermDtoPorCantMinimoAlta.setBounds(44, 168, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDtoPorCantMinimoAlta);
		
		this.lblPromPermDtoPorCantPrecioUnitarioAlta = new JLabel("Precio unitario");
		this.lblPromPermDtoPorCantPrecioUnitarioAlta.setBounds(44, 202, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDtoPorCantPrecioUnitarioAlta);
		
		this.lblPromPermProductoAlta = new JLabel("Producto");
		this.lblPromPermProductoAlta.setBounds(44, 72, 77, 14);
		this.panelPromPermAlta.add(this.lblPromPermProductoAlta);
		
		this.comboBoxPromPermProductoAlta = new JComboBox();
		this.comboBoxPromPermProductoAlta.setBounds(183, 72, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermProductoAlta);
		
		this.listPromPerm = new JList();
		this.listPromPerm.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Promociones Permanentes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listPromPerm.setBounds(467, 24, 364, 288);
		this.panelPromPerm.add(this.listPromPerm);
		
		this.btnPromPermBaja = new JButton("Eliminar");
		this.btnPromPermBaja.setBounds(601, 323, 89, 23);
		this.panelPromPerm.add(this.btnPromPermBaja);
		
		this.panelPromPermModif = new JPanel();
		this.panelPromPermModif.setLayout(null);
		this.panelPromPermModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Promociones permanentes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPromPermModif.setBounds(912, 23, 364, 288);
		this.panelPromPerm.add(this.panelPromPermModif);
		
		this.comboBoxPromPermDiasModif = new JComboBox();
		this.comboBoxPromPermDiasModif.setBounds(183, 52, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermDiasModif);
		
		this.lblPromPermDiasModif = new JLabel("Dias de promo");
		this.lblPromPermDiasModif.setBounds(44, 55, 77, 14);
		this.panelPromPermModif.add(this.lblPromPermDiasModif);
		
		this.comboBoxPromPermDosPorUnoAltaModif = new JComboBox();
		this.comboBoxPromPermDosPorUnoAltaModif.setBounds(183, 114, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermDosPorUnoAltaModif);
		
		this.lblPromPermDosPorUnoModif = new JLabel("Dos por uno");
		this.lblPromPermDosPorUnoModif.setBounds(44, 117, 77, 14);
		this.panelPromPermModif.add(this.lblPromPermDosPorUnoModif);
		
		this.lblPromPermDtoPorCantModif = new JLabel("Descuento por cantidad");
		this.lblPromPermDtoPorCantModif.setBounds(44, 148, 122, 14);
		this.panelPromPermModif.add(this.lblPromPermDtoPorCantModif);
		
		this.comboBoxPromPermDtoPorCantModif = new JComboBox();
		this.comboBoxPromPermDtoPorCantModif.setBounds(183, 145, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermDtoPorCantModif);
		
		this.btnPromPermModif = new JButton("Modificar");
		this.btnPromPermModif.setBounds(119, 238, 89, 23);
		this.panelPromPermModif.add(this.btnPromPermModif);
		
		this.textFieldPromPermDtoPorCantMinimoModif = new JTextField();
		this.textFieldPromPermDtoPorCantMinimoModif.setColumns(10);
		this.textFieldPromPermDtoPorCantMinimoModif.setBounds(183, 176, 122, 20);
		this.panelPromPermModif.add(this.textFieldPromPermDtoPorCantMinimoModif);
		
		this.textFieldPromPermDtoPorCantPrecioUnitarioModif = new JTextField();
		this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setColumns(10);
		this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setBounds(183, 207, 122, 20);
		this.panelPromPermModif.add(this.textFieldPromPermDtoPorCantPrecioUnitarioModif);
		
		this.lblPromPermDtoPorCantMinimoModif = new JLabel("Cantidad minima");
		this.lblPromPermDtoPorCantMinimoModif.setBounds(44, 179, 122, 14);
		this.panelPromPermModif.add(this.lblPromPermDtoPorCantMinimoModif);
		
		this.lblPromPermDtoPorCantPrecioUnitarioModif = new JLabel("Precio unitario");
		this.lblPromPermDtoPorCantPrecioUnitarioModif.setBounds(44, 210, 122, 14);
		this.panelPromPermModif.add(this.lblPromPermDtoPorCantPrecioUnitarioModif);
		
		this.comboBoxPromPermProductoModif = new JComboBox();
		this.comboBoxPromPermProductoModif.setBounds(183, 83, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermProductoModif);
		
		this.lblPromPermProductoModif = new JLabel("Producto");
		this.lblPromPermProductoModif.setBounds(44, 86, 77, 14);
		this.panelPromPermModif.add(this.lblPromPermProductoModif);
		
		this.comboBoxPromPermEstadoModif = new JComboBox();
		this.comboBoxPromPermEstadoModif.setBounds(183, 21, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermEstadoModif);
		
		this.lblPromPermEstadoModif = new JLabel("Estado");
		this.lblPromPermEstadoModif.setBounds(44, 24, 77, 14);
		this.panelPromPermModif.add(this.lblPromPermEstadoModif);
		
		this.panelPromTemp = new JPanel();
		this.panelPromTemp.setBorder(new TitledBorder(null, "Promociones Temporales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelPromociones.add(this.panelPromTemp);
		this.panelPromTemp.setLayout(null);
		
		this.panelPromTempAlta = new JPanel();
		this.panelPromTempAlta.setLayout(null);
		this.panelPromTempAlta.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alta de Promociones Temporales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPromTempAlta.setBounds(32, 27, 364, 287);
		this.panelPromTemp.add(this.panelPromTempAlta);
		
		this.comboBoxPromTempDiasAlta = new JComboBox();
		this.comboBoxPromTempDiasAlta.setBounds(183, 41, 122, 20);
		this.panelPromTempAlta.add(this.comboBoxPromTempDiasAlta);
		
		this.lblPromTempDiasAlta = new JLabel("Dias de promo");
		this.lblPromTempDiasAlta.setBounds(44, 41, 77, 14);
		this.panelPromTempAlta.add(this.lblPromTempDiasAlta);
		
		this.textFieldPromTempPorcentajeDtoAlta = new JTextField();
		this.textFieldPromTempPorcentajeDtoAlta.setBounds(183, 103, 122, 20);
		this.panelPromTempAlta.add(this.textFieldPromTempPorcentajeDtoAlta);
		
		this.lblPromTempPorcentajeDtoAlta = new JLabel("Porcentaje de descuento");
		this.lblPromTempPorcentajeDtoAlta.setBounds(44, 106, 129, 14);
		this.panelPromTempAlta.add(this.lblPromTempPorcentajeDtoAlta);
		
		this.lblPromTempAcumulableAlta = new JLabel("Acumulable");
		this.lblPromTempAcumulableAlta.setBounds(44, 137, 122, 14);
		this.panelPromTempAlta.add(this.lblPromTempAcumulableAlta);
		
		this.comboBoxPromTempAcumulableAlta = new JComboBox();
		this.comboBoxPromTempAcumulableAlta.setBounds(183, 134, 122, 20);
		this.panelPromTempAlta.add(this.comboBoxPromTempAcumulableAlta);
		
		this.btnPromTempAlta = new JButton("Crear");
		this.btnPromTempAlta.setBounds(117, 227, 89, 23);
		this.panelPromTempAlta.add(this.btnPromTempAlta);
		
		this.comboBoxPromTempMetodoPagoAlta = new JComboBox();
		this.comboBoxPromTempMetodoPagoAlta.setBounds(183, 165, 122, 20);
		this.panelPromTempAlta.add(this.comboBoxPromTempMetodoPagoAlta);
		
		this.lblPromTempMetodoPagoAlta = new JLabel("Metodo de pago");
		this.lblPromTempMetodoPagoAlta.setBounds(44, 168, 122, 14);
		this.panelPromTempAlta.add(this.lblPromTempMetodoPagoAlta);
		
		this.lblPromTempNombreAlta = new JLabel("Nombre");
		this.lblPromTempNombreAlta.setBounds(44, 72, 77, 14);
		this.panelPromTempAlta.add(this.lblPromTempNombreAlta);
		
		this.textFieldPromTempNombreAlta = new JTextField();
		this.textFieldPromTempNombreAlta.setBounds(183, 72, 122, 20);
		this.panelPromTempAlta.add(this.textFieldPromTempNombreAlta);
		
		this.listPromTemp = new JList();
		this.listPromTemp.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Promociones Temporales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listPromTemp.setBounds(461, 26, 364, 288);
		this.panelPromTemp.add(this.listPromTemp);
		
		this.btnPromTempBaja = new JButton("Eliminar");
		this.btnPromTempBaja.setBounds(599, 325, 89, 23);
		this.panelPromTemp.add(this.btnPromTempBaja);
		
		this.panelPromTempModif = new JPanel();
		this.panelPromTempModif.setLayout(null);
		this.panelPromTempModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Promociones Temporales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPromTempModif.setBounds(914, 27, 364, 287);
		this.panelPromTemp.add(this.panelPromTempModif);
		
		this.comboBoxPromTempDiasModif = new JComboBox();
		this.comboBoxPromTempDiasModif.setBounds(183, 55, 122, 20);
		this.panelPromTempModif.add(this.comboBoxPromTempDiasModif);
		
		this.lblPromTempDiasModif = new JLabel("Dias de promo");
		this.lblPromTempDiasModif.setBounds(44, 58, 77, 14);
		this.panelPromTempModif.add(this.lblPromTempDiasModif);
		
		this.textFieldPromTempPorcentajeDtoModif = new JTextField();
		this.textFieldPromTempPorcentajeDtoModif.setBounds(183, 117, 122, 20);
		this.panelPromTempModif.add(this.textFieldPromTempPorcentajeDtoModif);
		
		this.lblPromTempPorcentajeDtoModif = new JLabel("Porcentaje de descuento");
		this.lblPromTempPorcentajeDtoModif.setBounds(44, 120, 129, 14);
		this.panelPromTempModif.add(this.lblPromTempPorcentajeDtoModif);
		
		this.lblPromTempAcumulableModif = new JLabel("Acumulable");
		this.lblPromTempAcumulableModif.setBounds(44, 151, 122, 14);
		this.panelPromTempModif.add(this.lblPromTempAcumulableModif);
		
		this.comboBoxPromTempAcumulableModif = new JComboBox();
		this.comboBoxPromTempAcumulableModif.setBounds(183, 148, 122, 20);
		this.panelPromTempModif.add(this.comboBoxPromTempAcumulableModif);
		
		this.btnPromTempModif = new JButton("Modificar");
		this.btnPromTempModif.setBounds(117, 227, 89, 23);
		this.panelPromTempModif.add(this.btnPromTempModif);
		
		this.comboBoxPromTempMetodoPagoModif = new JComboBox();
		this.comboBoxPromTempMetodoPagoModif.setBounds(183, 179, 122, 20);
		this.panelPromTempModif.add(this.comboBoxPromTempMetodoPagoModif);
		
		this.lblPromTempMetodoPagoModif = new JLabel("Metodo de pago");
		this.lblPromTempMetodoPagoModif.setBounds(44, 182, 122, 14);
		this.panelPromTempModif.add(this.lblPromTempMetodoPagoModif);
		
		this.lblPromTempNombreModif = new JLabel("Nombre");
		this.lblPromTempNombreModif.setBounds(44, 89, 77, 14);
		this.panelPromTempModif.add(this.lblPromTempNombreModif);
		
		this.textFieldPromTempNombreModif = new JTextField();
		this.textFieldPromTempNombreModif.setBounds(183, 86, 122, 20);
		this.panelPromTempModif.add(this.textFieldPromTempNombreModif);
		
		this.comboBoxPromTempEstadoModif = new JComboBox();
		this.comboBoxPromTempEstadoModif.setBounds(183, 23, 122, 20);
		this.panelPromTempModif.add(this.comboBoxPromTempEstadoModif);
		
		this.lblPromTempEstadoModif = new JLabel("Estado");
		this.lblPromTempEstadoModif.setBounds(44, 26, 77, 14);
		this.panelPromTempModif.add(this.lblPromTempEstadoModif);
		
		this.panel_2 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_2, null);
		
		this.panel_3 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_3, null);
		
		this.panel_4 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_4, null);
		
		this.panel_5 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_5, null);
	}
	public void actionPerformed(ActionEvent e) {
	}
}
