package mvc_Controlador;
import patron_generico.*;
import mvc_Vista.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import mvc_Modelo.*;
public class logica_negocio implements configurable{

	private DefaultTableModel modelo;
	private ResultSet res;
	private conexionJDB con;
	private atributos_gen<Eventos, Double> datos;
	public logica_negocio(){
		datos = new atributos_gen<Eventos, Double>();
		con = new conexionJDB();
	}

	public Double calcularIVA(Double numero) {
		return numero * 0.12;
	}

	public void cargarEventos(String evento) {
		datos.getAlmacen().clear();
		try {
			switch(evento) {
			case "PELICULA":
				res = con.getQuery("SELECT * FROM peliculas WHERE estado=1;");
				while(res.next()) {
					datos.addAlmacen(new Pelicula(new ImageIcon("src/Imagenes/" + res.getString("titulo") + ".jpg"), res.getString("titulo"), res.getString("duracion"), res.getString("sala"), res.getString("horarios").split(",") , res.getString("genero"), res.getString("censura"), res.getString("sinapsis")));
				}
				break;
			case "TEATRO":
				res = con.getQuery("SELECT * FROM obras_teatro WHERE estado=1;");
				while(res.next()) {
					datos.addAlmacen(new funcion_teatro(new ImageIcon("src/Imagenes/" + res.getString("titulo") + ".jpg"), res.getString("titulo"), res.getString("duracion"), res.getString("sala"), res.getString("horarios").split(","), res.getString("tematica"), res.getString("actores").split(",")));
				}
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarCatalogo(Catalogo cat) {
		for(int i = 0; i < datos.getAlmacen().size(); i++) {
			switch(i) {
			case 0:
				cat.btn_evento1.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento1.setVisible(true);
				break;
			case 1:
				cat.btn_evento2.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento2.setVisible(true);
				break;
			case 2:
				cat.btn_evento3.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento3.setVisible(true);
				break;
			case 3:
				cat.btn_evento4.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento4.setVisible(true);
				break;
			case 4:
				cat.btn_evento5.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento5.setVisible(true);
				break;
			case 5:
				cat.btn_evento6.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento6.setVisible(true);
				break;
			case 6:
				cat.btn_evento7.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento7.setVisible(true);
				break;
			case 7:
				cat.btn_evento8.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento8.setVisible(true);
				break;
			case 8:
				cat.btn_evento9.setIcon(datos.getAlmacen().get(i).getImagen());
				cat.btn_evento9.setVisible(true);
				break;		
			}
		}
	}

	public void cargarEvento(panel_datos pd, Eventos event) {
		pd.lbl_imagenPel.setIcon(event.getImagen());
		pd.txt_titulo.setText(event.getTitulo());	
		pd.txt_sinapsis.setText(event.getDescripcion());
		for(String horario: event.getHorario())
			pd.cmd_horario.addItem(horario);
		if(event.getTipoEvento() == "TEATRO") 
			pd.lbl_sinapsis.setText("TEMATICA");
		if(event.getCensura())
			pd.txt_clasificación.setText("Censurado");

	}

	public Eventos enviarEvento(int numero) {
		return datos.getAlmacen().get(numero);
	}

	public Cliente enviarCliente(segundaEtapa_panel pn) {
		return new Cliente(pn.txt_cedula.getText(), pn.txt_nombre.getText(), pn.txt_telefono.getText(), pn.txt_direccion.getText());
	}

	public Boletos enviarBoleto(segundaEtapa_panel pn) {
		return new Boletos(Long.parseLong(pn.txt_adultos.getText()), Long.parseLong(pn.txt_ninos.getText()));
	}

	public long verificarAsiento(JCheckBox asiento, long num) {
		if(asiento.isSelected() && num != 0)
			return --num;
		else if(asiento.isSelected() && num == 0) {
			asiento.setSelected(false);
			printUI("Cantidad Excedida", 1);
			return 0;
		}
		else
			return ++num;
	}

	public void CargarAsientos(Eventos event, Sala sala_, String horario) {
		Sala_cine sala = new Sala_cine(Integer.parseInt(event.getSala()), horario);

		if(sala.getSala()[0][0] == '0') 
			asientoVacio(sala_.lbl_a1);
		else
			asietoOcupado(sala_.lbl_a1, sala_.A1);

		if(sala.getSala()[0][1] == '0') 
			asientoVacio(sala_.lbl_a2);
		else
			asietoOcupado(sala_.lbl_a2, sala_.A2);

		if(sala.getSala()[0][2] == '0') 
			asientoVacio(sala_.lbl_a3);
		else
			asietoOcupado(sala_.lbl_a3, sala_.A3);

		if(sala.getSala()[0][3] == '0') 
			asientoVacio(sala_.lbl_a4);
		else
			asietoOcupado(sala_.lbl_a4, sala_.A4);

		if(sala.getSala()[0][4] == '0') 
			asientoVacio(sala_.lbl_a5);
		else
			asietoOcupado(sala_.lbl_a5, sala_.A5);

		if(sala.getSala()[0][5] == '0') 
			asientoVacio(sala_.lbl_a6);
		else
			asietoOcupado(sala_.lbl_a6, sala_.A6);

		if(sala.getSala()[0][6] == '0') 
			asientoVacio(sala_.lbl_a7);
		else
			asietoOcupado(sala_.lbl_a7, sala_.A7);

		if(sala.getSala()[0][7] == '0') 
			asientoVacio(sala_.lbl_a8);
		else
			asietoOcupado(sala_.lbl_a8, sala_.A8);

		if(sala.getSala()[0][8] == '0') 
			asientoVacio(sala_.lbl_a9);
		else
			asietoOcupado(sala_.lbl_a9, sala_.A9);

		if(sala.getSala()[0][9] == '0') 
			asientoVacio(sala_.lbl_a10);
		else
			asietoOcupado(sala_.lbl_a10, sala_.A10);

		if(sala.getSala()[1][0] == '0') 
			asientoVacio(sala_.lbl_b1);
		else
			asietoOcupado(sala_.lbl_b1, sala_.B1);

		if(sala.getSala()[1][1] == '0') 
			asientoVacio(sala_.lbl_b2);
		else
			asietoOcupado(sala_.lbl_b2, sala_.B2);

		if(sala.getSala()[1][2] == '0') 
			asientoVacio(sala_.lbl_b3);
		else
			asietoOcupado(sala_.lbl_b3, sala_.B3);

		if(sala.getSala()[1][3] == '0') 
			asientoVacio(sala_.lbl_b4);
		else
			asietoOcupado(sala_.lbl_b4, sala_.B4);

		if(sala.getSala()[1][4] == '0') 
			asientoVacio(sala_.lbl_b5);
		else
			asietoOcupado(sala_.lbl_b5, sala_.B5);

		if(sala.getSala()[1][5] == '0') 
			asientoVacio(sala_.lbl_b6);
		else
			asietoOcupado(sala_.lbl_b6, sala_.B6);

		if(sala.getSala()[1][6] == '0') 
			asientoVacio(sala_.lbl_b7);
		else
			asietoOcupado(sala_.lbl_b7, sala_.B7);

		if(sala.getSala()[1][7] == '0') 
			asientoVacio(sala_.lbl_b8);
		else
			asietoOcupado(sala_.lbl_b8, sala_.B8);

		if(sala.getSala()[1][8] == '0') 
			asientoVacio(sala_.lbl_b9);
		else
			asietoOcupado(sala_.lbl_b9, sala_.B9);

		if(sala.getSala()[1][9] == '0') 
			asientoVacio(sala_.lbl_b10);
		else
			asietoOcupado(sala_.lbl_b10, sala_.B10);

		if(sala.getSala()[2][0] == '0') 
			asientoVacio(sala_.lbl_c1);
		else
			asietoOcupado(sala_.lbl_c1, sala_.C1);

		if(sala.getSala()[2][1] == '0') 
			asientoVacio(sala_.lbl_c2);
		else
			asietoOcupado(sala_.lbl_c2, sala_.C2);

		if(sala.getSala()[2][2] == '0') 
			asientoVacio(sala_.lbl_c3);
		else
			asietoOcupado(sala_.lbl_c3, sala_.C3);

		if(sala.getSala()[2][3] == '0') 
			asientoVacio(sala_.lbl_c4);
		else
			asietoOcupado(sala_.lbl_c4, sala_.C4);

		if(sala.getSala()[2][4] == '0') 
			asientoVacio(sala_.lbl_c5);
		else
			asietoOcupado(sala_.lbl_c5, sala_.C5);

		if(sala.getSala()[2][5] == '0') 
			asientoVacio(sala_.lbl_c6);
		else
			asietoOcupado(sala_.lbl_c6, sala_.C6);

		if(sala.getSala()[2][6] == '0') 
			asientoVacio(sala_.lbl_c7);
		else
			asietoOcupado(sala_.lbl_c7, sala_.C7);

		if(sala.getSala()[2][7] == '0') 
			asientoVacio(sala_.lbl_c8);
		else
			asietoOcupado(sala_.lbl_c8, sala_.C8);

		if(sala.getSala()[2][8] == '0') 
			asientoVacio(sala_.lbl_c9);
		else
			asietoOcupado(sala_.lbl_c9, sala_.C9);

		if(sala.getSala()[2][9] == '0') 
			asientoVacio(sala_.lbl_c10);
		else
			asietoOcupado(sala_.lbl_c10, sala_.C10);

		if(sala.getSala()[3][0] == '0') 
			asientoVacio(sala_.lbl_d1);
		else
			asietoOcupado(sala_.lbl_d1, sala_.D1);

		if(sala.getSala()[3][1] == '0') 
			asientoVacio(sala_.lbl_d2);
		else
			asietoOcupado(sala_.lbl_d2, sala_.D2);

		if(sala.getSala()[3][2] == '0') 
			asientoVacio(sala_.lbl_d3);
		else
			asietoOcupado(sala_.lbl_d3, sala_.D3);

		if(sala.getSala()[3][3] == '0') 
			asientoVacio(sala_.lbl_d4);
		else
			asietoOcupado(sala_.lbl_d4, sala_.D4);

		if(sala.getSala()[3][4] == '0') 
			asientoVacio(sala_.lbl_d5);
		else
			asietoOcupado(sala_.lbl_d5, sala_.D5);

		if(sala.getSala()[3][5] == '0') 
			asientoVacio(sala_.lbl_d6);
		else
			asietoOcupado(sala_.lbl_d6, sala_.D6);

		if(sala.getSala()[3][6] == '0') 
			asientoVacio(sala_.lbl_d7);
		else
			asietoOcupado(sala_.lbl_d7, sala_.D7);

		if(sala.getSala()[3][7] == '0') 
			asientoVacio(sala_.lbl_d8);
		else
			asietoOcupado(sala_.lbl_d8, sala_.D8);

		if(sala.getSala()[3][8] == '0') 
			asientoVacio(sala_.lbl_d9);
		else
			asietoOcupado(sala_.lbl_d9, sala_.D9);

		if(sala.getSala()[3][9] == '0') 
			asientoVacio(sala_.lbl_d10);
		else
			asietoOcupado(sala_.lbl_d10, sala_.D10);

		if(sala.getSala()[4][0] == '0') 
			asientoVacio(sala_.lbl_e1);
		else
			asietoOcupado(sala_.lbl_e1, sala_.E1);

		if(sala.getSala()[4][1] == '0') 
			asientoVacio(sala_.lbl_e2);
		else
			asietoOcupado(sala_.lbl_e2, sala_.E2);

		if(sala.getSala()[4][2] == '0') 
			asientoVacio(sala_.lbl_e3);
		else
			asietoOcupado(sala_.lbl_e3, sala_.E3);

		if(sala.getSala()[4][3] == '0') 
			asientoVacio(sala_.lbl_e4);
		else
			asietoOcupado(sala_.lbl_e4, sala_.E4);

		if(sala.getSala()[4][4] == '0') 
			asientoVacio(sala_.lbl_e5);
		else
			asietoOcupado(sala_.lbl_e5, sala_.E5);

		if(sala.getSala()[4][5] == '0') 
			asientoVacio(sala_.lbl_e6);
		else
			asietoOcupado(sala_.lbl_e6, sala_.E6);

		if(sala.getSala()[4][6] == '0') 
			asientoVacio(sala_.lbl_e7);
		else
			asietoOcupado(sala_.lbl_e7, sala_.E7);

		if(sala.getSala()[4][7] == '0') 
			asientoVacio(sala_.lbl_e8);
		else
			asietoOcupado(sala_.lbl_e8, sala_.E8);

		if(sala.getSala()[4][8] == '0') 
			asientoVacio(sala_.lbl_e9);
		else
			asietoOcupado(sala_.lbl_e9, sala_.E9);

		if(sala.getSala()[4][9] == '0') 
			asientoVacio(sala_.lbl_e10);
		else
			asietoOcupado(sala_.lbl_e10, sala_.E10);

		if(sala.getSala()[5][0] == '0') 
			asientoVacio(sala_.lbl_f1);
		else
			asietoOcupado(sala_.lbl_f1, sala_.F1);

		if(sala.getSala()[5][1] == '0') 
			asientoVacio(sala_.lbl_f2);
		else
			asietoOcupado(sala_.lbl_f2, sala_.F2);

		if(sala.getSala()[5][2] == '0') 
			asientoVacio(sala_.lbl_f3);
		else
			asietoOcupado(sala_.lbl_f3, sala_.F3);

		if(sala.getSala()[5][3] == '0') 
			asientoVacio(sala_.lbl_f4);
		else
			asietoOcupado(sala_.lbl_f4, sala_.F4);

		if(sala.getSala()[5][4] == '0') 
			asientoVacio(sala_.lbl_f5);
		else
			asietoOcupado(sala_.lbl_f5, sala_.F5);

		if(sala.getSala()[5][5] == '0') 
			asientoVacio(sala_.lbl_f6);
		else
			asietoOcupado(sala_.lbl_f6, sala_.F6);

		if(sala.getSala()[5][6] == '0') 
			asientoVacio(sala_.lbl_f7);
		else
			asietoOcupado(sala_.lbl_f7, sala_.F7);

		if(sala.getSala()[5][7] == '0') 
			asientoVacio(sala_.lbl_f8);
		else
			asietoOcupado(sala_.lbl_f8, sala_.F8);

		if(sala.getSala()[5][8] == '0') 
			asientoVacio(sala_.lbl_f9);
		else
			asietoOcupado(sala_.lbl_f9, sala_.F9);

		if(sala.getSala()[5][9] == '0') 
			asientoVacio(sala_.lbl_f10);
		else
			asietoOcupado(sala_.lbl_f10, sala_.F10);
	}

	private void asientoVacio(JLabel asiento) {
		asiento.setIcon(new ImageIcon(Sala.class.getResource("/Imagenes/asiento vacio.png")));
	}

	private void asietoOcupado(JLabel asiento, JCheckBox asiento_) {
		asiento.setIcon(new ImageIcon(Sala.class.getResource("/Imagenes/asiento ocupado.png")));
		asiento_.setEnabled(false);
		asiento_.setSelected(false);
	}

	public void cargarFactura(panel_factura factura, Eventos event, Cliente client, Boletos boleto) {
		factura.lbl_nombreCliente.setText(client.getNombre());
		factura.lbl_CedulaCliente.setText(client.getCedula());
		factura.lbl_telefonoCliente.setText(client.getTelefono());
		factura.lbl_DireccionCliente.setText(client.getDireccion());
		factura.lbl_cantAdultos.setText("" + boleto.getNumAdultos());
		factura.lbl_cantNinos.setText("" + boleto.getNumNinos());
		factura.lbl_numsala.setText(event.getSala());
		factura.lbl_duracion.setText(event.getDuracion());
		factura.lbl_date.setText(client.mostrarFecha());
		for(String asientos: boleto.getAsientos()) {
			factura.lbl_asientos.setText(factura.lbl_asientos.getText() + asientos + "\n");
		}
		if(event.getTipoEvento() == "PELICULA") {
			factura.lbl_valortotalAdultos.setText("" + (boleto.getNumAdultos() * 4.50));
			factura.lbl_valortotalNiños.setText("" + (boleto.getNumNinos() * 2.25));
			datos.setAtributoS4((boleto.getNumAdultos() * 4.50) + (boleto.getNumNinos() * 2.25));
		}
		else{
			factura.lbl_valortotalAdultos.setText("" + (boleto.getNumAdultos() * 12.5));
			factura.lbl_valortotalNiños.setText("" + (boleto.getNumNinos() * 6.25));
			datos.setAtributoS4((boleto.getNumAdultos() * 12.50) + (boleto.getNumNinos() * 6.25));
		}
		factura.lbl_iva.setText("$" + calcularIVA(datos.getAtributoS4()));
		factura.lbl_subtotal.setText("$" + datos.getAtributoS4());
		datos.setAtributoS5(calcularIVA(datos.getAtributoS4()) + datos.getAtributoS4());
		factura.lbl_valortotalapagar.setText("$" + datos.getAtributoS5());

	}

	public void comprobarDisponibilidad(panel_datos pd, Eventos event, Catalogo cat, String horario) {
		Sala_cine sala = new Sala_cine(Integer.parseInt(event.getSala()), pd.cmd_horario.getSelectedItem().toString());
		if(sala.getCantidad() > 0) {
			segundaEtapa_panel ps = new segundaEtapa_panel(event, horario);
			ps.setBounds(0, 0, 808, 746);
			ps.setVisible(true);
			pd.cerrar();
			cat.cerrar();
		}
		else
			printUI("No hay disponibilidad en la sala", 1);
	}

	public void comprobarCensura(segundaEtapa_panel et, Eventos event) {
		if(event.getCensura()) {
			et.lbl_ninos.setVisible(false);
			et.txt_ninos.setVisible(false);
		}
	}

	public void agregarAsientos(Eventos event, Sala sala_, Boletos boleto, String Horario) {
		Sala_cine sala = new Sala_cine(Integer.parseInt(event.getSala()), Horario);
		if(sala.getSala()[0][0] == '0' && sala_.A1.isSelected()) {
			boleto.agregarAsiento("A1");
			sala.getSala()[0][0] = 'X';
		}

		if(sala.getSala()[0][1] == '0' && sala_.A2.isSelected()) {
			boleto.agregarAsiento("A2");
			sala.getSala()[0][1] = 'X';
		}

		if(sala.getSala()[0][2] == '0' && sala_.A3.isSelected()) {
			boleto.agregarAsiento("A3");
			sala.getSala()[0][2] = 'X';
		}

		if(sala.getSala()[0][3] == '0' && sala_.A4.isSelected()) {
			boleto.agregarAsiento("A4");
			sala.getSala()[0][3] = 'X';
		}

		if(sala.getSala()[0][4] == '0' && sala_.A5.isSelected()) {
			boleto.agregarAsiento("A5");
			sala.getSala()[0][4] = 'X';
		}

		if(sala.getSala()[0][5] == '0' && sala_.A6.isSelected()) {
			boleto.agregarAsiento("A6");
			sala.getSala()[0][5] = 'X';
		}

		if(sala.getSala()[0][6] == '0' && sala_.A7.isSelected()) {
			boleto.agregarAsiento("A7");
			sala.getSala()[0][6] = 'X';
		}

		if(sala.getSala()[0][7] == '0' && sala_.A8.isSelected()) {
			boleto.agregarAsiento("A8");
			sala.getSala()[0][7] = 'X';
		}

		if(sala.getSala()[0][8] == '0' && sala_.A9.isSelected()) {
			boleto.agregarAsiento("A9");
			sala.getSala()[0][8] = 'X';
		}

		if(sala.getSala()[0][9] == '0' && sala_.A10.isSelected()) {
			boleto.agregarAsiento("A10");
			sala.getSala()[0][9] = 'X';
		}

		if(sala.getSala()[1][0] == '0' && sala_.B1.isSelected()) {
			boleto.agregarAsiento("B1");
			sala.getSala()[1][0] = 'X';
		}

		if(sala.getSala()[1][1] == '0' && sala_.B2.isSelected()) {
			boleto.agregarAsiento("B2");
			sala.getSala()[1][1] = 'X';
		}

		if(sala.getSala()[1][2] == '0' && sala_.B3.isSelected()) {
			boleto.agregarAsiento("B3");
			sala.getSala()[1][2] = 'X';
		}

		if(sala.getSala()[1][3] == '0' && sala_.B4.isSelected()) {
			boleto.agregarAsiento("B4");
			sala.getSala()[1][3] = 'X';
		}

		if(sala.getSala()[1][4] == '0' && sala_.B5.isSelected()) {
			boleto.agregarAsiento("B5");
			sala.getSala()[1][4] = 'X';
		}

		if(sala.getSala()[1][5] == '0' && sala_.B6.isSelected()) {
			boleto.agregarAsiento("B6");
			sala.getSala()[1][5] = 'X';
		}

		if(sala.getSala()[1][6] == '0' && sala_.B7.isSelected()) {
			boleto.agregarAsiento("B7");
			sala.getSala()[1][6] = 'X';
		}

		if(sala.getSala()[1][7] == '0' && sala_.B8.isSelected()) {
			boleto.agregarAsiento("B8");
			sala.getSala()[1][7] = 'X';
		}

		if(sala.getSala()[1][8] == '0' && sala_.B9.isSelected()) {
			boleto.agregarAsiento("B9");
			sala.getSala()[1][8] = 'X';
		}

		if(sala.getSala()[1][9] == '0' && sala_.B10.isSelected()) {
			boleto.agregarAsiento("B10");
			sala.getSala()[1][9] = 'X';
		}

		if(sala.getSala()[2][0] == '0' && sala_.C1.isSelected()) {
			boleto.agregarAsiento("C1");
			sala.getSala()[2][0] = 'X';
		}

		if(sala.getSala()[2][1] == '0' && sala_.C2.isSelected()) {
			boleto.agregarAsiento("C2");
			sala.getSala()[2][1] = 'X';
		}

		if(sala.getSala()[2][2] == '0' && sala_.C3.isSelected()) {
			boleto.agregarAsiento("C3");
			sala.getSala()[2][2] = 'X';
		}

		if(sala.getSala()[2][3] == '0' && sala_.C4.isSelected()) {
			boleto.agregarAsiento("C4");
			sala.getSala()[2][3] = 'X';
		}

		if(sala.getSala()[2][4] == '0' && sala_.C5.isSelected()) {
			boleto.agregarAsiento("C5");
			sala.getSala()[2][4] = 'X';
		}

		if(sala.getSala()[2][5] == '0' && sala_.C6.isSelected()) {
			boleto.agregarAsiento("C6");
			sala.getSala()[2][5] = 'X';
		}

		if(sala.getSala()[2][6] == '0' && sala_.C7.isSelected()) {
			boleto.agregarAsiento("C7");
			sala.getSala()[2][6] = 'X';
		}

		if(sala.getSala()[2][7] == '0' && sala_.C8.isSelected()) {
			boleto.agregarAsiento("C8");
			sala.getSala()[2][7] = 'X';
		}

		if(sala.getSala()[2][8] == '0' && sala_.C9.isSelected()) {
			boleto.agregarAsiento("C9");
			sala.getSala()[2][8] = 'X';
		}

		if(sala.getSala()[2][9] == '0' && sala_.C10.isSelected()) {
			boleto.agregarAsiento("C10");
			sala.getSala()[2][9] = 'X';
		}

		if(sala.getSala()[3][0] == '0' && sala_.D1.isSelected()) {
			boleto.agregarAsiento("D1");
			sala.getSala()[3][0] = 'X';
		}

		if(sala.getSala()[3][1] == '0' && sala_.D2.isSelected()) {
			boleto.agregarAsiento("D2");
			sala.getSala()[3][1] = 'X';
		}

		if(sala.getSala()[3][2] == '0' && sala_.D3.isSelected()) {
			boleto.agregarAsiento("D3");
			sala.getSala()[3][2] = 'X';
		}

		if(sala.getSala()[3][3] == '0' && sala_.D4.isSelected()) {
			boleto.agregarAsiento("D4");
			sala.getSala()[3][3] = 'X';
		}

		if(sala.getSala()[3][4] == '0' && sala_.D5.isSelected()) {
			boleto.agregarAsiento("D5");
			sala.getSala()[3][4] = 'X';
		}

		if(sala.getSala()[3][5] == '0' && sala_.D6.isSelected()) {
			boleto.agregarAsiento("D6");
			sala.getSala()[3][5] = 'X';
		}

		if(sala.getSala()[3][6] == '0' && sala_.D7.isSelected()) {
			boleto.agregarAsiento("D7");
			sala.getSala()[3][6] = 'X';
		}

		if(sala.getSala()[3][7] == '0' && sala_.D8.isSelected()) {
			boleto.agregarAsiento("D8");
			sala.getSala()[3][7] = 'X';
		}

		if(sala.getSala()[3][8] == '0' && sala_.D9.isSelected()) {
			boleto.agregarAsiento("D9");
			sala.getSala()[3][8] = 'X';
		}

		if(sala.getSala()[3][9] == '0' && sala_.D10.isSelected()) {
			boleto.agregarAsiento("D10");
			sala.getSala()[3][9] = 'X';
		}

		if(sala.getSala()[4][0] == '0' && sala_.E1.isSelected()) {
			boleto.agregarAsiento("E1");
			sala.getSala()[4][0] = 'X';
		}

		if(sala.getSala()[4][1] == '0' && sala_.E2.isSelected()) {
			boleto.agregarAsiento("E2");
			sala.getSala()[4][1] = 'X';
		}

		if(sala.getSala()[4][2] == '0' && sala_.E3.isSelected()) {
			boleto.agregarAsiento("E3");
			sala.getSala()[4][2] = 'X';
		}

		if(sala.getSala()[4][3] == '0' && sala_.E4.isSelected()) {
			boleto.agregarAsiento("E4");
			sala.getSala()[4][3] = 'X';
		}

		if(sala.getSala()[4][4] == '0' && sala_.E5.isSelected()) {
			boleto.agregarAsiento("E5");
			sala.getSala()[4][4] = 'X';
		}

		if(sala.getSala()[4][5] == '0' && sala_.E6.isSelected()) {
			boleto.agregarAsiento("E6");
			sala.getSala()[4][5] = 'X';
		}

		if(sala.getSala()[4][6] == '0' && sala_.E7.isSelected()) {
			boleto.agregarAsiento("E7");
			sala.getSala()[4][6] = 'X';
		}

		if(sala.getSala()[4][7] == '0' && sala_.E8.isSelected()) {
			boleto.agregarAsiento("E8");
			sala.getSala()[4][7] = 'X';
		}

		if(sala.getSala()[4][8] == '0' && sala_.E9.isSelected()) {
			boleto.agregarAsiento("E9");
			sala.getSala()[4][8] = 'X';
		}

		if(sala.getSala()[4][9] == '0' && sala_.E9.isSelected()) {
			boleto.agregarAsiento("E10");
			sala.getSala()[4][9] = 'X';
		}

		if(sala.getSala()[5][0] == '0' && sala_.F1.isSelected()) {
			boleto.agregarAsiento("F1");
			sala.getSala()[5][0] = 'X';
		}

		if(sala.getSala()[5][1] == '0' && sala_.F2.isSelected()) { 
			boleto.agregarAsiento("F2");
			sala.getSala()[5][1] = 'X';
		}

		if(sala.getSala()[5][2] == '0' && sala_.F3.isSelected()) {
			boleto.agregarAsiento("F3");
			sala.getSala()[5][2] = 'X';
		}

		if(sala.getSala()[5][3] == '0' && sala_.F4.isSelected()) {
			boleto.agregarAsiento("F4");
			sala.getSala()[5][3] = 'X';
		}

		if(sala.getSala()[5][4] == '0' && sala_.F5.isSelected()) {
			boleto.agregarAsiento("F5");
			sala.getSala()[5][4] = 'X';
		}

		if(sala.getSala()[5][5] == '0' && sala_.F6.isSelected()) {
			boleto.agregarAsiento("F6");
			sala.getSala()[5][5] = 'X';
		}

		if(sala.getSala()[5][6] == '0' && sala_.F7.isSelected()) {
			boleto.agregarAsiento("F7");
			sala.getSala()[5][6] = 'X';
		}

		if(sala.getSala()[5][7] == '0' && sala_.F8.isSelected()) {
			boleto.agregarAsiento("F8");
			sala.getSala()[5][7] = 'X';
		}

		if(sala.getSala()[5][8] == '0' && sala_.F9.isSelected()) { 
			boleto.agregarAsiento("F9");
			sala.getSala()[5][8] = 'X';
		}

		if(sala.getSala()[5][9] == '0' && sala_.F10.isSelected()) {
			boleto.agregarAsiento("F10");
			sala.getSala()[5][9] = 'X';
		}
		sala.guardarSala();

	}

	public boolean login(panel_Administrador pa) {
		res = con.getQuery("SELECT usuario, password FROM usuarios;");
		try {
			while(res.next()) {
				if(pa.txt_usuario.getText().equals(res.getString("usuario")) && pa.txt_password.getText().equals(res.getString("password"))) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public void cargarSalas(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		res = con.getQuery("SELECT id_sala FROM salas");
		try {
			while(res.next()) {
				if(tipo == 1)//Pelicula
					prP.cmbBox_sala.addItem(res.getInt("id_sala"));
				else //Obra de teatro
					prT.cmbBox_sala.addItem(res.getInt("id_sala"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		try {
			switch(tipo) {
			case 1: //Pelicula
				if(prP.txt_titulo.getText().isBlank() || prP.txt_genero.getText().isBlank() || prP.txt_sinapsis.getText().isBlank() || prP.txt_duracion.getText().isBlank() || prP.txt_horarios.getText().isBlank()) {
					printUI("Se debe rellenar todos los campos!", 1);
					return;
				}
				res = con.getQuery(String.format("SELECT * FROM salas WHERE id_sala='%d';", Integer.parseInt(prP.cmbBox_sala.getSelectedItem().toString())));
				res.next();
				if(res.getInt("disponible") == 0) {
					printUI("La sala seleccionada no esta disponible!", 1);
					return;
				}
				con.setQuery(String.format("INSERT INTO peliculas VALUES ('%s', '%d', '%s', '%s', '%d', '%s', '%s', '%d')",
						prP.txt_titulo.getText(),
						Integer.parseInt(prP.txt_duracion.getText()),
						prP.txt_genero.getText(),
						prP.txt_sinapsis.getText(),
						Integer.parseInt(prP.cmbBox_sala.getSelectedItem().toString()),
						prP.txt_horarios.getText(),
						censura(prP),
						estado(prP, prT, 0)));
				con.setQuery(String.format("UPDATE salas SET disponible=0 WHERE id_sala='%d'", Integer.parseInt(prP.cmbBox_sala.getSelectedItem().toString())));
				break;
			case 2: //Obra de teatro
				if(prT.txt_titulo.getText().isBlank() || prT.txt_tematica.getText().isBlank() || prT.txt_actores.getText().isBlank() || prT.txt_duracion.getText().isBlank() || prT.txt_horarios.getText().isBlank()) {
					printUI("Se debe rellenar todos los campos!", 1);
					return;
				}
				res = con.getQuery(String.format("SELECT * FROM salas WHERE id_sala='%d';", Integer.parseInt(prT.cmbBox_sala.getSelectedItem().toString())));
				res.next();
				if(res.getInt("disponible") == 0) {
					printUI("La sala seleccionada no esta disponible", 1);
					return;
				}
				con.setQuery(String.format("INSERT INTO obras_teatro VALUES ('%s', '%d', '%s', '%s', '%d', '%s', '%d')",
						prT.txt_titulo.getText(),
						Integer.parseInt(prT.txt_duracion.getText()),
						prT.txt_actores.getText(),
						prT.txt_tematica.getText(),
						Integer.parseInt(prT.cmbBox_sala.getSelectedItem().toString()),
						prT.txt_horarios.getText(),
						estado(prP, prT, 1)));
				con.setQuery(String.format("UPDATE salas SET disponible=0 WHERE id_sala='%d'", Integer.parseInt(prT.cmbBox_sala.getSelectedItem().toString())));
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String censura(panel_RegistroPeliculas prP) {
		if(prP.chckbx_censura.isSelected())
			return "si";
		else
			return "no";
	}

	public int estado(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		if(tipo == 0) //Pelicula
			return prP.chckbx_Activo.isSelected()? 1 : 0;
		else //Obra de teatro
			return prT.chckbx_Activo.isSelected()? 1 : 0;
	}

	public void mod(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		if(tipo == 1) { //Pelicula
			con.setQuery(String.format("UPDATE peliculas SET titulo='%s', duracion='%d', genero='%s', sinapsis='%s', sala='%d', horarios='%s', censura='%s', estado='%d' WHERE titulo='%s'", 
					prP.txt_titulo.getText(),
					Integer.parseInt(prP.txt_duracion.getText()),
					prP.txt_genero.getText(),
					prP.txt_sinapsis.getText(),
					Integer.parseInt(prP.cmbBox_sala.getSelectedItem().toString()),
					prP.txt_horarios.getText(),
					censura(prP),
					estado(prP, prT, 0),
					prP.txt_titulo.getText()));
		}
		else { //Obras de teatro
			con.setQuery(String.format("UPDATE obras_teatro SET titulo='%s', duracion='%d', actores='%s', tematica='%s', sala='%d', horarios='%s', estado='%d' WHERE titulo='%s';",
					prT.txt_titulo.getText(),
					Integer.parseInt(prT.txt_duracion.getText()),
					prT.txt_actores.getText(),
					prT.txt_tematica.getText(),
					Integer.parseInt(prT.cmbBox_sala.getSelectedItem().toString()),
					prT.txt_horarios.getText(),
					estado(prP, prT, 1),
					prT.txt_titulo.getText()));
		}
	}

	public void search(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		try {
			if(tipo == 1) { //pelicula
				res = con.getQuery(String.format("SELECT * FROM peliculas WHERE titulo like '%s", respuesta("Ingrese el nombre de la pelicula a buscar")) + "%'");
				res.next();
				prP.txt_titulo.setText(res.getString("titulo"));
				prP.txt_genero.setText(res.getString("genero"));
				prP.txt_duracion.setText(res.getString("duracion"));
				prP.txt_sinapsis.setText(res.getString("sinapsis"));
				prP.txt_horarios.setText(res.getString("horarios"));
				prP.cmbBox_sala.setSelectedItem(res.getInt("sala"));
				if(res.getInt("estado") == 1)
					prP.chckbx_Activo.setSelected(true);
				else
					prP.chckbx_Activo.setSelected(false);
				if(res.getString("censura").equals("si"))
					prP.chckbx_censura.setSelected(true);
				else
					prP.chckbx_censura.setSelected(false);
			}
			else { //Obra de teatro
				res = con.getQuery(String.format("SELECT * FROM obras_teatro WHERE titulo like '%s", respuesta("Ingrese el nombre de la obra de teatro a buscar")) + "%'");
				res.next();
				prT.txt_titulo.setText(res.getString("titulo"));
				prT.txt_tematica.setText(res.getString("tematica"));
				prT.txt_duracion.setText(res.getString("duracion"));
				prT.txt_actores.setText(res.getString("actores"));
				prT.txt_horarios.setText(res.getString("horarios"));
				prT.cmbBox_sala.setSelectedItem(res.getInt("sala"));
				if(res.getInt("estado") == 1)
					prT.chckbx_Activo.setSelected(true);
				else
					prT.chckbx_Activo.setSelected(false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(panel_RegistroPeliculas prP, panel_RegistroTeatro prT, int tipo) {
		try {
			if(tipo == 1) { //Peliculas
				res = con.getQuery(String.format("SELECT sala FROM peliculas WHERE titulo like '%s", prP.txt_titulo.getText()) + "%'");
				con.setQuery(String.format("DELETE FROM peliculas WHERE titulo='%s'", prP.txt_titulo.getText()));
				res.next();
				con.setQuery(String.format("UPDATE salas SET disponible=1 WHERE id_sala='%d'", res.getInt("sala")));
			}
			else { //Obras de teatro
				res = con.getQuery(String.format("SELECT sala FROM peliculas WHERE titulo like '%s", prT.txt_titulo.getText()) + "%'");
				con.setQuery(String.format("DELETE FROM obras_teatro WHERE titulo='%s'", prT.txt_titulo.getText()));
				res.next();
				con.setQuery(String.format("UPDATE salas SET disponible=1 WHERE id_sala='%d'", res.getInt("sala")));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarPeliculas(panel_Estadisticas pe) {
		res = con.getQuery("SELECT titulo FROM peliculas WHERE estado=1");
		try {
			while(res.next()) {
				pe.cmbBox_pelicula.addItem(res.getString("titulo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarObras(panel_Estadisticas pe) {
		res = con.getQuery("SELECT titulo FROM obras_teatro WHERE estado=1");
		try {
			while(res.next()) {
				pe.cmbBox_obrasTeatro.addItem(res.getString("titulo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cargarAsientosVacios(panel_Estadisticas pe) {
		int tipo = 0;
		if(pe.rdbtn_Pelicula.isSelected()) {
			tipo = 1;
		}
		modelo = new DefaultTableModel(new Object[] {"SALA", "ASIENTOS", "HORARIO"}, 0);
		try {
			if(tipo == 1) { //Pelicula
				res = con.getQuery(String.format("SELECT sala, horarios FROM peliculas WHERE titulo='%s'", pe.cmbBox_pelicula.getSelectedItem().toString()));
				while(res.next()) {
					Sala_cine sala = new Sala_cine(res.getInt("sala"), "");
					modelo.addRow(new Object[] {res.getInt("sala"), sala.getCantidad(), res.getString("horarios")});
				}
			}
			else { //Obra de teatro
				res = con.getQuery(String.format("SELECT sala, horarios FROM obras_teatro WHERE titulo='%s'", pe.cmbBox_obrasTeatro.getSelectedItem().toString()));
				while(res.next()) {
					Sala_cine sala = new Sala_cine(res.getInt("sala"), "");
					modelo.addRow(new Object[] {res.getInt("sala"), sala.getCantidad(), res.getString("horarios")});
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe.table_asientoslibres.setModel(modelo);
	}

	public void cargarAsientosOcupados(panel_Estadisticas pe) {
		int tipo = 0;
		if(pe.rdbtn_Pelicula.isSelected()) {
			tipo = 1;
		}
		modelo = new DefaultTableModel(new Object[] {"SALA", "ASIENTOS", "HORARIO"}, 0);
		try {
			if(tipo == 1) {
				res = con.getQuery(String.format("SELECT sala, horarios FROM peliculas WHERE titulo='%s'", pe.cmbBox_pelicula.getSelectedItem().toString()));
				while(res.next()) {
					Sala_cine sala = new Sala_cine(res.getInt("sala"), "");
					modelo.addRow(new Object[] {res.getInt("sala"), 60 - sala.getCantidad(), res.getString("horarios")});
				}
			}
			else {
				res = con.getQuery(String.format("SELECT sala, horarios FROM obras_teatro WHERE titulo='%s'", pe.cmbBox_obrasTeatro.getSelectedItem().toString()));
				while(res.next()) {
					Sala_cine sala = new Sala_cine(res.getInt("sala"), "");
					modelo.addRow(new Object[] {res.getInt("sala"), 60 - sala.getCantidad(), res.getString("horarios")});
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe.table_asientosocupados.setModel(modelo);
	}

	public void addBoleteria(int sala) {
		con.setQuery(String.format("INSERT INTO boleteria VALUES ('%d', '", sala) + datos.getAtributoS5() + "');");
	}

	public void cargarBoleteria(panel_Estadisticas pe) {
		double valor = 0;
		modelo = new DefaultTableModel(new Object[] {"SALA", "VALOR"}, 0);
		for(int i = 1; i <= 10; i++) {
			res = con.getQuery(String.format("SELECT * FROM boleteria WHERE sala=%d", i));
			try {
				while(res.next()) {
					valor += res.getDouble("precio"); 
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			modelo.addRow(new Object[] {i, "$" + valor});
			valor = 0;
		}
		pe.table_boleteria.setModel(modelo);
	}
}