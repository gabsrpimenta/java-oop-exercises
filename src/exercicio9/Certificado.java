package exercicio9;

import java.time.LocalDate;

public class Certificado implements Exibivel {

    private String nomeAluno;
    private int cargaHoraria;
    private String nomeCurso;
    private LocalDate dataEmissao;

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String exibirResumo() {
        return "Certificado de: " + getNomeAluno() + " emitido pela entidade: " + getNomeCurso() + " em " + getDataEmissao() + " com a Carga horaria de " + getCargaHoraria();
    }
}

