package exercicio6;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("IEFP");
        curso.setDuracaoEmHoras(300);
        curso.setConcluido(true);

        Curso curso2 = new Curso();
        curso2.setNome("ISLA");
        curso2.setDuracaoEmHoras(300);
        curso2.setConcluido(false);

        CursoOnline cursoonline = new CursoOnline();
        cursoonline.setNome("IEFP");
        cursoonline.setDuracaoEmHoras(250);
        cursoonline.setLinkAcesso("https://www.IEFP.com");
        cursoonline.setConcluido(true);


        CursoOnline cursoonline2 = new CursoOnline();
        cursoonline2.setNome("ISLA");
        cursoonline2.setDuracaoEmHoras(250);
        cursoonline2.setLinkAcesso("https://www.ISLA.com");
        cursoonline2.setConcluido(false);

        System.out.println("Curso 1: " + curso.getNome() + " - Concluído: " + curso.isConcluido());
        System.out.println("Curso 2: " + curso2.getNome() + " - Concluído: " + curso2.isConcluido());

        System.out.println("Curso Online 1: " + cursoonline.getNome() + " - Concluído: " + cursoonline.isConcluido() + " em " + cursoonline.getLinkAcesso());
        System.out.println("Curso Online 2: " + cursoonline2.getNome() + " - Concluído: " + cursoonline2.isConcluido() + " em " + cursoonline2.getLinkAcesso());

    }
}