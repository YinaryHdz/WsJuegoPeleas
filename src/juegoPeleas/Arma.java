package juegoPeleas;

public class Arma {
	private TipoArma tipoArma;
	private int danio;
	
	
public TipoArma getTipoArma() {
		return tipoArma;
	}


	public void setTipoArma(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}


	public double getDanio() {
		return danio;
	}


	public void setDanio(int danio) {
		this.danio = danio;
	}


public  int danioArma(Personaje p){
	 	int bonus = 0;
		if(p instanceof Mago) {
			Mago mago = (Mago)p;
			if (tipoArma == TipoArma.HECHIZO) {
				bonus = 10;
				return (this.danio + bonus);
			}else {
				return this.danio;
			}
		}else if (p instanceof Guerrero) {
			Guerrero guerrero = (Guerrero)p;
			if (tipoArma == TipoArma.ARCO ||tipoArma == TipoArma.ESPADA ) {
				bonus = 10;
				return (this.danio + bonus);
			}else {
				return this.danio;
			}
		}else if (p instanceof Curandero) {
			Curandero curandero = (Curandero)p;
			if (tipoArma == TipoArma.REZOS ) {
				bonus = 10;
				return (this.danio + bonus);
			}else {
				return this.danio;
			}
		}
		return (this.danio + bonus);

	}
}
