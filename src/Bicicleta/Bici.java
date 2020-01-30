package Bicicleta;

import Vehiculo.Vehiculo;

public class Bici extends Vehiculo {
	public String tipo;
	
	public Bici(String marca, String modelo,int ruedas, String color, int año,int velInicial, String tipo, int acelFre) {
		super(marca, modelo, ruedas,color, año, velInicial,acelFre);
		this.tipo = tipo;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.año + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Tipo:" + tipo + ", Actual: " + super.acelFre);
		  if(super.acelFre> 0)
		  {
			  System.out.println(" >>>Pedaleo mas rapido");
		  }
	}
}
