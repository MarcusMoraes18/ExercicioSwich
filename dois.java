import java.util.Scanner;
public class dois {

	public static void main(String[] args) {
		// Cachorro quente 100 3,20 
		//Bauru simples 101 4,30 
		//Bauru com ovo 102 5,50 
		//Hambúrger 103 3,20 
		//Cheeseburguer 104 4,30 
		//Refrigerante 105 4,00 

	Scanner Prod = new Scanner(System.in);
	Scanner Quant = new Scanner(System.in);
	int produto;
	float quantidade;
	
	
	
	System.out.println("Escolha um produto");
	produto = Prod.nextInt();	
	System.out.println("Quantos deseja?");
	quantidade= Quant.nextFloat();
	
	
	
	switch(produto) {
	
	case 100:
		System.out.println("Cachorro quente ");
		System.out.println("Valor: "+(quantidade)*(3.20));
	break;
	
	case 101:
		System.out.println("Bauru simples ");
		System.out.println("Valor: "+(quantidade)*(4.30));
	break;
	
	case 102:
		System.out.println("Bauru com ovo ");
		System.out.println("Valor: "+(quantidade)*(5.50));
	break;
	
	
	case 103:
		System.out.println("Hambúrger ");
		System.out.println("Valor: "+(quantidade)*(3.20));
	break;
	
	
	case 104:
		System.out.println("Cheeseburguer ");
		System.out.println("Valor: "+(quantidade)*(4.30));
	break;
	
	
	case 105:
		System.out.println("Refrigerante ");
		System.out.println("Valor: "+(quantidade)*(4.00));
	break;
	
	
	default: 
	System.out.println("Repita o precesso");
	System.out.println(99.99);
	}
	
	
	
	}

}
