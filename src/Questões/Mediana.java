package Questões;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mediana {

	public static int median(int[] elements) {

		List<Integer> listaNumeros = new ArrayList<>();

		for(int elemento : elements){
			listaNumeros.add(elemento);
		}

		Collections.sort(listaNumeros);

		double mediana;
		int verificaPar = listaNumeros.size() % 2;
		System.out.println(verificaPar);

		if (verificaPar == 0){
			mediana = ( listaNumeros.get(
					((listaNumeros.size() / 2) - 1))
					+ (listaNumeros.get(listaNumeros.size() /2))
			) / 2;
			System.out.println(listaNumeros.get(
					((listaNumeros.size() / 2))));
		}else {
			mediana = listaNumeros.get(listaNumeros.size() / 2);
		}
		return (int)mediana;
	}

	 public static void main(String[] args) {
			int[] number = {9,2,1,4, 6};

			System.out.println(median(number));

}
	}


