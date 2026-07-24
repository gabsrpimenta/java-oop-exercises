package exercicio8;

/*
 * CLASSE FILHA 2: Curso Presencial (Usa o mesmo molde)
 * Também herda o nome, mas inicia a aula de um jeito totalmente diferente.
 */

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