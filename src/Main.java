import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas "+ devLucas.getConteudosIncristos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos Lucas "+ devLucas.getConteudosIncristos());
        System.out.println("Conteudos Concluídos Lucas "+ devLucas.getConteudosConcluidos());
        System.out.println("XP: "+devLucas.calcularTotalXp());


        System.out.println("____________");

        Dev devKalline = new Dev();
        devKalline.setNome("Kalline");
        devKalline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kalline "+ devKalline.getConteudosIncristos());
        devKalline.progredir();
        devKalline.progredir();
        devKalline.progredir();
        System.out.println("_");
        System.out.println("Conteudos Inscritos Kalline "+ devKalline.getConteudosIncristos());
        System.out.println("Conteudos Concluídos Kalline "+ devKalline.getConteudosConcluidos());
        System.out.println("XP: "+devKalline.calcularTotalXp());
    }
}