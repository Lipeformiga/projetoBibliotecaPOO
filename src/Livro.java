public class Livro extends ItemBiblioteca {

    private String autor;
    private long isbn;

    public Livro(String titulo, double preco, int quantidade, String autor, long isbn) {
        super(titulo, preco, quantidade);
        this.isbn =isbn;
        this.autor = autor;
    }

    public double calcularValorTotalComDesconto(double percentual){
        // Os livros do Machado de Assis estão de graça
        if (autor.equals("Machado de Assis")){
            percentual = 0.5;
        }
        // 5% de desconto pra valor acima de R$82.50
        if (this.getPreco() > 82.50){
            System.out.println(this);
            percentual += 0.05;
        }
        return (this.getPreco() - (this.getPreco() * percentual)) * this.getQuantidade();
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+
                "- Autor: "+ autor +"\n"+
                "- isbn: " + isbn + "\n" + "\n";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}