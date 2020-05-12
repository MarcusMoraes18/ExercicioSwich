import java.util.Scanner;
public class um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Escolha = new Scanner(System.in);	
	int num;
	
	System.out.println("Digite o codigo do produto que deseja");
	num = Escolha.nextInt();
	
	switch(num) {
	
		case 001:
			System.out.println("Parafuso");
			break;
		case 002:
			System.out.println("Porca");
			break;
		case 003:
			System.out.println("Prego");
			break;
		case 004:
			System.out.println("Ferramenta");
			break;
		default:
			System.out.println("Diversos");
		

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
