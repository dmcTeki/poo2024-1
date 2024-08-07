package br.ufpb.dcx.davi.exercicioAmigoSecreto;

public class MensagemParaAlguem extends Mensagem{

    private String emailDestinatario;
    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, Boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    @Override
    public String getTextoCompletoAExibir() {
        if(ehAnonima()){
            return "Mensagem anônima para " + emailDestinatario + "\n Mensagem: " + getTexto();
        }
        else{
            return "Mensagem de " + getEmailRemetente() " para " + emailDestinatario + "\n Mensagem: " + getTexto();
        }
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
}
