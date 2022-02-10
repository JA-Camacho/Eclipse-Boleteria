package mvc_Vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import mvc_Controlador.logica_negocio;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_RegistroTeatro extends JDialog {
	public JTextField txt_duracion;
	public JTextField txt_tematica;
	public JTextField txt_titulo;
	public JTextField txt_horarios;
	public JComboBox <Integer> cmbBox_sala;
	public JCheckBox chckbx_Activo;
	public JTextField txt_actores;
	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_RegistroTeatro() {
		panel_RegistroTeatro aux = this;
		setResizable(false);
		setBounds(100, 0, 447, 560);
		setBackground(new Color(176, 224, 230));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(211, 211, 211), 3, true));
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 466, 523);
		getContentPane().add(panel);
		
		JLabel lblRegistroTeatro = new JLabel("<html><body style='text-align: left'>REGISTRO<br>OBRAS DE TEATRO");
		lblRegistroTeatro.setForeground(new Color(255, 255, 255));
		lblRegistroTeatro.setFont(new Font("Teen Light", Font.BOLD, 25));
		lblRegistroTeatro.setBounds(92, 34, 249, 51);
		panel.add(lblRegistroTeatro);
		
		JLabel lblNewLabel1 = new JLabel("Titulo :");
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel1.setBounds(46, 110, 69, 25);
		panel.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Tematica:");
		lblNewLabel2.setForeground(new Color(255, 255, 255));
		lblNewLabel2.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel2.setBounds(34, 146, 81, 25);
		panel.add(lblNewLabel2);
		
		JLabel lblNewLabel4 = new JLabel("Duraci\u00F3n :");
		lblNewLabel4.setForeground(new Color(255, 255, 255));
		lblNewLabel4.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel4.setBounds(34, 182, 82, 25);
		panel.add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Horarios :");
		lblNewLabel5.setForeground(new Color(255, 255, 255));
		lblNewLabel5.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel5.setBounds(34, 271, 82, 25);
		panel.add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("Sala de proyecci\u00F3n");
		lblNewLabel6.setForeground(new Color(255, 255, 255));
		lblNewLabel6.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel6.setBounds(35, 319, 142, 25);
		panel.add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("Estado :");
		lblNewLabel7.setForeground(new Color(255, 255, 255));
		lblNewLabel7.setFont(new Font("Teen", Font.PLAIN, 15));
		lblNewLabel7.setBounds(35, 366, 69, 25);
		panel.add(lblNewLabel7);
		
		cmbBox_sala = new JComboBox();
		cmbBox_sala.setBackground(new Color(176, 196, 222));
		cmbBox_sala.setFont(new Font("Teen", Font.PLAIN, 15));
		cmbBox_sala.setBounds(175, 321, 235, 23);
		panel.add(cmbBox_sala);
		
		txt_duracion = new JTextField();
		txt_duracion.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_duracion.setColumns(10);
		txt_duracion.setBounds(125, 185, 285, 25);
		panel.add(txt_duracion);
		
		txt_tematica = new JTextField();
		txt_tematica.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_tematica.setColumns(10);
		txt_tematica.setBounds(125, 149, 285, 25);
		panel.add(txt_tematica);
		
		txt_titulo = new JTextField();
		txt_titulo.setFont(new Font("Teen", Font.PLAIN, 15));
		txt_titulo.setColumns(10);
		txt_titulo.setBounds(125, 110, 285, 25);
		panel.add(txt_titulo);
		
		chckbx_Activo = new JCheckBox("Activo");
		chckbx_Activo.setForeground(new Color(255, 255, 255));
		chckbx_Activo.setFont(new Font("Teen", Font.PLAIN, 15));
		chckbx_Activo.setBackground(new Color(178, 34, 34));
		chckbx_Activo.setBounds(120, 367, 101, 23);
		panel.add(chckbx_Activo);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.add(null, aux, 2);
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(34, 435, 82, 23);
		panel.add(btnNewButton);
		
		JButton btnMod = new JButton("MOD");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.mod(null, aux, 2);
			}
		});
		btnMod.setBackground(new Color(230, 230, 250));
		btnMod.setBounds(126, 435, 82, 23);
		panel.add(btnMod);
		
		JButton btnSec = new JButton("SEC");
		btnSec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.search(null, aux, 2);
			}
		});
		btnSec.setBackground(new Color(230, 230, 250));
		btnSec.setBounds(218, 435, 82, 23);
		panel.add(btnSec);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.delete(null, aux, 2);
			}
		});
		btnDel.setBackground(new Color(230, 230, 250));
		btnDel.setBounds(310, 435, 82, 23);
		panel.add(btnDel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(panel_RegistroTeatro.class.getResource("/Imagenes/teatro.png")));
		lblNewLabel.setBounds(10, 27, 72, 72);
		panel.add(lblNewLabel);
		
		txt_horarios = new JTextField();
		txt_horarios.setFont(new Font("Dialog", Font.PLAIN, 15));
		txt_horarios.setColumns(10);
		txt_horarios.setBounds(126, 270, 285, 25);
		panel.add(txt_horarios);
		
		JLabel lblActores = new JLabel("Actores:");
		lblActores.setForeground(Color.WHITE);
		lblActores.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblActores.setBounds(34, 226, 82, 25);
		panel.add(lblActores);
		
		txt_actores = new JTextField();
		txt_actores.setFont(new Font("Dialog", Font.PLAIN, 15));
		txt_actores.setColumns(10);
		txt_actores.setBounds(125, 229, 285, 25);
		panel.add(txt_actores);
		ln = new logica_negocio();
		ln.cargarSalas(null, this, 2);
	}
}
