package br.com.witha;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.cadastrarProduto("Macbook Pro 15'");
        System.out.println(produto);
    }
}