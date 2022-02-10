package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mvc_Controlador.logica_negocio;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class panel_Administrador extends JDialog {
	public JTextField txt_usuario;
	public JPasswordField txt_password;
	private panel_intro pi;
	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_Administrador(panel_intro pi) {
		this.pi = pi;
		panel_Administrador aux = this;
		setResizable(false);
		setBounds(400, 0, 530, 640);
		setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(216, 191, 216), 5, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 516, 602);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("MI CINE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Top Secret", Font.BOLD, 40));
		lblNewLabel.setBounds(152, 33, 191, 38);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 225), 3), "LOGIN", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_1.setBounds(45, 308, 420, 246);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("USUARIO :");
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setFont(new Font("Teen", Font.PLAIN, 20));
		lblNewLabel1.setBounds(25, 51, 158, 24);
		panel_1.add(lblNewLabel1);

		JLabel lblNewLabel2 = new JLabel("PASSWORD :");
		lblNewLabel2.setForeground(new Color(255, 255, 255));
		lblNewLabel2.setFont(new Font("Teen", Font.PLAIN, 20));
		lblNewLabel2.setBounds(25, 102, 158, 24);
		panel_1.add(lblNewLabel2);

		txt_usuario = new JTextField();
		txt_usuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		txt_usuario.setFont(new Font("Teen", Font.PLAIN, 20));
		txt_usuario.setBounds(193, 53, 187, 31);
		panel_1.add(txt_usuario);
		txt_usuario.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnNewButton.setFont(new Font("Teen", Font.PLAIN, 20));
		btnNewButton.setBounds(151, 172, 91, 31);
		panel_1.add(btnNewButton);
		
		txt_password = new JPasswordField();
		txt_password.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		txt_password.setBounds(193, 100, 187, 31);
		panel_1.add(txt_password);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(panel_Administrador.class.getResource("/Imagenes/Cine1.png")));
		lblNewLabel_2.setBounds(87, 82, 301, 215);
		panel.add(lblNewLabel_2);

		ln = new logica_negocio();
	}
	
	private void login() {
		if(ln.login(this)) {
			panel_Gestion pg = new panel_Gestion(pi);
			pi.dispose();
			dispose();
			pg.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectas");
		}
	}
}
