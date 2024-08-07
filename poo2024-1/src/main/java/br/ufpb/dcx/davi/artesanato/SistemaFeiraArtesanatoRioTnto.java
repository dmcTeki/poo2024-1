package br.ufpb.dcx.davi.artesanato;

import java.util.*;
/*


public class SistemaFeiraArtesanatoRioTnto implements SistemaFeiraArtesanato {

    private Map<String, ItemArtesanato> itensDeArtesaanto;


    public SistemaFeiraArtesanatoRioTnto(){
        this.itensDeArtesaanto = new HashMap<>();
    }
    @Override
    public boolean cadastrarItem(ItemArtesanato item) {
        if(this.itensDeArtesaanto.containsKey(item.getCodigo())){
            return false;
        }
        else {
            this.itensDeArtesaanto.put(item.getCodigo(), item);

            return true;
        }
    }

    @Override
    public List<ItemArtesanato> pesquisaItemPeloNome(String nome) {
        List<ItemArtesanato> itensPeloNome = new LinkedList<>();
        for (ItemArtesanato item : this.itensDeArtesaanto.values()) {
            if (item.getNome().startsWith(nome)) {
                itensPeloNome.add(item);
            }
        }
        Collections.sort(itensPeloNome);
        return itensPeloNome;
    }

    @Override
    public List<ItemArtesanato> pesquisaItemAbaixoDoPreco(double preco) {
        //TODO
        List<ItemArtesanato> itensPorPreco = new LinkedList<>();
        for (ItemArtesanato item : this.itensDeArtesaanto.values()) {
            if (item.getPreco()<= preco){
                itensPorPreco.add(item);
            }
        }
        Collections.sort(itensPorPreco);
        return itensPorPreco;
    }

    @Override
    public List<ItemArtesanato> pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException {
        ItemArtesanato item = this.itensDeArtesaanto.get(codigo);
        if( item == null){
            throw new ItemInexistenteException("Não existe item com o código "+codigo+" .");
        }
        else{
            return item;
        }
    }
}

*/