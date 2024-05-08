package juegoPeleas;

public class Curandero extends Personaje{
	private double sabiduria;
	@Override
	public void atacar(Personaje p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int danioArma() {
		double danio = 0.0;
		if (getArma().getTipoArma() == TipoArma.REZOS) {
			danio = 10.0;
		}
		return (int)(getArma().getDanio() + danio );
	}

}
