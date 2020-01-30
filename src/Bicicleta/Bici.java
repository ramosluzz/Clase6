package Bicicleta;

import Vehiculo.Vehiculo;

public class Bici extends Vehiculo {
	public String tipo;
	
	public Bici(String marca, String modelo,int ruedas, String color, int a�o,int velInicial, String tipo, int acelFre) {
		super(marca, modelo, ruedas,color, a�o, velInicial,acelFre);
		this.tipo = tipo;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.a�o + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Tipo:" + tipo + ", Actual: " + super.acelFre);
		  if(super.acelFre> 0)
		  {
			  System.out.println(" >>>Pedaleo mas rapido");
		  }
	}
}
