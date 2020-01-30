package Vehiculo;

public class Vehiculo {
	public String marca;
	public String modelo;
	public int ruedas;
	public String color;
	public int año;
	public int velInicial;
	public int acelFre;
	
	public Vehiculo(String marca, String modelo, int ruedas, String color, int año, int velInicial, int acelFre) {
		this.marca = marca;
		this.modelo = modelo;
		this.ruedas=ruedas;
		this.color= color;
		this.año = año;
		this.velInicial= velInicial;
		this.acelFre = acelFre;
	}
}

