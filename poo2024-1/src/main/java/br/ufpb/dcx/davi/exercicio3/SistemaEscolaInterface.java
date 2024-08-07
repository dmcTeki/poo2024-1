package br.ufpb.dcx.davi.exercicio3;

public interface SistemaEscolaInterface {

    public void CadastraNovoAluno(String nome, String serie, String endereco, String responsavel, String matricula, String telefoneResponsavel) throws AlunoJaCadastradoException;
    public Boolean VerificaAluno(String matricula);
    public String PesquisarAluno(String matricula) throws AlunoNaoCadastradoException;

    public String VerBoletim(String matricula);

    public String CadastrarNotas(String Nota1, String Nota2, String Nota3);

}
