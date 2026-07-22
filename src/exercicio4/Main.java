public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.nome = "IEFP";
        curso.duracaoEmHoras = 300;
        curso.concluido = true;

        Curso curso2 = new Curso();
        curso2.nome = "ISLA";
        curso2.duracaoEmHoras = 150;
        curso2.concluido = false;

        System.out.println("Curso 1: " + curso.nome + " - Concluído: " + curso.concluido);
        System.out.println("Curso 2: " + curso2.nome + " - Concluído: " + curso2.concluido);
    }
}