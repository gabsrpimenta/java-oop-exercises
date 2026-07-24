package exercicio8;

/*
 * CLASSE FILHA 1: Curso Online (Usa o molde)
 * Herda o nome do Curso, mas personaliza a forma de iniciar a aula.
 */

public class CursoOnline extends Curso {

    private String linkAcesso;

    public String getLinkAcesso() {
        return linkAcesso;
    }
    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

    @Override
    public String exibirResumo() {
        return "Curso: " + getNome() + " (" + getDuracaoEmHoras() + "h) - Acesse em: " + linkAcesso;
    }
}