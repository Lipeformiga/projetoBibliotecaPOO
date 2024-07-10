public class Revista extends ItemBiblioteca{

    private int edicao;

    public double calcularValorTotalComDesconto(double percentual){
       int quantidade = this.getQuantidade();
       // leve mais q 10 e ganhe uma grátis
       if ( quantidade > 10){
           quantidade--;
       }
       // as 3 primeiras edições terão um valor com + 10% do valor
       if (edicao <= 3){
           percentual -= 0.1;
       }
       return (this.getPreco() - (this.getPreco() * percentual)) * quantidade;
    }

    public Revista(String titulo, double preco, int quantidade, int edicao) {
        super(titulo, preco, quantidade);
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return super.toString() +"\n" +
                "- edição: '" + edicao + "\n" + "\n";
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
