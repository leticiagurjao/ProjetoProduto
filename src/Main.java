import java.util.ArrayList;

public class Main {
    public static void main (String args[]){
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        Mouse m1 = new Mouse("Mouse 01");
        m1.setTipo("tipo 01");
        m1.setPreco(10);
        m1.setNomeLoja("loja 01");

        Livros l1 = new Livros( "Livro 01");
        l1.setAutor("autor 01");
        l1.setPreco(15);
        l1.setNomeLoja("loja 01");

        carrinho.add(m1);
        carrinho.add(l1);

        for (Produto p: carrinho){
            System.out.println(p.getDescricao());
        }
    }
}
