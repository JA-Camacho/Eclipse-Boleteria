package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mvc_Controlador.logica_negocio;
import mvc_Modelo.Boletos;
import mvc_Modelo.Cliente;
import mvc_Modelo.Eventos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_factura extends JFrame {
	public JLabel lbl_cantAdultos;
	public JLabel lbl_cantNinos;
	public JLabel lbl_numsala;
	public JLabel lbl_duracion;
	public JLabel lbl_asientos;
	public JLabel lbl_nombreCliente;
	public JLabel lbl_CedulaCliente;
	public JLabel lbl_telefonoCliente;
	public JLabel lbl_DireccionCliente;
	public JLabel lbl_valortotalAdultos;
	public JLabel lbl_valortotalNiños;
	public JLabel lbl_subtotal;
	public JLabel lbl_iva;
	public JLabel lbl_valortotalapagar;
	public JLabel lbl_date;
	public JLabel lbl_horario;
	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_factura(Cliente client, Eventos event, String horario, Boletos boleto) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("FACTURA");
		setResizable(false);
		getContentPane().setBackground(new Color(189, 183, 107));
		setBounds(new Rectangle(0, 0, 1024, 768));
		setBackground(new Color(250, 240, 230));
		getContentPane().setLayout(null);
		
		JPanel pn_datoscliente = new JPanel();
		pn_datoscliente.setBackground(new Color(253, 245, 230));
		pn_datoscliente.setBorder(new TitledBorder(null, "CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn_datoscliente.setBounds(10, 11, 1003, 227);
		getContentPane().add(pn_datoscliente);
		pn_datoscliente.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 28, 79, 31);
		pn_datoscliente.add(lblNewLabel);
		
		JLabel lblCedula = new JLabel("CEDULA: ");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCedula.setBounds(10, 57, 79, 31);
		pn_datoscliente.add(lblCedula);
		
		JLabel lblTelefono = new JLabel("TELEFONO: ");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 89, 79, 31);
		pn_datoscliente.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDireccion.setBounds(10, 119, 89, 31);
		pn_datoscliente.add(lblDireccion);
		
		lbl_nombreCliente = new JLabel("");
		lbl_nombreCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_nombreCliente.setBounds(109, 28, 511, 31);
		pn_datoscliente.add(lbl_nombreCliente);
		
		lbl_CedulaCliente = new JLabel("");
		lbl_CedulaCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_CedulaCliente.setBounds(109, 57, 511, 31);
		pn_datoscliente.add(lbl_CedulaCliente);
		
		lbl_telefonoCliente = new JLabel("");
		lbl_telefonoCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_telefonoCliente.setBounds(109, 89, 511, 31);
		pn_datoscliente.add(lbl_telefonoCliente);
		
		lbl_DireccionCliente = new JLabel("");
		lbl_DireccionCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_DireccionCliente.setBounds(109, 119, 511, 78);
		pn_datoscliente.add(lbl_DireccionCliente);
		
		JLabel lblNewLabel_2 = new JLabel("FECHA:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(647, 80, 52, 40);
		pn_datoscliente.add(lblNewLabel_2);
		
		lbl_date = new JLabel("0");
		lbl_date.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_date.setBounds(718, 85, 179, 35);
		pn_datoscliente.add(lbl_date);
		
		JLabel lblNewLabel_1 = new JLabel("FACTURA");
		lblNewLabel_1.setBounds(769, 14, 155, 48);
		pn_datoscliente.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(253, 245, 230));
		panel_1.setBorder(new TitledBorder(null, "DETALLES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 249, 1003, 440);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("CANT. BOLETOS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 12, 125, 30);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADULTOS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(20, 52, 78, 30);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("NI\u00D1OS / 3ra EDAD");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(20, 87, 131, 30);
		panel_1.add(lblNewLabel_4_1);
		
		lbl_cantAdultos = new JLabel("    --");
		lbl_cantAdultos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_cantAdultos.setBounds(153, 47, 70, 30);
		panel_1.add(lbl_cantAdultos);
		
		lbl_cantNinos = new JLabel("  ---");
		lbl_cantNinos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_cantNinos.setBounds(153, 87, 70, 30);
		panel_1.add(lbl_cantNinos);
		
		JLabel lblNewLabel_5 = new JLabel("ASIENTOS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(241, 127, 113, 34);
		panel_1.add(lblNewLabel_5);
		
		lbl_asientos = new JLabel("Asientos: ");
		lbl_asientos.setBounds(10, 161, 601, 81);
		panel_1.add(lbl_asientos);
		
		JLabel lblNewLabel_3_1 = new JLabel("SALA N\u00B0");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 242, 85, 30);
		panel_1.add(lblNewLabel_3_1);
		
		lbl_numsala = new JLabel("----");
		lbl_numsala.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_numsala.setBounds(105, 242, 118, 30);
		panel_1.add(lbl_numsala);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("DURACION:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(10, 282, 78, 30);
		panel_1.add(lblNewLabel_3_1_1);
		
		lbl_duracion = new JLabel("---");
		lbl_duracion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_duracion.setBounds(105, 282, 118, 30);
		panel_1.add(lbl_duracion);
		
		JLabel lblNewLabel_5_1 = new JLabel("PRECIO UNIT. PELICULA");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_1.setBounds(242, 10, 164, 34);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lbl_valorunitPeliAdulto = new JLabel("4.50");
		lbl_valorunitPeliAdulto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_valorunitPeliAdulto.setBounds(284, 47, 70, 30);
		panel_1.add(lbl_valorunitPeliAdulto);
		
		JLabel lbl_valorunitpelniño = new JLabel("2.25");
		lbl_valorunitpelniño.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_valorunitpelniño.setBounds(284, 87, 70, 30);
		panel_1.add(lbl_valorunitpelniño);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("PRECIO UNIT. FUNCION DE TEATRO");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5_1_1.setBounds(479, 12, 249, 34);
		panel_1.add(lblNewLabel_5_1_1);
		
		JLabel lbl_cantboletosA_1_2 = new JLabel("12.50");
		lbl_cantboletosA_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_cantboletosA_1_2.setBounds(556, 49, 70, 30);
		panel_1.add(lbl_cantboletosA_1_2);
		
		JLabel lbl_cantboletosA_1_1_1 = new JLabel("6.25");
		lbl_cantboletosA_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_cantboletosA_1_1_1.setBounds(556, 89, 70, 30);
		panel_1.add(lbl_cantboletosA_1_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("TOTAL");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(837, 12, 64, 30);
		panel_1.add(lblNewLabel_3_1_2);
		
		lbl_valortotalAdultos = new JLabel("----");
		lbl_valortotalAdultos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_valortotalAdultos.setBounds(852, 47, 70, 30);
		panel_1.add(lbl_valortotalAdultos);
		
		lbl_valortotalNiños = new JLabel("----");
		lbl_valortotalNiños.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_valortotalNiños.setBounds(852, 87, 70, 30);
		panel_1.add(lbl_valortotalNiños);
		
		JLabel lblNewLabel_3_1_2_3 = new JLabel("TOTAL");
		lblNewLabel_3_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2_3.setBounds(716, 326, 85, 30);
		panel_1.add(lblNewLabel_3_1_2_3);
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel("IVA 12%");
		lblNewLabel_3_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2_2.setBounds(716, 286, 85, 30);
		panel_1.add(lblNewLabel_3_1_2_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("SUBTOTAL:");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2_1.setBounds(716, 252, 85, 30);
		panel_1.add(lblNewLabel_3_1_2_1);
		
		lbl_subtotal = new JLabel("----");
		lbl_subtotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_subtotal.setBounds(811, 252, 113, 30);
		panel_1.add(lbl_subtotal);
		
		lbl_iva = new JLabel("----");
		lbl_iva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_iva.setBounds(811, 286, 113, 30);
		panel_1.add(lbl_iva);
		
		lbl_valortotalapagar = new JLabel("----");
		lbl_valortotalapagar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_valortotalapagar.setBounds(811, 326, 113, 30);
		panel_1.add(lbl_valortotalapagar);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("HORARIO:");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(10, 343, 78, 30);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		lbl_horario = new JLabel(horario);
		lbl_horario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_horario.setBounds(105, 343, 118, 30);
		panel_1.add(lbl_horario);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setForeground(new Color(176, 196, 222));
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_intro pi = new panel_intro();
				dispose();
				pi.setBounds(100, 100, 1041, 797);
				pi.setVisible(true);
			}
		});
		btnNewButton.setBounds(811, 395, 113, 34);
		panel_1.add(btnNewButton);
		ln = new logica_negocio();
		ln.cargarFactura(this, event, client, boleto);
		ln.addBoleteria(Integer.parseInt(lbl_numsala.getText()));
	}
}
