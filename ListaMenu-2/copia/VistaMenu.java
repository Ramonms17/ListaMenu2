package jcolonia.daw2021.listadoMenu.copia;

import java.util.Scanner;

public class VistaMenu extends VistaMatriz  {
	
	private String [] textoOpciones;
	private int opcionElegida;
	
	public VistaMenu (String[] opcionesMenu, Scanner sc) {
		super (sc);
		this.textoOpciones = new String [opcionesMenu.length];
		
		for (int i = 0; i < textoOpciones.length; i++) {
			this.textoOpciones[i] = textoOpciones[i];
		}
	}
	
	public void mostrarMenu() {
		System.out.println("0 = salir \n1 = Añadir colegio\n2 = gestion listado colegio\n3 = Exportar colegio a archivo\n4 = Importar colegio desde archivo");
		
		System.out.println("\n escoja una opcion del Menu:");
	}
	
	public static void mostrarTexto(String texto) {
		System.out.println("saliendo...  \n Adios, Que tengas un buen dia.");
		
	}
	
	public static void textoError(String texto) {
		System.out.println("<<Esta Opcion no es correcta>> \n ------------------------------\n Escriba aqui la opcion que se encuentre en este menu:\n");
		
	}
	
	public int pedirOpcion() {
		String linea;
		boolean exit=false; 
		
		while(!exit) {
			try {
				linea=sc.nextLine();
				opcionElegida=Integer.parseUnsignedInt(linea);
				if(opcionElegida>textoOpciones.length) {
					System.out.println("Esta opcion no es valida.");
				}else {
					exit=true;
				}
			}catch(NumberFormatException ex){
				System.out.printf("\tNo es una de las opciones validas <<%s>>%n", ex.getMessage());
			}
		}
		
		//opcionElegida = getEntrada().nextInt();
		return opcionElegida;
	}
	
}
