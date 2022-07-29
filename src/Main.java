import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

       Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("Descrição curso java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("curso js");
       curso2.setDescricao("Descrição curso js");
       curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descriçao mentoria java");
        mentoria1.setData(LocalDate.now());


/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devAndresa = new Dev();
        devAndresa.setNome("Andresa");
        devAndresa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andresa: " + devAndresa.getConteudosIncritos());
        System.out.println(".");
        devAndresa.progredir();
        System.out.println("Conteúdos Inscritos Andresa: " + devAndresa.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Andresa: " + devAndresa.getConteudosConcluidos());
        System.out.println(".");
        System.out.println(".");
        devAndresa.progredir();
        System.out.println("Conteúdos Inscritos Andresa: " + devAndresa.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Andresa: " + devAndresa.getConteudosConcluidos());
        System.out.println(".");

        System.out.println("Xp: " + devAndresa.calcularTotalXp());

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosIncritos());
        System.out.println(".");
        devMateus.progredir();
        System.out.println("Conteúdos Inscritos Mateus: " + devMateus.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println(".");

        System.out.println("Xp: " + devMateus.calcularTotalXp());
    }

}


