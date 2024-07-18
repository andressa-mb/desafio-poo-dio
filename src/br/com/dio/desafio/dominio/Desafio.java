package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{
    private int nivelDificuldade;

    @Override
    public double calcularXp() {
        return XP_PADRAO * nivelDificuldade;
    }
    
    public Desafio(){

    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Desafio [Titulo: " + getTitulo() + " Nivel de dificuldade: " + nivelDificuldade + " Descricao: " + getDescricao() + "]";
    }

    
}
