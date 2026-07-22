package exercicio7;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setNome("IEFP");
        curso1.setDuracaoEmHoras(300);

        Curso curso2 = new Curso();
        curso2.setNome("ISLA");
        curso2.setDuracaoEmHoras(300);

        CursoOnline cursoOnline1 = new CursoOnline();
        cursoOnline1.setNome("IEFP Online");
        cursoOnline1.setDuracaoEmHoras(250);
        cursoOnline1.setLinkAcesso("https://www.iefp.pt");

        CursoOnline cursoOnline2 = new CursoOnline();
        cursoOnline2.setNome("ISLA");
        cursoOnline2.setDuracaoEmHoras(250);
        cursoOnline2.setLinkAcesso("https://www.isla.pt");

        System.out.println(curso1.exibirResumo());
        System.out.println(curso2.exibirResumo());

        System.out.println(cursoOnline1.exibirResumo());
        System.out.println(cursoOnline2.exibirResumo());
    }
}