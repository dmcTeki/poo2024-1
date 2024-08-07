package br.ufpb.dcx.davi.exercicio3;

public class Responsavel {
    private String nome;
    private String endereco;
    private String telefone;
    private Aluno aluno;

    public Responsavel(String nome, String endereco, String telefone, Aluno aluno) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
