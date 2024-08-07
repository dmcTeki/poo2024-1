package br.ufpb.dcx.davi.exercicio2;

public interface SistemaProduto {

    public void CadastrarProduto(String codigo, String nome, double preco) throws ProdutoJaCadastradoException;
}
