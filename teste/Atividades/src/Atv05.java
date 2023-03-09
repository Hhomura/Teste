
public class Atv05 {

	public static void main(String[] args) {
		
		String a = "Felipe";
		String nomeInverso = "";

		char[] nome = a.toCharArray();
		
		System.out.println("Entrada: "+a);
		
		for(int i = a.length(); i > 0; i--) {
			nomeInverso += nome[i-1]+"";
		}
		
		System.out.println("Saida: "+nomeInverso);
		

	}

}
