import java.util.Scanner;

	public class volumeEsfera{	

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite o valor do diametro :");
         int diametro = scan.nextInt();
         
         int raio = (diametro/2);
              double raioCubico = raio * raio * raio; // raio^3
              double volume = (4.0 / 3.0) * 3.14 * raioCubico;

         
       System.out.println("O volume da esfera é: " + volume);
        scan.close();
        
	}

	}