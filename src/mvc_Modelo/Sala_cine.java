package mvc_Modelo;
import patron_generico.*;
public class Sala_cine {

	private atributos_gen<Integer, String> datos;
	private char [][] sala;
	private archivos arch;
	public Sala_cine(int num, String horario) {
		sala = new char[6][10];
		arch = new archivos();
		datos = new atributos_gen<Integer, String>(0,"src/Salas/Sala" + num + ".txt");
		cargar_sala();
	}

	public void cargar_sala() {
		datos.setAtributoT1(0);
		datos.setAtributoT2(0);
		String [] asientos = arch.leer(datos.getAtributoS4().toString()).split("[\n]|[;]");
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				if(asientos[datos.getAtributoT1()].charAt(0) == '0')
					datos.setAtributoT2(datos.getAtributoT2() + 1);
				sala[i][j] = asientos[datos.getAtributoT1()].charAt(0);
				datos.setAtributoT1(datos.getAtributoT1() + 1);
			}
		}
	}

	public void asignarAsiento(char fila, int columna) {
			sala[fila - 65][columna] = 'X';
	}

	public void guardarSala() {
		datos.setAtributoS5("");
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 9)
					datos.setAtributoS5(datos.getAtributoS5() + String.valueOf(sala[i][j]));
				else
					datos.setAtributoS5(datos.getAtributoS5() + String.valueOf(sala[i][j]) + ";");
			}
			if(i != 7)
				datos.setAtributoS5(datos.getAtributoS5() + "\n");
		}
		arch.escribir(datos.getAtributoS4(), datos.getAtributoS5(), true);
	}
	
	public char[][] getSala(){
		return sala;
	}
	
	public long getCantidad() {
		return datos.getAtributoT2();
	}
}
