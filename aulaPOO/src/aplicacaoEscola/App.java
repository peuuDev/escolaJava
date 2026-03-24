package aplicacaoEscola;
import java.util.Scanner;
import Escola.turma;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		turma t = new turma();
		int n;
		
		System.out.println("\nBem-Vindo à Escola Java!\n");
		
		do {
			System.out.println("1 - Inserir aluno\n"
					+ "2 - Registrar notas\n"
					+ "3 - Calcular média da turma\n"
					+ "4 - Mostrar listagem da turma\n"
					+ "0 - Sair");
					
			n = sc.nextInt();
			sc.nextLine();

			switch(n) {
			case 1: t.inserirAluno(); break;
			case 2: t.registrarNotas(); break;
			case 3: t.mediaTurma(); break;
			case 4: t.listagemAlunos(); break;
			}
		}while(n != 0);
	}

}
