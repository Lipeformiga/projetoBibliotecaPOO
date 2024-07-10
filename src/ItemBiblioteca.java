public abstract class ItemBiblioteca {

    private String titulo;
    private double preco;
    private int quantidade;

    public ItemBiblioteca(String titulo, double preco, int quantidade){
        this.titulo = titulo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "- titulo: " + titulo + "\n" +
                "- preco: " + preco + "\n"+
                "- quantidade=" + quantidade;
    }

     public abstract double calcularValorTotalComDesconto(double percentual);


}
