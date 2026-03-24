package aplicacaoEscola;

import java.util.Scanner;

import Escola.aluno;
import Escola.turma;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		turma t = new turma("Física", "Erick", 60);
		int n;
		
		System.out.println("Bem-Vindo à Escola Java!\n");
		
		do {
			System.out.println("1 - Inserir aluno\n"
					+ "2 - Registrar nota 1\n"
					+ "3 - Registrar nota 2\n"
					+ "4 - Registrar nota do trabalho\n"
					+ "5 - Calcular média da turma\n"
					+ "6 - Mostrar listagem da turma\n"
					+ "0 - Sair");
					
			n = sc.nextInt();
			sc.nextLine();

			switch(n) {
			case 1: t.inserirAluno(); break;
			case 2: t.registrarN1(); break;
			case 3: t.registrarN2(); break;
			case 4: t.registrarTrab(); break;
			case 5: t.mediaTurma(); break;
			case 6: t.listagemAlunos(); break;
			}
		}while(n != 0);
	}

}
