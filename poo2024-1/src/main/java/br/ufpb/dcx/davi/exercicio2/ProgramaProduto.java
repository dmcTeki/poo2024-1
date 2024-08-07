package br.ufpb.dcx.davi.exercicio2;
import javax.swing.*;
import java.awt.color.ProfileDataException;

public class ProgramaProduto {

    public static void main(String[] args) {
        int continuar = 0;
        SistemaProduto2 sistema = new SistemaProduto2();

        while(continuar == 0){
        String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar" +
                "\n2.Pesquisar pelo código\n3.Sair");
        if (opcao.equals("1")) {
            String codigo = JOptionPane.showInputDialog("Digite o código:");
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:"));
            try {
                sistema.CadastrarProduto(codigo, nome, preco);
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso: ");
            } catch (ProdutoJaCadastradoException e){
                JOptionPane.showMessageDialog(null, "Este produto já foi cadastrado");
            }
        }else if(opcao.equals("2")){
            String codigo = JOptionPane.showInputDialog("Qual o codigo");
            try{
                JOptionPane.showMessageDialog(null, sistema.PesquisaPeloCodigo(codigo));
            }catch (ProdutoNaoCadastradoException e){
                JOptionPane.showMessageDialog(null,"Produto não cadastrado no sistema.");
            }
            }
        else if (opcao.equals("3")) {
            JOptionPane.showMessageDialog(null,"Até a próxima!");
            continuar = 1;
         }
        }
    }
}
