package lacosderepeti��o;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		int contador , par = 0 , impar= 0 ;
		Scanner ler = new Scanner(System.in);
		
		for(contador = 1 ; contador <= 10 ; contador++ ) {
			System.out.println("Escreva os n�meros aqui:") ;
			contador= ler.nextInt(); 
			
			if (contador% 2 == 0) {
				par= par+1 ;}
		 
			
			 if (contador% 2 > 0){
				impar = impar+1 ; } }
				 System.out.println("\nA quantidade de impares s�o: "+impar); 
				 System.out.println("\nA quantidade de pares s�o: "+ par); } }



