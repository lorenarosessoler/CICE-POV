package com.cice.clases;

import java.util.ArrayList;

public class Presidente extends Director{
	
	//Lista de directores
	private ArrayList<Director> lameculos;

	
	//Constructores
	public Presidente() {
		super();
	}

	public Presidente(ArrayList<Director> lameculos) {
		super(null);
		this.lameculos = lameculos;
	}

	//Getters y Setters
	public ArrayList<Director> getLameculos() {
		return lameculos;
	}

	public void setLameculos(ArrayList<Director> lameculos) {
		this.lameculos = lameculos;
	}
	

	//Voy a sobreescribir el método soyElMejorDirector
	@Override
	protected boolean soyElMejorDirector() {
		//return super.soyElMejorDirector();
		return true;
	}
}
