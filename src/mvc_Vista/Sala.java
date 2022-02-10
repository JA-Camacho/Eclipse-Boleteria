package mvc_Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mvc_Controlador.logica_negocio;
import mvc_Modelo.Boletos;
import mvc_Modelo.Cliente;
import mvc_Modelo.Eventos;

import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sala extends JFrame {

	private JPanel contentPane;
	public JLabel lbl_a1;
	public JCheckBox A1;
	public JLabel lbl_a2;
	public JCheckBox A2;
	public JLabel lbl_a3;
	public JCheckBox A3;
	public JLabel lbl_a4;
	public JCheckBox A4;
	public JLabel lbl_a5;
	public JCheckBox A5;
	public JLabel lbl_a6;
	public JCheckBox A6;
	public JLabel lbl_a7;
	public JCheckBox A7;
	public JLabel lbl_a8;
	public JCheckBox A8;
	public JLabel lbl_a9;
	public JCheckBox A9;
	public JLabel lbl_a10;
	public JCheckBox A10;
	public JLabel lbl_b1;
	public JCheckBox B1;
	public JLabel lbl_b2;
	public JCheckBox B2;
	public JLabel lbl_b3;
	public JCheckBox B3;
	public JLabel lbl_b4;
	public JCheckBox B4;
	public JLabel lbl_b5;
	public JCheckBox B5;
	public JLabel lbl_b6;
	public JLabel lbl_b7;
	public JLabel lbl_b8;
	public JCheckBox B6;
	public JCheckBox B7;
	public JCheckBox B8;
	public JCheckBox B9;
	public JLabel lbl_b9;
	public JLabel lbl_b10;
	public JCheckBox B10;
	public JLabel lbl_d1;
	public JCheckBox D1;
	public JLabel lbl_d2;
	public JCheckBox D2;
	public JLabel lbl_d3;
	public JCheckBox D3;
	public JLabel lbl_d4;
	public JCheckBox D4;
	public JLabel lbl_d5;
	public JCheckBox D5;
	public JLabel lbl_d6;
	public JCheckBox D6;
	public JLabel lbl_d7;
	public JCheckBox D7;
	public JLabel lbl_d8;
	public JCheckBox D8;
	public JLabel lbl_d9;
	public JCheckBox D9;
	public JLabel lbl_d10;
	public JCheckBox D10;
	public JLabel lbl_e1;
	public JCheckBox E1;
	public JLabel lbl_e2;
	public JCheckBox E2;
	public JLabel lbl_e3;
	public JCheckBox E3;
	public JLabel lbl_e4;
	public JCheckBox E4;
	public JLabel lbl_e5;
	public JCheckBox E5;
	public JLabel lbl_e6;
	public JCheckBox E6;
	public JCheckBox E7;
	public JLabel lbl_e7;
	public JLabel lbl_e8;
	public JCheckBox E8;
	public JLabel lbl_e9;
	public JCheckBox E9;
	public JLabel lbl_e10;
	public JCheckBox E10;
	public JLabel lbl_f1;
	public JCheckBox F1;
	public JLabel lbl_f2;
	public JCheckBox F2;
	public JLabel lbl_f3;
	public JCheckBox F3;
	public JLabel lbl_f4;
	public JCheckBox F4;
	public JLabel lbl_f5;
	public JCheckBox F5;
	public JLabel lbl_f6;
	public JCheckBox F6;
	public JLabel lbl_f7;
	public JCheckBox F7;
	public JLabel lbl_f8;
	public JCheckBox F8;
	public JLabel lbl_f9;
	public JCheckBox F9;
	public JLabel lbl_f10;
	public JCheckBox F10;
	private long num;
	public JCheckBox C6;
	public JCheckBox C1;
	public JCheckBox C2;
	public JCheckBox C3;
	public JCheckBox C4;
	public JCheckBox C5;
	public JCheckBox C7;
	public JCheckBox C8;
	public JCheckBox C9;
	public JCheckBox C10;
	private logica_negocio ln;
	public JLabel lbl_c1;
	public JLabel lbl_c2;
	public JLabel lbl_c3;
	public JLabel lbl_c4;
	public JLabel lbl_c5;
	public JLabel lbl_c6;
	public JLabel lbl_c7;
	public JLabel lbl_c8;
	public JLabel lbl_c9;
	public JLabel lbl_c10;
	/**
	 * Create the frame.
	 */
	public Sala(Eventos event, Cliente persona, Boletos boleto, String horario) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("SALA");
		num = boleto.getNumAdultos() + boleto.getNumNinos();
		Sala sala_ = this;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 760);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl_a3 = new JLabel("");
		lbl_a3.setBounds(219, 81, 38, 34);
		contentPane.add(lbl_a3);

		lbl_a4 = new JLabel("");
		lbl_a4.setBounds(296, 81, 38, 34);
		contentPane.add(lbl_a4);

		lbl_a5 = new JLabel("");
		lbl_a5.setBounds(370, 81, 38, 34);
		contentPane.add(lbl_a5);

		lbl_a6 = new JLabel("");
		lbl_a6.setBounds(450, 81, 38, 34);
		contentPane.add(lbl_a6);

		lbl_a7 = new JLabel("");
		lbl_a7.setBounds(526, 81, 38, 34);
		contentPane.add(lbl_a7);

		lbl_a8 = new JLabel("");
		lbl_a8.setBounds(604, 81, 38, 34);
		contentPane.add(lbl_a8);

		lbl_a1 = new JLabel("");
		lbl_a1.setBounds(80, 81, 38, 34);
		contentPane.add(lbl_a1);

		lbl_a2 = new JLabel("");
		lbl_a2.setBounds(145, 81, 38, 34);
		contentPane.add(lbl_a2);

		lbl_a9 = new JLabel("");
		lbl_a9.setBounds(684, 81, 38, 34);
		contentPane.add(lbl_a9);

		lbl_a10 = new JLabel("");
		lbl_a10.setBounds(761, 81, 38, 34);
		contentPane.add(lbl_a10);

		lbl_b10 = new JLabel("");
		lbl_b10.setBounds(761, 169, 38, 34);
		contentPane.add(lbl_b10);

		lbl_b9 = new JLabel("");
		lbl_b9.setBounds(684, 169, 38, 34);
		contentPane.add(lbl_b9);

		lbl_b8 = new JLabel("");
		lbl_b8.setBounds(604, 169, 38, 34);
		contentPane.add(lbl_b8);

		lbl_b7 = new JLabel("");
		lbl_b7.setBounds(526, 169, 38, 34);
		contentPane.add(lbl_b7);

		lbl_b6 = new JLabel("");
		lbl_b6.setBounds(450, 169, 38, 34);
		contentPane.add(lbl_b6);

		lbl_b5 = new JLabel("");
		lbl_b5.setBounds(370, 169, 38, 34);
		contentPane.add(lbl_b5);

		lbl_b4 = new JLabel("");
		lbl_b4.setBounds(296, 169, 38, 34);
		contentPane.add(lbl_b4);

		lbl_b3 = new JLabel("");
		lbl_b3.setBounds(219, 169, 38, 34);
		contentPane.add(lbl_b3);

		lbl_b2 = new JLabel("");
		lbl_b2.setBounds(145, 169, 38, 34);
		contentPane.add(lbl_b2);

		lbl_b1 = new JLabel("");
		lbl_b1.setBounds(80, 169, 38, 34);
		contentPane.add(lbl_b1);

		lbl_c10 = new JLabel("");
		lbl_c10.setBounds(761, 251, 38, 34);
		contentPane.add(lbl_c10);

		lbl_c9 = new JLabel("");
		lbl_c9.setBounds(684, 251, 38, 34);
		contentPane.add(lbl_c9);

		lbl_c8 = new JLabel("");
		lbl_c8.setBounds(604, 251, 38, 34);
		contentPane.add(lbl_c8);

		lbl_c7 = new JLabel("");
		lbl_c7.setBounds(526, 251, 38, 34);
		contentPane.add(lbl_c7);

		lbl_c6 = new JLabel("");
		lbl_c6.setBounds(450, 251, 38, 34);
		contentPane.add(lbl_c6);

		lbl_c5 = new JLabel("");
		lbl_c5.setBounds(370, 251, 38, 34);
		contentPane.add(lbl_c5);

		lbl_c4 = new JLabel("");
		lbl_c4.setBounds(296, 251, 38, 34);
		contentPane.add(lbl_c4);

		lbl_c3 = new JLabel("");
		lbl_c3.setBounds(219, 251, 38, 34);
		contentPane.add(lbl_c3);

		lbl_c2 = new JLabel("");
		lbl_c2.setBounds(145, 251, 38, 34);
		contentPane.add(lbl_c2);

		lbl_c1 = new JLabel("");
		lbl_c1.setBounds(80, 251, 38, 34);
		contentPane.add(lbl_c1);

		lbl_d10 = new JLabel("");
		lbl_d10.setBounds(761, 349, 38, 34);
		contentPane.add(lbl_d10);

		lbl_d9 = new JLabel("");
		lbl_d9.setBounds(684, 349, 38, 34);
		contentPane.add(lbl_d9);

		lbl_d8 = new JLabel("");
		lbl_d8.setBounds(604, 349, 38, 34);
		contentPane.add(lbl_d8);

		lbl_d7 = new JLabel("");
		lbl_d7.setBounds(526, 349, 38, 34);
		contentPane.add(lbl_d7);

		lbl_d6 = new JLabel("");
		lbl_d6.setBounds(450, 349, 38, 34);
		contentPane.add(lbl_d6);

		lbl_d5 = new JLabel("");
		lbl_d5.setBounds(370, 349, 38, 34);
		contentPane.add(lbl_d5);

		lbl_d4 = new JLabel("");
		lbl_d4.setBounds(296, 349, 38, 34);
		contentPane.add(lbl_d4);

		lbl_d3 = new JLabel("");
		lbl_d3.setBounds(219, 349, 38, 34);
		contentPane.add(lbl_d3);

		lbl_d2 = new JLabel("");
		lbl_d2.setBounds(145, 349, 38, 34);
		contentPane.add(lbl_d2);

		lbl_d1 = new JLabel("");
		lbl_d1.setBounds(80, 349, 38, 34);
		contentPane.add(lbl_d1);

		lbl_e10 = new JLabel("");
		lbl_e10.setBounds(761, 450, 38, 34);
		contentPane.add(lbl_e10);

		lbl_e9 = new JLabel("");
		lbl_e9.setBounds(684, 450, 38, 34);
		contentPane.add(lbl_e9);

		lbl_e8 = new JLabel("");
		lbl_e8.setBounds(604, 450, 38, 34);
		contentPane.add(lbl_e8);

		lbl_e7 = new JLabel("");
		lbl_e7.setBounds(526, 450, 38, 34);
		contentPane.add(lbl_e7);

		lbl_e6 = new JLabel("");
		lbl_e6.setBounds(450, 450, 38, 34);
		contentPane.add(lbl_e6);

		lbl_e5 = new JLabel("");
		lbl_e5.setBounds(370, 450, 38, 34);
		contentPane.add(lbl_e5);

		lbl_e4 = new JLabel("");
		lbl_e4.setBounds(296, 450, 38, 34);
		contentPane.add(lbl_e4);

		lbl_e3 = new JLabel("");
		lbl_e3.setBounds(219, 450, 38, 34);
		contentPane.add(lbl_e3);

		lbl_e2 = new JLabel("");
		lbl_e2.setBounds(145, 450, 38, 34);
		contentPane.add(lbl_e2);

		lbl_e1 = new JLabel("");
		lbl_e1.setBounds(80, 450, 38, 34);
		contentPane.add(lbl_e1);

		lbl_f10 = new JLabel("");
		lbl_f10.setBounds(761, 551, 38, 34);
		contentPane.add(lbl_f10);

		lbl_f9 = new JLabel("");
		lbl_f9.setBounds(684, 551, 38, 34);
		contentPane.add(lbl_f9);

		lbl_f8 = new JLabel("");
		lbl_f8.setBounds(604, 551, 38, 34);
		contentPane.add(lbl_f8);

		lbl_f7 = new JLabel("");
		lbl_f7.setBounds(526, 551, 38, 34);
		contentPane.add(lbl_f7);

		lbl_f6 = new JLabel("");
		lbl_f6.setBounds(450, 551, 38, 34);
		contentPane.add(lbl_f6);

		lbl_f5 = new JLabel("");
		lbl_f5.setBounds(370, 551, 38, 34);
		contentPane.add(lbl_f5);

		lbl_f4 = new JLabel("");
		lbl_f4.setBounds(296, 551, 38, 34);
		contentPane.add(lbl_f4);

		lbl_f3 = new JLabel("");
		lbl_f3.setBounds(219, 551, 38, 34);
		contentPane.add(lbl_f3);

		lbl_f2 = new JLabel("");
		lbl_f2.setBounds(145, 551, 38, 34);
		contentPane.add(lbl_f2);

		lbl_f1 = new JLabel("");
		lbl_f1.setBounds(80, 551, 38, 34);
		contentPane.add(lbl_f1);

		JButton btn_cancelarAsiento = new JButton("CANCELAR");
		btn_cancelarAsiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundaEtapa_panel ep = new segundaEtapa_panel(event, horario);
				ep.setVisible(true);
				dispose();
			}
		});
		btn_cancelarAsiento.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 17));
		btn_cancelarAsiento.setBounds(306, 668, 114, 23);
		contentPane.add(btn_cancelarAsiento);

		JButton btn_aceptaAsiento = new JButton("ACEPTAR");
		btn_aceptaAsiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num == 0) {
					ln.agregarAsientos(event, sala_, boleto, horario);
					panel_factura pf = new panel_factura(persona, event, horario, boleto);
					pf.setVisible(true);
					pf.setBounds(0, 0, 1024, 768);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Aun tiene asientos por asignar");
			}
		});
		btn_aceptaAsiento.setBackground(Color.RED);
		btn_aceptaAsiento.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 17));
		btn_aceptaAsiento.setBounds(451, 670, 114, 23);
		contentPane.add(btn_aceptaAsiento);

		JLabel lblNewLabel_11 = new JLabel("A");
		lblNewLabel_11.setBackground(new Color(173, 255, 47));
		lblNewLabel_11.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(10, 93, 46, 22);
		contentPane.add(lblNewLabel_11);

		JLabel lblNewLabel_11_1 = new JLabel("B");
		lblNewLabel_11_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_1.setBounds(10, 181, 46, 22);
		contentPane.add(lblNewLabel_11_1);

		JLabel lblNewLabel_11_2 = new JLabel("C");
		lblNewLabel_11_2.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_2.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_2.setBounds(10, 263, 46, 22);
		contentPane.add(lblNewLabel_11_2);

		JLabel lblNewLabel_11_3 = new JLabel("D");
		lblNewLabel_11_3.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_3.setBounds(10, 361, 46, 22);
		contentPane.add(lblNewLabel_11_3);

		JLabel lblNewLabel_11_4 = new JLabel("E");
		lblNewLabel_11_4.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_4.setBounds(10, 462, 46, 22);
		contentPane.add(lblNewLabel_11_4);

		JLabel lblNewLabel_11_5 = new JLabel("F");
		lblNewLabel_11_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_11_5.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_5.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_5.setBounds(10, 563, 46, 22);
		contentPane.add(lblNewLabel_11_5);

		JLabel lblNewLabel_11_6 = new JLabel("1");
		lblNewLabel_11_6.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_6.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_6.setBounds(72, 24, 46, 22);
		contentPane.add(lblNewLabel_11_6);

		JLabel lblNewLabel_11_7 = new JLabel("2");
		lblNewLabel_11_7.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_7.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_7.setBounds(145, 24, 46, 22);
		contentPane.add(lblNewLabel_11_7);

		JLabel lblNewLabel_11_8 = new JLabel("3");
		lblNewLabel_11_8.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_8.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_8.setBounds(211, 24, 46, 22);
		contentPane.add(lblNewLabel_11_8);

		JLabel lblNewLabel_11_9 = new JLabel("4");
		lblNewLabel_11_9.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_9.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_9.setBounds(288, 26, 46, 22);
		contentPane.add(lblNewLabel_11_9);

		JLabel lblNewLabel_11_10 = new JLabel("5");
		lblNewLabel_11_10.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_10.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_10.setBounds(362, 26, 46, 22);
		contentPane.add(lblNewLabel_11_10);

		JLabel lblNewLabel_11_11 = new JLabel("6");
		lblNewLabel_11_11.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_11.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_11.setBounds(442, 26, 46, 22);
		contentPane.add(lblNewLabel_11_11);

		JLabel lblNewLabel_11_12 = new JLabel("7");
		lblNewLabel_11_12.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_12.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_12.setBounds(518, 26, 46, 22);
		contentPane.add(lblNewLabel_11_12);

		JLabel lblNewLabel_11_13 = new JLabel("8");
		lblNewLabel_11_13.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_13.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_13.setBounds(596, 26, 46, 22);
		contentPane.add(lblNewLabel_11_13);

		JLabel lblNewLabel_11_14 = new JLabel("9");
		lblNewLabel_11_14.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_14.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_14.setBounds(676, 26, 46, 22);
		contentPane.add(lblNewLabel_11_14);

		JLabel lblNewLabel_11_15 = new JLabel("10");
		lblNewLabel_11_15.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_15.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_15.setBounds(753, 26, 46, 22);
		contentPane.add(lblNewLabel_11_15);

		A1 = new JCheckBox("");
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A1, num);
			}
		});
		A1.setBackground(new Color(240, 230, 140));
		A1.setBounds(90, 119, 28, 15);
		contentPane.add(A1);

		B1 = new JCheckBox("");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B1, num);
			}
		});
		B1.setBackground(new Color(240, 230, 140));
		B1.setBounds(90, 206, 28, 15);
		contentPane.add(B1);

		C1 = new JCheckBox("");
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C1, num);
			}
		});
		C1.setBackground(new Color(240, 230, 140));
		C1.setBounds(90, 287, 28, 15);
		contentPane.add(C1);

		D1 = new JCheckBox("");
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D1, num);
			}
		});
		D1.setBackground(new Color(240, 230, 140));
		D1.setBounds(90, 387, 28, 15);
		contentPane.add(D1);

		E1 = new JCheckBox("");
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E1, num);
			}
		});
		E1.setBackground(new Color(240, 230, 140));
		E1.setBounds(90, 486, 28, 15);
		contentPane.add(E1);

		F1 = new JCheckBox("");
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F1, num);
			}
		});
		F1.setBackground(new Color(240, 230, 140));
		F1.setBounds(90, 588, 28, 15);
		contentPane.add(F1);

		A2 = new JCheckBox("");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A2, num);
			}
		});
		A2.setBackground(new Color(240, 230, 140));
		A2.setBounds(155, 119, 28, 15);
		contentPane.add(A2);

		A3 = new JCheckBox("");
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A3, num);
			}
		});
		A3.setBackground(new Color(240, 230, 140));
		A3.setBounds(229, 119, 28, 15);
		contentPane.add(A3);

		A4 = new JCheckBox("");
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A4, num);
			}
		});
		A4.setBackground(new Color(240, 230, 140));
		A4.setBounds(306, 119, 28, 15);
		contentPane.add(A4);

		A5 = new JCheckBox("");
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A5, num);
			}
		});
		A5.setBackground(new Color(240, 230, 140));
		A5.setBounds(380, 119, 28, 15);
		contentPane.add(A5);

		A6 = new JCheckBox("");
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A6, num);
			}
		});
		A6.setBackground(new Color(240, 230, 140));
		A6.setBounds(460, 119, 28, 15);
		contentPane.add(A6);

		A7 = new JCheckBox("");
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A7, num);
			}
		});
		A7.setBackground(new Color(240, 230, 140));
		A7.setBounds(536, 119, 28, 15);
		contentPane.add(A7);

		A8 = new JCheckBox("");
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A8, num);
			}
		});
		A8.setBackground(new Color(240, 230, 140));
		A8.setBounds(614, 119, 28, 15);
		contentPane.add(A8);

		A9 = new JCheckBox("");
		A9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A9, num);
			}
		});
		A9.setBackground(new Color(240, 230, 140));
		A9.setBounds(694, 119, 28, 15);
		contentPane.add(A9);

		A10 = new JCheckBox("");
		A10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(A10, num);
			}
		});
		A10.setBackground(new Color(240, 230, 140));
		A10.setBounds(771, 119, 28, 15);
		contentPane.add(A10);

		B2 = new JCheckBox("");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B2, num);
			}
		});
		B2.setBackground(new Color(240, 230, 140));
		B2.setBounds(155, 206, 28, 15);
		contentPane.add(B2);

		C2 = new JCheckBox("");
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C2, num);
			}
		});
		C2.setBackground(new Color(240, 230, 140));
		C2.setBounds(155, 287, 28, 15);
		contentPane.add(C2);

		D2 = new JCheckBox("");
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D2, num);
			}
		});
		D2.setBackground(new Color(240, 230, 140));
		D2.setBounds(155, 387, 28, 15);
		contentPane.add(D2);

		E2 = new JCheckBox("");
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E2, num);
			}
		});
		E2.setBackground(new Color(240, 230, 140));
		E2.setBounds(155, 486, 28, 15);
		contentPane.add(E2);

		F2 = new JCheckBox("");
		F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F2, num);
			}
		});
		F2.setBackground(new Color(240, 230, 140));
		F2.setBounds(155, 588, 28, 15);
		contentPane.add(F2);

		B3 = new JCheckBox("");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B3, num);
			}
		});
		B3.setBackground(new Color(240, 230, 140));
		B3.setBounds(229, 206, 28, 15);
		contentPane.add(B3);

		C3 = new JCheckBox("");
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C3, num);
			}
		});
		C3.setBackground(new Color(240, 230, 140));
		C3.setBounds(229, 287, 28, 15);
		contentPane.add(C3);

		D3 = new JCheckBox("");
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D3, num);
			}
		});
		D3.setBackground(new Color(240, 230, 140));
		D3.setBounds(229, 387, 28, 15);
		contentPane.add(D3);

		E3 = new JCheckBox("");
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E3, num);
			}
		});
		E3.setBackground(new Color(240, 230, 140));
		E3.setBounds(229, 486, 28, 15);
		contentPane.add(E3);

		F3 = new JCheckBox("");
		F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F3, num);
			}
		});
		F3.setBackground(new Color(240, 230, 140));
		F3.setBounds(229, 588, 28, 15);
		contentPane.add(F3);

		B4 = new JCheckBox("");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B4, num);
			}
		});
		B4.setBackground(new Color(240, 230, 140));
		B4.setBounds(306, 206, 28, 15);
		contentPane.add(B4);

		C4 = new JCheckBox("");
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C4, num);
			}
		});
		C4.setBackground(new Color(240, 230, 140));
		C4.setBounds(306, 287, 28, 15);
		contentPane.add(C4);

		D4 = new JCheckBox("");
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D4, num);
			}
		});
		D4.setBackground(new Color(240, 230, 140));
		D4.setBounds(306, 387, 28, 15);
		contentPane.add(D4);

		E4 = new JCheckBox("");
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E4, num);
			}
		});
		E4.setBackground(new Color(240, 230, 140));
		E4.setBounds(306, 486, 28, 15);
		contentPane.add(E4);

		F4 = new JCheckBox("");
		F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F4, num);
			}
		});
		F4.setBackground(new Color(240, 230, 140));
		F4.setBounds(306, 588, 28, 15);
		contentPane.add(F4);

		B6 = new JCheckBox("");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B6, num);
			}
		});
		B6.setBackground(new Color(240, 230, 140));
		B6.setBounds(460, 206, 28, 15);
		contentPane.add(B6);

		C6 = new JCheckBox("");
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C6, num);
			}
		});
		C6.setBackground(new Color(240, 230, 140));
		C6.setBounds(460, 287, 28, 15);
		contentPane.add(C6);

		D6 = new JCheckBox("");
		D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D6, num);
			}
		});
		D6.setBackground(new Color(240, 230, 140));
		D6.setBounds(460, 387, 28, 15);
		contentPane.add(D6);

		E6 = new JCheckBox("");
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E6, num);
			}
		});
		E6.setBackground(new Color(240, 230, 140));
		E6.setBounds(460, 486, 28, 15);
		contentPane.add(E6);

		F6 = new JCheckBox("");
		F6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F6, num);
			}
		});
		F6.setBackground(new Color(240, 230, 140));
		F6.setBounds(460, 588, 28, 15);
		contentPane.add(F6);

		B7 = new JCheckBox("");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B7, num);
			}
		});
		B7.setBackground(new Color(240, 230, 140));
		B7.setBounds(536, 206, 28, 15);
		contentPane.add(B7);

		C7 = new JCheckBox("");
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C7, num);
			}
		});
		C7.setBackground(new Color(240, 230, 140));
		C7.setBounds(536, 287, 28, 15);
		contentPane.add(C7);

		D7 = new JCheckBox("");
		D7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D7, num);
			}
		});
		D7.setBackground(new Color(240, 230, 140));
		D7.setBounds(536, 387, 28, 15);
		contentPane.add(D7);

		E7 = new JCheckBox("");
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E7, num);
			}
		});
		E7.setBackground(new Color(240, 230, 140));
		E7.setBounds(536, 486, 28, 15);
		contentPane.add(E7);

		F7 = new JCheckBox("");
		F7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F7, num);
			}
		});
		F7.setBackground(new Color(240, 230, 140));
		F7.setBounds(536, 588, 28, 15);
		contentPane.add(F7);

		F8 = new JCheckBox("");
		F8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F8, num);
			}
		});
		F8.setBackground(new Color(240, 230, 140));
		F8.setBounds(614, 588, 28, 15);
		contentPane.add(F8);

		E8 = new JCheckBox("");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E8, num);
			}
		});
		E8.setBackground(new Color(240, 230, 140));
		E8.setBounds(614, 486, 28, 15);
		contentPane.add(E8);

		D8 = new JCheckBox("");
		D8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D8, num);
			}
		});
		D8.setBackground(new Color(240, 230, 140));
		D8.setBounds(614, 387, 28, 15);
		contentPane.add(D8);

		C8 = new JCheckBox("");
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C8, num);
			}
		});
		C8.setBackground(new Color(240, 230, 140));
		C8.setBounds(614, 287, 28, 15);
		contentPane.add(C8);

		B8 = new JCheckBox("");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B8, num);
			}
		});
		B8.setBackground(new Color(240, 230, 140));
		B8.setBounds(614, 206, 28, 15);
		contentPane.add(B8);

		F9 = new JCheckBox("");
		F9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F9, num);
			}
		});
		F9.setBackground(new Color(240, 230, 140));
		F9.setBounds(694, 588, 28, 15);
		contentPane.add(F9);

		E9 = new JCheckBox("");
		E9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E9, num);
			}
		});
		E9.setBackground(new Color(240, 230, 140));
		E9.setBounds(694, 486, 28, 15);
		contentPane.add(E9);

		D9 = new JCheckBox("");
		D9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D9, num);
			}
		});
		D9.setBackground(new Color(240, 230, 140));
		D9.setBounds(694, 387, 28, 15);
		contentPane.add(D9);

		C9 = new JCheckBox("");
		C9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C9, num);
			}
		});
		C9.setBackground(new Color(240, 230, 140));
		C9.setBounds(694, 287, 28, 15);
		contentPane.add(C9);

		B9 = new JCheckBox("");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B9, num);
			}
		});
		B9.setBackground(new Color(240, 230, 140));
		B9.setBounds(694, 206, 28, 15);
		contentPane.add(B9);

		F10 = new JCheckBox("");
		F10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F10, num);
			}
		});
		F10.setBackground(new Color(240, 230, 140));
		F10.setBounds(771, 588, 28, 15);
		contentPane.add(F10);

		E10 = new JCheckBox("");
		E10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E10, num);
			}
		});
		E10.setBackground(new Color(240, 230, 140));
		E10.setBounds(771, 486, 28, 15);
		contentPane.add(E10);

		D10 = new JCheckBox("");
		D10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D10, num);
			}
		});
		D10.setBackground(new Color(240, 230, 140));
		D10.setBounds(771, 387, 28, 15);
		contentPane.add(D10);

		C10 = new JCheckBox("");
		C10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C10, num);
			}
		});
		C10.setBackground(new Color(240, 230, 140));
		C10.setBounds(771, 287, 28, 15);
		contentPane.add(C10);

		B10 = new JCheckBox("");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B10, num);
			}
		});
		B10.setBackground(new Color(240, 230, 140));
		B10.setBounds(771, 206, 28, 15);
		contentPane.add(B10);

		F5 = new JCheckBox("");
		F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(F5, num);
			}
		});
		F5.setBackground(new Color(240, 230, 140));
		F5.setBounds(380, 588, 28, 15);
		contentPane.add(F5);

		E5 = new JCheckBox("");
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(E5, num);
			}
		});
		E5.setBackground(new Color(240, 230, 140));
		E5.setBounds(380, 486, 28, 15);
		contentPane.add(E5);

		D5 = new JCheckBox("");
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(D5, num);
			}
		});
		D5.setBackground(new Color(240, 230, 140));
		D5.setBounds(380, 387, 28, 15);
		contentPane.add(D5);

		C5 = new JCheckBox("");
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(C5, num);
			}
		});
		C5.setBackground(new Color(240, 230, 140));
		C5.setBounds(380, 287, 28, 15);
		contentPane.add(C5);

		B5 = new JCheckBox("");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = ln.verificarAsiento(B5, num);
			}
		});
		B5.setBackground(new Color(240, 230, 140));
		B5.setBounds(380, 206, 28, 15);
		contentPane.add(B5);

		JLabel lblNewLabel_11_16 = new JLabel("A");
		lblNewLabel_11_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_16.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_16.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_16.setBounds(819, 93, 46, 22);
		contentPane.add(lblNewLabel_11_16);

		JLabel lblNewLabel_11_1_1 = new JLabel("B");
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_1_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_1_1.setBounds(819, 181, 46, 22);
		contentPane.add(lblNewLabel_11_1_1);

		JLabel lblNewLabel_11_2_1 = new JLabel("C");
		lblNewLabel_11_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_2_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_2_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_2_1.setBounds(819, 263, 46, 22);
		contentPane.add(lblNewLabel_11_2_1);

		JLabel lblNewLabel_11_3_1 = new JLabel("D");
		lblNewLabel_11_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_3_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_3_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_3_1.setBounds(819, 361, 46, 22);
		contentPane.add(lblNewLabel_11_3_1);

		JLabel lblNewLabel_11_4_1 = new JLabel("E");
		lblNewLabel_11_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_4_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_4_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_4_1.setBounds(819, 462, 46, 22);
		contentPane.add(lblNewLabel_11_4_1);

		JLabel lblNewLabel_11_5_1 = new JLabel("F");
		lblNewLabel_11_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_5_1.setForeground(Color.BLACK);
		lblNewLabel_11_5_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_11_5_1.setBackground(new Color(173, 255, 47));
		lblNewLabel_11_5_1.setBounds(819, 563, 46, 22);
		contentPane.add(lblNewLabel_11_5_1);

		ln = new logica_negocio();
		ln.CargarAsientos(event, this, horario);
	}
}
