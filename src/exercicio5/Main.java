package exercicio5;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("IEFP");
        curso.setDuracaoEmHoras(300);
        curso.setConcluido(true);

        Curso curso2 = new Curso();
        curso2.setNome("ISLA");
        curso2.setDuracaoEmHoras(300);
        curso2.setConcluido(true);

        System.out.println("Curso 1: " + curso.getNome() + " - Concluído: " + curso.isConcluido());
        System.out.println("Curso 2: " + curso2.getNome() + " - Concluído: " + curso2.isConcluido());
    }
}