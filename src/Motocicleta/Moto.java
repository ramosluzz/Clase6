package Motocicleta;

import Vehiculo.Vehiculo;

public class Moto extends Vehiculo{
	public int veloMax;
	
	public Moto(String marca, String modelo,int ruedas, String color, int a�o, int velInicial, int veloMax,int acelFre) {
		super(marca, modelo, ruedas,color, a�o, velInicial,acelFre);
		this.veloMax =veloMax;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.a�o + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Vel. Max:" + veloMax + ", Actual: "+super.acelFre);
		  if(super.acelFre> veloMax)
		  {
			 System.out.println("> Supera a la velocidad maxima <");
		  }
	}
}
