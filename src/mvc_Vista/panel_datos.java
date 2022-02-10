package mvc_Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mvc_Controlador.logica_negocio;
import mvc_Modelo.Eventos;
import mvc_Modelo.Sala_cine;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_datos extends JFrame {

	public JPanel contentPane;
	public JTextField txt_clasificación;
	public JLabel lbl_imagenPel;
	public JTextArea txt_sinapsis;
	public JComboBox cmd_horario;
	private logica_negocio ln;
	public JLabel txt_titulo;
	public JLabel lbl_sinapsis;
	/**
	 * Create the frame.
	 */
	public panel_datos(Eventos event, Catalogo cat) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel_datos pd = this;
		setResizable(false);
		setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 12));
		setBackground(new Color(255, 0, 0));
		setTitle("INFORMACI\u00D3N\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 0, 830, 609);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl_sinapsis = new JLabel("SINAPSIS:");
		lbl_sinapsis.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		lbl_sinapsis.setBounds(10, 260, 113, 26);
		contentPane.add(lbl_sinapsis);

		txt_sinapsis = new JTextArea();
		txt_sinapsis.setFont(new Font("Calibri", Font.PLAIN, 20));
		txt_sinapsis.setEditable(false);
		txt_sinapsis.setBounds(10, 297, 761, 130);
		contentPane.add(txt_sinapsis);

		JLabel lbl_horario = new JLabel("HORARIO:");
		lbl_horario.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		lbl_horario.setBounds(36, 508, 113, 26);
		contentPane.add(lbl_horario);

		cmd_horario = new JComboBox();
		cmd_horario.setBackground(new Color(0, 255, 255));
		cmd_horario.setBounds(223, 504, 115, 32);
		contentPane.add(cmd_horario);

		JLabel lbl_clasificacin = new JLabel("CLASIFICACI\u00D3N:");
		lbl_clasificacin.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		lbl_clasificacin.setBounds(36, 451, 182, 26);
		contentPane.add(lbl_clasificacin);

		txt_clasificación = new JTextField();
		txt_clasificación.setText("Todo Publico");
		txt_clasificación.setEditable(false);
		txt_clasificación.setBounds(223, 453, 241, 20);
		contentPane.add(txt_clasificación);
		txt_clasificación.setColumns(10);

		lbl_imagenPel = new JLabel("");
		lbl_imagenPel.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imagenPel.setBounds(10, 51, 761, 206);
		contentPane.add(lbl_imagenPel);

		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_cancelar.setBackground(new Color(255, 255, 0));
		btn_cancelar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn_cancelar.setBounds(462, 509, 129, 23);
		contentPane.add(btn_cancelar);

		JButton btn_comprar = new JButton("COMPRAR");
		btn_comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln.comprobarDisponibilidad(pd, event, cat, cmd_horario.getSelectedItem().toString());
			}
		});
		btn_comprar.setForeground(new Color(255, 0, 0));
		btn_comprar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btn_comprar.setBackground(Color.RED);
		btn_comprar.setBounds(616, 509, 129, 23);
		contentPane.add(btn_comprar);

		txt_titulo = new JLabel("");
		txt_titulo.setFont(new Font("Engravers MT", Font.PLAIN, 19));
		txt_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		txt_titulo.setBounds(10, 11, 761, 32);
		contentPane.add(txt_titulo);

		ln = new logica_negocio();
		ln.cargarEvento(this, event);
	}
	
	public void cerrar() {
		dispose();
	}
}

