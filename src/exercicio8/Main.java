package exercicio8;

public class Main {
    public static void main(String[] args) {

        CursoOnline c1 = new CursoOnline();
        c1.setNome("IEFP Online");
        c1.setDuracaoEmHoras(250);
        c1.setLinkAcesso("https://www.iefp.pt");

        CursoOnline c2 = new CursoOnline();
        c2.setNome("ISLA");
        c2.setDuracaoEmHoras(250);
        c2.setLinkAcesso("https://www.isla.pt");

        CursoPresencial cursoPresencial = new CursoPresencial();
        cursoPresencial.setNome("Inglês Avançado");
        cursoPresencial.setDuracaoEmHoras(120);
        cursoPresencial.setConcluido(false);
        cursoPresencial.setEndereco("Rua das Flores, 123 - Porto");

        System.out.println(c1.exibirResumo());
        System.out.println(c2.exibirResumo());
        System.out.println(cursoPresencial.exibirResumo());
    }
}