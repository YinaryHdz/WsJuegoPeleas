package juegoPeleas;

public class Guerrero extends Personaje {
	private double fuerza;
	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int danioArma() {
		double danio = 0.0;
		if (getArma().getTipoArma() == TipoArma.ESPADA || getArma().getTipoArma() == TipoArma.ARCO ) {
			danio = 10.0;
		}
		return (int)(getArma().getDanio()  + danio );
	}

}
