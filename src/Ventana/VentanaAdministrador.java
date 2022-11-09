package Ventana;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import controlador.Controlador;
import main.Comanda;
import main.Mesa;
import main.Mozo;
import main.Operario;
import main.Producto;
import main.PromocionPermanente;
import main.PromocionTemporal;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class VentanaAdministrador extends JFrame implements ActionListener, KeyListener, IVista, MouseListener, ItemListener {
	Controlador c;

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelOperarioYMesa;
	private JPanel panelPromociones;
	private JPanel panelMozo;
	private JPanel panelProducto;
	private JPanel panelGeneral;
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
	private JTextField textFieldOperarioContraseniaModif;
	private JTextField textFieldOperarioNyAModif;
	private JButton btnOperarioModificacion;
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
	private JTextField textFieldMesaCantidadComensalesModif;
	private JButton btnMesaModificacion;
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
	private JComboBox comboBoxPromPermDosPorUnoModif;
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
	private JPanel panelMozoAlta;
	private JLabel lblMozoNyAAlta;
	private JTextField textFieldMozoNyAAlta;
	private JLabel lblMozoFechaDeNacimientoAlta;
	private JLabel lblMozoHijosAlta;
	private JTextField textFieldMozoHijosAlta;
	private JButton btnMozoAlta;
	private JPanel panelMozoModif;
	private JLabel lblMozoNyAModif;
	private JTextField textFieldMozoNyAModif;
	private JLabel lblMozoFechaDeNacimientoModif;
	private JLabel lblMozoHijosModif;
	private JTextField textFieldMozoHijosModif;
	private JButton btnMozoModif;
	private JList listMozos;
	private JButton btnMozoBaja;
	private JPanel panelEstadisticas;
	private JButton btnMozoEstadEmp;
	private JButton btnMozoEstadEmpMayorVolVenta;
	private JButton btnMozoEstadEmpMenorVolVenta;
	private JButton btnMozoEstadMesaConsumoProm;
	private JScrollPane scrollPaneEstadisticas;
	private JTextArea textAreaEstadisticas;
	private JPanel panelProductoAlta;
	private JLabel lblProductoNombreAlta;
	private JTextField textFieldProductoNombreAlta;
	private JLabel lblProductoPrecioCostoAlta;
	private JTextField textFieldProductoPrecioCostoAlta;
	private JLabel lblProductoPrecioVentaAlta;
	private JTextField textFieldProductoPrecioVentaAlta;
	private JLabel lblProductoStockInicialAlta;
	private JTextField textFieldProductoStockInicialAlta;
	private JButton btnProductoAlta;
	private JPanel panelProductoModif;
	private JLabel lblProductoNombreModif;
	private JTextField textFieldProductoNombreModif;
	private JLabel lblProductoPrecioCostoModif;
	private JTextField textFieldProductoPrecioCostoModif;
	private JLabel lblProductoPrecioVentaModif;
	private JTextField textFieldProductoPrecioVentaModif;
	private JLabel lblProductoStockInicialModif;
	private JTextField textFieldProductoStockInicialModif;
	private JButton btnProductoModificacion;
	private JList listProductos;
	private JButton btnProductoBaja;
	private JPanel panelNuevoStockProducto;
	private JLabel lblProductoStockNuevo;
	private JTextField textFieldProductoNuevoStock;
	private JButton btnProductoNuevoStock;
	private JScrollPane scrollPaneListaOperarios;
	private JScrollPane scrollPaneListaMesas;
	private JScrollPane scrollPaneListaPromPerm;
	private JScrollPane scrollPaneListaPromTemp;
	private JScrollPane scrollPaneListaMozos;
	private JScrollPane scrollPaneListaProductos;
	private JPanel panelEstadoMozos;
	private JList listMozosEstados;
	private JScrollPane scrollPaneMozosEstado;
	private JPanel panelSeleccionEstadosMozos;
	private JRadioButton rdbtnEstadoActivo;
	private JRadioButton rdbtnEstadoAusente;
	private JRadioButton rdbtnEstadoDeFranco;
	private JButton btnEstadoConfirmar;
	private final ButtonGroup buttonGroupEstadosMozos = new ButtonGroup();
	private JPanel panelAsignacionMesas;
	private JList listMozosActivos;
	private JScrollPane scrollPaneMozosActivos;
	private JScrollPane scrollPaneMesas;
	private JList listMesasAsignables;
	private JButton btnAsignarMozoMesa;
	private JPanel panelFacturacion;
	private JPanel panelOcupacionMesa;
	private JLabel lblOcupacionComensales;
	private JButton btnOcuparMesa;
	private JTextField textFieldOcupacionComensales;
	private JList listComandasActivas;
	private JScrollPane scrollPaneComandasActivas;
	private JList listProductosGeneral;
	private JScrollPane scrollPaneProductosPedidos;
	private JPanel panelAgregaPedido;
	private JPanel panelCerrarComanda;
	private JLabel lblCantidadProducto;
	private JTextField textFieldCantidadProducto;
	private JButton btnAgregarPedidoAComanda;
	private JButton btnCerrarComanda;
	private JPanel panelLoginSerializacion;
	private JPanel panelLogin;
	private JLabel lblLoginUsuario;
	private JTextField textFieldLoginUsuario;
	private JLabel lblLoginContrasenia;
	private JTextField textFieldLoginContrasenia;
	private JButton btnLogin;
	private JPanel panelSerializacion;
	private JButton btnRecuperarSistema;
	private JButton btnNuevoSistema;
	private JButton btnGuardarSistema;
	private JButton btnLogout;
	private JPanel panel;
	private JLabel lblNombreLocal;
	private JTextField textFieldNombreLocal;
	private JFormattedTextField formattedTextFieldFechaNacimientoAlta;
	private JFormattedTextField formattedTextFieldFechaNacimientoModif;
	private JLabel lblOperarioEstadoModif;
	private JComboBox comboBoxOperarioEstadoModif;
	private JLabel lblNombreLocalGrande;
	private DefaultListModel<Operario> modelListOperarios;
	private DefaultListModel<Mesa> modelListMesas,modelListMesasAsignables;
	private DefaultListModel<PromocionPermanente> modelListPromPerm;
	private DefaultListModel<PromocionTemporal> modelListPromTemp;
	private DefaultListModel<Mozo> modelListMozos,modelListMozosEstados,modelListMozosActivos;
	private DefaultListModel<Producto> modelListProductos;
	private DefaultListModel<Comanda> modelListComandasActivas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdministrador frame = new VentanaAdministrador();
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
	public VentanaAdministrador() {
		
		
		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1367, 796);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.contentPane.add(this.tabbedPane, BorderLayout.CENTER);
		
		this.panelLoginSerializacion = new JPanel();
		this.tabbedPane.addTab("Login", null, this.panelLoginSerializacion, null);
		this.panelLoginSerializacion.setLayout(null);
		
		this.panelLogin = new JPanel();
		this.panelLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelLogin.setBounds(392, 139, 511, 176);
		this.panelLoginSerializacion.add(this.panelLogin);
		this.panelLogin.setLayout(null);
		
		this.lblLoginUsuario = new JLabel("Usuario");
		this.lblLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblLoginUsuario.setBounds(88, 36, 57, 27);
		this.panelLogin.add(this.lblLoginUsuario);
		
		this.textFieldLoginUsuario = new JTextField();
		this.textFieldLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.textFieldLoginUsuario.setBounds(187, 41, 271, 20);
		this.panelLogin.add(this.textFieldLoginUsuario);
		this.textFieldLoginUsuario.setColumns(10);
		
		this.lblLoginContrasenia = new JLabel("Contraseña");
		this.lblLoginContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblLoginContrasenia.setBounds(88, 74, 86, 27);
		this.panelLogin.add(this.lblLoginContrasenia);
		
		this.textFieldLoginContrasenia = new JTextField();
		this.textFieldLoginContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.textFieldLoginContrasenia.setColumns(10);
		this.textFieldLoginContrasenia.setBounds(187, 79, 271, 20);
		this.panelLogin.add(this.textFieldLoginContrasenia);
		
		this.btnLogin = new JButton("Login");
		this.btnLogin.setBounds(139, 123, 89, 23);
		this.panelLogin.add(this.btnLogin);
		
		this.btnLogout = new JButton("Logout");
		this.btnLogout.setBounds(301, 123, 89, 23);
		this.panelLogin.add(this.btnLogout);
		
		this.panelSerializacion = new JPanel();
		this.panelSerializacion.setBorder(new TitledBorder(null, "Serializaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelSerializacion.setBounds(392, 326, 511, 369);
		this.panelLoginSerializacion.add(this.panelSerializacion);
		this.panelSerializacion.setLayout(null);
		
		this.btnRecuperarSistema = new JButton("Recuperar Sistema");
		this.btnRecuperarSistema.setBounds(40, 117, 157, 47);
		this.panelSerializacion.add(this.btnRecuperarSistema);
		
		this.btnGuardarSistema = new JButton("Guardar Sistema");
		this.btnGuardarSistema.setBounds(40, 45, 157, 47);
		this.panelSerializacion.add(this.btnGuardarSistema);
		
		this.panel = new JPanel();
		this.panel.setBounds(40, 214, 436, 69);
		this.panelSerializacion.add(this.panel);
		this.panel.setLayout(null);
		
		this.btnNuevoSistema = new JButton("Nuevo Sistema");
		this.btnNuevoSistema.setBounds(257, 11, 157, 47);
		this.panel.add(this.btnNuevoSistema);
		
		this.lblNombreLocal = new JLabel("Nombre del local:");
		this.lblNombreLocal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblNombreLocal.setBounds(10, 11, 169, 14);
		this.panel.add(this.lblNombreLocal);
		
		this.textFieldNombreLocal = new JTextField();
		this.textFieldNombreLocal.setBounds(10, 36, 204, 20);
		this.panel.add(this.textFieldNombreLocal);
		this.textFieldNombreLocal.setColumns(10);
		
		this.lblNombreLocalGrande = new JLabel("");
		this.lblNombreLocalGrande.setFont(new Font("Tahoma", Font.PLAIN, 36));
		this.lblNombreLocalGrande.setBounds(10, 11, 609, 117);
		this.panelLoginSerializacion.add(this.lblNombreLocalGrande);
		
		this.panelGeneral = new JPanel();
		this.tabbedPane.addTab("General", null, this.panelGeneral, null);
		this.panelGeneral.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelEstadoMozos = new JPanel();
		this.panelEstadoMozos.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelGeneral.add(this.panelEstadoMozos);
		this.panelEstadoMozos.setLayout(null);
		
		this.scrollPaneMozosEstado = new JScrollPane();
		this.scrollPaneMozosEstado.setViewportBorder(new TitledBorder(null, "Mozos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneMozosEstado.setBounds(10, 11, 425, 564);
		this.panelEstadoMozos.add(this.scrollPaneMozosEstado);
		
		this.listMozosEstados = new JList();
		this.scrollPaneMozosEstado.setViewportView(this.listMozosEstados);
		
		this.panelSeleccionEstadosMozos = new JPanel();
		this.panelSeleccionEstadosMozos.setBorder(new TitledBorder(null, "Estados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelSeleccionEstadosMozos.setBounds(10, 594, 425, 114);
		this.panelEstadoMozos.add(this.panelSeleccionEstadosMozos);
		this.panelSeleccionEstadosMozos.setLayout(null);
		
		this.rdbtnEstadoActivo = new JRadioButton("Activo");
		this.rdbtnEstadoActivo.setSelected(true);
		buttonGroupEstadosMozos.add(this.rdbtnEstadoActivo);
		this.rdbtnEstadoActivo.setBounds(69, 25, 69, 23);
		this.panelSeleccionEstadosMozos.add(this.rdbtnEstadoActivo);
		
		this.rdbtnEstadoAusente = new JRadioButton("Ausente");
		buttonGroupEstadosMozos.add(this.rdbtnEstadoAusente);
		this.rdbtnEstadoAusente.setBounds(250, 25, 89, 23);
		this.panelSeleccionEstadosMozos.add(this.rdbtnEstadoAusente);
		
		this.rdbtnEstadoDeFranco = new JRadioButton("De franco");
		buttonGroupEstadosMozos.add(this.rdbtnEstadoDeFranco);
		this.rdbtnEstadoDeFranco.setBounds(153, 25, 89, 23);
		this.panelSeleccionEstadosMozos.add(this.rdbtnEstadoDeFranco);
		
		this.btnEstadoConfirmar = new JButton("Confirmar");
		this.btnEstadoConfirmar.setBounds(153, 80, 89, 23);
		this.panelSeleccionEstadosMozos.add(this.btnEstadoConfirmar);
		
		this.panelAsignacionMesas = new JPanel();
		this.panelAsignacionMesas.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelGeneral.add(this.panelAsignacionMesas);
		this.panelAsignacionMesas.setLayout(null);
		
		this.scrollPaneMozosActivos = new JScrollPane();
		this.scrollPaneMozosActivos.setViewportBorder(new TitledBorder(null, "Mozos activos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneMozosActivos.setBounds(10, 11, 425, 210);
		this.panelAsignacionMesas.add(this.scrollPaneMozosActivos);
		
		this.listMozosActivos = new JList();
		this.scrollPaneMozosActivos.setViewportView(this.listMozosActivos);
		
		this.scrollPaneMesas = new JScrollPane();
		this.scrollPaneMesas.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.scrollPaneMesas.setBounds(10, 232, 425, 316);
		this.panelAsignacionMesas.add(this.scrollPaneMesas);
		
		this.listMesasAsignables = new JList();
		this.scrollPaneMesas.setViewportView(this.listMesasAsignables);
		
		this.btnAsignarMozoMesa = new JButton("Asignar");
		this.btnAsignarMozoMesa.setBounds(169, 559, 89, 23);
		this.panelAsignacionMesas.add(this.btnAsignarMozoMesa);
		
		this.panelOcupacionMesa = new JPanel();
		this.panelOcupacionMesa.setBounds(10, 593, 425, 119);
		this.panelAsignacionMesas.add(this.panelOcupacionMesa);
		this.panelOcupacionMesa.setBorder(new TitledBorder(null, "Ocupaci\u00F3n de mesas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOcupacionMesa.setLayout(null);
		
		this.lblOcupacionComensales = new JLabel("Cantidad de comensales");
		this.lblOcupacionComensales.setBounds(67, 30, 187, 14);
		this.panelOcupacionMesa.add(this.lblOcupacionComensales);
		
		this.btnOcuparMesa = new JButton("Ocupar");
		this.btnOcuparMesa.setBounds(171, 81, 89, 23);
		this.panelOcupacionMesa.add(this.btnOcuparMesa);
		
		this.textFieldOcupacionComensales = new JTextField();
		this.textFieldOcupacionComensales.setBounds(264, 27, 99, 20);
		this.panelOcupacionMesa.add(this.textFieldOcupacionComensales);
		this.textFieldOcupacionComensales.setColumns(10);
		
		this.panelFacturacion = new JPanel();
		this.panelFacturacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelGeneral.add(this.panelFacturacion);
		this.panelFacturacion.setLayout(null);
		
		this.scrollPaneComandasActivas = new JScrollPane();
		this.scrollPaneComandasActivas.setViewportBorder(new TitledBorder(null, "Comandas Activas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneComandasActivas.setBounds(10, 11, 425, 254);
		this.panelFacturacion.add(this.scrollPaneComandasActivas);
		
		this.listComandasActivas = new JList();
		this.scrollPaneComandasActivas.setViewportView(this.listComandasActivas);
		
		this.scrollPaneProductosPedidos = new JScrollPane();
		this.scrollPaneProductosPedidos.setViewportBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneProductosPedidos.setBounds(10, 276, 425, 284);
		this.panelFacturacion.add(this.scrollPaneProductosPedidos);
		
		this.listProductosGeneral = new JList();
		this.scrollPaneProductosPedidos.setViewportView(this.listProductosGeneral);
		
		this.panelAgregaPedido = new JPanel();
		this.panelAgregaPedido.setBorder(new TitledBorder(null, "Agregar pedido a Comanda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelAgregaPedido.setBounds(10, 571, 202, 137);
		this.panelFacturacion.add(this.panelAgregaPedido);
		this.panelAgregaPedido.setLayout(null);
		
		this.lblCantidadProducto = new JLabel("Cantidad de producto");
		this.lblCantidadProducto.setBounds(38, 30, 154, 14);
		this.panelAgregaPedido.add(this.lblCantidadProducto);
		
		this.textFieldCantidadProducto = new JTextField();
		this.textFieldCantidadProducto.setBounds(48, 55, 86, 20);
		this.panelAgregaPedido.add(this.textFieldCantidadProducto);
		this.textFieldCantidadProducto.setColumns(10);
		
		this.btnAgregarPedidoAComanda = new JButton("Agregar");
		this.btnAgregarPedidoAComanda.setBounds(45, 103, 89, 23);
		this.panelAgregaPedido.add(this.btnAgregarPedidoAComanda);
		
		this.panelCerrarComanda = new JPanel();
		this.panelCerrarComanda.setBorder(new TitledBorder(null, "Cerrar Comanda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCerrarComanda.setBounds(233, 571, 202, 137);
		this.panelFacturacion.add(this.panelCerrarComanda);
		this.panelCerrarComanda.setLayout(null);
		
		this.btnCerrarComanda = new JButton("Cerrar");
		this.btnCerrarComanda.setBounds(56, 67, 89, 23);
		this.panelCerrarComanda.add(this.btnCerrarComanda);
		
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
		this.lblOperarioContraseniaAlta.setBounds(44, 98, 82, 14);
		this.panelOperarioCreacion.add(this.lblOperarioContraseniaAlta);
		
		this.lblOperarioNyAAlta = new JLabel("Nombre y Apellido");
		this.lblOperarioNyAAlta.setBounds(44, 151, 114, 14);
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
		this.lblOperarioContraseniaModif.setBounds(65, 78, 102, 14);
		this.panelOperarioModif.add(this.lblOperarioContraseniaModif);
		
		this.lblOperarioNyAModif = new JLabel("Nombre y Apellido");
		this.lblOperarioNyAModif.setBounds(65, 114, 122, 17);
		this.panelOperarioModif.add(this.lblOperarioNyAModif);
		
		this.textFieldOperarioContraseniaModif = new JTextField();
		this.textFieldOperarioContraseniaModif.setColumns(10);
		this.textFieldOperarioContraseniaModif.setBounds(216, 75, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioContraseniaModif);
		
		this.textFieldOperarioNyAModif = new JTextField();
		this.textFieldOperarioNyAModif.setColumns(10);
		this.textFieldOperarioNyAModif.setBounds(216, 112, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioNyAModif);
		
		this.btnOperarioModificacion = new JButton("Modificar");
		this.btnOperarioModificacion.setBounds(156, 217, 89, 23);
		this.panelOperarioModif.add(this.btnOperarioModificacion);
		
		this.lblOperarioEstadoModif = new JLabel("Estado");
		this.lblOperarioEstadoModif.setBounds(65, 160, 61, 14);
		this.panelOperarioModif.add(this.lblOperarioEstadoModif);
		
		this.comboBoxOperarioEstadoModif = new JComboBox();
		this.comboBoxOperarioEstadoModif.setBounds(216, 156, 122, 22);
		this.panelOperarioModif.add(this.comboBoxOperarioEstadoModif);
		
		this.scrollPaneListaOperarios = new JScrollPane();
		this.scrollPaneListaOperarios.setViewportBorder(new TitledBorder(null, "Lista de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaOperarios.setBounds(463, 36, 364, 280);
		this.panelOperarioABM.add(this.scrollPaneListaOperarios);
		
		this.listOperarios = new JList();
		this.scrollPaneListaOperarios.setViewportView(this.listOperarios);
		
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
		this.lblMesaNumeroAlta.setBounds(22, 46, 96, 14);
		this.panelMesaCreacion.add(this.lblMesaNumeroAlta);
		
		this.textFieldMesaCantidadComensalesAlta = new JTextField();
		this.textFieldMesaCantidadComensalesAlta.setColumns(10);
		this.textFieldMesaCantidadComensalesAlta.setBounds(183, 81, 122, 20);
		this.panelMesaCreacion.add(this.textFieldMesaCantidadComensalesAlta);
		
		this.lblMesaCantidadComensalesAlta = new JLabel("Cantidad de comensales");
		this.lblMesaCantidadComensalesAlta.setBounds(22, 84, 151, 14);
		this.panelMesaCreacion.add(this.lblMesaCantidadComensalesAlta);
		
		this.btnMesaAlta = new JButton("Crear");
		this.btnMesaAlta.setBounds(117, 214, 89, 23);
		this.panelMesaCreacion.add(this.btnMesaAlta);
		
		this.scrollPaneListaMesas = new JScrollPane();
		this.scrollPaneListaMesas.setViewportBorder(new TitledBorder(null, "Lista de Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaMesas.setBounds(463, 35, 364, 280);
		this.panelMesaABM.add(this.scrollPaneListaMesas);
		
		this.listMesas = new JList();
		this.scrollPaneListaMesas.setViewportView(this.listMesas);
		
		this.btnMesaBaja = new JButton("Eliminar");
		this.btnMesaBaja.setBounds(599, 326, 89, 23);
		this.panelMesaABM.add(this.btnMesaBaja);
		
		this.panelMesaModif = new JPanel();
		this.panelMesaModif.setLayout(null);
		this.panelMesaModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Mesas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelMesaModif.setBounds(899, 36, 402, 278);
		this.panelMesaABM.add(this.panelMesaModif);
		
		this.lblMesaNumeroModif = new JLabel("Numero de Mesa");
		this.lblMesaNumeroModif.setBounds(65, 38, 129, 14);
		this.panelMesaModif.add(this.lblMesaNumeroModif);
		
		this.textFieldMesaNumeroModif = new JTextField();
		this.textFieldMesaNumeroModif.setColumns(10);
		this.textFieldMesaNumeroModif.setBounds(246, 35, 122, 20);
		this.panelMesaModif.add(this.textFieldMesaNumeroModif);
		
		this.lblMesaCantidadComensalesModif = new JLabel("Cantidad de comensales");
		this.lblMesaCantidadComensalesModif.setBounds(65, 76, 171, 14);
		this.panelMesaModif.add(this.lblMesaCantidadComensalesModif);
		
		this.textFieldMesaCantidadComensalesModif = new JTextField();
		this.textFieldMesaCantidadComensalesModif.setColumns(10);
		this.textFieldMesaCantidadComensalesModif.setBounds(246, 73, 122, 20);
		this.panelMesaModif.add(this.textFieldMesaCantidadComensalesModif);
		
		this.btnMesaModificacion = new JButton("Modificar");
		this.btnMesaModificacion.setBounds(156, 217, 89, 23);
		this.panelMesaModif.add(this.btnMesaModificacion);
		
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
		this.lblPromPermDiasAlta.setBounds(21, 41, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDiasAlta);
		
		this.comboBoxPromPermDosPorUnoAlta = new JComboBox();
		this.comboBoxPromPermDosPorUnoAlta.setBounds(183, 103, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermDosPorUnoAlta);
		
		this.lblPromPermDosPorUnoAlta = new JLabel("Dos por uno");
		this.lblPromPermDosPorUnoAlta.setBounds(21, 106, 77, 14);
		this.panelPromPermAlta.add(this.lblPromPermDosPorUnoAlta);
		
		this.lblPromPermDtoPorCantAlta = new JLabel("Descuento por cantidad");
		this.lblPromPermDtoPorCantAlta.setBounds(21, 137, 145, 14);
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
		this.lblPromPermDtoPorCantMinimoAlta.setBounds(21, 168, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDtoPorCantMinimoAlta);
		
		this.lblPromPermDtoPorCantPrecioUnitarioAlta = new JLabel("Precio unitario");
		this.lblPromPermDtoPorCantPrecioUnitarioAlta.setBounds(21, 202, 122, 14);
		this.panelPromPermAlta.add(this.lblPromPermDtoPorCantPrecioUnitarioAlta);
		
		this.lblPromPermProductoAlta = new JLabel("Producto");
		this.lblPromPermProductoAlta.setBounds(21, 75, 77, 14);
		this.panelPromPermAlta.add(this.lblPromPermProductoAlta);
		
		this.comboBoxPromPermProductoAlta = new JComboBox();
		this.comboBoxPromPermProductoAlta.setBounds(183, 72, 122, 20);
		this.panelPromPermAlta.add(this.comboBoxPromPermProductoAlta);
		
		this.scrollPaneListaPromPerm = new JScrollPane();
		this.scrollPaneListaPromPerm.setViewportBorder(new TitledBorder(null, "Lista de Promociones Permanentes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaPromPerm.setBounds(467, 24, 364, 288);
		this.panelPromPerm.add(this.scrollPaneListaPromPerm);
		
		this.listPromPerm = new JList();
		this.scrollPaneListaPromPerm.setViewportView(this.listPromPerm);
		
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
		this.lblPromPermDiasModif.setBounds(20, 55, 101, 14);
		this.panelPromPermModif.add(this.lblPromPermDiasModif);
		
		this.comboBoxPromPermDosPorUnoModif = new JComboBox();
		this.comboBoxPromPermDosPorUnoModif.setBounds(183, 114, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermDosPorUnoModif);
		
		this.lblPromPermDosPorUnoModif = new JLabel("Dos por uno");
		this.lblPromPermDosPorUnoModif.setBounds(20, 117, 101, 14);
		this.panelPromPermModif.add(this.lblPromPermDosPorUnoModif);
		
		this.lblPromPermDtoPorCantModif = new JLabel("Descuento por cantidad");
		this.lblPromPermDtoPorCantModif.setBounds(20, 148, 146, 14);
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
		this.lblPromPermDtoPorCantMinimoModif.setBounds(20, 179, 146, 14);
		this.panelPromPermModif.add(this.lblPromPermDtoPorCantMinimoModif);
		
		this.lblPromPermDtoPorCantPrecioUnitarioModif = new JLabel("Precio unitario");
		this.lblPromPermDtoPorCantPrecioUnitarioModif.setBounds(20, 210, 146, 14);
		this.panelPromPermModif.add(this.lblPromPermDtoPorCantPrecioUnitarioModif);
		
		this.comboBoxPromPermProductoModif = new JComboBox();
		this.comboBoxPromPermProductoModif.setBounds(183, 83, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermProductoModif);
		
		this.lblPromPermProductoModif = new JLabel("Producto");
		this.lblPromPermProductoModif.setBounds(20, 86, 101, 14);
		this.panelPromPermModif.add(this.lblPromPermProductoModif);
		
		this.comboBoxPromPermEstadoModif = new JComboBox();
		this.comboBoxPromPermEstadoModif.setBounds(183, 21, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermEstadoModif);
		
		this.lblPromPermEstadoModif = new JLabel("Estado");
		this.lblPromPermEstadoModif.setBounds(20, 24, 77, 14);
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
		this.lblPromTempDiasAlta.setBounds(20, 41, 101, 14);
		this.panelPromTempAlta.add(this.lblPromTempDiasAlta);
		
		this.textFieldPromTempPorcentajeDtoAlta = new JTextField();
		this.textFieldPromTempPorcentajeDtoAlta.setBounds(183, 103, 122, 20);
		this.panelPromTempAlta.add(this.textFieldPromTempPorcentajeDtoAlta);
		
		this.lblPromTempPorcentajeDtoAlta = new JLabel("Porcentaje de descuento");
		this.lblPromTempPorcentajeDtoAlta.setBounds(20, 106, 153, 14);
		this.panelPromTempAlta.add(this.lblPromTempPorcentajeDtoAlta);
		
		this.lblPromTempAcumulableAlta = new JLabel("Acumulable");
		this.lblPromTempAcumulableAlta.setBounds(20, 137, 146, 14);
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
		this.lblPromTempMetodoPagoAlta.setBounds(20, 168, 146, 14);
		this.panelPromTempAlta.add(this.lblPromTempMetodoPagoAlta);
		
		this.lblPromTempNombreAlta = new JLabel("Nombre");
		this.lblPromTempNombreAlta.setBounds(20, 72, 101, 14);
		this.panelPromTempAlta.add(this.lblPromTempNombreAlta);
		
		this.textFieldPromTempNombreAlta = new JTextField();
		this.textFieldPromTempNombreAlta.setBounds(183, 72, 122, 20);
		this.panelPromTempAlta.add(this.textFieldPromTempNombreAlta);
		
		this.scrollPaneListaPromTemp = new JScrollPane();
		this.scrollPaneListaPromTemp.setViewportBorder(new TitledBorder(null, "Lista de Promociones Temporales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaPromTemp.setBounds(461, 26, 364, 288);
		this.panelPromTemp.add(this.scrollPaneListaPromTemp);
		
		this.listPromTemp = new JList();
		this.scrollPaneListaPromTemp.setViewportView(this.listPromTemp);
		
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
		this.lblPromTempDiasModif.setBounds(20, 58, 101, 14);
		this.panelPromTempModif.add(this.lblPromTempDiasModif);
		
		this.textFieldPromTempPorcentajeDtoModif = new JTextField();
		this.textFieldPromTempPorcentajeDtoModif.setBounds(183, 117, 122, 20);
		this.panelPromTempModif.add(this.textFieldPromTempPorcentajeDtoModif);
		
		this.lblPromTempPorcentajeDtoModif = new JLabel("Porcentaje de descuento");
		this.lblPromTempPorcentajeDtoModif.setBounds(20, 120, 153, 14);
		this.panelPromTempModif.add(this.lblPromTempPorcentajeDtoModif);
		
		this.lblPromTempAcumulableModif = new JLabel("Acumulable");
		this.lblPromTempAcumulableModif.setBounds(20, 151, 146, 14);
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
		this.lblPromTempMetodoPagoModif.setBounds(20, 182, 146, 14);
		this.panelPromTempModif.add(this.lblPromTempMetodoPagoModif);
		
		this.lblPromTempNombreModif = new JLabel("Nombre");
		this.lblPromTempNombreModif.setBounds(20, 89, 101, 14);
		this.panelPromTempModif.add(this.lblPromTempNombreModif);
		
		this.textFieldPromTempNombreModif = new JTextField();
		this.textFieldPromTempNombreModif.setBounds(183, 86, 122, 20);
		this.panelPromTempModif.add(this.textFieldPromTempNombreModif);
		
		this.comboBoxPromTempEstadoModif = new JComboBox();
		this.comboBoxPromTempEstadoModif.setBounds(183, 23, 122, 20);
		this.panelPromTempModif.add(this.comboBoxPromTempEstadoModif);
		
		this.lblPromTempEstadoModif = new JLabel("Estado");
		this.lblPromTempEstadoModif.setBounds(20, 26, 101, 14);
		this.panelPromTempModif.add(this.lblPromTempEstadoModif);
		
		this.panelMozo = new JPanel();
		this.tabbedPane.addTab("Mozos", null, this.panelMozo, null);
		this.panelMozo.setLayout(null);
		
		this.panelMozoAlta = new JPanel();
		this.panelMozoAlta.setBorder(new TitledBorder(null, "Alta de Mozo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelMozoAlta.setBounds(10, 39, 346, 274);
		this.panelMozo.add(this.panelMozoAlta);
		this.panelMozoAlta.setLayout(null);
		
		this.lblMozoNyAAlta = new JLabel("Nombre y Apellido");
		this.lblMozoNyAAlta.setBounds(10, 33, 113, 14);
		this.panelMozoAlta.add(this.lblMozoNyAAlta);
		
		this.textFieldMozoNyAAlta = new JTextField();
		this.textFieldMozoNyAAlta.setBounds(165, 30, 159, 20);
		this.panelMozoAlta.add(this.textFieldMozoNyAAlta);
		this.textFieldMozoNyAAlta.setColumns(10);
		
		this.lblMozoFechaDeNacimientoAlta = new JLabel("Fecha de nacimiento(yyyy-MM-dd)");
		this.lblMozoFechaDeNacimientoAlta.setBounds(10, 81, 205, 17);
		this.panelMozoAlta.add(this.lblMozoFechaDeNacimientoAlta);
		
		this.lblMozoHijosAlta = new JLabel("Hijos");
		this.lblMozoHijosAlta.setBounds(10, 128, 113, 14);
		this.panelMozoAlta.add(this.lblMozoHijosAlta);
		
		this.textFieldMozoHijosAlta = new JTextField();
		this.textFieldMozoHijosAlta.setColumns(10);
		this.textFieldMozoHijosAlta.setBounds(165, 125, 159, 20);
		this.panelMozoAlta.add(this.textFieldMozoHijosAlta);
		
		this.btnMozoAlta = new JButton("Crear");
		this.btnMozoAlta.setBounds(114, 202, 89, 23);
		this.panelMozoAlta.add(this.btnMozoAlta);
		
		this.formattedTextFieldFechaNacimientoAlta = new JFormattedTextField();
		this.formattedTextFieldFechaNacimientoAlta.setBounds(224, 78, 100, 20);
		this.panelMozoAlta.add(this.formattedTextFieldFechaNacimientoAlta);
		this.formattedTextFieldFechaNacimientoAlta.setColumns(10);
		this.formattedTextFieldFechaNacimientoAlta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
		
		this.panelMozoModif = new JPanel();
		this.panelMozoModif.setLayout(null);
		this.panelMozoModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Mozo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelMozoModif.setBounds(10, 380, 346, 274);
		this.panelMozo.add(this.panelMozoModif);
		
		this.lblMozoNyAModif = new JLabel("Nombre y Apellido");
		this.lblMozoNyAModif.setBounds(10, 33, 113, 14);
		this.panelMozoModif.add(this.lblMozoNyAModif);
		
		this.textFieldMozoNyAModif = new JTextField();
		this.textFieldMozoNyAModif.setColumns(10);
		this.textFieldMozoNyAModif.setBounds(165, 30, 159, 20);
		this.panelMozoModif.add(this.textFieldMozoNyAModif);
		
		this.lblMozoFechaDeNacimientoModif = new JLabel("Fecha de nacimiento(yyyy-MM-dd)");
		this.lblMozoFechaDeNacimientoModif.setBounds(10, 81, 204, 14);
		this.panelMozoModif.add(this.lblMozoFechaDeNacimientoModif);
		
		this.lblMozoHijosModif = new JLabel("Hijos");
		this.lblMozoHijosModif.setBounds(10, 128, 113, 14);
		this.panelMozoModif.add(this.lblMozoHijosModif);
		
		this.textFieldMozoHijosModif = new JTextField();
		this.textFieldMozoHijosModif.setColumns(10);
		this.textFieldMozoHijosModif.setBounds(165, 125, 159, 20);
		this.panelMozoModif.add(this.textFieldMozoHijosModif);
		
		this.btnMozoModif = new JButton("Modificar");
		this.btnMozoModif.setBounds(114, 210, 89, 23);
		this.panelMozoModif.add(this.btnMozoModif);
		
		this.formattedTextFieldFechaNacimientoModif = new JFormattedTextField();
		this.formattedTextFieldFechaNacimientoModif.setBounds(224, 78, 100, 20);
		this.panelMozoModif.add(this.formattedTextFieldFechaNacimientoModif);
		this.formattedTextFieldFechaNacimientoModif.setColumns(10);
		this.formattedTextFieldFechaNacimientoModif.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
		
		this.scrollPaneListaMozos = new JScrollPane();
		this.scrollPaneListaMozos.setViewportBorder(new TitledBorder(null, "Lista de Mozos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaMozos.setBounds(412, 38, 430, 274);
		this.panelMozo.add(this.scrollPaneListaMozos);
		
		this.listMozos = new JList();
		this.scrollPaneListaMozos.setViewportView(this.listMozos);
		
		this.btnMozoBaja = new JButton("Eliminar");
		this.btnMozoBaja.setBounds(570, 337, 89, 23);
		this.panelMozo.add(this.btnMozoBaja);
		
		this.panelEstadisticas = new JPanel();
		this.panelEstadisticas.setBorder(new TitledBorder(null, "Estadisticas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEstadisticas.setBounds(412, 380, 430, 268);
		this.panelMozo.add(this.panelEstadisticas);
		this.panelEstadisticas.setLayout(null);
		
		this.btnMozoEstadEmp = new JButton("Estadisticas de un empleado");
		this.btnMozoEstadEmp.setBounds(57, 29, 308, 43);
		this.panelEstadisticas.add(this.btnMozoEstadEmp);
		
		this.btnMozoEstadEmpMayorVolVenta = new JButton("Empleado con mayor volumen de venta");
		this.btnMozoEstadEmpMayorVolVenta.setBounds(57, 83, 308, 43);
		this.panelEstadisticas.add(this.btnMozoEstadEmpMayorVolVenta);
		
		this.btnMozoEstadEmpMenorVolVenta = new JButton("Empleado con menor volumen de venta");
		this.btnMozoEstadEmpMenorVolVenta.setBounds(57, 137, 308, 43);
		this.panelEstadisticas.add(this.btnMozoEstadEmpMenorVolVenta);
		
		this.btnMozoEstadMesaConsumoProm = new JButton("Consumo promedio por mesa");
		this.btnMozoEstadMesaConsumoProm.setBounds(57, 191, 308, 43);
		this.panelEstadisticas.add(this.btnMozoEstadMesaConsumoProm);
		
		this.scrollPaneEstadisticas = new JScrollPane();
		this.scrollPaneEstadisticas.setViewportBorder(new TitledBorder(null, "Estadisticas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneEstadisticas.setBounds(870, 39, 415, 607);
		this.panelMozo.add(this.scrollPaneEstadisticas);
		
		this.textAreaEstadisticas = new JTextArea();
		this.scrollPaneEstadisticas.setViewportView(this.textAreaEstadisticas);
		
		this.panelProducto = new JPanel();
		this.tabbedPane.addTab("Productos", null, this.panelProducto, null);
		this.panelProducto.setLayout(null);
		
		this.panelProductoAlta = new JPanel();
		this.panelProductoAlta.setBorder(new TitledBorder(null, "Alta de Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelProductoAlta.setBounds(10, 41, 411, 289);
		this.panelProducto.add(this.panelProductoAlta);
		this.panelProductoAlta.setLayout(null);
		
		this.lblProductoNombreAlta = new JLabel("Nombre");
		this.lblProductoNombreAlta.setBounds(47, 40, 69, 14);
		this.panelProductoAlta.add(this.lblProductoNombreAlta);
		
		this.textFieldProductoNombreAlta = new JTextField();
		this.textFieldProductoNombreAlta.setBounds(181, 37, 155, 20);
		this.panelProductoAlta.add(this.textFieldProductoNombreAlta);
		this.textFieldProductoNombreAlta.setColumns(10);
		
		this.lblProductoPrecioCostoAlta = new JLabel("Precio costo");
		this.lblProductoPrecioCostoAlta.setBounds(47, 84, 92, 14);
		this.panelProductoAlta.add(this.lblProductoPrecioCostoAlta);
		
		this.textFieldProductoPrecioCostoAlta = new JTextField();
		this.textFieldProductoPrecioCostoAlta.setColumns(10);
		this.textFieldProductoPrecioCostoAlta.setBounds(181, 81, 155, 20);
		this.panelProductoAlta.add(this.textFieldProductoPrecioCostoAlta);
		
		this.lblProductoPrecioVentaAlta = new JLabel("Precio venta");
		this.lblProductoPrecioVentaAlta.setBounds(47, 127, 92, 14);
		this.panelProductoAlta.add(this.lblProductoPrecioVentaAlta);
		
		this.textFieldProductoPrecioVentaAlta = new JTextField();
		this.textFieldProductoPrecioVentaAlta.setColumns(10);
		this.textFieldProductoPrecioVentaAlta.setBounds(181, 124, 155, 20);
		this.panelProductoAlta.add(this.textFieldProductoPrecioVentaAlta);
		
		this.lblProductoStockInicialAlta = new JLabel("Stock inicial");
		this.lblProductoStockInicialAlta.setBounds(47, 171, 92, 14);
		this.panelProductoAlta.add(this.lblProductoStockInicialAlta);
		
		this.textFieldProductoStockInicialAlta = new JTextField();
		this.textFieldProductoStockInicialAlta.setColumns(10);
		this.textFieldProductoStockInicialAlta.setBounds(181, 168, 155, 20);
		this.panelProductoAlta.add(this.textFieldProductoStockInicialAlta);
		
		this.btnProductoAlta = new JButton("Crear");
		this.btnProductoAlta.setBounds(145, 228, 89, 23);
		this.panelProductoAlta.add(this.btnProductoAlta);
		
		this.panelProductoModif = new JPanel();
		this.panelProductoModif.setLayout(null);
		this.panelProductoModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificacion de Producto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelProductoModif.setBounds(10, 384, 411, 289);
		this.panelProducto.add(this.panelProductoModif);
		
		this.lblProductoNombreModif = new JLabel("Nombre");
		this.lblProductoNombreModif.setBounds(47, 40, 69, 14);
		this.panelProductoModif.add(this.lblProductoNombreModif);
		
		this.textFieldProductoNombreModif = new JTextField();
		this.textFieldProductoNombreModif.setColumns(10);
		this.textFieldProductoNombreModif.setBounds(181, 37, 155, 20);
		this.panelProductoModif.add(this.textFieldProductoNombreModif);
		
		this.lblProductoPrecioCostoModif = new JLabel("Precio costo");
		this.lblProductoPrecioCostoModif.setBounds(47, 84, 92, 14);
		this.panelProductoModif.add(this.lblProductoPrecioCostoModif);
		
		this.textFieldProductoPrecioCostoModif = new JTextField();
		this.textFieldProductoPrecioCostoModif.setColumns(10);
		this.textFieldProductoPrecioCostoModif.setBounds(181, 81, 155, 20);
		this.panelProductoModif.add(this.textFieldProductoPrecioCostoModif);
		
		this.lblProductoPrecioVentaModif = new JLabel("Precio venta");
		this.lblProductoPrecioVentaModif.setBounds(47, 127, 92, 14);
		this.panelProductoModif.add(this.lblProductoPrecioVentaModif);
		
		this.textFieldProductoPrecioVentaModif = new JTextField();
		this.textFieldProductoPrecioVentaModif.setColumns(10);
		this.textFieldProductoPrecioVentaModif.setBounds(181, 124, 155, 20);
		this.panelProductoModif.add(this.textFieldProductoPrecioVentaModif);
		
		this.lblProductoStockInicialModif = new JLabel("Stock inicial");
		this.lblProductoStockInicialModif.setBounds(47, 171, 92, 14);
		this.panelProductoModif.add(this.lblProductoStockInicialModif);
		
		this.textFieldProductoStockInicialModif = new JTextField();
		this.textFieldProductoStockInicialModif.setColumns(10);
		this.textFieldProductoStockInicialModif.setBounds(181, 168, 155, 20);
		this.panelProductoModif.add(this.textFieldProductoStockInicialModif);
		
		this.btnProductoModificacion = new JButton("Modificar");
		this.btnProductoModificacion.setBounds(145, 228, 89, 23);
		this.panelProductoModif.add(this.btnProductoModificacion);
		
		this.scrollPaneListaProductos = new JScrollPane();
		this.scrollPaneListaProductos.setViewportBorder(new TitledBorder(null, "Lista de Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.scrollPaneListaProductos.setBounds(460, 41, 416, 598);
		this.panelProducto.add(this.scrollPaneListaProductos);
		
		this.listProductos = new JList();
		this.scrollPaneListaProductos.setViewportView(this.listProductos);
		
		this.btnProductoBaja = new JButton("Eliminar");
		this.btnProductoBaja.setBounds(619, 650, 89, 23);
		this.panelProducto.add(this.btnProductoBaja);
		
		this.panelNuevoStockProducto = new JPanel();
		this.panelNuevoStockProducto.setBorder(new TitledBorder(null, "Actualizar Stock de Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelNuevoStockProducto.setBounds(929, 41, 397, 188);
		this.panelProducto.add(this.panelNuevoStockProducto);
		this.panelNuevoStockProducto.setLayout(null);
		
		this.lblProductoStockNuevo = new JLabel("Nuevo Stock");
		this.lblProductoStockNuevo.setBounds(35, 50, 72, 14);
		this.panelNuevoStockProducto.add(this.lblProductoStockNuevo);
		
		this.textFieldProductoNuevoStock = new JTextField();
		this.textFieldProductoNuevoStock.setBounds(150, 47, 216, 20);
		this.panelNuevoStockProducto.add(this.textFieldProductoNuevoStock);
		this.textFieldProductoNuevoStock.setColumns(10);
		
		this.btnProductoNuevoStock = new JButton("Actualizar");
		this.btnProductoNuevoStock.setBounds(158, 116, 101, 23);
		this.panelNuevoStockProducto.add(this.btnProductoNuevoStock);
		

	}
	
	public void actionPerformed(ActionEvent e) {
	}
	
	public void setControlador(Controlador c) {
		this.c = c;
		setDefault();
	}
	public void setDefault() {
		
		
		this.tabbedPane.setEnabledAt(1, false);
		this.tabbedPane.setEnabledAt(2, false);
		this.tabbedPane.setEnabledAt(3, false);
		this.tabbedPane.setEnabledAt(4, false);
		this.tabbedPane.setEnabledAt(5, false);
		
		
		//Ventana Login--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.textFieldLoginUsuario.addKeyListener(this);
		this.textFieldLoginContrasenia.addKeyListener(this);
		this.textFieldNombreLocal.addKeyListener(this);
		
		this.btnLogin.setActionCommand(confirmaLoginUsuario);
		this.btnLogout.setActionCommand(confirmaLogoutUsuario);
		this.btnGuardarSistema.setActionCommand(guardaSistema);
		this.btnRecuperarSistema.setActionCommand(recuperaSistema);
		this.btnNuevoSistema.setActionCommand(nuevoSistema);
		
		this.btnLogin.addActionListener(c);
		this.btnLogout.addActionListener(c);
		this.btnGuardarSistema.addActionListener(c);
		this.btnRecuperarSistema.addActionListener(c);
		this.btnNuevoSistema.addActionListener(c);
		
		this.btnLogin.addMouseListener(this);
		this.btnLogout.addMouseListener(this);
		this.btnGuardarSistema.addMouseListener(this);
		this.btnRecuperarSistema.addMouseListener(this);
		this.btnNuevoSistema.addMouseListener(this);
		
		this.btnLogin.setEnabled(false);
		this.btnLogout.setEnabled(false);
		this.btnNuevoSistema.setEnabled(false);
		
		//Ventana general--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.listMozosEstados.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListMozosEstados = new DefaultListModel<Mozo>();
		this.listMozosEstados.setModel(modelListMozosEstados);
		this.listMozosEstados.addMouseListener(this);
		this.listMozosActivos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListMozosActivos = new DefaultListModel<Mozo>();
		this.listMozosActivos.setModel(modelListMozosActivos);
		this.listMozosActivos.addMouseListener(this);
		this.listMesasAsignables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListMesasAsignables = new DefaultListModel<Mesa>();
		this.listMesasAsignables.setModel(modelListMesasAsignables);
		this.listMesasAsignables.addMouseListener(this);
		this.listComandasActivas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListComandasActivas = new DefaultListModel<Comanda>();
		this.listComandasActivas.setModel(modelListComandasActivas);
		this.listComandasActivas.addMouseListener(this);
		this.listProductosGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListProductos = new DefaultListModel<Producto>();
		this.listProductosGeneral.setModel(modelListProductos);
		this.listProductosGeneral.addMouseListener(this);
		
		this.textFieldOcupacionComensales.addKeyListener(this);
		this.textFieldCantidadProducto.addKeyListener(this);
		
		this.btnEstadoConfirmar.setActionCommand(confirmaEstadoMozoDia);
		this.btnAsignarMozoMesa.setActionCommand(asociaMozoAMesa);
		this.btnOcuparMesa.setActionCommand(ocupaMesa);
		this.btnAgregarPedidoAComanda.setActionCommand(agregaPedido);
		this.btnCerrarComanda.setActionCommand(cerrarComanda);
		
		this.btnEstadoConfirmar.addActionListener(c);
		this.btnAsignarMozoMesa.addActionListener(c);
		this.btnOcuparMesa.addActionListener(c);
		this.btnAgregarPedidoAComanda.addActionListener(c);
		this.btnCerrarComanda.addActionListener(c);
		
		this.btnEstadoConfirmar.addMouseListener(this);
		this.btnAsignarMozoMesa.addMouseListener(this);
		this.btnOcuparMesa.addMouseListener(this);
		this.btnAgregarPedidoAComanda.addMouseListener(this);
		this.btnCerrarComanda.addMouseListener(this);
		
		this.btnEstadoConfirmar.setEnabled(false);
		this.btnAsignarMozoMesa.setEnabled(false);
		this.btnOcuparMesa.setEnabled(false);
		this.btnAgregarPedidoAComanda.setEnabled(false);
		this.btnCerrarComanda.setEnabled(false);
		
		//Ventana Operarios y Mesas--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.listOperarios.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListOperarios = new DefaultListModel<Operario>();
		this.listOperarios.setModel(modelListOperarios);
		this.listOperarios.addMouseListener(this);
		this.listMesas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListMesas = new DefaultListModel<Mesa>();
		this.listMesas.setModel(modelListMesas);
		this.listMesas.addMouseListener(this);
		
		this.comboBoxOperarioEstadoModif.addItem("Activo");
		this.comboBoxOperarioEstadoModif.addItem("Inactivo");
		
		this.textFieldOperarioUsuarioAlta.addKeyListener(this);
		this.textFieldOperarioContraseniaAlta.addKeyListener(this);
		this.textFieldOperarioNyAAlta.addKeyListener(this);
		this.textFieldOperarioUsuarioModif.addKeyListener(this);
		this.textFieldOperarioContraseniaModif.addKeyListener(this);
		this.textFieldOperarioNyAModif.addKeyListener(this);
		this.textFieldMesaNumeroAlta.addKeyListener(this);
		this.textFieldMesaCantidadComensalesAlta.addKeyListener(this);
		this.textFieldMesaNumeroModif.addKeyListener(this);
		this.textFieldMesaCantidadComensalesModif.addKeyListener(this);
		
		this.btnOperarioAlta.setActionCommand(crearOperario);
		this.btnOperarioBaja.setActionCommand(eliminarOperario);
		this.btnOperarioModificacion.setActionCommand(modificarOperario);
		this.btnMesaAlta.setActionCommand(crearMesa);
		this.btnMesaBaja.setActionCommand(eliminarMesa);
		this.btnMesaModificacion.setActionCommand(modificarMesa);
		
		this.btnOperarioAlta.addActionListener(c);
		this.btnOperarioBaja.addActionListener(c);
		this.btnOperarioModificacion.addActionListener(c);
		this.btnMesaAlta.addActionListener(c);
		this.btnMesaBaja.addActionListener(c);
		this.btnMesaModificacion.addActionListener(c);
		
		this.btnOperarioAlta.addMouseListener(this);
		this.btnOperarioBaja.addMouseListener(this);
		this.btnOperarioModificacion.addMouseListener(this);
		this.btnMesaAlta.addMouseListener(this);
		this.btnMesaBaja.addMouseListener(this);
		this.btnMesaModificacion.addMouseListener(this);
		
		this.btnOperarioAlta.setEnabled(false);
		this.btnOperarioBaja.setEnabled(false);
		this.btnOperarioModificacion.setEnabled(false);
		this.btnMesaAlta.setEnabled(false);
		this.btnMesaBaja.setEnabled(false);
		this.btnMesaModificacion.setEnabled(false);
		
		//Ventana promociones--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.listPromPerm.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListPromPerm = new DefaultListModel<PromocionPermanente>();
		this.listPromPerm.setModel(modelListPromPerm);
		this.listPromPerm.addMouseListener(this);
		this.listPromTemp.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListPromTemp = new DefaultListModel<PromocionTemporal>();
		this.listPromTemp.setModel(modelListPromTemp);
		this.listPromTemp.addMouseListener(this);
		
		this.comboBoxPromPermDiasAlta.addItem("Lunes");
		this.comboBoxPromPermDiasAlta.addItem("Martes");
		this.comboBoxPromPermDiasAlta.addItem("Miercoles");
		this.comboBoxPromPermDiasAlta.addItem("Jueves");
		this.comboBoxPromPermDiasAlta.addItem("Viernes");
		this.comboBoxPromPermDiasAlta.addItem("Sabado");
		this.comboBoxPromPermDiasAlta.addItem("Domingo");
		
		
		this.comboBoxPromPermDosPorUnoAlta.addItem("Si");
		this.comboBoxPromPermDosPorUnoAlta.addItem("No");
		
		
		this.comboBoxPromPermDtoPorCantAlta.addItemListener(this);
		this.comboBoxPromPermDtoPorCantAlta.addItem("Si");
		this.comboBoxPromPermDtoPorCantAlta.addItem("No");
		
		this.comboBoxPromPermEstadoModif.addItem("Activa");
		this.comboBoxPromPermEstadoModif.addItem("Inactiva");
		
		this.comboBoxPromPermDiasModif.addItem("Lunes");
		this.comboBoxPromPermDiasModif.addItem("Martes");
		this.comboBoxPromPermDiasModif.addItem("Miercoles");
		this.comboBoxPromPermDiasModif.addItem("Jueves");
		this.comboBoxPromPermDiasModif.addItem("Viernes");
		this.comboBoxPromPermDiasModif.addItem("Sabado");
		this.comboBoxPromPermDiasModif.addItem("Domingo");
		
		
		this.comboBoxPromPermDosPorUnoModif.addItem("Si");
		this.comboBoxPromPermDosPorUnoModif.addItem("No");
		
		this.comboBoxPromPermDtoPorCantModif.addItemListener(this);
		this.comboBoxPromPermDtoPorCantModif.addItem("Si");
		this.comboBoxPromPermDtoPorCantModif.addItem("No");
		
		this.comboBoxPromTempDiasAlta.addItem("Lunes");
		this.comboBoxPromTempDiasAlta.addItem("Martes");
		this.comboBoxPromTempDiasAlta.addItem("Miercoles");
		this.comboBoxPromTempDiasAlta.addItem("Jueves");
		this.comboBoxPromTempDiasAlta.addItem("Viernes");
		this.comboBoxPromTempDiasAlta.addItem("Sabado");
		this.comboBoxPromTempDiasAlta.addItem("Domingo");
		
		this.comboBoxPromTempAcumulableAlta.addItem("Si");
		this.comboBoxPromTempAcumulableAlta.addItem("No");
		
		this.comboBoxPromTempMetodoPagoAlta.addItem("Efectivo");
		this.comboBoxPromTempMetodoPagoAlta.addItem("Tarjeta");
		this.comboBoxPromTempMetodoPagoAlta.addItem("MercPago");
		this.comboBoxPromTempMetodoPagoAlta.addItem("CtaDNI");
		
		this.comboBoxPromTempEstadoModif.addItem("Activa");
		this.comboBoxPromTempEstadoModif.addItem("Inactiva");
		
		this.comboBoxPromTempDiasModif.addItem("Lunes");
		this.comboBoxPromTempDiasModif.addItem("Martes");
		this.comboBoxPromTempDiasModif.addItem("Miercoles");
		this.comboBoxPromTempDiasModif.addItem("Jueves");
		this.comboBoxPromTempDiasModif.addItem("Viernes");
		this.comboBoxPromTempDiasModif.addItem("Sabado");
		this.comboBoxPromTempDiasModif.addItem("Domingo");
		
		this.comboBoxPromTempAcumulableModif.addItem("Si");
		this.comboBoxPromTempAcumulableModif.addItem("No");
		
		this.comboBoxPromTempMetodoPagoModif.addItem("Efectivo");
		this.comboBoxPromTempMetodoPagoModif.addItem("Tarjeta");
		this.comboBoxPromTempMetodoPagoModif.addItem("MercPago");
		this.comboBoxPromTempMetodoPagoModif.addItem("CtaDNI");
		
		this.textFieldPromPermDtoPorCantMinimoAlta.addKeyListener(this);
		this.textFieldPromPermDtoPorCantMinimoModif.addKeyListener(this);
		this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.addKeyListener(this);
		this.textFieldPromPermDtoPorCantPrecioUnitarioModif.addKeyListener(this);
		this.textFieldPromTempNombreAlta.addKeyListener(this);
		this.textFieldPromTempNombreModif.addKeyListener(this);
		this.textFieldPromTempPorcentajeDtoAlta.addKeyListener(this);
		this.textFieldPromTempPorcentajeDtoModif.addKeyListener(this);
		
		this.btnPromPermAlta.setActionCommand(crearPromPerm);
		this.btnPromPermBaja.setActionCommand(eliminarPromPerm);
		this.btnPromPermModif.setActionCommand(modificarPromPerm);
		this.btnPromTempAlta.setActionCommand(crearPromTemp);
		this.btnPromTempBaja.setActionCommand(eliminarPromTemp);
		this.btnPromTempModif.setActionCommand(modificarPromTemp);
		
		this.btnPromPermAlta.addActionListener(c);
		this.btnPromPermBaja.addActionListener(c);
		this.btnPromPermModif.addActionListener(c);
		this.btnPromTempAlta.addActionListener(c);
		this.btnPromTempBaja.addActionListener(c);
		this.btnPromTempModif.addActionListener(c);
		
		this.btnPromPermAlta.addMouseListener(this);
		this.btnPromPermBaja.addMouseListener(this);
		this.btnPromPermModif.addMouseListener(this);
		this.btnPromTempAlta.addMouseListener(this);
		this.btnPromTempBaja.addMouseListener(this);
		this.btnPromTempModif.addMouseListener(this);
		
		this.btnPromPermAlta.setEnabled(false);
		this.btnPromPermBaja.setEnabled(false);
		this.btnPromPermModif.setEnabled(false);
		this.btnPromTempAlta.setEnabled(false);
		this.btnPromTempBaja.setEnabled(false);
		this.btnPromTempModif.setEnabled(false);
		
		//Ventana Mozos--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.listMozos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.modelListMozos = new DefaultListModel<Mozo>();
		this.listMozos.setModel(modelListMozos);
		this.listMozos.addMouseListener(this);
		this.textAreaEstadisticas.setEnabled(false);
		
		this.textFieldMozoNyAAlta.addKeyListener(this);
		this.textFieldMozoNyAModif.addKeyListener(this);
		this.textFieldMozoHijosAlta.addKeyListener(this);
		this.textFieldMozoHijosModif.addKeyListener(this);
		this.formattedTextFieldFechaNacimientoAlta.addKeyListener(this);
		this.formattedTextFieldFechaNacimientoModif.addKeyListener(this);
		
		this.btnMozoAlta.setActionCommand(crearMozo);
		this.btnMozoBaja.setActionCommand(eliminarMozo);
		this.btnMozoModif.setActionCommand(modificarMozo);
		this.btnMozoEstadEmp.setActionCommand(estadEmpleado);
		this.btnMozoEstadEmpMayorVolVenta.setActionCommand(estadEmpleadoMayorVol);
		this.btnMozoEstadEmpMenorVolVenta.setActionCommand(estadEmpleadoMenorVol);
		this.btnMozoEstadMesaConsumoProm.setActionCommand(estadPromMesas);
		
		this.btnMozoAlta.addActionListener(c);
		this.btnMozoBaja.addActionListener(c);
		this.btnMozoModif.addActionListener(c);
		this.btnMozoEstadEmp.addActionListener(c);
		this.btnMozoEstadEmpMayorVolVenta.addActionListener(c);
		this.btnMozoEstadEmpMenorVolVenta.addActionListener(c);
		this.btnMozoEstadMesaConsumoProm.addActionListener(c);
		
		this.btnMozoAlta.addMouseListener(this);
		this.btnMozoBaja.addMouseListener(this);
		this.btnMozoModif.addMouseListener(this);
		this.btnMozoEstadEmp.addMouseListener(this);
		this.btnMozoEstadEmpMayorVolVenta.addMouseListener(this);
		this.btnMozoEstadEmpMenorVolVenta.addMouseListener(this);
		this.btnMozoEstadMesaConsumoProm.addMouseListener(this);
		
		this.btnMozoAlta.setEnabled(false);
		this.btnMozoBaja.setEnabled(false);
		this.btnMozoModif.setEnabled(false);
		this.btnMozoEstadEmp.setEnabled(false);
		this.btnMozoEstadEmpMayorVolVenta.setEnabled(false);
		this.btnMozoEstadEmpMenorVolVenta.setEnabled(false);
		this.btnMozoEstadMesaConsumoProm.setEnabled(false);
		
		//Ventana Productos--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		this.listProductos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.listProductos.setModel(modelListProductos);
		this.listProductos.addMouseListener(this);
		
		this.textFieldProductoNombreAlta.addKeyListener(this);
		this.textFieldProductoNombreModif.addKeyListener(this);
		this.textFieldProductoPrecioCostoAlta.addKeyListener(this);
		this.textFieldProductoPrecioCostoModif.addKeyListener(this);
		this.textFieldProductoPrecioVentaAlta.addKeyListener(this);
		this.textFieldProductoPrecioVentaModif.addKeyListener(this);
		this.textFieldProductoStockInicialAlta.addKeyListener(this);
		this.textFieldProductoStockInicialModif.addKeyListener(this);
		this.textFieldProductoNuevoStock.addKeyListener(this);
		
		this.btnProductoAlta.setActionCommand(crearProducto);
		this.btnProductoBaja.setActionCommand(eliminarProducto);
		this.btnProductoModificacion.setActionCommand(modificarProducto);
		this.btnProductoNuevoStock.setActionCommand(actualizarStockProducto);
		
		this.btnProductoAlta.addActionListener(c);
		this.btnProductoBaja.addActionListener(c);
		this.btnProductoModificacion.addActionListener(c);
		this.btnProductoNuevoStock.addActionListener(c);
		
		this.btnProductoAlta.addMouseListener(this);
		this.btnProductoBaja.addMouseListener(this);
		this.btnProductoModificacion.addMouseListener(this);
		this.btnProductoNuevoStock.addMouseListener(this);

		this.btnProductoAlta.setEnabled(false);
		this.btnProductoBaja.setEnabled(false);
		this.btnProductoModificacion.setEnabled(false);
		this.btnProductoNuevoStock.setEnabled(false);
		
	}
	

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean hab;
		
		if(e.getSource() == this.textFieldNombreLocal) {
			hab = !(this.textFieldNombreLocal.getText().isEmpty());
			this.btnNuevoSistema.setEnabled(hab);
		}else if(e.getSource() == this.textFieldLoginUsuario || e.getSource() == this.textFieldLoginContrasenia) {
			hab = !(this.textFieldLoginUsuario.getText().isEmpty() || this.textFieldLoginContrasenia.getText().isEmpty()) && c.existeSistema();
			this.btnLogin.setEnabled(hab);
		}else if(e.getSource() == this.textFieldOcupacionComensales) {
			hab = !(this.textFieldOcupacionComensales.getText().isEmpty() || this.listMozosActivos.isSelectionEmpty() || this.listMesasAsignables.isSelectionEmpty());
			this.btnOcuparMesa.setEnabled(hab);
		}else if(e.getSource() == this.textFieldCantidadProducto) {
			hab = !(this.textFieldCantidadProducto.getText().isEmpty() || this.listComandasActivas.isSelectionEmpty() || this.listProductosGeneral.isSelectionEmpty());
			this.btnAgregarPedidoAComanda.setEnabled(hab);
		}else if(e.getSource() == this.textFieldOperarioUsuarioAlta ||  e.getSource() == this.textFieldOperarioContraseniaAlta ||  e.getSource() == this.textFieldOperarioNyAAlta) {
			hab = !(this.textFieldOperarioUsuarioAlta.getText().isEmpty() || this.textFieldOperarioContraseniaAlta.getText().isEmpty() || this.textFieldOperarioNyAAlta.getText().isEmpty());
			this.btnOperarioAlta.setEnabled(hab);
		}else if(e.getSource() == this.textFieldOperarioUsuarioModif ||  e.getSource() == this.textFieldOperarioContraseniaModif ||  e.getSource() == this.textFieldOperarioNyAModif) {
			hab = !(this.textFieldOperarioUsuarioModif.getText().isEmpty() || this.textFieldOperarioContraseniaModif.getText().isEmpty() || this.textFieldOperarioNyAModif.getText().isEmpty());
			this.btnOperarioModificacion.setEnabled(hab);
		}else if(e.getSource() == this.textFieldMesaNumeroAlta || e.getSource() == this.textFieldMesaCantidadComensalesAlta) {
			hab = !(this.textFieldMesaNumeroAlta.getText().isEmpty() || this.textFieldMesaCantidadComensalesAlta.getText().isEmpty());
			this.btnMesaAlta.setEnabled(hab);
		}else if(e.getSource() == this.textFieldMesaNumeroModif || e.getSource() == this.textFieldMesaCantidadComensalesModif) {
			hab = !(this.textFieldMesaNumeroModif.getText().isEmpty() || this.textFieldMesaCantidadComensalesModif.getText().isEmpty());
			this.btnMesaModificacion.setEnabled(hab);
		}else if(e.getSource() == this.textFieldPromPermDtoPorCantMinimoAlta || e.getSource() == this.textFieldPromPermDtoPorCantPrecioUnitarioAlta) { //REVISAR DESPUES AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
			hab = this.comboBoxPromPermDtoPorCantAlta.getSelectedItem().equals("Si") && 
					!(this.textFieldPromPermDtoPorCantMinimoAlta.getText().isEmpty() || this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.getText().isEmpty());
			this.btnPromPermAlta.setEnabled(hab);
		}else if(e.getSource() == this.textFieldPromPermDtoPorCantMinimoModif || e.getSource() == this.textFieldPromPermDtoPorCantPrecioUnitarioModif) {//REVISAR DESPUES AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
			hab = this.comboBoxPromPermDtoPorCantModif.getSelectedItem().equals("Si") && 
					!(this.textFieldPromPermDtoPorCantMinimoModif.getText().isEmpty() || this.textFieldPromPermDtoPorCantPrecioUnitarioModif.getText().isEmpty());
			this.btnPromPermModif.setEnabled(hab);
		}else if(e.getSource() == this.textFieldPromTempNombreAlta || e.getSource() == this.textFieldPromTempPorcentajeDtoAlta) {
			hab = !(this.textFieldPromTempNombreAlta.getText().isEmpty() || this.textFieldPromTempPorcentajeDtoAlta.getText().isEmpty());
			this.btnPromTempAlta.setEnabled(hab);
		}else if(e.getSource() == this.textFieldPromTempNombreModif || e.getSource() == this.textFieldPromTempPorcentajeDtoModif) {
			hab = !(this.textFieldPromTempNombreModif.getText().isEmpty() || this.textFieldPromTempPorcentajeDtoModif.getText().isEmpty());
			this.btnPromTempModif.setEnabled(hab);
		}else if(e.getSource() == this.textFieldMozoNyAAlta || e.getSource() == this.formattedTextFieldFechaNacimientoAlta || e.getSource() == this.textFieldMozoHijosAlta) {
			hab = !(this.textFieldMozoNyAAlta.getText().isEmpty() || this.formattedTextFieldFechaNacimientoAlta.getText().isEmpty() || this.textFieldMozoHijosAlta.getText().isEmpty());
			this.btnMozoAlta.setEnabled(hab);
		}else if((e.getSource() == this.textFieldMozoNyAModif || e.getSource() == this.formattedTextFieldFechaNacimientoModif || e.getSource() == this.textFieldMozoHijosModif)) {
			hab = !(this.textFieldMozoNyAModif.getText().isEmpty() || this.formattedTextFieldFechaNacimientoModif.getText().isEmpty() || this.textFieldMozoHijosModif.getText().isEmpty());
			this.btnMozoModif.setEnabled(hab);
		}else if(e.getSource() == this.textFieldProductoNombreAlta || e.getSource() == this.textFieldProductoPrecioCostoAlta || e.getSource() == this.textFieldProductoPrecioVentaAlta || 
				e.getSource() == this.textFieldProductoStockInicialAlta){
			hab = !(this.textFieldProductoNombreAlta.getText().isEmpty() || this.textFieldProductoPrecioCostoAlta.getText().isEmpty() || this.textFieldProductoPrecioVentaAlta.getText().isEmpty() ||
					this.textFieldProductoStockInicialAlta.getText().isEmpty());
			this.btnProductoAlta.setEnabled(hab);
		}else if(e.getSource() == this.textFieldProductoNombreModif || e.getSource() == this.textFieldProductoPrecioCostoModif || e.getSource() == this.textFieldProductoPrecioVentaModif || 
				e.getSource() == this.textFieldProductoStockInicialModif) {
			hab = !(this.textFieldProductoNombreModif.getText().isEmpty() || this.textFieldProductoPrecioCostoModif.getText().isEmpty() || this.textFieldProductoPrecioVentaModif.getText().isEmpty() ||
					this.textFieldProductoStockInicialModif.getText().isEmpty());
			this.btnProductoModificacion.setEnabled(hab);
		}else if(e.getSource() == this.textFieldProductoNuevoStock) {
			hab = !(this.textFieldProductoNuevoStock.getText().isEmpty() || this.listProductos.isSelectionEmpty());
			this.btnProductoNuevoStock.setEnabled(hab);
		}
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) { //FALTARIA VER LOS BOTONES QUE NO TIENEN INVOLUCRACION DIRECTA O EXCLUSIVA CON LOS TEXTFIELDS 
		if(e.getSource() == this.btnLogin && this.btnLogin.isEnabled()) {
			this.textFieldLoginUsuario.setText("");
			this.textFieldLoginContrasenia.setText("");
			this.textFieldLoginUsuario.setEnabled(false);
			this.textFieldLoginContrasenia.setEnabled(false);
			this.btnLogin.setEnabled(false);
			this.btnLogout.setEnabled(true);
		}else if (e.getSource() == this.btnLogout && this.btnLogout.isEnabled()) {
			this.textFieldLoginUsuario.setEnabled(true);
			this.textFieldLoginContrasenia.setEnabled(true);
			this.btnLogout.setEnabled(false);
		}else if(e.getSource() == this.btnNuevoSistema && this.btnNuevoSistema.isEnabled()) {
			this.textFieldNombreLocal.setText("");
			this.btnNuevoSistema.setEnabled(false);
		}else if(e.getSource() == this.btnOcuparMesa && this.btnOcuparMesa.isEnabled()) {
			this.textFieldOcupacionComensales.setText("");
			this.btnOcuparMesa.setEnabled(false);
		}else if(e.getSource() == this.btnAgregarPedidoAComanda && this.btnAgregarPedidoAComanda.isEnabled()) {
			this.textFieldCantidadProducto.setText("");
			this.btnAgregarPedidoAComanda.setEnabled(false);
		}else if(e.getSource() == this.btnOperarioAlta && this.btnOperarioAlta.isEnabled()) {
			this.textFieldOperarioNyAAlta.setText("");
			this.textFieldOperarioUsuarioAlta.setText("");
			this.textFieldOperarioContraseniaAlta.setText("");
			this.btnOperarioAlta.setEnabled(false);
		}else if((e.getSource() == this.btnOperarioModificacion && this.btnOperarioModificacion.isEnabled()) || (e.getSource() == this.btnOperarioBaja && this.btnOperarioBaja.isEnabled())) {
			this.textFieldOperarioNyAModif.setText("");
			this.textFieldOperarioUsuarioModif.setText("");
			this.textFieldOperarioContraseniaModif.setText("");
			this.comboBoxOperarioEstadoModif.setSelectedIndex(0);
			this.btnOperarioModificacion.setEnabled(false);
			this.btnOperarioBaja.setEnabled(false);
			this.listOperarios.clearSelection();
		}else if(e.getSource() == this.btnMesaAlta && this.btnMesaAlta.isEnabled()) {
			this.textFieldMesaCantidadComensalesAlta.setText("");
			this.textFieldMesaNumeroAlta.setText("");
			this.btnMesaAlta.setEnabled(false);
		}else if((e.getSource() == this.btnMesaModificacion && this.btnMesaModificacion.isEnabled()) || (e.getSource() == this.btnMesaBaja && this.btnMesaBaja.isEnabled())) {
			this.textFieldMesaCantidadComensalesModif.setText("");
			this.textFieldMesaNumeroModif.setText("");
			this.btnMesaModificacion.setEnabled(false);
			this.btnMesaBaja.setEnabled(false);
			this.listMesas.clearSelection();
		}else if(e.getSource() == this.btnPromPermAlta && this.btnPromPermAlta.isEnabled()) {
			this.comboBoxPromPermDiasAlta.setSelectedIndex(0);
			this.comboBoxPromPermDosPorUnoAlta.setSelectedIndex(0);
			this.comboBoxPromPermDtoPorCantAlta.setSelectedIndex(0);
			this.comboBoxPromPermProductoAlta.setSelectedIndex(0);
			this.textFieldPromPermDtoPorCantMinimoAlta.setText("");
			this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("");
			this.btnPromPermAlta.setEnabled(false);
		}else if((e.getSource() == this.btnPromPermModif && this.btnPromPermModif.isEnabled()) || (e.getSource() == this.btnPromPermBaja && this.btnPromPermBaja.isEnabled())) {
			this.comboBoxPromPermDiasModif.setSelectedIndex(0);
			this.comboBoxPromPermDosPorUnoModif.setSelectedIndex(0);
			this.comboBoxPromPermDtoPorCantModif.setSelectedIndex(0);
			this.comboBoxPromPermEstadoModif.setSelectedIndex(0);
			this.comboBoxPromPermProductoModif.setSelectedIndex(0);
			this.textFieldPromPermDtoPorCantMinimoModif.setText("");
			this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("");
			this.btnPromPermModif.setEnabled(false);
			this.btnPromPermBaja.setEnabled(false);
			this.listPromPerm.clearSelection();
		}else if(e.getSource() == this.btnPromTempAlta && this.btnPromTempAlta.isEnabled()) {
			this.comboBoxPromTempAcumulableAlta.setSelectedIndex(0);
			this.comboBoxPromTempDiasAlta.setSelectedIndex(0);
			this.comboBoxPromTempMetodoPagoAlta.setSelectedIndex(0);
			this.textFieldPromTempNombreAlta.setText("");
			this.textFieldPromTempPorcentajeDtoAlta.setText("");
			this.btnPromTempAlta.setEnabled(false);
		}else if((e.getSource() == this.btnPromTempModif && this.btnPromTempModif.isEnabled()) || (e.getSource() == this.btnPromTempBaja && this.btnPromTempBaja.isEnabled()) ) {
			this.comboBoxPromTempEstadoModif.setSelectedIndex(0);
			this.comboBoxPromTempDiasModif.setSelectedIndex(0);
			this.comboBoxPromTempAcumulableModif.setSelectedIndex(0);
			this.comboBoxPromTempMetodoPagoModif.setSelectedIndex(0);
			this.textFieldPromTempNombreModif.setText("");
			this.textFieldPromTempPorcentajeDtoModif.setText("");
			this.btnPromTempModif.setEnabled(false);
			this.btnPromTempBaja.setEnabled(false);
			this.listPromTemp.clearSelection();
		}else if(e.getSource() == this.btnMozoAlta && this.btnMozoAlta.isEnabled()) {
			this.textFieldMozoHijosAlta.setText("");
			this.textFieldMozoNyAAlta.setText("");
			this.formattedTextFieldFechaNacimientoAlta.setText("");
			this.btnMozoAlta.setEnabled(false);
		}else if((e.getSource() == this.btnMozoModif && this.btnMozoModif.isEnabled()) || (e.getSource() == this.btnMozoBaja && this.btnMozoBaja.isEnabled())) {
			this.textFieldMozoHijosModif.setText("");
			this.textFieldMozoNyAModif.setText("");
			this.formattedTextFieldFechaNacimientoModif.setText("");
			this.btnMozoModif.setEnabled(false);
			this.btnMozoBaja.setEnabled(false);
			this.listMozos.clearSelection();
		}else if(e.getSource() == this.btnProductoAlta && this.btnProductoAlta.isEnabled()) {
			this.textFieldProductoNombreAlta.setText("");
			this.textFieldProductoPrecioCostoAlta.setText("");
			this.textFieldProductoPrecioVentaAlta.setText("");
			this.textFieldProductoStockInicialAlta.setText("");
			this.btnProductoAlta.setEnabled(false);
		}else if((e.getSource() == this.btnProductoModificacion && this.btnProductoModificacion.isEnabled()) || (e.getSource() == this.btnProductoBaja && this.btnProductoBaja.isEnabled())
				|| (e.getSource() == this.btnProductoNuevoStock && this.btnProductoNuevoStock.isEnabled())) {
			this.textFieldProductoNombreModif.setText("");
			this.textFieldProductoPrecioCostoModif.setText("");
			this.textFieldProductoPrecioVentaModif.setText("");
			this.textFieldProductoStockInicialModif.setText("");
			this.textFieldProductoNuevoStock.setText("");
			this.btnProductoModificacion.setEnabled(false);
			this.btnProductoBaja.setEnabled(false);
			this.btnProductoNuevoStock.setEnabled(false);
			this.listProductos.clearSelection();
		}else if(e.getSource() == this.btnProductoNuevoStock && this.btnProductoNuevoStock.isEnabled()) {
			this.textFieldProductoNuevoStock.setText("");
			this.btnProductoNuevoStock.setEnabled(false);
		}else if(e.getSource() == this.listOperarios && !this.listOperarios.isSelectionEmpty()) {
			this.btnOperarioBaja.setEnabled(true);
			this.btnOperarioModificacion.setEnabled(true);
			c.recuperaDatosOperario(getSelectedOperario());
		}else if(e.getSource() == this.listMesas && !this.listMesas.isSelectionEmpty()) {
			this.btnMesaBaja.setEnabled(true);
			this.btnMesaModificacion.setEnabled(true);
			c.recuperaDatosMesa(getSelectedMesa());
		}else if(e.getSource() == this.listMozos && !this.listMozos.isSelectionEmpty()) {
			this.btnMozoBaja.setEnabled(true);
			this.btnMozoModif.setEnabled(true);
			c.recuperaDatosMozo(getSelectedMozo());
		}else if(e.getSource() == this.listProductos && !this.listProductos.isSelectionEmpty()) {
			this.btnProductoBaja.setEnabled(true);
			this.btnProductoModificacion.setEnabled(true);
			boolean hab = !(this.textFieldProductoNuevoStock.getText().isEmpty() || this.listProductos.isSelectionEmpty());
			this.btnProductoNuevoStock.setEnabled(hab);
			c.recuperaDatosProducto(getSelectedProducto());
		}else if(e.getSource() == this.listPromPerm && !this.listPromPerm.isSelectionEmpty()) {
			this.btnPromPermBaja.setEnabled(true);
			this.btnPromPermModif.setEnabled(true);
			c.recuperarDatosPromPerm(getSelectedPromPerm());
		}else if(e.getSource() == this.listPromTemp && !this.listPromTemp.isSelectionEmpty()) {
			this.btnPromTempBaja.setEnabled(true);
			this.btnPromTempModif.setEnabled(true);
			c.recuperarDatosPromTemp(getSelectedPromTemp());
		}else if(e.getSource() == this.listMozosEstados && !this.listMozosEstados.isSelectionEmpty()) {
			this.btnEstadoConfirmar.setEnabled(true);
		}else if(e.getSource() == this.btnEstadoConfirmar && this.btnEstadoConfirmar.isEnabled()) {
			this.listMozosEstados.clearSelection();
			this.btnEstadoConfirmar.setEnabled(false);
		}else if (e.getSource() == this.btnAsignarMozoMesa && this.btnAsignarMozoMesa.isEnabled()){
			this.listMozosActivos.clearSelection();
			this.listMesasAsignables.clearSelection();
			this.btnAsignarMozoMesa.setEnabled(false);
		}else if((e.getSource() == this.listMozosActivos || e.getSource() == this.listMesasAsignables) && !this.listMozosActivos.isSelectionEmpty() && !this.listMesasAsignables.isSelectionEmpty()) {
			this.btnAsignarMozoMesa.setEnabled(true);
		}
		//this.listComandasActivas.isSelectionEmpty()  TAL VEZ PODRIA SERVIR CLICKEAR AHI PARA HABILITAR ALGUNOS BOTONES :)
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {  //REVISAR AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.SELECTED) {
			Object source = (JComboBox) e.getSource();
			if(source.equals(this.comboBoxPromPermDtoPorCantAlta)) {
				if(this.comboBoxPromPermDtoPorCantAlta.getSelectedItem().equals("Si")) {
					this.textFieldPromPermDtoPorCantMinimoAlta.setEnabled(true);
					this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setEnabled(true);
					this.textFieldPromPermDtoPorCantMinimoAlta.setText("");
					this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("");
					this.btnPromPermAlta.setEnabled(false);
				}else {
					this.textFieldPromPermDtoPorCantMinimoAlta.setEnabled(false);
					this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setEnabled(false);
					this.textFieldPromPermDtoPorCantMinimoAlta.setText("0");
					this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("0");
					this.btnPromPermAlta.setEnabled(true);
				}
			}else if(source.equals(this.comboBoxPromPermDtoPorCantModif)) {
				if(this.comboBoxPromPermDtoPorCantModif.getSelectedItem().equals("Si")) {
					this.textFieldPromPermDtoPorCantMinimoModif.setEnabled(true);
					this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setEnabled(true);
					this.textFieldPromPermDtoPorCantMinimoModif.setText("");
					this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setText("");
					this.btnPromPermModif.setEnabled(false);
				}else {
					this.textFieldPromPermDtoPorCantMinimoModif.setEnabled(false);
					this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setEnabled(false);
					this.textFieldPromPermDtoPorCantMinimoModif.setText("0");
					this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setText("0");
					this.btnPromPermModif.setEnabled(true);
				}
			}
			
		}
	}
	
	/*if(this.comboBoxPromPermDtoPorCantAlta.getSelectedItem().equals("Si")) {
				this.textFieldPromPermDtoPorCantMinimoAlta.setEnabled(true);
				this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setEnabled(true);
				this.textFieldPromPermDtoPorCantMinimoAlta.setText("");
				this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("");
				this.btnPromPermAlta.setEnabled(false);
			}else {
				this.textFieldPromPermDtoPorCantMinimoAlta.setEnabled(false);
				this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setEnabled(false);
				this.textFieldPromPermDtoPorCantMinimoAlta.setText("0");
				this.textFieldPromPermDtoPorCantPrecioUnitarioAlta.setText("0");
				this.btnPromPermAlta.setEnabled(true);
			}
		else if(e.getStateChange() == this.comboBoxPromPermDtoPorCantModif.getSelectedIndex())
			if(this.comboBoxPromPermDtoPorCantModif.getSelectedItem().equals("Si")) {
				this.textFieldPromPermDtoPorCantMinimoModif.setEnabled(true);
				this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setEnabled(true);
				this.textFieldPromPermDtoPorCantMinimoModif.setText("");
				this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setText("");
				this.btnPromPermModif.setEnabled(false);
			}else {
				this.textFieldPromPermDtoPorCantMinimoModif.setEnabled(false);
				this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setEnabled(false);
				this.textFieldPromPermDtoPorCantMinimoModif.setText("0");
				this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setText("0");
				this.btnPromPermModif.setEnabled(true);
			}
	*/

	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public String getTextFieldNombreLocal() {
		return textFieldNombreLocal.getText();
	}

	public void setLblNombreLocalGrande(String nombreLocalGrande) {
		this.lblNombreLocalGrande.setText(nombreLocalGrande);
	}
	
	public String getTextFieldLoginUsuario() {
		return textFieldLoginUsuario.getText();
	}

	public void setTextFieldLoginUsuario(String textFieldLoginUsuario) {
		this.textFieldLoginUsuario.setText(textFieldLoginUsuario);;
	}

	public String getTextFieldLoginContrasenia() {
		return textFieldLoginContrasenia.getText();
	}

	public void setTextFieldLoginContrasenia(String textFieldLoginContrasenia) {
		this.textFieldLoginContrasenia.setText(textFieldLoginContrasenia);
	}
	
	
	public String getTextFieldOperarioUsuarioAlta() {
		return textFieldOperarioUsuarioAlta.getText();
	}

	public void setTextFieldOperarioUsuarioAlta(JTextField textFieldOperarioUsuarioAlta) {
		this.textFieldOperarioUsuarioAlta = textFieldOperarioUsuarioAlta;
	}

	public String getTextFieldOperarioContraseniaAlta() {
		return textFieldOperarioContraseniaAlta.getText();
	}

	public void setTextFieldOperarioContraseniaAlta(JTextField textFieldOperarioContraseniaAlta) {
		this.textFieldOperarioContraseniaAlta = textFieldOperarioContraseniaAlta;
	}

	public String getTextFieldOperarioNyAAlta() {
		return textFieldOperarioNyAAlta.getText();
	}

	public void setTextFieldOperarioNyAAlta(JTextField textFieldOperarioNyAAlta) {
		this.textFieldOperarioNyAAlta = textFieldOperarioNyAAlta;
	}

	public String getTextFieldOperarioUsuarioModif() {
		return textFieldOperarioUsuarioModif.getText();
	}

	public void setTextFieldOperarioUsuarioModif(String textFieldOperarioUsuarioModif) {
		this.textFieldOperarioUsuarioModif.setText(textFieldOperarioUsuarioModif);;
	}

	public String getTextFieldOperarioContraseniaModif() {
		return textFieldOperarioContraseniaModif.getText();
	}

	public void setTextFieldOperarioContraseniaModif(String textFieldOperarioContraseniaModif) {
		this.textFieldOperarioContraseniaModif.setText(textFieldOperarioContraseniaModif);;
	}

	public String getTextFieldOperarioNyAModif() {
		return textFieldOperarioNyAModif.getText();
	}

	public void setTextFieldOperarioNyAModif(String textFieldOperarioNyAModif) {
		this.textFieldOperarioNyAModif.setText(textFieldOperarioNyAModif);;
	}

	public String getComboBoxOperarioEstadoModif() {
		return (String) comboBoxOperarioEstadoModif.getSelectedItem();
	}

	public void setComboBoxOperarioEstadoModif(String comboBoxOperarioEstadoModif) {
		this.comboBoxOperarioEstadoModif.setSelectedItem(comboBoxOperarioEstadoModif);
	}
	
	

	public int getTextFieldMesaNumeroAlta() {
		return Integer.parseInt(textFieldMesaNumeroAlta.getText());
	}

	public void setTextFieldMesaNumeroAlta(JTextField textFieldMesaNumeroAlta) {
		this.textFieldMesaNumeroAlta = textFieldMesaNumeroAlta;
	}

	public int getTextFieldMesaCantidadComensalesAlta() {
		return Integer.parseInt(textFieldMesaCantidadComensalesAlta.getText());
	}

	public void setTextFieldMesaCantidadComensalesAlta(JTextField textFieldMesaCantidadComensalesAlta) {
		this.textFieldMesaCantidadComensalesAlta = textFieldMesaCantidadComensalesAlta;
	}

	public int getTextFieldMesaNumeroModif() {
		return Integer.parseInt(textFieldMesaNumeroModif.getText());
	}

	public void setTextFieldMesaNumeroModif(int textFieldMesaNumeroModif) {
		this.textFieldMesaNumeroModif.setText(Integer.toString(textFieldMesaNumeroModif));
	}

	public int getTextFieldMesaCantidadComensalesModif() {
		return Integer.parseInt(textFieldMesaCantidadComensalesModif.getText());
	}

	public void setTextFieldMesaCantidadComensalesModif(int textFieldMesaCantidadComensalesModif) {
		this.textFieldMesaCantidadComensalesModif.setText(Integer.toString(textFieldMesaCantidadComensalesModif));
	}

	
	public String getComboBoxPromPermDiasAlta() {
		return (String) comboBoxPromPermDiasAlta.getSelectedItem();
	}

	public void setComboBoxPromPermDiasAlta(JComboBox comboBoxPromPermDiasAlta) {
		this.comboBoxPromPermDiasAlta = comboBoxPromPermDiasAlta;
	}

	public String getComboBoxPromPermDosPorUnoAlta() {
		return (String) comboBoxPromPermDosPorUnoAlta.getSelectedItem();
	}

	public void setComboBoxPromPermDosPorUnoAlta(JComboBox comboBoxPromPermDosPorUnoAlta) {
		this.comboBoxPromPermDosPorUnoAlta = comboBoxPromPermDosPorUnoAlta;
	}

	public String getComboBoxPromPermDtoPorCantAlta() {
		return (String) comboBoxPromPermDtoPorCantAlta.getSelectedItem();
	}

	public void setComboBoxPromPermDtoPorCantAlta(JComboBox comboBoxPromPermDtoPorCantAlta) {
		this.comboBoxPromPermDtoPorCantAlta = comboBoxPromPermDtoPorCantAlta;
	}

	public int getTextFieldPromPermDtoPorCantMinimoAlta() {
		return Integer.parseInt(textFieldPromPermDtoPorCantMinimoAlta.getText());
	}

	public void setTextFieldPromPermDtoPorCantMinimoAlta(JTextField textFieldPromPermDtoPorCantMinimoAlta) {
		this.textFieldPromPermDtoPorCantMinimoAlta = textFieldPromPermDtoPorCantMinimoAlta;
	}

	public double getTextFieldPromPermDtoPorCantPrecioUnitarioAlta() {
		return Double.parseDouble(textFieldPromPermDtoPorCantPrecioUnitarioAlta.getText());
	}

	public void setTextFieldPromPermDtoPorCantPrecioUnitarioAlta(JTextField textFieldPromPermDtoPorCantPrecioUnitarioAlta) {
		this.textFieldPromPermDtoPorCantPrecioUnitarioAlta = textFieldPromPermDtoPorCantPrecioUnitarioAlta;
	}

	public String getComboBoxPromPermDiasModif() {
		return (String) comboBoxPromPermDiasModif.getSelectedItem();
	}

	public void setComboBoxPromPermDiasModif(String comboBoxPromPermDiasModif) {
		this.comboBoxPromPermDiasModif.setSelectedItem(comboBoxPromPermDiasModif);
	}

	public String getComboBoxPromPermDosPorUnoModif() {
		return (String) comboBoxPromPermDosPorUnoModif.getSelectedItem();
	}

	public void setComboBoxPromPermDosPorUnoModif(String comboBoxPromPermDosPorUnoModif) {
		this.comboBoxPromPermDosPorUnoModif.setSelectedItem(comboBoxPromPermDosPorUnoModif);
	}

	public String getComboBoxPromPermDtoPorCantModif() {
		return (String) comboBoxPromPermDtoPorCantModif.getSelectedItem();
	}

	public void setComboBoxPromPermDtoPorCantModif(String comboBoxPromPermDtoPorCantModif) {
		this.comboBoxPromPermDtoPorCantModif.setSelectedItem(comboBoxPromPermDtoPorCantModif);
	}

	public int getTextFieldPromPermDtoPorCantMinimoModif() {
		return Integer.parseInt(textFieldPromPermDtoPorCantMinimoModif.getText());
	}

	public void setTextFieldPromPermDtoPorCantMinimoModif(int textFieldPromPermDtoPorCantMinimoModif) {
		this.textFieldPromPermDtoPorCantMinimoModif.setText(Integer.toString(textFieldPromPermDtoPorCantMinimoModif));
	}

	public double getTextFieldPromPermDtoPorCantPrecioUnitarioModif() {
		return Double.parseDouble(textFieldPromPermDtoPorCantPrecioUnitarioModif.getText());
	}

	public void setTextFieldPromPermDtoPorCantPrecioUnitarioModif(double textFieldPromPermDtoPorCantPrecioUnitarioModif) {
		this.textFieldPromPermDtoPorCantPrecioUnitarioModif.setText(Double.toString(textFieldPromPermDtoPorCantPrecioUnitarioModif));
	}

	public String getComboBoxPromPermProductoAlta() {
		return (String) comboBoxPromPermProductoAlta.getSelectedItem();
	}

	public void setComboBoxPromPermProductoAlta(JComboBox comboBoxPromPermProductoAlta) {
		this.comboBoxPromPermProductoAlta = comboBoxPromPermProductoAlta;
	}

	public String getComboBoxPromPermProductoModif() {
		return (String) comboBoxPromPermProductoModif.getSelectedItem();
	}

	public void setComboBoxPromPermProductoModif(String comboBoxPromPermProductoModif) {
		this.comboBoxPromPermProductoModif.setSelectedItem(comboBoxPromPermProductoModif);
	}

	public String getComboBoxPromPermEstadoModif() {
		return (String) comboBoxPromPermEstadoModif.getSelectedItem();
	}

	public void setComboBoxPromPermEstadoModif(String comboBoxPromPermEstadoModif) {
		this.comboBoxPromPermEstadoModif.setSelectedItem(comboBoxPromPermEstadoModif);
	}
	

	public String getComboBoxPromTempDiasAlta() {
		return (String) comboBoxPromTempDiasAlta.getSelectedItem();
	}

	public void setComboBoxPromTempDiasAlta(JComboBox comboBoxPromTempDiasAlta) {
		this.comboBoxPromTempDiasAlta = comboBoxPromTempDiasAlta;
	}

	public int getTextFieldPromTempPorcentajeDtoAlta() {
		return Integer.parseInt(textFieldPromTempPorcentajeDtoAlta.getText());
	}

	public void setTextFieldPromTempPorcentajeDtoAlta(JTextField textFieldPromTempPorcentajeDtoAlta) {
		this.textFieldPromTempPorcentajeDtoAlta = textFieldPromTempPorcentajeDtoAlta;
	}

	public String getComboBoxPromTempAcumulableAlta() {
		return (String) comboBoxPromTempAcumulableAlta.getSelectedItem();
	}

	public void setComboBoxPromTempAcumulableAlta(JComboBox comboBoxPromTempAcumulableAlta) {
		this.comboBoxPromTempAcumulableAlta = comboBoxPromTempAcumulableAlta;
	}

	public String getComboBoxPromTempMetodoPagoAlta() {
		return (String) comboBoxPromTempMetodoPagoAlta.getSelectedItem();
	}

	public void setComboBoxPromTempMetodoPagoAlta(JComboBox comboBoxPromTempMetodoPagoAlta) {
		this.comboBoxPromTempMetodoPagoAlta = comboBoxPromTempMetodoPagoAlta;
	}

	public String getTextFieldPromTempNombreAlta() {
		return textFieldPromTempNombreAlta.getText();
	}

	public void setTextFieldPromTempNombreAlta(JTextField textFieldPromTempNombreAlta) {
		this.textFieldPromTempNombreAlta = textFieldPromTempNombreAlta;
	}

	public String getComboBoxPromTempDiasModif() {
		return (String) comboBoxPromTempDiasModif.getSelectedItem();
	}

	public void setComboBoxPromTempDiasModif(String comboBoxPromTempDiasModif) {
		this.comboBoxPromTempDiasModif.setSelectedItem(comboBoxPromTempDiasModif);
	}

	public int getTextFieldPromTempPorcentajeDtoModif() {
		return Integer.parseInt(textFieldPromTempPorcentajeDtoModif.getText());
	}

	public void setTextFieldPromTempPorcentajeDtoModif(int textFieldPromTempPorcentajeDtoModif) {
		this.textFieldPromTempPorcentajeDtoModif.setText(Integer.toString(textFieldPromTempPorcentajeDtoModif));
	}

	public String getComboBoxPromTempAcumulableModif() {
		return (String) comboBoxPromTempAcumulableModif.getSelectedItem();
	}

	public void setComboBoxPromTempAcumulableModif(String comboBoxPromTempAcumulableModif) {
		this.comboBoxPromTempAcumulableModif.setSelectedItem(comboBoxPromTempAcumulableModif);
	}

	public String getComboBoxPromTempMetodoPagoModif() {
		return (String) comboBoxPromTempMetodoPagoModif.getSelectedItem();
	}

	public void setComboBoxPromTempMetodoPagoModif(String comboBoxPromTempMetodoPagoModif) {
		this.comboBoxPromTempMetodoPagoModif.setSelectedItem(comboBoxPromTempMetodoPagoModif);
	}

	public String getTextFieldPromTempNombreModif() {
		return (String) textFieldPromTempNombreModif.getText();
	}

	public void setTextFieldPromTempNombreModif(String textFieldPromTempNombreModif) {
		this.textFieldPromTempNombreModif.setText(textFieldPromTempNombreModif);
	}

	public String getComboBoxPromTempEstadoModif() {
		return (String) comboBoxPromTempEstadoModif.getSelectedItem();
	}

	public void setComboBoxPromTempEstadoModif(String comboBoxPromTempEstadoModif) {
		this.comboBoxPromTempEstadoModif.setSelectedItem(comboBoxPromTempEstadoModif);
	}
	
	
	public String getTextFieldMozoNyAAlta() {
		return textFieldMozoNyAAlta.getText();
	}

	public void setTextFieldMozoNyAAlta(JTextField textFieldMozoNyAAlta) {
		this.textFieldMozoNyAAlta = textFieldMozoNyAAlta;
	}

	public int getTextFieldMozoHijosAlta() {
		return Integer.parseInt(textFieldMozoHijosAlta.getText());
	}

	public void setTextFieldMozoHijosAlta(JTextField textFieldMozoHijosAlta) {
		this.textFieldMozoHijosAlta = textFieldMozoHijosAlta;
	}

	public String getTextFieldMozoNyAModif() {
		return textFieldMozoNyAModif.getText();
	}

	public void setTextFieldMozoNyAModif(String textFieldMozoNyAModif) {
		this.textFieldMozoNyAModif.setText(textFieldMozoNyAModif);
	}

	public int getTextFieldMozoHijosModif() {
		return Integer.parseInt(textFieldMozoHijosModif.getText());
	}

	public void setTextFieldMozoHijosModif(int textFieldMozoHijosModif) {
		this.textFieldMozoHijosModif.setText(Integer.toString(textFieldMozoHijosModif));
	}

	public LocalDate getFormattedTextFieldFechaNacimientoAlta() {
		return LocalDate.parse(formattedTextFieldFechaNacimientoAlta.getText());
	}

	public void setFormattedTextFieldFechaNacimientoAlta(JFormattedTextField formattedTextFieldFechaNacimientoAlta) {
		this.formattedTextFieldFechaNacimientoAlta = formattedTextFieldFechaNacimientoAlta;
	}

	public LocalDate getFormattedTextFieldFechaNacimientoModif() {
		return  LocalDate.parse(formattedTextFieldFechaNacimientoModif.getText());
	}

	public void setFormattedTextFieldFechaNacimientoModif(LocalDate formattedTextFieldFechaNacimientoModif) {
		this.formattedTextFieldFechaNacimientoModif.setText(formattedTextFieldFechaNacimientoModif.toString());
	}
	
	
	public String getTextFieldProductoNombreAlta() {
		return textFieldProductoNombreAlta.getText();
	}

	public void setTextFieldProductoNombreAlta(JTextField textFieldProductoNombreAlta) {
		this.textFieldProductoNombreAlta = textFieldProductoNombreAlta;
	}

	public double getTextFieldProductoPrecioCostoAlta() {
		return Double.parseDouble(textFieldProductoPrecioCostoAlta.getText());
	}

	public void setTextFieldProductoPrecioCostoAlta(JTextField textFieldProductoPrecioCostoAlta) {
		this.textFieldProductoPrecioCostoAlta = textFieldProductoPrecioCostoAlta;
	}

	public double getTextFieldProductoPrecioVentaAlta() {
		return Double.parseDouble(textFieldProductoPrecioVentaAlta.getText());
	}

	public void setTextFieldProductoPrecioVentaAlta(JTextField textFieldProductoPrecioVentaAlta) {
		this.textFieldProductoPrecioVentaAlta = textFieldProductoPrecioVentaAlta;
	}

	public int getTextFieldProductoStockInicialAlta() {
		return Integer.parseInt(textFieldProductoStockInicialAlta.getText());
	}

	public void setTextFieldProductoStockInicialAlta(JTextField textFieldProductoStockInicialAlta) {
		this.textFieldProductoStockInicialAlta = textFieldProductoStockInicialAlta;
	}

	public String getTextFieldProductoNombreModif() {
		return textFieldProductoNombreModif.getText();
	}

	public void setTextFieldProductoNombreModif(String textFieldProductoNombreModif) {
		this.textFieldProductoNombreModif.setText(textFieldProductoNombreModif);
	}

	public double getTextFieldProductoPrecioCostoModif() {
		return Double.parseDouble(textFieldProductoPrecioCostoModif.getText());
	}

	public void setTextFieldProductoPrecioCostoModif(double textFieldProductoPrecioCostoModif) {
		this.textFieldProductoPrecioCostoModif.setText(Double.toString(textFieldProductoPrecioCostoModif));
	}

	public double getTextFieldProductoPrecioVentaModif() {
		return Double.parseDouble(textFieldProductoPrecioVentaModif.getText());
	}

	public void setTextFieldProductoPrecioVentaModif(double textFieldProductoPrecioVentaModif) {
		this.textFieldProductoPrecioVentaModif.setText(Double.toString(textFieldProductoPrecioVentaModif));
	}

	public int getTextFieldProductoStockInicialModif() {
		return Integer.parseInt(textFieldProductoStockInicialModif.getText());
	}

	public void setTextFieldProductoStockInicialModif(int textFieldProductoStockInicialModif) {
		this.textFieldProductoStockInicialModif.setText(Integer.toString(textFieldProductoStockInicialModif));
	}

	public int getTextFieldProductoNuevoStock() {
		return Integer.parseInt(textFieldProductoNuevoStock.getText());
	}

	public void setTextFieldProductoNuevoStock(int textFieldProductoNuevoStock) {
		this.textFieldProductoNuevoStock.setText(Integer.toString(textFieldProductoNuevoStock));
	}
	
	
	public boolean getRdbtnEstadoActivo() {
		return rdbtnEstadoActivo.isSelected();
	}

	public boolean getRdbtnEstadoAusente() {
		return rdbtnEstadoAusente.isSelected();
	}

	public boolean getRdbtnEstadoDeFranco() {
		return rdbtnEstadoDeFranco.isSelected();
	}
	

	public Operario getSelectedOperario() {
		return (Operario) this.listOperarios.getSelectedValue();
	}
	
	public Mesa getSelectedMesa() {
		return (Mesa) this.listMesas.getSelectedValue();
	}
	
	public Mozo getSelectedMozo() {
		return (Mozo) this.listMozos.getSelectedValue();
	}
	
	public Producto getSelectedProducto() {
		return (Producto) this.listProductos.getSelectedValue();
	}
	
	public PromocionPermanente getSelectedPromPerm() {
		return (PromocionPermanente) this.listPromPerm.getSelectedValue();
	}
	
	public PromocionTemporal getSelectedPromTemp() {
		return (PromocionTemporal) this.listPromTemp.getSelectedValue();
	}
	
	public Mozo getSelectedMozoEstado() {
		return (Mozo) this.listMozosEstados.getSelectedValue();
	}
	
	public Mozo getSelectedMozoActivo() {
		return (Mozo) this.listMozosActivos.getSelectedValue();
	}
	
	public Mesa getSelectedMesaAsignable() {
		return (Mesa) this.listMesasAsignables.getSelectedValue();
	}
	
	
	
	public void logueoAdmin() {
		this.textFieldLoginUsuario.setText("");
		this.textFieldLoginContrasenia.setText("");
		this.btnLogin.setEnabled(false);
		this.btnLogout.setEnabled(true);
		this.btnGuardarSistema.setEnabled(false);
		this.textFieldNombreLocal.setEnabled(false);
		this.btnRecuperarSistema.setEnabled(false);
		this.tabbedPane.setEnabledAt(1, true);
		this.tabbedPane.setEnabledAt(2, true);
		this.tabbedPane.setEnabledAt(3, true);
		this.tabbedPane.setEnabledAt(4, true);
		this.tabbedPane.setEnabledAt(5, true);
		actualizar();
	}
	
	public void logueoOperario() {
		this.textFieldLoginUsuario.setText("");
		this.textFieldLoginContrasenia.setText("");
		this.btnLogin.setEnabled(false);
		this.btnLogout.setEnabled(true);
		this.btnGuardarSistema.setEnabled(false);
		this.textFieldNombreLocal.setEnabled(false);
		this.btnRecuperarSistema.setEnabled(false);
		this.tabbedPane.setEnabledAt(1, true);
		actualizar();
	}
	
	public void logout() {
		this.btnGuardarSistema.setEnabled(true);
		this.textFieldNombreLocal.setEnabled(true);
		this.btnRecuperarSistema.setEnabled(true);
		this.tabbedPane.setEnabledAt(1, false);
		this.tabbedPane.setEnabledAt(2, false);
		this.tabbedPane.setEnabledAt(3, false);
		this.tabbedPane.setEnabledAt(4, false);
		this.tabbedPane.setEnabledAt(5, false);
	}
	
	public String passwordNueva() {
		return JOptionPane.showInputDialog("Introduzca contraseña nueva: ");
	}
	
	public String NyANueva() {
		return JOptionPane.showInputDialog("Introduzca nombre y apellido: ");
	}
	
	public void actualizarListaOperarios() {
		this.modelListOperarios.clear();
		ArrayList<Operario> it = c.recuperaListaOperarios();
		for(int i=0;i<it.size();i++) {
			this.modelListOperarios.addElement(it.get(i));
		}
	}
	
	public void actualizarListaMesas() {
		this.modelListMesas.clear();
		ArrayList<Mesa> it = c.recuperaListaMesas();
		for(int i=0;i<it.size();i++) {
			this.modelListMesas.addElement(it.get(i));
		}
	}
	
	public void actualizarListaPromPerm() {
		this.modelListPromPerm.clear();
		ArrayList<PromocionPermanente> it = c.recuperaListaPromPerm();
		for(int i=0;i<it.size();i++) {
			this.modelListPromPerm.addElement(it.get(i));
		}
	}
	
	public void actualizarListaPromTemp() {
		this.modelListPromTemp.clear();
		ArrayList<PromocionTemporal> it = c.recuperaListaPromTemp();
		for(int i=0;i<it.size();i++) {
			this.modelListPromTemp.addElement(it.get(i));
		}
	}
	
	public void actualizarListaMozos() {
		this.modelListMozos.clear();
		ArrayList<Mozo> it = c.recuperaListaMozos();
		for(int i=0;i<it.size();i++) {
			this.modelListMozos.addElement(it.get(i));
		}
	}
	
	public void actualizarListaProductos() {
		this.modelListProductos.clear();
		ArrayList<Producto> it = c.recuperaListaProductos();
		for(int i=0;i<it.size();i++) {
			this.modelListProductos.addElement(it.get(i));
		}
	}
	
	public void actualizarComboBoxProductosAlta() {
		this.comboBoxPromPermProductoAlta.removeAllItems();
		ArrayList<Producto> it = c.recuperaListaProductos();
		for(int i=0;i<it.size();i++) 
			this.comboBoxPromPermProductoAlta.addItem(it.get(i).getNombre());
	}
	
	public void actualizarComboBoxProductosModif() {
		this.comboBoxPromPermProductoModif.removeAllItems();
		ArrayList<Producto> it = c.recuperaListaProductos();
		for(int i=0;i<it.size();i++) 
			this.comboBoxPromPermProductoModif.addItem(it.get(i).getNombre());
	}
	
	public void actualizarListaMozosEstados() {
		this.modelListMozosEstados.clear();
		ArrayList<Mozo> it = c.recuperaListaMozos();
		for(int i=0;i<it.size();i++) {
			this.modelListMozosEstados.addElement(it.get(i));
		}
	}
	
	public void actualizarListaMozosActivos() {
		this.modelListMozosActivos.clear();
		ArrayList<Mozo> it = c.recuperaListaMozos();
		for(int i=0;i<it.size();i++) {
			if(c.mozoActivo(it.get(i)))
				this.modelListMozosActivos.addElement(it.get(i));
		}
	}
	
	public void actualizarListaMesasAsignables() {
		this.modelListMesasAsignables.clear();
		ArrayList<Mesa> it = c.recuperaListaMesas();
		for(int i=0;i<it.size();i++) {
			this.modelListMesasAsignables.addElement(it.get(i));
		}
	}
	
	public void actualizar() {
		actualizarListaOperarios();
		actualizarListaMesas();
		actualizarListaMesasAsignables();
		actualizarListaPromPerm();
		actualizarListaPromTemp();
		actualizarListaMozos();
		actualizarListaMozosEstados();
		actualizarListaMozosActivos();
		actualizarListaProductos();
		actualizarComboBoxProductosAlta();
		actualizarComboBoxProductosModif();
	}
}
	
