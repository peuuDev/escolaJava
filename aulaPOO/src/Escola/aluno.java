package Escola;

public class aluno {
	private String nome; 
	private String matricula;
	private double prova1, prova2, trab;
	
	public aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}
	
	public double getProva1(){
		return prova1;
	}

	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}
	
	public double getProva2(){
		return prova2;
	}

	public void setTrab(double trab) {
		this.trab = trab;
	}

	public double getTrab(){
		return trab;
	}
	
	public double getMedia() {
        return ((prova1 * 2.5) + (prova2 * 2.5) + (trab * 2)) / 7;
    }

}
