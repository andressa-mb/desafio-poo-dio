import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desafio;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Professor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.setNome("José de Assis");
        
        Professor professor2 = new Professor();
        professor2.setNome("Maria Soares");
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Java com programação em objetos");
        curso1.setDescricao("Programando objetos");
        curso1.setCargaHoraria(40);
        curso1.setProfessorResponsavel(professor2);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP - aprendendo o básico");
        curso2.setDescricao("Aprendendo em PHP");
        curso2.setCargaHoraria(30);
        curso2.setProfessorResponsavel(professor1);
        

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        mentoria1.setProfessorResponsavel(professor2);

  
        professor1.adicionarConteudo(curso2);
        professor2.adicionarConteudo(curso1);
        professor2.adicionarConteudo(mentoria1);
        
        professor1.imprimirConteudos();
        professor2.imprimirConteudos();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        Desafio desCamila = new Desafio();
        desCamila.setNivelDificuldade(3); 
        System.out.println("Nível de dificuldade Camila: " + desCamila.getNivelDificuldade());

        Desafio desJoao = new Desafio();
        desJoao.setNivelDificuldade(2);
        System.out.println("Nível de dificuldade João: " + desJoao.getNivelDificuldade());

    }

}
