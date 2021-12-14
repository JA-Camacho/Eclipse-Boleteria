package mvc_Modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import patron_generico.atributos_gen;
public class Cliente {

	private atributos_gen<?, ?> datos;

	public Cliente(String cedula, String nombre, String telefono, String direccion) {
		datos = new atributos_gen<String, String>(cedula, nombre, telefono, direccion);
	}

	public String getCedula() {
		return datos.getAtributoT1().toString();
	}

	public String getNombre() {
		return datos.getAtributoT2().toString();
	}

	public String getTelefono() {
		return datos.getAtributoS4().toString();
	}

	public String getDireccion() {
		return datos.getAtributoS5().toString();
	}

	public String mostrarFecha(){
		Date date = new Date();
		DateFormat dateFormat=new SimpleDateFormat("dd/MM/yy");
		return (dateFormat.format(date).toString());
	}
}
