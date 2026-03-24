package Escola;

import java.util.Scanner;

public class turma {
	
	static Scanner sc = new Scanner(System.in);
	// private String disciplina, professor;
	// private int cargaHoraria;
    static capitalizacao cap = new capitalizacao();
	private aluno[] alunos = new aluno[30];
	
	private int n = 0;
	
	// public turma(String disciplina, String professor, int cargaHoraria){
	// 	this.disciplina = disciplina;
	// 	this.professor = professor;
	// 	this.cargaHoraria = cargaHoraria;
	// }
	public void inserirAluno() {
		if(n >= 30) {
			System.out.println("Turma cheia");
		}
		
		System.out.println("Digite o nome do aluno que deseja adicionar: ");
		String nome = sc.nextLine();
        String nomeFormatado = cap.inicialMaiscula(nome);
        if (nomeFormatado == null || nomeFormatado.isEmpty()) {
            System.out.println("Digite um nome válido!");
            inserirAluno();   
            return;
        }
		System.out.println("Digite a matrícula: ");
		String matricula = sc.nextLine();
        if (matricula == null || matricula.isEmpty()) {
            System.out.println("Digite uma matrícula válida");
            inserirAluno();
            return;
        }
		alunos[n]= new aluno(nomeFormatado, matricula);
		n++;
		System.out.println("\nNome do aluno: " + nomeFormatado + "\nMatricula do aluno: " + matricula + "\n\nAluno inserido com sucesso!");
	}

	public void listagemAlunos(){
		for(int i = 0; i < n; i++){
			if (alunos[i] == null) continue;
			System.out.println(alunos[i]);
		}
	}

	    public aluno buscarAluno(String matricula) {
        for (int i = 0; i < n; i++) {	
            if (alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null;
    }

    public void registrarNotas(){
        int op = 1;
        System.out.println("Digite a matrícula do aluno que deseja adicionar as notas: ");
        String m = sc.nextLine();
        aluno a = buscarAluno(m);
        System.out.println("Aluno encontrado: " + a.getNome());
        do{
            System.out.println("Qual opção deseja escolher?: \n1 - Adicionar nota 1\n2 - Adicionar nota 2\n3 - Adicionar nota do trabalho\n0 - Voltar para o menu principal\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: registrarN1(a); break;
                case 2: registrarN2(a); break;
                case 3: registrarTrab(a); break;
                case 0: op = 0; break;
            }
        }while (op != 0); 
    }

	public void registrarN1(aluno a){
		if (a != null) {
            System.out.println("Adicionar nota 1:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setProva1(n);
            System.out.println("Nota registrada!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
	}

	public void registrarN2(aluno a){
		if (a != null) {
            System.out.println("Adicionar nota 2:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setProva2(n);
            System.out.println("Nota registrada!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
	}

	public void registrarTrab(aluno a){
		if (a != null) {
            System.out.println("Adicionar nota do trabalho:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setTrab(n);
            System.out.println("Nota registrada!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
	}

	public void mediaTurma() {
        double soma = 0;

        if (n == 0) {
            System.out.println("Não há alunos na turma para calcular a média.");
            return;
        }

        for (int i = 0; i < n; i++) {
            soma += alunos[i].getMedia();
        }

        double mediaTurma = soma / n;
        System.out.println("Média da turma: " + mediaTurma);
    }
}
