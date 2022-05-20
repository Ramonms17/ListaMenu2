package jcolonia.daw2021.listadoMenu.copia;

import java.util.Scanner;

public class VistaMatriz <sc> {
	
	public Scanner sc;
	
	public VistaMatriz (Scanner sc) {
		this.sc=sc;
	}
	
	public Scanner getEntrada() {
		return sc;
	}
	
	public static void mostrarTexto(String texto) {
		for(int i=0; i<texto.length(); i++) {
			System.out.println(texto);
		} 
		
			
}
}