package br.ufpb.dcx.davi.exercicioAmigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class TestaSistemaAmigo {

    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();
        List<Mensagem> MensagensAnonimas = new ArrayList<>();

        //a) Cadastra dois amigos
        sistema.cadsatraAmigo("jose", "jose@dcx");
        sistema.cadsatraAmigo("maria", "maria@dcx");

        //b) Configura o amigo secreto de josé como sendo maria e o amigo secreto de maria sendo jose.

        try {
            sistema.configuraAmigoSecretoDe("jose@dcx", "maria@dcx");
            sistema.configuraAmigoSecretoDe("maria@dcx", "jose@dcx");
        } catch (AmigoInexistenteException e) {
            System.out.println("erro");
        }

        //c)Envie uma mensagem anonima de maria para josé.
        sistema.enviarMensagemParaAlguem("oi", "maria@dcx", "jose@dcx", true);

        // d) envie uma mensagem anonima de maria para todos.
        sistema.enviarMensagemParaTodos("oi", "maria@dcx", true);

        //e)Pesquise as mensagens anonimas e imprima o texto completo dessas mensagens através do método  getTextoCompletoAExibir.
        MensagensAnonimas = sistema.pesquisaMensagensAnonimas();
        for (Mensagem m : MensagensAnonimas) {
            System.out.println(m.getTextoCompletoAExibir());
        }
        // f) Pesquise o e-mail do amigo secreto de José e veja se é o e-mail de Maria, imprimindo “Ok” caso seja.
        try {
            if(sistema.pesquisaAmigoSecretoDe("jose@dcx").equals("maria@dcx")){
                System.out.println("ok");
            }
        } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
            System.out.println("erro");
        }
    }
}