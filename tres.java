import java.util.Scanner;
public class tres {

	public static void main(String[] args) {
		//1 Executa a rotina de Inclusão de Alunos
		//2 Executa a rotina de Alteração de Alunos 
		//3 Executa a rotina de Exclusão de Alunos 
		//4 Executa a rotina de Consulta de Alunos 


	Scanner Ler = new Scanner(System.in);
	
	int op;
	
	System.out.println("Escolha uma opção");
	System.out.println("1 Inclusão de Alunos");
	System.out.println("2 Alteração de Alunos");
	System.out.println("3 Exclusão de Alunos");
	System.out.println("4 Consulta de Alunos ");
	
	op=Ler.nextInt();
	
	switch(op) {
	case 001:
		System.out.println("Executa a rotina de Inclusão de Alunos");
	break;
	
	case 002:
		System.out.println(" Executa a rotina de Alteração de Alunos");
	break;
	
	case 003:
		System.out.println("Executa a rotina de Exclusão de Alunos");
	break;
	
	case 004:
		System.out.println("Executa a rotina de Consulta de Alunos");
	break;
	
	default:
		System.out.println("Escolha uma opção válida");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
