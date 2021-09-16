package desafio3;

import java.util.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		List<Integer> listaCompleta = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);

		for (int count = 1; count < 6; count++) {
			System.out.println();
			System.out.println("digite o valor " + count + ":");
			int input = in.nextInt();
			listaCompleta.add(input);
		}

		Collections.sort(listaCompleta);
		System.out.println(listaCompleta);
	}

}
