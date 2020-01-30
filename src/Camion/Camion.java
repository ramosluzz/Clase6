package Camion;

import Vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	public float tamaño;
	public int veloMax;
	
	public Camion(String marca, String modelo,int ruedas, String color, int año, int velInicial,int acelFre, int veloMax, float tamaño) {
		super(marca, modelo, ruedas,color, año, velInicial,acelFre);
		this.veloMax =veloMax;
		this.tamaño = tamaño;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.año + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Vel. Max:" + veloMax + ", Tam. del Acoplado: " + tamaño + ", Actual: " + super.acelFre);
		if(super.acelFre> veloMax)
	    {
		  System.out.println(">>>Supera a la velocidad maxima <<<");
		}
	}
}
