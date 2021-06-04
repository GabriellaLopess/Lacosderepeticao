package lacosderepetição;
import java.util.Scanner;
public class Exercicio5 {
	
	
	public static void main(String[] args) {
		int numero = 0, soma = 0, contador= 0 ; 
		Scanner leia = new Scanner(System.in); 
		System.out.println("Escreva o numero:");
	do {
			numero = leia.nextInt();
			soma = soma + numero ; }
	
		while (numero != 0) ;
		System.out.println("O resultado da soma é:" +soma);
		 
}	}
