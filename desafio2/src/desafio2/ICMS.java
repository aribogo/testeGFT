package desafio2;

public class ICMS implements Imposto{
	
	private double v;
	
	
	public ICMS(double v) {
		this.v = v;
	}


	public double getV() {
		return v;
	}


	public void setV(double v) {
		this.v = v;
	}


	public double calculaImposto(double valor) {
		v = (24* valor)/100;
		return v;
	}

}
