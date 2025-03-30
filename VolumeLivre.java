    import java.util.Scanner;

public class VolumeLivre {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);

     
        System.out.print("Digite a aresta do cubo : ");
        double aresta = scan.nextDouble();

       
        System.out.print("Digite o raio da esfera : ");
        double raio = scan.nextDouble();


        if (raio > aresta) {
            System.out.println("O raio da esfera nao pode ser maior que a aresta do cubo.");
        } else {
            double pi = 3.14;


            double volumeCubo = aresta * aresta * aresta;

        
            double volumeEsfera = (4.0 / 3.0) * pi * raio * raio * raio;

   
            double volumeLivre = volumeCubo - volumeEsfera;

          
            System.out.println("O volume livre do ambiente eh: " + volumeLivre);
        }

        scan.close();
    }
}
