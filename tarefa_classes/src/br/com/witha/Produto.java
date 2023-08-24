package br.com.witha;


public class Produto {

    private static String nomeProduto;

    /**
     @return String
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
    @param String
    */
    public void setNomeProduto(String nomeProduto) {
        Produto.nomeProduto = nomeProduto;
    }
    /**
    @param String
    */
    public void cadastrarProduto(String nomeProduto) {
        this.setNomeProduto(nomeProduto);
    }
    @Override
    public String toString() {
        return nomeProduto;
    }
}
