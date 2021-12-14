package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class panel_intro extends JFrame {
	private JPanel panel_sd;

	/**
	 * Create the panel.
	 */
	public panel_intro() {
		setTitle("SELECCION");
		setResizable(false);
		setMinimumSize(new Dimension(1024, 768));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(10, 11, 1024, 768);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_obras = new JButton("OBRAS DE TEATRO");
		btn_obras.setBounds(39, 127, 504, 97);
		panel.add(btn_obras);
		btn_obras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catalogo ct = new Catalogo("TEATRO");
				dispose();
				ct.setBounds(0, 0, 1024, 768);
				ct.setVisible(true);			
			}
		});
		btn_obras.setForeground(new Color(0, 0, 0));
		btn_obras.setBackground(new Color(255, 0, 0));
		btn_obras.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 45));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(569, 38, 326, 251);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(panel_intro.class.getResource("/Imagenes/teatro-min_opt.jpg")));
		
		JButton btn_peliculas = new JButton("PELICULAS");
		btn_peliculas.setBounds(433, 477, 504, 97);
		panel.add(btn_peliculas);
		btn_peliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catalogo ct = new Catalogo("PELICULA");
				dispose();
				ct.setBounds(0, 0, 1024, 768);
				ct.setVisible(true);
			}
		});
		btn_peliculas.setBackground(new Color(255, 0, 0));
		btn_peliculas.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 45));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(26, 410, 350, 236);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(panel_intro.class.getResource("/Imagenes/peliculas-min_opt.jpg")));

	}
}
