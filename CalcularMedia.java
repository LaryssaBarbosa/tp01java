import java.util.Scanner;

        public class CalcularMedia{
	
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double v1 = scan.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double v2 = scan.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double v3 = scan.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double v4 = scan.nextDouble();

       
 double media = (v1 + v2 + v3 + v4) / 4;

 System.out.println("A media aritmetica dos valores eh: " + media);
 scan.close();

}

}