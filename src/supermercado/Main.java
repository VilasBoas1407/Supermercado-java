package supermercado;

import supermercado.Classes.Carrinho;
import supermercado.Classes.Cliente;
import supermercado.Classes.Produto;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Iniciando a execução do programa....");        
        CriarCliente();

    }
    
    public static void CriarCliente(){
        Carrinho carrinho = new Carrinho();

        carrinho.InserirProduto(new Produto("Leite", 2.50, 10, "Leite"));
        carrinho.InserirProduto(new Produto("Arroz", 3.50, 10, "Pacote de arroz"));
        carrinho.InserirProduto(new Produto("Feijão", 4.50, 10, "Pacote de feijão"));
        carrinho.InserirProduto(new Produto("Açucar", 5.50, 10, "Pacote de açucar"));
        carrinho.InserirProduto(new Produto("Café", 6.50, 10, "Pacote de café"));
        carrinho.InserirProduto(new Produto("Cerveja", 7.50, 10, "Fardo de cerveja"));
        carrinho.InserirProduto(new Produto("Suco", 8.50, 10, "Caixa de Suco"));
        carrinho.InserirProduto(new Produto("Refrigerante", 9.50, 10, "Garrafa Refrigerante"));
        carrinho.InserirProduto(new Produto("Creme de leite", 10.50, 10, "Caixa de Creme de leite"));
        carrinho.InserirProduto(new Produto("Pasta de dente", 11.50, 10, "Pacote de pasta de dente"));

        Cliente cliente = new Cliente("Gabriel", carrinho);
        cliente.getCarrinho().RemoveProduto("Suco");
        cliente.getCarrinho().ImprimeCarrinho();
    }
}
