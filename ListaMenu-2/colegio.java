package jcolonia.daw2021.listadoMenu.copia;

import java.util.Scanner;

public class colegio  {

	
	private  String nombre, colegio, lugar;
	private TipoEducacion tipo;
	
	
	private int N�Matricula;
	
	public colegio(Scanner sc) {
		
	}
	
	public colegio(String nombre,String colegio, String lugar, TipoEducacion tipo, int N�Matricula) {
		this.nombre=nombre;
		this.colegio=colegio;
		this.lugar=lugar;
		this.tipo=tipo;
		this.N�Matricula=N�Matricula;
	}
	
	
	public  enum TipoEducacion{
		INFANTIL, PRIMARIA, SECUNDARIA, BACHILLERATO, FORMACION_PROFESIONAL;


	}

	public  String getNombre() {
		return nombre;
	}

	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public  String getColegio() {
		return colegio;
	}

	public  void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public  String getLugar() {
		return lugar;
	}

	public  void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public TipoEducacion getTipo() {
		
		return tipo;
	}

	
	public  void setTipoEducacion(TipoEducacion tipo) {
		this.tipo = tipo;
	}

	public  int getN�Matricula() {
		return N�Matricula;
	}

	public void setN�Matricula(int N�Matricula) {
		this.N�Matricula =N�Matricula;
	}
	
	public String toString() {
		String texto;
		texto=String.format("%7s     %7s        %7s        %7s               %d         %n",
				getNombre(),getColegio(),getLugar(),getTipo(),getN�Matricula());
		
		return texto;
		
	}

	
	
	
	
}