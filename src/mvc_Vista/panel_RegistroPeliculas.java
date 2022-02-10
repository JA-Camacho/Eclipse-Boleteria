package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.border.LineBorder;

import mvc_Controlador.logica_negocio;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_RegistroPeliculas extends JDialog {
	public JTextField txt_duracion;
	public JTextField txt_sinapsis;
	public JTextField txt_genero;
	public JTextField txt_titulo;
	public JTextField txt_horarios;
	public JComboBox<Integer> cmbBox_sala;
	public JCheckBox chckbx_censura;
	public JCheckBox chckbx_Activo;
	private logica_negocio ln;

	/**
	 * Create the panel.
	 */
	public panel_RegistroPeliculas() {
		panel_RegistroPeliculas aux = this;
		setBounds(100, 0, 480, 560);
		setBackground(new Color(176, 224, 230));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(169, 169, 169), 3, true));
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(20, 11, 430, 492);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("REGISTRO PEL\u00CDCULAS");
		lblNewLabel1.setFont(new Font("Teen Light", Font.BOLD, 25));
		lblNewLabel1.setBounds(34, 33, 364, 51);
		panel.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Titulo :");
		lblNewLabel2.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel2.setBounds(46, 110, 46, 25);
		panel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Genero :");
		lblNewLabel3.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel3.setBounds(34, 146, 71, 25);
		panel.add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Sinapsis:");
		lblNewLabel4.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel4.setBounds(31, 189, 62, 25);
		panel.add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Duraci\u00F3n :");
		lblNewLabel5.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel5.setBounds(23, 232, 82, 25);
		panel.add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("Horarios :");
		lblNewLabel6.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel6.setBounds(23, 277, 82, 25);
		panel.add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("Sala de proyecci\u00F3n");
		lblNewLabel7.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel7.setBounds(23, 323, 142, 25);
		panel.add(lblNewLabel7);
		
		cmbBox_sala = new JComboBox();
		cmbBox_sala.setFont(new Font("Teen", Font.PLAIN, 15));
		cmbBox_sala.setBounds(163, 325, 235, 23);
		panel.add(cmbBox_sala);
		
		txt_duracion = new JTextField();
		txt_duracion.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_duracion.setBounds(115, 232, 283, 25);
		panel.add(txt_duracion);
		txt_duracion.setColumns(10);
		
		txt_sinapsis = new JTextField();
		txt_sinapsis.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_sinapsis.setColumns(10);
		txt_sinapsis.setBounds(115, 192, 283, 25);
		panel.add(txt_sinapsis);
		
		txt_genero = new JTextField();
		txt_genero.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_genero.setColumns(10);
		txt_genero.setBounds(115, 149, 283, 25);
		panel.add(txt_genero);
		
		txt_titulo = new JTextField();
		txt_titulo.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_titulo.setColumns(10);
		txt_titulo.setBounds(115, 110, 283, 25);
		panel.add(txt_titulo);
		
		chckbx_censura = new JCheckBox("Censura");
		chckbx_censura.setBackground(new Color(176, 196, 222));
		chckbx_censura.setFont(new Font("Teen", Font.PLAIN, 15));
		chckbx_censura.setBounds(34, 371, 101, 23);
		panel.add(chckbx_censura);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.add(aux, null, 1);
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(34, 435, 82, 23);
		panel.add(btnNewButton);
		
		JButton btnMod = new JButton("MOD");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.mod(aux, null, 1);
			}
		});
		btnMod.setBackground(new Color(230, 230, 250));
		btnMod.setBounds(126, 435, 82, 23);
		panel.add(btnMod);
		
		JButton btnSec = new JButton("SEC");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.search(aux, null, 1);
			}
		});
		btnSec.setBackground(new Color(230, 230, 250));
		btnSec.setBounds(218, 435, 82, 23);
		panel.add(btnSec);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.delete(aux, null, 1);
			}
		});
		btnDel.setBackground(new Color(230, 230, 250));
		btnDel.setBounds(310, 435, 82, 23);
		panel.add(btnDel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(panel_RegistroPeliculas.class.getResource("/Imagenes/pelicula.png")));
		lblNewLabel_2.setBounds(340, 17, 69, 67);
		panel.add(lblNewLabel_2);
		
		txt_horarios = new JTextField();
		txt_horarios.setFont(new Font("Dialog", Font.PLAIN, 15));
		txt_horarios.setColumns(10);
		txt_horarios.setBounds(115, 281, 283, 25);
		panel.add(txt_horarios);
		
		JLabel lblNewLabel8_1 = new JLabel("Estado :");
		lblNewLabel8_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel8_1.setBounds(212, 370, 69, 25);
		panel.add(lblNewLabel8_1);
		
		chckbx_Activo = new JCheckBox("Activo");
		chckbx_Activo.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbx_Activo.setBackground(new Color(176, 196, 222));
		chckbx_Activo.setBounds(297, 371, 101, 23);
		panel.add(chckbx_Activo);

		ln = new logica_negocio();
		ln.cargarSalas(this, null, 1);
	}
}
