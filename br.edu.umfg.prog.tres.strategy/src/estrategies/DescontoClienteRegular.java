package estrategies;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public Double calcularDesconto(Double preco) {
        Double desconto =(preco * 10.0) / 100;
        return  desconto ;
    }
}
