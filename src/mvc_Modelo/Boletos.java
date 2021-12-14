package mvc_Modelo;
import patron_generico.atributos_gen;
import patron_generico.configurable;
public class Boletos {
	
	private atributos_gen<String, Long> datos;
	public Boletos(Long numAdultos, Long numNinos) {
		datos = new atributos_gen<String, Long>();
		datos.setAtributoS4(numAdultos);
		datos.setAtributoS5(numNinos);
	}
	
	public long getNumNinos() {
		return datos.getAtributoS5();
	}
	
	public long getNumAdultos() {
		return datos.getAtributoS4();
	}
	
	public void agregarAsiento(String asiento) {
		datos.addAlmacen(asiento);
	}
	
	public String[] getAsientos() {
		String[] asientos = new String[datos.getAlmacen().size()];
		for(int i = 0; i < datos.getAlmacen().size(); i++)
			asientos[i] = datos.getAlmacen().get(i);
		return asientos;
	}
}
