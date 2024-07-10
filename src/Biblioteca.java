import java.util.ArrayList;

public class Biblioteca {

    private static ArrayList<ItemBiblioteca> acervo = new ArrayList<>();

    public static void adicionarItem(ItemBiblioteca item){
        acervo.add(item);
    }
    public static void atualizarItem(int index, ItemBiblioteca item){
        acervo.set(index, item);
    }
    public static void removerItem(int index) {
        acervo.remove(index);
    }
    public static void listarItens(){
        System.out.println(acervo);
    }
    public static ItemBiblioteca buscarItemPorTitulo(String titulo) {
        for (ItemBiblioteca item: acervo) {
            if (item.getTitulo().equals(titulo)){
                return item;
            }
        }
        return null;
    }
    public static double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (ItemBiblioteca item: acervo){
            valorTotal += ((item).getPreco()* item.getQuantidade());
        }
        return valorTotal;
    }
}
