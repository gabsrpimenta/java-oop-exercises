package exercicio9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("Java Backend");
        curso.setDuracaoEmHoras(250);
        curso.setConcluido(true);

        Certificado certificado = new Certificado();
        certificado.setNomeAluno("Gabriella");
        certificado.setNomeCurso("Java Backend");
        certificado.setCargaHoraria(250);
        certificado.setDataEmissao(LocalDate.now());

        CursoOnline cursoOnline = new CursoOnline();
        cursoOnline.setNome("Curso Online de Java");
        cursoOnline.setDuracaoEmHoras(1200);
        cursoOnline.setLinkAcesso("https://www.alura.com.br");

        CursoPresencial cursoPresencial = new CursoPresencial();
        cursoPresencial.setNome("Curso Presencial de Java");
        cursoPresencial.setDuracaoEmHoras(1200);
        cursoPresencial.setEndereco("Rua das Flores, 123 - Porto");

        Exibivel item1 = curso;
        Exibivel item2 = cursoPresencial;
        Exibivel item3 = cursoOnline;
        Exibivel item4 = cursoPresencial;

        // Criamos o array com os itens
        Exibivel[] itens = { item1, item2, item3, item4 };

        // Fazemos a impressão apenas uma vez usando o ciclo for
        for (Exibivel item : itens) {
            System.out.println(item.exibirResumo());
        }
    }
}
