package Motocicleta;

import Vehiculo.Vehiculo;

public class Moto extends Vehiculo{
	public int veloMax;
	
	public Moto(String marca, String modelo,int ruedas, String color, int año, int velInicial, int veloMax,int acelFre) {
		super(marca, modelo, ruedas,color, año, velInicial,acelFre);
		this.veloMax =veloMax;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.año + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Vel. Max:" + veloMax + ", Actual: "+super.acelFre);
		  if(super.acelFre> veloMax)
		  {
			 System.out.println("> Supera a la velocidad maxima <");
		  }
	}
}
