package br.ufpb.dcx.davi.exercicio9;

import br.ufpb.dcx.davi.exercicio9.Exceptions.AlunoJaCadastradoException;
import br.ufpb.dcx.davi.exercicio9.Exceptions.AlunoNaoCadastradoException;

public interface SistemaEscolaInterface {

    public void CadastraNovoAluno(String nome, String serie, String matricula) throws AlunoJaCadastradoException;
    public Aluno PesquisarAluno(String matricula) throws AlunoNaoCadastradoException;

    public String VerBoletim(String matricula) throws AlunoNaoCadastradoException;

    void CadastrarNotas(double Nota1, double Nota2, double Nota3, String matriculaAluno) throws AlunoNaoCadastradoException;

    public String EditarBoletim(int opcao, double Nota, String matriculaAluno) throws AlunoNaoCadastradoException;

    void RemoverAlunoEBoletim(String Matricula)throws AlunoNaoCadastradoException;
}
