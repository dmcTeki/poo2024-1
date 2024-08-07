package br.ufpb.dcx.davi.exercicio3;

import java.util.Objects;

public class Aluno implements Comparable <Aluno> {
    private String nome;
    private String serie;
    private String endereco;
    private String responsavel;
    private String telefoneResponsavel;
    private String matricula;
    public Aluno(String nome, String serie, String endereco, String responsavel, String matricula, String telefoneResponsavel) {
        this.nome = nome;
        this.serie = serie;
        this.endereco = endereco;
        this.responsavel = responsavel;
        this.matricula = matricula;
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", serie='" + serie + '\'' +
                ", endereco='" + endereco + '\'' +
                ", responsavel=" + responsavel +
                ", matricula='" + matricula + '\'' +
                '}';
    }


    @Override
    public int compareTo(Aluno o) {
        return this.matricula.compareTo(o.getMatricula());
    }
}
