package pojo;

import java.util.List;

public class ProdutoPojo {

    private String produtoNome;
    private double produtoValor;
    private List<String> produtoCores;
    private List<ComponentePojo> componentes;
    private String produtoUrlMock;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public List<ComponentePojo> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ComponentePojo> componentes) {
        this.componentes = componentes;
    }

    public String getProdutoUrlMock() {
        return produtoUrlMock;
    }

    public void setProdutoUrlMock(String produtoUrlMock) {
        this.produtoUrlMock = produtoUrlMock;
    }

}
