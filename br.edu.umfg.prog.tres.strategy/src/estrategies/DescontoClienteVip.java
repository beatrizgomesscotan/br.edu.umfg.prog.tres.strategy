package estrategies;

public class DescontoClienteVip implements DescontoStrategy{
    @Override
    public Double calcularDesconto(Double preco) {
        Double desconto = (preco * 20.0) / 100;
        return desconto;
    }
}
