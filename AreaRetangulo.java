import java.util.Scanner;

	public class AreaRetangulo {
   	 public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextInt();

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextInt();

        double area = base * altura;

   
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
