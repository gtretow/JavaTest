import br.com.dio.challenge.Bootcamp;
import br.com.dio.challenge.Curso;
import br.com.dio.challenge.Dev;
import br.com.dio.challenge.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();

        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("Descrição curso JavaScript");
        curso1.setCargahoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java descrição");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Java descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGui = new Dev();
        devGui.setNome("Gui");
        devGui.inscreverBootcamp(bootcamp);
        devGui.progredir();

        Dev devZe = new Dev();
        devZe.setNome("Zé");
        devZe.inscreverBootcamp(bootcamp);
        devZe.progredir();



    }
}