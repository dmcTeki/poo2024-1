package br.ufpb.dcx.davi.exercicio4;

import br.ufpb.dcx.davi.exercicio3AmigoSecreto.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {
    private List<Mensagem> mensagens;
    private Map<String, Amigo> amigos;
    public SistemaAmigoMap(){
        this.amigos = new HashMap<>();
        this.mensagens = new ArrayList<>();
    }
    public void cadsatraAmigo(String nomeAmigo, String emailAmigo)throws AmigoJaExisteException {
        if(amigos.containsKey(emailAmigo)){
            throw new AmigoJaExisteException("Amigo já  cadastrado.");
        }
        Amigo a = new Amigo(nomeAmigo, emailAmigo);
        amigos.put(emailAmigo,a);
    }
    public Amigo pesquisaAmigo(String emailAmigo)throws AmigoInexistenteException{
            if(amigos.containsKey(emailAmigo)){
                return amigos.get(emailAmigo);
            }else{
                throw new AmigoInexistenteException("Amigo não cadastrado");
         }
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
        Mensagem mensagem = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagens.add(mensagem);
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        Mensagem mensagem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        mensagens.add(mensagem);
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> listaMensagensAnonimas = new ArrayList<>();
        for(Mensagem m: mensagens){
            if(m.ehAnonima() == true){
                listaMensagensAnonimas.add(m);
            }
        }   return listaMensagensAnonimas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo amigo = amigos.get(emailDaPessoa);
        if (amigo == null) {
            throw new AmigoInexistenteException("Esse amigo não existe.");
        }
        amigo.setEmailAmigoSorteado(emailAmigoSorteado);
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return mensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        Amigo amigo = amigos.get(emailDaPessoa);
        if (amigo == null) {
            throw new AmigoInexistenteException("Amigo não cadastrado");
        }
        if (amigo.getEmailAmigoSorteado() == null) {
            throw new AmigoNaoSorteadoException("Amigo secreto ainda não sorteado");
        }
        return amigo.getEmailAmigoSorteado();
    }
}