package Automovil;

import Vehiculo.Vehiculo;

public class Auto extends Vehiculo{
	public String baul;
	public int veloMax;

  public Auto(String marca, String modelo, int ruedas, String color,int año, int velInicial, int veloMax, String baul, int acelFre) {
	 super(marca, modelo, ruedas, color,año, velInicial,acelFre);
	 this.veloMax = veloMax;
	 this.baul = baul;	
 }
  
  public void mostrarInfo()
  {	
	  System.out.println("- " + super.marca + " "+ super.modelo +", "+ super.año + ": ");
	  System.out.println("Ruedas: "+ super.ruedas +", Color:"+ super.color +", Vel. Max: "+ veloMax+ ", Baul:" + baul +", Actual: "+ super.acelFre);
	  
	  if(super.acelFre> veloMax)
	  {
		  System.out.println(">>>Supera a la velocidad maxima<<<");
	  }
  }
  
}