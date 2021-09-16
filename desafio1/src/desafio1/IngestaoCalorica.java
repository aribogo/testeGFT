package desafio1;

import java.util.*;

public class IngestaoCalorica {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<String> alimentos = new ArrayList();
		List<Integer> calorias = new ArrayList();
		int count = 0;
		
		System.out.println("Digite a quantidade de calorias:");
		int qtdCalorias = in.nextInt();
		
		System.out.println("----- Alimentos Consumidos -----");
		
		while (count < 1) {
			System.out.println("Nome do Alimento:");
			String alimento = in.next();
			System.out.println(alimento);
			if (alimento.toLowerCase() == "sair") {
				break;
			}
			else {
				System.out.println("Quantidade:");
				int caloria = in.nextInt(); 
				
				alimentos.add(alimento);
				calorias.add(caloria);
			}
			}
			
			System.out.println("------------------");
			
			int totalCalorias = 0;
			
			for (int elemento : calorias) {
				totalCalorias += elemento; 
			}
			
			if (totalCalorias > qtdCalorias) {
				System.out.println("Você consumiu " + totalCalorias + " calorias e ficou acima da meta");
		}
			if (totalCalorias == qtdCalorias) {
				System.out.println("Você consumiu " + totalCalorias + " calorias e atingiu a meta");
			}
			else {
				System.out.println("Você consumiu " + totalCalorias + " calorias e ficou abaixo da meta");
			}
			
		

	}

}
