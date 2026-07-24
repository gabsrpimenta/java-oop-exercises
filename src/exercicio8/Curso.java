package exercicio8;

/*
 * EXEMPLO DE CLASSE ABSTRATA (que serve como um molde)
 * A classe Curso não pode ser criada diretamente (new Curso() se não dá erro).
 * Ela serve apenas como base para as classes filhas.
 */

public abstract class Curso {

    private String nome;
    private int duracaoEmHoras;
    private boolean concluido;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }
    public void setDuracaoEmHoras(int duracaoEmHoras) {
        if (duracaoEmHoras > 0) {
            this.duracaoEmHoras = duracaoEmHoras;
        }
    }

    public boolean isConcluido() {
        return concluido;
    }
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    // Método abstrato: Toda classe filha é OBRIGADA a criar sua própria versão deste método
    public abstract String exibirResumo();
}