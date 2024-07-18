package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private Set<Conteudo> conteudoLecionados = new LinkedHashSet<>();
  
    public Professor() {
       
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudoLecionados.add(conteudo);
    }

    public String getNome() {
        return nome;
    }

    public Set<Conteudo> conteudoLecionados() {
        return conteudoLecionados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setconteudoLecionados(Set<Conteudo> conteudoLecionados) {
        this.conteudoLecionados = conteudoLecionados;
    }   

    public void imprimirConteudos(){
        System.out.println("Listagem de Conteudos lecionadas: ");
        for(Conteudo conteudo : conteudoLecionados){
            System.out.println(conteudo);
        }
    }
}