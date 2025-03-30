import java.util.Scanner;

public class VolumeLivre {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite a aresta do cubo : ");
        double aresta = scan.nextDouble();


        System.out.print("Digite o raio da esfera : ");
        double raio = scan.nextDouble();

    
        double pi = 3.14;

   
        double volumeCubo = aresta * aresta * aresta;

    
        double volumeEsfera = (4.0 / 3.0) * pi * raio * raio * raio;

        double volumeLivre = volumeCubo - volumeEsfera;

        System.out.println("O volume livre do ambiente é: " + volumeLivre);


        scan.close();
    }
}
