import java.util.Scanner;
public class tres {

	public static void main(String[] args) {
		//1 Executa a rotina de Inclus�o de Alunos
		//2 Executa a rotina de Altera��o de Alunos 
		//3 Executa a rotina de Exclus�o de Alunos 
		//4 Executa a rotina de Consulta de Alunos 


	Scanner Ler = new Scanner(System.in);
	
	int op;
	
	System.out.println("Escolha uma op��o");
	System.out.println("1 Inclus�o de Alunos");
	System.out.println("2 Altera��o de Alunos");
	System.out.println("3 Exclus�o de Alunos");
	System.out.println("4 Consulta de Alunos ");
	
	op=Ler.nextInt();
	
	switch(op) {
	case 001:
		System.out.println("Executa a rotina de Inclus�o de Alunos");
	break;
	
	case 002:
		System.out.println(" Executa a rotina de Altera��o de Alunos");
	break;
	
	case 003:
		System.out.println("Executa a rotina de Exclus�o de Alunos");
	break;
	
	case 004:
		System.out.println("Executa a rotina de Consulta de Alunos");
	break;
	
	default:
		System.out.println("Escolha uma op��o v�lida");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
