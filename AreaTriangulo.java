import java.util.Scanner;

	public class AreaTriangulo{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo : ");
        int base = scan.nextInt();
        System.out.println("Digite o valor da altura");
        int altura = scan.nextInt();
        
         int area = (base * altura)/2; 
        
         System.out.println("A area do triangulo  eh :" + area);
         scan.close();
        
       
        
        }
	}