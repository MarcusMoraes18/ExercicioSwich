import java.util.Scanner;
public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner Leitor = new Scanner(System.in);
	
	float pre�o;
	int codigo;
	float porc;
	
	
	System.out.println("digite o valor do produto");
	pre�o = Leitor.nextFloat();
	System.out.println("digite a condi��o de pagamento");
	codigo = Leitor.nextInt();
	
	switch(codigo){
		
	case 1:
		porc=10;
		
		System.out.println("Valor a ser pago: R$"+(pre�o-pre�o*porc/100));
		
		
		break;
		
	case 2:
		porc=5;
		System.out.println("Valor a ser pago: R$"+(pre�o-pre�o*porc/100));
	
	 
		break;
		
	case 3:
		
		System.out.println("Valor a ser pago em 2 vezes de: R$"+(pre�o/2));
		
		break;
	
	case 4:
		porc=10;
		System.out.println("Valor a ser pago em 3 vezes de: R$"+(pre�o*porc/100+(pre�o)/3));
		
	break;
		
	default:
		System.out.println("Codigo invalido");
		
	}
	
	
	
	
	
	}

}
