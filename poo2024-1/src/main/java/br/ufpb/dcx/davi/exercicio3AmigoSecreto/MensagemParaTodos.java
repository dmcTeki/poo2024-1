package br.ufpb.dcx.davi.exercicio3AmigoSecreto;

public class MensagemParaTodos extends Mensagem {

    public MensagemParaTodos(String texto, String emailRemetente, Boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    @Override
    public String getTextoCompletoAExibir() {
        return "Mensagem de " + getEmailRemetente() + " para todos." + "\n Mensagem: " + getTexto();
    }
}
