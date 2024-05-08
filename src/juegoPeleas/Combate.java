package juegoPeleas;

import java.util.Scanner;

public class Combate {
	private static Scanner sc;
	private Personaje primerPersonaje;
	private Personaje segundoPersonaje;
	
	public Personaje getPrimerPersonaje() {
		return primerPersonaje;
	}
	public void setPrimerPersonaje(Personaje primerPersonaje) {
		this.primerPersonaje = primerPersonaje;
	}
	public Personaje getSegundoPersonaje() {
		return segundoPersonaje;
	}
	public void setSegundoPersonaje(Personaje segundoPersonaje) {
		this.segundoPersonaje = segundoPersonaje;
	}
	
	public void empezarCombate(Personaje primerPersonaje, Personaje segundoPersonaje) {
		sc = new Scanner(System.in);
	    int turno = 1;

	    while (true) {
	        System.out.println("Numero de turno: " + turno++);
	        System.out.println("Vida de " + primerPersonaje.getNombre() + ": " + primerPersonaje.getVida());
	        System.out.println("Vida de " + segundoPersonaje.getNombre() + ": " + segundoPersonaje.getVida());
	        System.out.println("Pulse enter para continuar con el combate");
	        sc.nextLine();

	        primerPersonaje.atacar(segundoPersonaje);
	        if (segundoPersonaje.getVida() <= 0) {
	            System.out.println("El ganador ha sido " + primerPersonaje.getNombre());
	            return;
	        }

	        segundoPersonaje.atacar(primerPersonaje);
	        if (primerPersonaje.getVida() <= 0) {
	            System.out.println("El ganador ha sido " + segundoPersonaje.getNombre());
	            return;
	        }
	    }
	}
}
