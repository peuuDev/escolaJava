package Escola;

public class capitalizacao {

    public String inicialMaiscula(String nome){
        if (nome == null || nome.isEmpty()) return nome;

        return nome.substring(0,1).toUpperCase() + nome.substring(1);
    }

}
