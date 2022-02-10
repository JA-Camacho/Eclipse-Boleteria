package mvc_Vista;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mvc_Controlador.logica_negocio;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.VetoableChangeListener;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import javax.swing.DefaultComboBoxModel;

public class panel_Estadisticas extends JDialog {
	public JComboBox <String> cmbBox_pelicula;
	private logica_negocio ln;
	public JTable table_asientosocupados;
	public JTable table_asientoslibres;
	public JTable table_boleteria;
	public JRadioButton rdbtn_Pelicula;
	public JRadioButton rdbtn_ObraDeTeatro;
	int count = 0;
	public JComboBox<String> cmbBox_obrasTeatro;
	/**
	 * Create the panel.
	 */
	public panel_Estadisticas() {

		panel_Estadisticas aux = this;
		setBounds(100, 0, 535, 740);
		setResizable(false);
		setBackground(new Color(240, 248, 255));
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBorder(new LineBorder(new Color(173, 216, 230), 3, true));
		panel.setBounds(20, 23, 490, 680);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("OPCI\u00D3N :");
		lblNewLabel.setFont(new Font("Teen", Font.BOLD, 15));
		lblNewLabel.setBounds(76, 37, 69, 21);
		panel.add(lblNewLabel);

		ButtonGroup group = new ButtonGroup();
		rdbtn_Pelicula = new JRadioButton("Pel\u00EDcula");
		rdbtn_Pelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbBox_pelicula.setVisible(true);
				cmbBox_obrasTeatro.setVisible(false);
				ln.cargarAsientosVacios(aux);
				ln.cargarAsientosOcupados(aux);
			}
		});
		rdbtn_Pelicula.setSelected(true);
		rdbtn_Pelicula.setBackground(new Color(248, 248, 255));
		rdbtn_Pelicula.setFont(new Font("Teen", Font.PLAIN, 15));
		rdbtn_Pelicula.setBounds(166, 35, 111, 23);
		panel.add(rdbtn_Pelicula);

		rdbtn_ObraDeTeatro = new JRadioButton("Obra de Teatro");
		rdbtn_ObraDeTeatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbBox_pelicula.setVisible(false);
				cmbBox_obrasTeatro.setVisible(true);
				ln.cargarAsientosVacios(aux);
				ln.cargarAsientosOcupados(aux);
			}
		});
		rdbtn_ObraDeTeatro.setBackground(new Color(248, 248, 255));
		rdbtn_ObraDeTeatro.setFont(new Font("Teen", Font.PLAIN, 15));
		rdbtn_ObraDeTeatro.setBounds(300, 35, 138, 23);
		panel.add(rdbtn_ObraDeTeatro);
		group.add(rdbtn_Pelicula);
		group.add(rdbtn_ObraDeTeatro);

		JLabel lblSearch = new JLabel("Search :");
		lblSearch.setFont(new Font("Teen", Font.BOLD, 15));
		lblSearch.setBounds(101, 89, 69, 21);
		panel.add(lblSearch);

		cmbBox_pelicula = new JComboBox <String>();		
		cmbBox_pelicula.setFont(new Font("Teen", Font.PLAIN, 15));
		cmbBox_pelicula.setBounds(191, 89, 223, 22);
		panel.add(cmbBox_pelicula);

		JLabel lblAsientosOcupados = new JLabel("Asientos ocupados :");
		lblAsientosOcupados.setFont(new Font("Teen", Font.BOLD, 15));
		lblAsientosOcupados.setBounds(52, 155, 168, 21);
		panel.add(lblAsientosOcupados);

		JLabel lblAsientosLibres = new JLabel("Asientos libres :");
		lblAsientosLibres.setFont(new Font("Teen", Font.BOLD, 15));
		lblAsientosLibres.setBounds(52, 316, 138, 21);
		panel.add(lblAsientosLibres);

		JLabel lblBoleteraObtenida = new JLabel("Boleter\u00EDa Obtenida");
		lblBoleteraObtenida.setFont(new Font("Teen", Font.BOLD, 15));
		lblBoleteraObtenida.setBounds(52, 486, 138, 21);
		panel.add(lblBoleteraObtenida);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(panel_Estadisticas.class.getResource("/Imagenes/lupaa.png")));
		lblNewLabel_1.setBounds(60, 77, 39, 40);
		panel.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 185, 398, 127);
		panel.add(scrollPane);

		table_asientosocupados = new JTable();
		scrollPane.setViewportView(table_asientosocupados);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(52, 348, 398, 127);
		panel.add(scrollPane_1);

		table_asientoslibres = new JTable();
		scrollPane_1.setViewportView(table_asientoslibres);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(52, 523, 398, 127);
		panel.add(scrollPane_2);

		table_boleteria = new JTable();
		scrollPane_2.setViewportView(table_boleteria);
		
		cmbBox_obrasTeatro = new JComboBox<String>();
		cmbBox_obrasTeatro.setFont(new Font("Dialog", Font.PLAIN, 15));
		cmbBox_obrasTeatro.setBounds(191, 89, 223, 22);
		cmbBox_obrasTeatro.setVisible(false);
		panel.add(cmbBox_obrasTeatro);
		ln = new logica_negocio();
		ln.cargarPeliculas(this);
		ln.cargarObras(this);
		ln.cargarBoleteria(this);
		ln.cargarAsientosVacios(this);
		ln.cargarAsientosOcupados(this);
	}
}
