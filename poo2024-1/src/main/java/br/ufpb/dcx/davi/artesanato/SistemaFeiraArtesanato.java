package br.ufpb.dcx.davi.artesanato;
import java.util.List;

/**
 * Sistema par a gerenciar itens de artesanato.
 */
public interface SistemaFeiraArtesanato {

    /**
     * Cadastra um novo item no sistema.
     * @param item o item a ser adicionado.
     * @return true se o itme foi cadastrado, ou false caso ele já exista no sistema.
     */
    public boolean cadastrarItem(ItemArtesanato item);

    /**
     * Pesquisa todos os itens cujo nome começa com o nome passado como parâmetro.
     * @param nome  O nome a pesquisar
     * @return uma lista contendo os itens cujo o nome começa com o parâmetro passado.
     */
    public List<ItemArtesanato> pesquisaItemPeloNome(String nome);

    /**
     * Pesquisa os itens cujo o preço é menor o igual ao valor passado no parâmetro.
     * @param preco Valor dos itens à pesquisar.
     * @return é a lista dos itens cujo o preço é menor o igual ao valor passado no parâmetro.
     */
    public List<ItemArtesanato> pesquisaItemAbaixoDoPreco(double preco);

    /**
     * Pesquisa o item cujo o código é passado por parâmetro.
     * @param codigo O código do item à pesquisar.
     * @return o item encontrado.
     * @throws ItemInexistenteException Se não for encontradoo nenhum item com o código passado.
     */
    public List<ItemArtesanato> pesquisaItemPeloCodigo (String codigo) throws ItemInexistenteException;
}
