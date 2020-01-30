package Principal;

import java.util.ArrayList;

import Automovil.Auto;
import Bicicleta.Bici;
import Camion.Camion;
import Motocicleta.Moto;

public class Principal {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("FIAT","Cronos", 4,"Rojo", 2019,0, 177,"Si", 120);
		Auto a2 = new Auto("VOLKSWAGEN","Amarok", 4,"Negro", 2000,0, 150,"No", 190 );
		Auto a3 = new Auto("CHEVROLET","Prisma", 4,"Blanco", 2020,0, 180,"Si",0);
		Bici b1 = new Bici("MOUNTAIN", "Pro 100",2, "Negro", 2010, 0,"Paseo",120);
		Bici b2 = new Bici("TOSCANO", "R28",2, "Blanco/Negro", 2014,0, "Carrera",100);
		Bici b3 = new Bici("TOSCANO", "Pro B56",2, "Gris", 2010,0, "Paseo",0);
		Moto m1 = new Moto("HONDA", "B12",2,"Gris",2011,180,0, 200);
		Moto m2 = new Moto("DUCATI", "BOOL",2,"Negro",2011,160,0,0);
		Moto m3 = new Moto("VICTORIA", "AAA",2,"Rosa",2011,177,0,90);
		Camion c1 = new Camion("FIAT","FILA",4,"Rojo",2000,0,120,177,110);
		Camion c2 = new Camion("MITSUBISHI","AAA",4,"Negro",2010,0,210,180,100);
	    Camion c3 = new Camion("MERCEDES-BENZ","RRR",4,"Blanco",2009,0,20,160,90);
		ArrayList<Auto> autos = new ArrayList<Auto>();
		autos.add(a1);
		autos.add(a2);
		autos.add(a3);
		ArrayList<Bici> bicis = new ArrayList<Bici>();
		bicis.add(b1);
		bicis.add(b2);
		bicis.add(b3);
		ArrayList<Moto> motos = new ArrayList<Moto>();
		motos.add(m1);
		motos.add(m2);
		motos.add(m3);
		ArrayList<Camion> camiones = new ArrayList<Camion>();
		camiones.add(c1);
		camiones.add(c2);
		camiones.add(c3);
	    System.out.println("> AUTOS:");
		a1.mostrarInfo();
		a2.mostrarInfo();
		a3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> BICICLETAS:");
		b1.mostrarInfo();
		b2.mostrarInfo();
		b3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> MOTOS:");
		m1.mostrarInfo();
		m2.mostrarInfo();
		m3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> CAMIONES:");
		c1.mostrarInfo();
		c2.mostrarInfo();
		c3.mostrarInfo();
		
		
  /*Cada vehículo además tiene una velocidad inicial que es 0 y
  se debe poder acelerar y frenar. En el caso de la bicicleta, al acelerarlo, además debe llevar la leyenda "Pedaleo más rápido".
  Acelerar y frenar al menos uno de cada vehículo.*/

		
	}

}
