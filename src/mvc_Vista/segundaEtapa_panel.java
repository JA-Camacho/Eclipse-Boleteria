package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mvc_Controlador.logica_negocio;
import mvc_Modelo.Boletos;
import mvc_Modelo.Eventos;
import mvc_Modelo.Sala_cine;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class segundaEtapa_panel extends JFrame {
	public JTextField txt_cedula;
	public JTextField txt_nombre;
	public JTextField txt_telefono;
	public JTextField txt_adultos;
	public JTextField txt_ninos;
	public JLabel lbl_tipo;
	public JLabel lbl_titulo;
	public JTextArea txt_direccion;
	private logica_negocio ln;
	public JLabel lbl_ninos;
	private Sala_cine sc;
	/**
	 * Create the panel.
	 */
	public segundaEtapa_panel(Eventos event, String horario) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("DATOS");
		segundaEtapa_panel sp = this;
		setResizable(false);
		setPreferredSize(new Dimension(1024, 768));
		setMinimumSize(new Dimension(1024, 768));
		getContentPane().setLayout(null);

		JPanel pn_detalleCliente = new JPanel();
		pn_detalleCliente.setBackground(new Color(240, 248, 255));
		pn_detalleCliente.setBorder(new TitledBorder(new LineBorder(new Color(176, 196, 222), 3, true), "  DETALLE CLIENTE    ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn_detalleCliente.setBounds(10, 115, 1004, 347);
		getContentPane().add(pn_detalleCliente);
		pn_detalleCliente.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("C\u00E9dula: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(25, 41, 84, 20);
		pn_detalleCliente.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(25, 82, 84, 20);
		pn_detalleCliente.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(25, 122, 84, 20);
		pn_detalleCliente.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(25, 166, 84, 20);
		pn_detalleCliente.add(lblNewLabel_1_3);

		txt_cedula = new JTextField();
		txt_cedula.setColumns(10);
		txt_cedula.setBounds(111, 41, 860, 25);
		pn_detalleCliente.add(txt_cedula);

		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(111, 84, 860, 25);
		pn_detalleCliente.add(txt_nombre);

		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(111, 124, 860, 25);
		pn_detalleCliente.add(txt_telefono);

		txt_direccion = new JTextArea();
		txt_direccion.setBounds(111, 166, 860, 139);
		pn_detalleCliente.add(txt_direccion);

		JPanel pn_valoresPagar = new JPanel();
		pn_valoresPagar.setBackground(new Color(230, 230, 250));
		pn_valoresPagar.setLayout(null);
		pn_valoresPagar.setBorder(new TitledBorder(new LineBorder(new Color(176, 196, 222), 3, true), "BOLETOS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn_valoresPagar.setBounds(10, 473, 1004, 216);
		getContentPane().add(pn_valoresPagar);

		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.setBackground(new Color(144, 238, 144));
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catalogo ct = new Catalogo(event.getTipoEvento());
				dispose();
				ct.setBounds(0, 0, 1024, 768);
				ct.setVisible(true);
			}
		});
		btn_cancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_cancelar.setBounds(37, 161, 137, 23);
		pn_valoresPagar.add(btn_cancelar);

		JButton btn_siguiente = new JButton("SIGUIENTE");
		btn_siguiente.setBackground(new Color(255, 0, 0));
		btn_siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(sc.getCantidad() >= Integer.parseInt(txt_adultos.getText()) + Integer.parseInt(txt_ninos.getText())) {

						Sala im = new Sala(event, ln.enviarCliente(sp), ln.enviarBoleto(sp), horario);
						im.setVisible(true);
						dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Cantidad de salas no disponible");
				} catch (NumberFormatException exception) {
					JOptionPane.showMessageDialog(null, "Debe ingresar al menos un boleto");
				}
			}
		});
		btn_siguiente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_siguiente.setBounds(838, 161, 137, 23);
		pn_valoresPagar.add(btn_siguiente);

		JLabel lblNewLabel_1_4 = new JLabel("N\u00FAmero Boletos Adultos:");
		lblNewLabel_1_4.setBounds(240, 45, 191, 20);
		pn_valoresPagar.add(lblNewLabel_1_4);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));

		lbl_ninos = new JLabel("N\u00FAmero Boletos Ni\u00F1os:");
		lbl_ninos.setBounds(240, 105, 191, 20);
		pn_valoresPagar.add(lbl_ninos);
		lbl_ninos.setFont(new Font("Tahoma", Font.PLAIN, 16));

		txt_adultos = new JTextField();
		txt_adultos.setBounds(441, 45, 252, 25);
		pn_valoresPagar.add(txt_adultos);
		txt_adultos.setColumns(10);

		txt_ninos = new JTextField();
		txt_ninos.setText("0");
		txt_ninos.setBounds(441, 105, 252, 25);
		pn_valoresPagar.add(txt_ninos);
		txt_ninos.setColumns(10);

		JPanel evento = new JPanel();
		evento.setBackground(new Color(255, 245, 238));
		evento.setBorder(new TitledBorder(null, "EVENTO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		evento.setBounds(10, 11, 1004, 93);
		getContentPane().add(evento);
		evento.setLayout(null);

		lbl_tipo = new JLabel(event.getTipoEvento());
		lbl_tipo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_tipo.setBounds(10, 11, 984, 27);
		evento.add(lbl_tipo);

		lbl_titulo = new JLabel(event.getTitulo());
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_titulo.setBounds(10, 49, 984, 27);
		evento.add(lbl_titulo);
		ln = new logica_negocio();
		ln.comprobarCensura(sp, event);
		sc = new Sala_cine(Integer.parseInt(event.getSala()), horario);
	}
}
