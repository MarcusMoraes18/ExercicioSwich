import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner Cod=new Scanner(System.in);
		
		int codzin;
		int porc;
		float sal;
		
		System.out.println("Digite o código do cargo:  ");
		codzin=Cod.nextInt();
		
		System.out.println("Digite o salario: ");
		sal=Cod.nextFloat();
		
		switch(codzin) {
		
		
		case 1:
			porc=10;
			
			System.out.println("Seu cargo:"+"Diretor ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
			break;
		case 2:
			porc=20;
			
			System.out.println("Seu cargo:"+"Engenheiro ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
			break;
		
		case 3:
			porc=30;
			
			System.out.println("Seu cargo:"+"Técnico ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
			
			break;	
		case 4:
			porc=10;
			
			System.out.println("Seu cargo:"+"Gerente ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
			break;	
		case 5:
			porc=30;
			
			System.out.println("Seu cargo:"+"Analista ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
			break;	
		case 6:
			porc=20;
			
			System.out.println("Seu cargo:"+"Coordenador ");
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
		
		break;
		default:
		
			porc=40;
			
			System.out.println("Seu salario antigo  " + (sal));
			System.out.println("Seu salario novo  " + (sal*porc/100+(sal)));
			System.out.println("Aumento de: R$ " + (sal*porc/100));
		
		}
		
		
		
		
		
		
		
		
		
	}

}
