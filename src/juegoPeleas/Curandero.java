package juegoPeleas;

public class Curandero extends Personaje{
	protected int sabiduria;
	@Override
	public void atacar(Personaje p) {	
		
		 if (p != null && p.getArma() != null && p.getArma().getTipoArma()!= null) {
	            int vidaFinal = p.getVida() - danioArma();
	            System.out.println(p.getNombre() +" Ha sido atacado, el danio es de: " + danioArma());
	            p.setVida(vidaFinal);
	            if(p.getVida()<=0) {
	            	p.setVida(0);
	            	System.out.println(p.getNombre() + " Ha sido derrotado");
	            }else {
	            	System.out.println("La vida de " + p.getNombre() + " despues del ataque es de: " +p.getVida());
	            }
	        } else {
	            System.out.println("No se puede atacar debido a datos de personaje nulos.");
	        }
		
	}
	@Override
	public int danioArma() {
		int danio = 0;
		if (getArma().getTipoArma() == TipoArma.REZOS) {
			danio = 10 + sabiduria;
		}
		return (int)(getArma().getDanio() + danio );
	}

}
