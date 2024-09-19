package br.ufpb.dcx.davi.exercicio9;

import br.ufpb.dcx.davi.exercicio9.Exceptions.AlunoJaCadastradoException;
import br.ufpb.dcx.davi.exercicio9.Exceptions.AlunoNaoCadastradoException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaEscola implements SistemaEscolaInterface {

    private Map<String, Aluno> alunos;
    private List<Boletim> boletins;

    public  SistemaEscola() {
        this.alunos = new HashMap<>();
        this.boletins = new ArrayList<>();
    }
    @Override
    public void CadastraNovoAluno(String nome, String serie, String matricula) throws AlunoJaCadastradoException {
        if(alunos.containsKey(matricula)){
            throw new AlunoJaCadastradoException("Aluno já cadastrado.");
        }
        else{
            Aluno a = new Aluno(nome,serie,matricula);
            alunos.put(matricula, a);
        }
    }

    @Override
    public Aluno PesquisarAluno(String matricula) throws AlunoNaoCadastradoException {
        for(Aluno a: alunos.values()){
            if(a.getMatricula().equals(matricula)){
                return alunos.get(matricula);
            }
        } throw new AlunoNaoCadastradoException("Este aluno não está cadastrado no sistema.");
    }

    @Override
    public String VerBoletim(String matricula) throws AlunoNaoCadastradoException{
        for(Boletim b: boletins){
            if(b.getMatriculaAluno().equals(matricula)){
                return b.toString();
            }
        } throw new AlunoNaoCadastradoException("Este aluno não está cadastrado no sistema.");
    }

    @Override
    public void CadastrarNotas(double Nota1, double Nota2, double Nota3, String matriculaAluno) throws AlunoNaoCadastradoException{
        for(Boletim b: boletins){
            if(b.getMatriculaAluno().equals(matriculaAluno)){
                b.setNota1(Nota1);
                b.setNota2(Nota2);
                b.setNota3(Nota3);
            }
        } throw new AlunoNaoCadastradoException("Este aluno não está cadastrado no sistema.");
    }

    public String EditarBoletim(int opcao, double Nota, String matriculaAluno) throws AlunoNaoCadastradoException{
        for(Boletim b: boletins) {
            if (b.getMatriculaAluno().equals(matriculaAluno)) {
                if (opcao == 1) {
                    b.setNota1(Nota);
                }
                if (opcao == 2) {
                    b.setNota2(Nota);
                }
                if (opcao == 3) {
                    b.setNota3(Nota);
                }
            } return b.toString();
        } throw new AlunoNaoCadastradoException("Este aluno não está cadastrado no sistema.");
    }

    @Override
    public void RemoverAlunoEBoletim(String matricula)throws AlunoNaoCadastradoException{
        if(alunos.containsKey(matricula)){
            alunos.remove(matricula);
            for(Boletim b: boletins){
                if(b.getMatriculaAluno().equals(matricula)){
                    boletins.remove(b);
                }
            }
        } throw new AlunoNaoCadastradoException("Este aluno não está cadastrado ou já foi removido do sistema.");
    }
}
