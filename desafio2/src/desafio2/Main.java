package desafio2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor para calculo dos impostos:");
		Scanner in = new Scanner(System.in);
		double valor = in.nextDouble();
		
		ICMS valor1 = new ICMS(valor);
		IPI valor2 = new IPI(valor);
		COFINS valor3 = new COFINS(valor);
		
		double impostoICMS = valor1.calculaImposto(valor);
		double impostoIPI = valor2.calculaImposto(valor);
		double impostoCOFINS = valor3.calculaImposto(valor);
		
		
		System.out.println("O ICMS vai custar " + impostoICMS);
		System.out.println("O IPI vai custar " + impostoIPI);
		System.out.println("O COFINS vai custar " + impostoCOFINS);
		
		double total = impostoICMS + impostoIPI + impostoCOFINS;
		
		System.out.println("O total do imposto será: " + total);
		

	}

}
