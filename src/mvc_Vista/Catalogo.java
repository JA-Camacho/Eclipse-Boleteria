package mvc_Vista;

import javax.swing.JPanel;

import mvc_Controlador.logica_negocio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

public class Catalogo extends JFrame {
	public JButton btn_evento1;
	public JButton btn_evento2;
	public JButton btn_evento3;
	public JButton btn_evento4;
	public JButton btn_evento5;
	public JButton btn_evento6;
	public JButton btn_evento7;
	public JButton btn_evento8;
	public JButton btn_evento9;

	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public Catalogo(String evento) {
		setTitle("CARTELERA");
		getContentPane().setBackground(new Color(240, 230, 140));
		setResizable(false);
		Catalogo cat = this;
		setMaximumSize(new Dimension(1024, 768));
		setMinimumSize(new Dimension(1024, 768));
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(10, 11, 1002, 678);
		getContentPane().add(panel);
		panel.setLayout(null);

		btn_evento1 = new JButton("");
		btn_evento1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(0), cat);
				pd.setVisible(true);
			}
		});
		btn_evento1.setVisible(false);
		btn_evento1.setBounds(10, 11, 263, 180);
		panel.add(btn_evento1);

		btn_evento2 = new JButton("");
		btn_evento2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(1), cat);
				pd.setVisible(true);
			}
		});
		btn_evento2.setVisible(false);
		btn_evento2.setBounds(362, 11, 263, 180);
		panel.add(btn_evento2);

		btn_evento3 = new JButton("");
		btn_evento3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(2), cat);
				pd.setVisible(true);
			}
		});
		btn_evento3.setVisible(false);
		btn_evento3.setBounds(714, 11, 263, 180);
		panel.add(btn_evento3);

		btn_evento4 = new JButton("");
		btn_evento4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(3), cat);
				pd.setVisible(true);
			}
		});
		btn_evento4.setVisible(false);
		btn_evento4.setBounds(10, 205, 263, 180);
		panel.add(btn_evento4);

		btn_evento5 = new JButton("");
		btn_evento5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(4), cat);
				pd.setVisible(true);
			}
		});
		btn_evento5.setVisible(false);
		btn_evento5.setBounds(362, 205, 263, 180);
		panel.add(btn_evento5);

		btn_evento6 = new JButton("");
		btn_evento6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(5), cat);
				pd.setVisible(true);
			}
		});
		btn_evento6.setVisible(false);
		btn_evento6.setBounds(714, 205, 263, 180);
		panel.add(btn_evento6);

		btn_evento7 = new JButton("");
		btn_evento7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(6), cat);
				pd.setVisible(true);
			}
		});
		btn_evento7.setVisible(false);
		btn_evento7.setBounds(10, 401, 263, 180);
		panel.add(btn_evento7);

		btn_evento8 = new JButton("");
		btn_evento8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(7), cat);
				pd.setVisible(true);
			}
		});
		btn_evento8.setVisible(false);
		btn_evento8.setBounds(362, 401, 263, 180);
		panel.add(btn_evento8);

		btn_evento9 = new JButton("");
		btn_evento9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos pd = new panel_datos(ln.enviarEvento(8), cat);
				pd.setVisible(true);
			}
		});
		btn_evento9.setVisible(false);
		btn_evento9.setBounds(714, 401, 263, 180);
		panel.add(btn_evento9);

		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBackground(new Color(233, 150, 122));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				panel_intro pi = new panel_intro();
				pi.setBounds(0, 0, 808, 746);
				pi.setVisible(true);
			}
		});
		btnNewButton.setBounds(362, 620, 263, 55);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));

		ln = new logica_negocio();
		ln.cargarEventos(evento);
		ln.cargarCatalogo(this);
	}

	public void cerrar() {
		dispose();
	}
}