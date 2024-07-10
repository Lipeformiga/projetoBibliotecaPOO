public class Main {

    public static void main(String[] args) {
        // 3 livros, 3 revistas calcular valores

        Livro livro1 = new Livro("Harry Potter", 60.0, 100, "JK Rowling", 123);
        Livro livro2 = new Livro("Senhor dos anéis", 90.0, 80, "JK Rowling", 321);
        Livro livro3 = new Livro("Dom Casmurro", 10.0, 10, "Machado de Assis", 456);
        Livro livro4 = new Livro("Memórias póstumas de Bras Cubas", 100.0, 10, "Machado de Assis", 456);

        Biblioteca.adicionarItem(livro1);
        Biblioteca.adicionarItem(livro2);
        Biblioteca.adicionarItem(livro3);
        Biblioteca.adicionarItem(livro4);

        Revista revista1 = new Revista("Quatro rodas", 20.0, 50, 200);
        Revista revista2 = new Revista("Recreio", 10.0, 150, 2);
        Revista revista3 = new Revista("Veja", 30.0, 10, 400);
        Revista revista4 = new Revista("Detonado", 10.0, 9, 1);

        Biblioteca.adicionarItem(revista1);
        Biblioteca.adicionarItem(revista2);
        Biblioteca.adicionarItem(revista3);
        Biblioteca.adicionarItem(revista4);

        Biblioteca.listarItens();
        System.out.println("\n" + Biblioteca.calcularValorTotalEstoque());

        System.out.println("\n" + Biblioteca.buscarItemPorTitulo("Harry Potter"));
        System.out.println("\n" + Biblioteca.buscarItemPorTitulo("Recreio"));

        System.out.println("livro1: " + livro1.calcularValorTotalComDesconto(0.1));
        System.out.println("livro2: " +livro2.calcularValorTotalComDesconto(0.1));
        System.out.println("livro3: " +livro3.calcularValorTotalComDesconto(0.1));
        System.out.println("livro4: " +livro4.calcularValorTotalComDesconto(0.1));

        System.out.println("revista1: " +revista1.calcularValorTotalComDesconto(0.1));
        System.out.println("revista2: " +revista2.calcularValorTotalComDesconto(0.1));
        System.out.println("revista3: " +revista3.calcularValorTotalComDesconto(0.1));
        System.out.println("revista4: " +revista4.calcularValorTotalComDesconto(0.1));
    }
}