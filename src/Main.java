import br.com.arthur.Bootcamp;
import br.com.arthur.Conteudo;
import br.com.arthur.Curso;
import br.com.arthur.Mentoria;

public class Main {
    public static void main(String[] args) {
        Conteudo curso = new Curso("Java","do 0 ao avançado");
        Conteudo mentoria = new Mentoria("Js", "do 0 ao avançado");

        Bootcamp bootcamp = new Bootcamp("Java bootcamp","do 0 ao avançado");


    }
}