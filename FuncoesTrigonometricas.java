import java.util.Scanner;

public class FuncoesTrigonometricas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
         System.out.print("Digite o valor do angulo em graus: ");
        double graus = scan.nextDouble();
       
        double radianos = Math.toRadians(graus);
                double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1.0 / cosseno;          
      
        System.out.println("Seno do angulo: " + seno);
        System.out.println("Cosseno do angulo: " + cosseno);
        System.out.println("Tangente do angulo: " + tangente);
        System.out.println("Secante do angulo: " + secante);
        
       
        scan.close();
    }
}
