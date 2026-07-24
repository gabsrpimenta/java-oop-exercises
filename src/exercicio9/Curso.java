package exercicio9;

public class Curso implements Exibivel {

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

    @Override
    public String exibirResumo(){
        return "Curso: " + nome + " (" + duracaoEmHoras + "h)";
    }

}
