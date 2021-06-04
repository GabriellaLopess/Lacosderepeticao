package lacosderepetição;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {

		int numero = 0, soma = 0, contador= 0 ;  
		double media ; 

		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva aqui o numero");

		do {
			numero = leia.nextInt(); 
				soma += numero;
		if ( numero % 3 == 0);
		   		soma += numero ;
		   			contador++ ;}
				
		 while (numero != 0);

		leia.close();
		media = soma / contador;
		
		System.out.println(" A média é:" + media);  
	}
	
	

}
		


