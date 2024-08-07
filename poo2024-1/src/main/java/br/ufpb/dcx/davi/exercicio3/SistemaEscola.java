package br.ufpb.dcx.davi.exercicio3;
import java.util.ArrayList;
import java.util.List;

public class SistemaEscola implements SistemaEscolaInterface{

    //TODO: TERMINAR O CODIGO

    public List<Aluno> listaAlunos = new ArrayList<>();
    public List<Boletim> listaBoletins = new ArrayList<>();

    public List<Responsavel> listaResponsavel = new ArrayList<>();

    public Boolean VerificaAluno(String matricula) {
        for (Aluno a : listaAlunos) {
            if (a.getMatricula().equals(matricula)) {
                return true;
            }
            else{
                return false;
            }
        } return null;
    }

    public void CadastraNovoAluno(String nome, String serie, String endereco, String responsavel, String matricula, String telefoneResponsavel) throws AlunoJaCadastradoException {
        if (VerificaAluno(matricula) == true) {
            throw new AlunoJaCadastradoException("Esse Aluno já está cadastrado no sistema.");
        } else {
            Aluno a = new Aluno(nome, serie, endereco, responsavel, matricula, telefoneResponsavel);
            listaAlunos.add(a);
        }
    }

    public String PesquisarAluno(String matricula) throws AlunoNaoCadastradoException{
        for(Aluno a: listaAlunos){
            if(a.getMatricula().equals(matricula)){
                return a.toString();
                }
            }
                throw new AlunoNaoCadastradoException("Aluno não Cadastrado no sistema");
            }

    @Override
    public String VerBoletim(String matricula) {
        return null;
    }

    @Override
    public String CadastrarNotas(String Nota1, String Nota2, String Nota3) {
        return null;
    }

}




