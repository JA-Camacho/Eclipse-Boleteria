package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel_Gestion extends JFrame {

	/**
	 * Create the panel.
	 */
	public panel_Gestion(panel_intro pi) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				pi.setVisible(true);
			}
		});
		setResizable(false);
		setBounds(100, 0, 539, 640);
		setBackground(new Color(250, 240, 230));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(216, 191, 216), 3));
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(22, 21, 475, 570);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("GESTI\u00D3N DE PEL\u00CDCULAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_RegistroPeliculas pr = new panel_RegistroPeliculas();
				pr.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Teen", Font.PLAIN, 30));
		btnNewButton.setBounds(33, 101, 415, 71);
		panel.add(btnNewButton);
		
		JButton btnGestinDeObras = new JButton("<html><body style='text-align: left'>GESTI\u00D3N DE<br>OBRAS DE TEATRO");
		btnGestinDeObras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_RegistroTeatro pr = new panel_RegistroTeatro();
				pr.setVisible(true);
			}
		});
		btnGestinDeObras.setBackground(new Color(245, 222, 179));
		btnGestinDeObras.setFont(new Font("Teen", Font.PLAIN, 30));
		btnGestinDeObras.setBounds(33, 206, 415, 109);
		panel.add(btnGestinDeObras);
		
		JButton btnEstadstica = new JButton("ESTAD\u00CDSTICA");
		btnEstadstica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Estadisticas pe = new panel_Estadisticas();
				pe.setVisible(true);
			}
		});
		btnEstadstica.setBackground(new Color(255, 245, 238));
		btnEstadstica.setFont(new Font("Teen", Font.PLAIN, 30));
		btnEstadstica.setBounds(33, 358, 415, 71);
		panel.add(btnEstadstica);

	}

}
