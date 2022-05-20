package jcolonia.daw2021.listadoMenu.copia;

import java.util.Scanner;

public class VistaListado extends VistaMatriz{
	
	public VistaListado (Scanner sc) {
		super(sc);	
	}
	
	public static void mostrarTexto(Datos listaNombres) {
		System.out.println("-Nombre - Colegio - Lugar - Tipo de Educacion - Numero de Matricula");
		System.out.println(listaNombres.toString());
	}
	
	

}
