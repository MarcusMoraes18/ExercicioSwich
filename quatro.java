import java.util.Scanner;
public class quatro {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner Notas=new Scanner(System.in);
	Scanner Codzin=new Scanner(System.in);
	int n1, n2 ,n3;
	int cod;
	
	System.out.println("digite qual média você quer fazer: ");
	System.out.println("1-Média aritmética. ");
	System.out.println("2-Média ponderada. ");
	cod=Codzin.nextInt();
	
	switch(cod) {
	
	
	case 1:
		System.out.println("Digite Sua primeira nota:");
		n1=Notas.nextInt();
		System.out.println("Digite Sua segunda nota:");
		n2=Notas.nextInt();
		System.out.println("Digite Sua terceira nota:");
		n3=Notas.nextInt();
	
		System.out.println("Sua Média: "+(n1+n2+n3)/3);
	
		break;
	
	case 2:
	
	System.out.println("Digite Sua primeira nota:");
	n1=Notas.nextInt();
	System.out.println("Digite Sua segunda nota:");
	n2=Notas.nextInt();
	System.out.println("Digite Sua terceira nota:");
	n3=Notas.nextInt();
	
	System.out.println("Sua Média: "+(n1*3+n2*3+n3*4)/(3+3+4));
	
	break;
	
	
	}
	
	
	
	
	}

}
