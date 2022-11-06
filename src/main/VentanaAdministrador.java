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
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class VentanaAdministrador extends JFrame implements ActionListener {

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
	private JLabel lblOperarioEstadoModif;
	private JTextField textFieldOperarioContraseniaModif;
	private JTextField textFieldOperarioNyAModif;
	private JComboBox comboBoxOperarioEstadoModif;
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
	private JLabel lblMesaEstadoModif;
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
	private JLabel lblMozoEstadoModif;
	private JComboBox comboBoxMozoEstadoModif;
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
	private JList list;
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
	private JTextField textFieldUsuarioContrasenia;
	private JButton btnLogin;
	private JPanel panelSerializacion;
	private JButton btnRecuperarSistema;
	private JButton btnNuevoSistema;
	private JButton btnGuardarSistema;
	private JButton btnLogout;
	private JPanel panel;
	private JLabel lblNombreLocal;
	private JTextField textFieldNombreLocal;

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
		
		this.textFieldUsuarioContrasenia = new JTextField();
		this.textFieldUsuarioContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.textFieldUsuarioContrasenia.setColumns(10);
		this.textFieldUsuarioContrasenia.setBounds(187, 79, 271, 20);
		this.panelLogin.add(this.textFieldUsuarioContrasenia);
		
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
		
		this.list = new JList();
		this.scrollPaneProductosPedidos.setViewportView(this.list);
		
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
		this.lblOperarioContraseniaModif.setBounds(65, 76, 102, 14);
		this.panelOperarioModif.add(this.lblOperarioContraseniaModif);
		
		this.lblOperarioNyAModif = new JLabel("Nombre y Apellido");
		this.lblOperarioNyAModif.setBounds(65, 115, 122, 17);
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
		
		this.btnOperarioModificacion = new JButton("Modificar");
		this.btnOperarioModificacion.setBounds(156, 217, 89, 23);
		this.panelOperarioModif.add(this.btnOperarioModificacion);
		
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
		this.textFieldMesaCantidadComensalesAlta.setBounds(183, 131, 122, 20);
		this.panelMesaCreacion.add(this.textFieldMesaCantidadComensalesAlta);
		
		this.lblMesaCantidadComensalesAlta = new JLabel("Cantidad de comensales");
		this.lblMesaCantidadComensalesAlta.setBounds(22, 134, 151, 14);
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
		
		this.comboBoxPromPermDosPorUnoAltaModif = new JComboBox();
		this.comboBoxPromPermDosPorUnoAltaModif.setBounds(183, 114, 122, 20);
		this.panelPromPermModif.add(this.comboBoxPromPermDosPorUnoAltaModif);
		
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
		
		this.lblMozoFechaDeNacimientoAlta = new JLabel("Fecha de nacimiento");
		this.lblMozoFechaDeNacimientoAlta.setBounds(10, 81, 130, 14);
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
		
		this.lblMozoFechaDeNacimientoModif = new JLabel("Fecha de nacimiento");
		this.lblMozoFechaDeNacimientoModif.setBounds(10, 81, 130, 14);
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
		
		this.lblMozoEstadoModif = new JLabel("Estado");
		this.lblMozoEstadoModif.setBounds(10, 174, 113, 14);
		this.panelMozoModif.add(this.lblMozoEstadoModif);
		
		this.comboBoxMozoEstadoModif = new JComboBox();
		this.comboBoxMozoEstadoModif.setBounds(165, 170, 159, 22);
		this.panelMozoModif.add(this.comboBoxMozoEstadoModif);
		
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
		this.panelProductoModif.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modificaci\u00F3n de Producto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		/*
		this.tabbedPane.setEnabledAt(1, false);
		this.tabbedPane.setEnabledAt(2, false);
		this.tabbedPane.setEnabledAt(3, false);
		this.tabbedPane.setEnabledAt(4, false);
		this.tabbedPane.setEnabledAt(5, false);
		*/
	}
	public void actionPerformed(ActionEvent e) {
	}
}