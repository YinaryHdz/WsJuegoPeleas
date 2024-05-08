package juegoPeleas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainJuegoPeleas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        List<Personaje> listaPersonajes = new ArrayList<>();
        
        
        listaPersonajes.add(crearPersonaje("Curandero", sc));
        listaPersonajes.add(crearPersonaje("Mago", sc));
        listaPersonajes.add(crearPersonaje("Guerrero", sc));
        Combate combate = new Combate();
        for (int i = 0; i < listaPersonajes.size(); i++) {
            for (int j = i + 1; j < listaPersonajes.size(); j++) {
                Personaje p1 = listaPersonajes.get(i);
                Personaje p2 = listaPersonajes.get(j);
  
                System.out.println("Combate: " + p1.getNombre() + " vs " + p2.getNombre());
                combate.empezarCombate(p1, p2);
                if (p1.getVida() <= 0 || p2.getVida() <= 0) {
                    break;
                }
              
            }
        }
        
       
    }

    public static Personaje crearPersonaje(String tipo, Scanner sc) {
        System.out.println(tipo);
        Personaje personaje = null;

        System.out.println("Introduce el nombre del " + tipo.toLowerCase());
        String nombre = sc.next();

        System.out.println("Introduce la vida del " + tipo.toLowerCase());
        int vida = sc.nextInt();

        Arma arma = new Arma();
        System.out.println("Introduce el tipo de arma del " + tipo.toLowerCase());
        for (int i = 0; i < TipoArma.values().length; i++) {
            System.out.println(i + " - " + TipoArma.values()[i]);
        }
        int seleccionTipo = sc.nextInt();
        TipoArma tm = TipoArma.values()[seleccionTipo];
        arma.setTipoArma(tm);
        System.out.println("Ha seleccionado: " + tm);

        System.out.println("Introduce la cantidad de danio que hara el arma");
        int danio = sc.nextInt();
        arma.setDanio(danio);

        if (tipo.equalsIgnoreCase("Curandero")) {
            Curandero curandero = new Curandero();
            curandero.setNombre(nombre);
            curandero.setVida(vida);
            curandero.setArma(arma);
            System.out.println("Por ultimo, introduce la cantidad de sabiduria que tendra");
            int poder = sc.nextInt();
            curandero.sabiduria = poder;

            personaje = curandero;
        } else if (tipo.equalsIgnoreCase("Mago")) {
            Mago mago = new Mago();
            mago.setNombre(nombre);
            mago.setVida(vida);
            mago.setArma(arma);
            System.out.println("Por ultimo, introduce la cantidad de inteligencia que tendra");
            int poder = sc.nextInt();
            mago.inteligencia = poder;

            personaje = mago;
        } else if (tipo.equalsIgnoreCase("Guerrero")) {
            Guerrero guerrero = new Guerrero();
            guerrero.setNombre(nombre);
            guerrero.setVida(vida);
            guerrero.setArma(arma);
            System.out.println("Por ultimo, introduce la cantidad de fuerza que tendra");
            int poder = sc.nextInt();
            guerrero.fuerza = poder;

            personaje = guerrero;
        }

        return personaje;
	}
}
