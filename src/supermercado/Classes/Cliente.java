package supermercado.Classes;

public class Cliente {

    private String nome;
    private Carrinho carrinho;

    //#region Getters and Setters

    public String getNome() {
        return nome;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //#endregion
    
    public Cliente(String nome, Carrinho carrinho) {
        this.nome = nome;
        this.carrinho = carrinho;
    }
}
