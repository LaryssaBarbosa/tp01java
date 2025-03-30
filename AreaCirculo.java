import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o diametro do circulo: ");
        double diametro = scan.nextDouble();

  
        double pi = 3.14;

   
        double raio = diametro / 2;

     
        double area = pi * raio * raio;

 
        System.out.println("A area do circulo com diametro " + diametro + " eh: " + area);

 
        scan.close();
    }
}
