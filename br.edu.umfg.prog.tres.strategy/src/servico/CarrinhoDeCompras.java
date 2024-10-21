package servico;

import entidades.Produto;
import estrategies.DescontoClienteNovo;
import estrategies.DescontoStrategy;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarProuto(Produto produto) {
        this.produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy cliente) {
        this.descontoStrategy = cliente;
    }

    public double CalculcarProdutoComDesconto() {
        double totalDesconto = 0;
        double totalPrecoProduto = 0;

        for (Produto produto : produtos) {
            double precoDesconto = descontoStrategy.calcularDesconto(produto.getPreco());
            totalDesconto = totalDesconto + precoDesconto;
            totalPrecoProduto = totalPrecoProduto + produto.getPreco();

        }
        if (totalPrecoProduto > totalDesconto) {
            return totalPrecoProduto - totalDesconto;
        } else {
            return totalPrecoProduto;
        }
    }
}
