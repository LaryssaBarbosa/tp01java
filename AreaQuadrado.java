import java.util.Scanner; 

public class AreaQuadrado{
	public static void main (String[] args){

 	Scanner scan = new Scanner(System.in); //instancia

	System.out.println("Digite a areta de um quadrado:");
	int aresta = scan.nextInt();

	int soma = (aresta * 2);

	System.out.println("A area do quadrado eh :" + soma);

	scan.close();

}
}

