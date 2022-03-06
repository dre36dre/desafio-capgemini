package Questões;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String texto;
		System.out.println("Digite o texto:");
		texto=entrada.nextLine();
		long textoSemEspaco= texto.chars().filter(ch -> ch != ' ').count();
		System.out.println(textoSemEspaco);
		}
}
