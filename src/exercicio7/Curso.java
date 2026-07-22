package exercicio7;

public class Curso {

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

    public String exibirResumo(){
        return "Curso: " + nome + " (" + duracaoEmHoras + "h)";
    }

}

