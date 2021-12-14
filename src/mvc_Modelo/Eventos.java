package mvc_Modelo;
import javax.swing.ImageIcon;

import patron_generico.*;
public class Eventos {

	protected atributos_gen<ImageIcon, String> datos;
	private atributos_gen<String, ?> horarios;

	public Eventos(ImageIcon poster, String titulo, String duracion, String sala, String[] horarios_) {
		datos = new atributos_gen<ImageIcon, String>(poster, titulo, duracion);
		horarios = new atributos_gen<String, String>();
		datos.setAtributoS6(sala);
		addHorarios(horarios_);
	}

	public ImageIcon getImagen() {
		return datos.getAtributoT1();
	}

	public String getTitulo() {
		return datos.getAtributoS4();
	}

	public String getDuracion() {
		return datos.getAtributoS5();
	}

	public String getDescripcion() {
		return "Descripcion Evento:";
	}

	public String getTipoEvento() {
		return "EVENTO";
	}

	public String getSala() {
		return datos.getAtributoS6();
	}

	private void addHorarios(String[] horarios_) {
		for(String hor: horarios_)
			horarios.addAlmacen(hor);
	}
	
	public String[] getHorario() {
		String[] horar = new String[horarios.getAlmacen().size()];
		for(int i =0; i < horarios.getAlmacen().size(); i++) {
			horar[i] = horarios.getAlmacen().get(i);
		}
		return horar;
	}
	
	public boolean getCensura() {
		return false;
	}
}
