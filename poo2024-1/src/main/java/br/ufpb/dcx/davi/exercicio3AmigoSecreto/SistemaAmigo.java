package br.ufpb.dcx.davi.exercicio3AmigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<Mensagem> listaMensagens = new ArrayList<>();
    private List<Amigo> listaAmigos = new ArrayList<>();

    public void cadsatraAmigo(String nomeAmigo, String emailAmigo){
        Amigo a = new Amigo(nomeAmigo, emailAmigo);
        listaAmigos.add(a);
    }
    public Amigo pesquisaAmigo(String emailAmigo){
        for(Amigo a: listaAmigos){
            if(a.getEmail().equals(emailAmigo)){
                return a;
            }
        }  return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
       Mensagem mensagem = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
       listaMensagens.add(mensagem);
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        Mensagem mensagem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        listaMensagens.add(mensagem);
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> listaMensagensAnonimas = new ArrayList<>();
        for(Mensagem m: listaMensagens){
            if(m.ehAnonima() == true){
                listaMensagensAnonimas.add(m);
            }
        }   return listaMensagensAnonimas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        for(Amigo a: listaAmigos){
            if(a.getEmail().equals(emailDaPessoa)){
                a.setEmailAmigoSorteado(emailAmigoSorteado);
            }
        } throw new AmigoInexistenteException("Esse amigo não existe.");
    }
    public List<Mensagem> pesquisaTodasAsMensagens(){
        return listaMensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{
        for(Amigo a: listaAmigos){
            if(a.getEmail().equals(emailDaPessoa)){
                if(a.getEmailAmigoSorteado() == null){
                    throw new AmigoNaoSorteadoException("Amigo ainda não sorteado.");
                } else{
                    return a.getEmailAmigoSorteado();
                }
            }
        } throw new AmigoInexistenteException("Amigo Inexistente");
    }

}
