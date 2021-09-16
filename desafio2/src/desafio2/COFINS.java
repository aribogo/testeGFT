package desafio2;

public class COFINS implements Imposto{
	
private double v;
	
	
	
	public COFINS(double v) {
		this.v = v;
	}



	public double getV() {
		return v;
	}



	public void setV(double v) {
		this.v = v;
	}
	
	
	@Override
	public double calculaImposto(double valor) {
		double v;
		if (valor > 1200) {
			v = (4 * valor)/100;
		} else {
			v = valor;
		}
		return v;
	}
}
