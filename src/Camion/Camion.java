package Camion;

import Vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	public float tama�o;
	public int veloMax;
	
	public Camion(String marca, String modelo,int ruedas, String color, int a�o, int velInicial,int acelFre, int veloMax, float tama�o) {
		super(marca, modelo, ruedas,color, a�o, velInicial,acelFre);
		this.veloMax =veloMax;
		this.tama�o = tama�o;
	}
	public void mostrarInfo()
	{
		System.out.println("- " + super.marca +" "+ super.modelo +", "+ super.a�o + ": ");
		System.out.println(" Ruedas: "+ super.ruedas +", Color: "+ super.color + ", Vel. Max:" + veloMax + ", Tam. del Acoplado: " + tama�o + ", Actual: " + super.acelFre);
		if(super.acelFre> veloMax)
	    {
		  System.out.println(">>>Supera a la velocidad maxima <<<");
		}
	}
}
