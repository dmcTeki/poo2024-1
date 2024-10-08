package br.ufpb.dcx.davi.exercicio3AmigoSecreto;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private Boolean anonima;

    public Mensagem(String texto, String emailRemetente, Boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public Boolean ehAnonima() {
        return anonima;
    }
    public abstract String getTextoCompletoAExibir();

}


