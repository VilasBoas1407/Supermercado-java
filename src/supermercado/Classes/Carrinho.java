package supermercado.Classes;

public class Carrinho {
    private Produto[] listProdutos = new Produto[10];
    private int primeiro = 0;
    private int ultimo = 0;

    public void LimparCarrinho(){
        this.primeiro = 0;
        this.ultimo = 0;
        listProdutos = new Produto[10];
    }

    public void InserirProduto(Produto produto){
        if(ultimo >= 10){
            System.out.println("Carrinho cheio!");
        }
        else{
          this.listProdutos[ultimo] = produto;  
          this.ultimo +=1;
        }
    }

    public void RemoveProduto(String produto){
        for(int i = 0; i < this.listProdutos.length; i++){
            if(this.listProdutos[i].getNome() == produto && this.primeiro != this.ultimo){
                this.listProdutos[i] = null;
                for(int j = i;j < this.listProdutos.length - 1;j++){
                    this.listProdutos[j] = this.listProdutos[j+1];
                }
                this.ultimo -=1;
            }
        }
    }

    public boolean CarrinhoVazio(){
        return primeiro == ultimo;
    }

    public void ImprimeCarrinho(){
        for(int i=0; i<ultimo; i++){
            System.out.println(listProdutos[i].toString());
        }
    }
}
