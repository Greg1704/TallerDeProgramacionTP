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

public class Ventanal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelOperario;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panelOperarioAlta;
	private JPanel panelOperarioBaja;
	private JPanel panelOperarioModificación;
	private JPanel panelOperarioCreacion;
	private JTextField textFieldOperarioUsuarioAlta;
	private JLabel lblOperarioUsuarioAlta;
	private JTextField textFieldOperarioContraseniaAlta;
	private JLabel lbltextFieldOperarioContraseniaAlta;
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
	private JTextField textFieldOperarioEstadoModif;
	private JButton btnNewButton;

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
		
		this.panelOperario = new JPanel();
		this.tabbedPane.addTab("Operario", null, this.panelOperario, null);
		this.panelOperario.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelOperarioAlta = new JPanel();
		this.panelOperario.add(this.panelOperarioAlta);
		this.panelOperarioAlta.setLayout(null);
		
		this.panelOperarioCreacion = new JPanel();
		this.panelOperarioCreacion.setBorder(new TitledBorder(null, "Alta de Operario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOperarioCreacion.setBounds(36, 36, 364, 278);
		this.panelOperarioAlta.add(this.panelOperarioCreacion);
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
		
		this.lbltextFieldOperarioContraseniaAlta = new JLabel("Contraseña");
		this.lbltextFieldOperarioContraseniaAlta.setBounds(44, 98, 61, 14);
		this.panelOperarioCreacion.add(this.lbltextFieldOperarioContraseniaAlta);
		
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
		
		this.panelOperarioBaja = new JPanel();
		this.panelOperario.add(this.panelOperarioBaja);
		this.panelOperarioBaja.setLayout(null);
		
		this.listOperarios = new JList();
		this.listOperarios.setBorder(new TitledBorder(null, "Lista de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listOperarios.setBounds(43, 36, 364, 280);
		this.panelOperarioBaja.add(this.listOperarios);
		
		this.btnOperarioBaja = new JButton("Eliminar");
		this.btnOperarioBaja.setBounds(167, 327, 89, 23);
		this.panelOperarioBaja.add(this.btnOperarioBaja);
		
		this.panelOperarioModificación = new JPanel();
		this.panelOperario.add(this.panelOperarioModificación);
		this.panelOperarioModificación.setLayout(null);
		
		this.panelOperarioModif = new JPanel();
		this.panelOperarioModif.setBorder(new TitledBorder(null, "Modificaci\u00F3n de Operarios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelOperarioModif.setBounds(21, 36, 402, 278);
		this.panelOperarioModificación.add(this.panelOperarioModif);
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
		
		this.textFieldOperarioEstadoModif = new JTextField();
		this.textFieldOperarioEstadoModif.setColumns(10);
		this.textFieldOperarioEstadoModif.setBounds(216, 152, 122, 20);
		this.panelOperarioModif.add(this.textFieldOperarioEstadoModif);
		
		this.btnNewButton = new JButton("Modificar");
		this.btnNewButton.setBounds(156, 217, 89, 23);
		this.panelOperarioModif.add(this.btnNewButton);
		
		this.panel_1 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_1, null);
		
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
