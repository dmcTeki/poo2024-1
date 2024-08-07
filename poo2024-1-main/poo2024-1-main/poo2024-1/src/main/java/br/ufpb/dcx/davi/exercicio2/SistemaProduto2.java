package br.ufpb.dcx.davi.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SistemaProduto2 implements SistemaProduto{

    public List<Produto> listaProdutos = new ArrayList<>();

    public String PesquisaPeloCodigo(String codigo) throws ProdutoNaoCadastradoException {
        for (Produto p : listaProdutos) {
            if (p.getCodigo().equals(codigo)) {
                return p.toString();
            }
            else{
                throw new ProdutoNaoCadastradoException("Esse produto não está cadastrado");
            }
        }return null;
    }
    public void CadastrarProduto(String codigo, String nome, double preco) throws ProdutoJaCadastradoException{
        if(ProdutoExiste(codigo) == true ) {
            throw new ProdutoJaCadastradoException("Esse produto já foi cadastrado");
        }
        else{
            Produto p = new Produto(codigo, nome, preco);
            listaProdutos.add(p);
        }
    }
    public boolean ProdutoExiste(String codigo){
        for(Produto p: listaProdutos){
            if(p.getCodigo().equals(codigo)){
                return true;
            }
        } return false;
    }
}
