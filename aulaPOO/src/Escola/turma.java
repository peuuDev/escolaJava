package Escola;

import java.util.Scanner;

public class turma {
	
	Scanner sc = new Scanner(System.in);
	private String disciplina, professor;
	private int cargaHoraria;
	private aluno[] alunos = new aluno[30];
	
	private int n = 0;
	
	public turma(String disciplina, String professor, int cargaHoraria){
		this.disciplina = disciplina;
		this.professor = professor;
		this.cargaHoraria = cargaHoraria;
	}
	public void inserirAluno() {
		if(n >= 30) {
			System.out.println("Turma cheia");
		}
		
		System.out.println("Digite o nome do aluno que deseja adicionar: ");
		String nome = sc.nextLine();
		System.out.println("Digite a matrícula: ");
		String matricula = sc.nextLine();
		alunos[n]= new aluno(nome, matricula);
		n++;
		System.out.println("Aluno inserido com sucesso!");
	}

	public void listagemAlunos(){
		for(int i = 0; i < n; i++){
			if (alunos[i] == null	) {
				continue;
			}
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

	public void registrarN1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a matricula do aluno que deseja adicionar a nota 1: ");
		String m = sc.nextLine();
		aluno a = buscarAluno(m);
		if (a != null) {
            System.out.println("Aluno encontrado: " + a.getNome() + "\nAdicionar nota 1:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setProva1(n);
            System.out.println("Nota registrada!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
	}

	public void registrarN2() {
        System.out.println("Matricula do aluno:");
        String m = sc.nextLine();

        aluno a = buscarAluno(m);

        if (a != null) {
            System.out.println("Aluno encontrado: "+ a.getNome() + "\nAdicionar nota 2:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setProva2(n);
            System.out.println("Nota registrada!");
        }
    }

	public void registrarTrab() {
        System.out.println("Matricula do aluno:");
        String m = sc.nextLine();

        aluno a = buscarAluno(m);

        if (a != null) {
            System.out.println("Aluno encontrado: " + a.getNome()+ "\nAdicionar nota do Trabalho:");
            double n = sc.nextDouble();
            sc.nextLine();
            a.setTrab(n);
            System.out.println("Nota registrada!");
        }
    }

	public void mediaTurma() {
        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += alunos[i].getMedia();
        }

        double mediaTurma = soma / n;
        System.out.println("Média da turma: " + mediaTurma);
    }

}
