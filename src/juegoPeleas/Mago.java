package juegoPeleas;

public class Mago extends Personaje {
	private double inteligencia;
	
	@Override
	public void atacar(Personaje p) {
		
		
	}

	@Override
	public int danioArma() {
		int danio = 0;
		if (getArma().getTipoArma() == TipoArma.HECHIZO) {
			danio = 10;
		}
		return (int)(getArma().getDanio() + danio );
	}





	

		
	

}
