package jcolonia.daw2021.listadoMenu.copia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.NullPointerException;


public class Control <sc>{
	
	private Scanner sc;
	private Datos listaNombres;
	private static final String [] OPCIONES_MENU = {"SALIDA","altas colegio","gestion listado colegio","importar colegio desde archivo","exportar colegio a archivo" };
	
	public Control (Scanner sc) {
		listaNombres =new Datos(sc);
		this.sc =sc;
	}
	
	public void buclePrincipal() throws IOException,NullPointerException {
		
		VistaMenu menu = new VistaMenu(OPCIONES_MENU, sc);
		int opcionElegida = -1;
		boolean exit = false;
		
		while (!exit) {

			menu.mostrarMenu();
			opcionElegida = menu.pedirOpcion();		
			//VistaMenu.mostrarTexto(String.format("%d", opcionElegida));
			
			switch (opcionElegida) {
			
			case 0:
				menu.mostrarTexto("saliendo... \n Adios, Que tengas un buen dia." );
				exit = true;
				break;

			case 1: //Añadir colegio
				gestionAltas();
				break;
			case 2://gestion listado colegios
				gestionListado();
				break;
			case 3://Importar colegio desde archivo				
				exportarColegio();
				break;
			case 4://Exportar colegio a archivo 				
				importarNombres();
				break;

			default:
				menu.textoError("<<Esta Opcion no es correcta>> \n  Escriba aqui la opcion que se encuentre en el menu: \n ");
				break;
			}

		}
	}
	
	public void gestionAltas(){
		VistaAltas llamar = new VistaAltas(sc, listaNombres); 
		colegio añadir =new colegio(null);
		llamar.cargarColegios(añadir);
		
		//listadoNombres(ArrayList).agregarColegio(añadir);
	}


	public void gestionListado(){
		new VistaListado (sc);
		VistaListado.mostrarTexto(listaNombres);
	}
		
	public void importarNombres() {
//			String texto;	
//			// crea un objeto file, el constructor recibe la
//	 		// ruta del archivo del cual quiero saber sus propiedades
//	 		File file = new File("./Colegios.txt");
//	 		// para saber si el archivo no existe, devuelve true o false
//	 		System.out.println(file.exists());
//	 		// para saber si directorio, devuelve true o false
//	 		System.out.println(file.isDirectory());
//	 		// para saber la fecha de modificación
//	 		System.out.println(file.lastModified());
//	 		// para saber el nombre del archivo
//	 		System.out.println(file.getName());
//	 		// para saber la ruta
//	 		System.out.println(file.getPath());
//	 		// para saber el tamaño en bytes que ocupa en disco
//	 		System.out.println(file.length());
//	 		// para saber si es de lectura, devuelve true o false
//	 		System.out.println(file.canRead());
//	 		// para saber si es de escritura, devuelve true o false
//	 		System.out.println(file.canRead());
//	 		// para saber el tamaño en bytes que ocupa en disco
//	 		System.out.println(file.length());
//	 		// crea un directorio en disco, devuelve true o false, para esto la ruta no debe ser .txt
//	 		// ejemplo: "C:\\archivos\\estudiantes" y crea el directorio estudiantes
//	 		System.out.println(file.mkdir());
//
//	 		// elimina el arhivo o directorio (debe estar vacio), devuelve true o false
//	 		// System.out.println(file.delete());
//
//	 		// si fuera un directorio, para saber los arhivos que contiene
//	 		
//	 		
//	 		
//	 		for (String string : file.list()) {
//	 			System.out.println(string);
//	 		}
	 		
	 		
	 		
	 		
	 	}
				
//		String texto;
//		try (FileReader fr = new FileReader("Colegios.txt");
//				BufferedWriter in = new BufferedWriter(fr);) {
//
//					boolean salirYa = false;
//						while (!salirYa) {
//							texto = in.readLint();
//						if (texto == null) {
//							salirYa = true;
//						} else {
//							listadoNombres.add(texto);
//						}
//					}
//
//		} catch (FileNotFoundException e) {
//			System.err.println("Archivo no encontrado"), e.getLocalizedMessage();
//		} catch (IOException e) {
//			System.err.printf("Error de escritura: %n");
//		}
//	}
	
	public void exportarColegio(){
		almacenamiento exportar=new almacenamiento();
		try {
			exportar.exportarNombres();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		
		
		
		
		
		
		//		try(PrintWriter exit =new PrintWriter("./Colegios.txt") ){
//				
//				for (String texto : listadoNombres) {
//					exit.println(texto);
//				}
//			}
//			catch(FileNotFoundException e) {
//				System.err.printf("Archivo no encontrado %n", e.getLocalizedMessage());
//			}
//			catch (NullPointerException e) {
//				System.err.printf("Esta vacio el listado %n", e.getLocalizedMessage());
//			}
		
		}
		
		public static void main (String [] args) throws IOException, NullPointerException{
			Scanner entrada = new Scanner(System.in);
			Control controlGeneral = new Control(entrada);
			controlGeneral.buclePrincipal();
		}
	
}
