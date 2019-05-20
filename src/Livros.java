public class Livros extends Produto {

    private String autor;

    public Livros(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getDescricao(){
        return this.descricao + this.autor;
    }
}
