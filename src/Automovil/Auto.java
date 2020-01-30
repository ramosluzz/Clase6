package Automovil;

import Vehiculo.Vehiculo;

public class Auto extends Vehiculo{
	public String baul;
	public int veloMax;

  public Auto(String marca, String modelo, int ruedas, String color,int a�o, int velInicial, int veloMax, String baul, int acelFre) {
	 super(marca, modelo, ruedas, color,a�o, velInicial,acelFre);
	 this.veloMax = veloMax;
	 this.baul = baul;	
 }
  
  public void mostrarInfo()
  {	
	  System.out.println("- " + super.marca + " "+ super.modelo +", "+ super.a�o + ": ");
	  System.out.println("Ruedas: "+ super.ruedas +", Color:"+ super.color +", Vel. Max: "+ veloMax+ ", Baul:" + baul +", Actual: "+ super.acelFre);
	  
	  if(super.acelFre> veloMax)
	  {
		  System.out.println(">>>Supera a la velocidad maxima<<<");
	  }
  }
  
}