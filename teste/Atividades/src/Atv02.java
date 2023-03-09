import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {
		//FIBONACCI
		Scanner inp = new Scanner(System.in);
		System.out.println("Insira um valor para verificar se pertence a sequência: ");
		int input = inp.nextInt();
		
		int inicial = 0;
		int proximoValor = 1;
		int aux;
		
		
		System.out.println(inicial);
		
		do {
			
			aux = proximoValor;
			proximoValor += inicial;
			inicial = aux;
			
			System.out.println(inicial);
			
			if(inicial > input) {
				break;
			}
			
		}while(proximoValor != input);
		
		if(proximoValor == input) {
			System.out.println(input);
			System.out.println("O numero " + input+ " pertence a sequencia Fibonacci");
		}else {
			System.out.println("O numero " + input+ " NAO pertence a sequencia Fibonacci");
		}
	}

}
