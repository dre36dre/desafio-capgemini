package Questões;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetoresPares {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);	
	int vetor[]= {5,4,3,2,1}; 
int par=0;
for(int i=0; i <= vetor.length ; i++) {
vetor[i]=vetor[i]-vetor[i+1];
par+=1;		
	
	
	System.out.println(par);
}
 }
}