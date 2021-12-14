package mvc_Modelo;
import javax.swing.ImageIcon;

import patron_generico.*;
public class funcion_teatro extends Eventos{

	atributos_gen<String, String> data;
	
	public funcion_teatro(ImageIcon poster, String titulo, String duracion, String sala, String[] horarios, String tematica_, String... actores_) {
		super(poster, titulo, duracion, sala, horarios);
		data = new atributos_gen<String, String>();
		data.setAtributoT1(tematica_);
		addActores(actores_);
	}
	
	private void addActores(String... actores_) {
		for(String act: actores_)
			data.addAlmacen(act);
	}
	
	public String getDescripcion() {
		return data.getAtributoT1();
	}
	
	public String getTipoEvento() {
		return "TEATRO";
	}
}
