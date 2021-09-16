package desafio2;

public class IPI implements Imposto{

	private double v;
	
	
	
	public IPI(double v) {
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
		if (valor >= 2000) {
			v = (11 * valor)/100;
		} else {
			v = (5 * valor)/100;
		}
		return v;
	}

}
