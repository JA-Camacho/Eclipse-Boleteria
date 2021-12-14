package mvc_Modelo;
import javax.swing.ImageIcon;

import patron_generico.*;
public class Pelicula extends Eventos{

	private atributos_gen<Boolean, ?> data;
	
	public Pelicula(ImageIcon poster, String titulo, String duracion, String sala, String[] horarios, String genero, String censura, String sinapsis) {
		super(poster, titulo, duracion, sala, horarios);
		data = new atributos_gen<Boolean, String>(Censura(censura), genero, sinapsis);
	}
	
	public String getGenero() {
		return data.getAtributoS4().toString();
	}
	
	public String getSinapsis() {
		return data.getAtributoS5().toString();
	}
	
	public boolean getCensura() {
		return data.getAtributoT1();
	}
	
	public String toStringCensura() {
		return data.getAtributoT1()? "Si" : "No";
	}
	
	public boolean Censura(String censura) {
		if(censura.equalsIgnoreCase("si"))
			return true;
		else
			return false;
	}
	
	public String getDescripcion() {
		return data.getAtributoS5().toString();
	}
	
	public String getTipoEvento() {
		return "PELICULA";
	}
		
}
