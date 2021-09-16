package desafio4;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

	int quantprodt;

	public Caixa(int quantprodt) {
		super();
		this.quantprodt = quantprodt;
	}

	public int getQuantprodt() {
		return quantprodt;
	}

	public void setQuantprodt(int quantprodt) {
		this.quantprodt = quantprodt;
	}

	public double calculaValorFinal(int quantidade) {
		double valorDesconto;
		double valorFinal;
		Produto produto;
		List<String> todosProdutos = new ArrayList();
		for (int x = 0; x <= quantprodt; x++) {
			for (String elemento : todosProdutos) {
				if (produto.getTipo() == 1) {
					 valorDesconto = (produto.getValor()) * 95 / 100;
					 valorFinal = valorDesconto * quantidade;
					System.out.println(produto.getNome() + "| " + valorFinal);
				}
				if (produto.getTipo() == 3 && quantidade > 5) {
					valorDesconto = (produto.getValor()) * 93 / 100;
					double valorFinal1 = valorDesconto * quantidade;
					System.out.println(produto.getNome() + "| " + valorFinal);

				} else {
					valorFinal = valorDesconto * quantidade;
					valorDesconto = (produto.getValor()) * 88 / 100;
					System.out.println(produto.getNome() + "| " + valorFinal);

				}
			}
		}
		return valorFinal;
	}
}
