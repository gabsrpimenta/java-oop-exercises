package exercicio7;

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
        return super.exibirResumo() + " - Acesse em: " + linkAcesso;
    }
}
