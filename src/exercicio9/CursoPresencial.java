package exercicio9;

public class CursoPresencial extends Curso {

    private String endereco;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String exibirResumo() {
        return "Curso: " + getNome() + " (" + getDuracaoEmHoras() + "h) - Local: " + endereco;
    }
}