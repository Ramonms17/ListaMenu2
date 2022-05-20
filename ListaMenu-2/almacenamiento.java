package jcolonia.daw2021.listadoMenu.copia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class almacenamiento extends Datos {

	private static final String ARCHIVO = ("DatosColegios.txt");

	public void exportarNombres() throws FileNotFoundException{

		try(PrintWriter salida = new PrintWriter(ARCHIVO)){
		
		File archivo = new File(ARCHIVO);

		for (int i=0;i<dato.size();i++){
			
		System.out.printf("%s#%s#%s#%f#%d#",dato.get(i).getNombre(),dato.get(i).getColegio(),
				dato.get(i).getLugar(),dato.get(i).getTipo(), dato.get(i).getNºMatricula());
		}
		}catch(FileNotFoundException e){
		System.err.printf("Archivo no encontrado", e.getLocalizedMessage());
		}
		
	}
}
