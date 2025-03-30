import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double a = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = scan.nextDouble();

        
        double mediaGeometrica = Math.sqrt(a * b);         // biblioteca para calcular raiz quadradaSS

     
        System.out.println("A media geometrica dos valores eh: " + mediaGeometrica);
        scan.close();
    }
}
