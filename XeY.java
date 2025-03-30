import java.util.Scanner;

public class XeY {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

   
        System.out.println("Digite um valor inteiro para X :");
        int X = scan.nextInt(); 
      
        System.out.println("Digite um valor inteiro para Y :");
        int Y = scan.nextInt();  

     
        double resultadoPotencia = Math.pow(X, Y);

  
        System.out.println("O valor de X^Y (X elevado a Y) eh: " + resultadoPotencia);


        scan.close();
    }
}

