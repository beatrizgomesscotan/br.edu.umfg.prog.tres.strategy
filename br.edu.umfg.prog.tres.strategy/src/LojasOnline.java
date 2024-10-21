import entidades.Produto;
import estrategies.DescontoClienteNovo;
import estrategies.DescontoClienteRegular;
import estrategies.DescontoClienteVip;
import servico.CarrinhoDeCompras;

public class LojasOnline {
    public static void main(String[] args) {


        //Criar alguns produtos
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);


        //Criar o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        {
            carrinho.adicionarProuto(produto1);
            carrinho.adicionarProuto(produto2);
            carrinho.adicionarProuto(produto3);
        }

        //Aplicar descoto para cliente Novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente NOVO: "+ carrinho.CalculcarProdutoComDesconto());

        //Aplicar desconto para cliente Regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente REGULAR: "+carrinho.CalculcarProdutoComDesconto());

        //Aplicar desconot para cliente Vip
        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Totl para cliente VIP: "+carrinho.CalculcarProdutoComDesconto());
    }
}