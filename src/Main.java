import br.com.dio.challenge.Curso;
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

    }
}