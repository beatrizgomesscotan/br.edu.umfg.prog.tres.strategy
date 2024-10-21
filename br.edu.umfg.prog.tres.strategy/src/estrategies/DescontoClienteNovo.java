package estrategies;

public class DescontoClienteNovo implements DescontoStrategy{
    @Override
    public Double calcularDesconto(Double preco) {
        return preco;
    }
}
