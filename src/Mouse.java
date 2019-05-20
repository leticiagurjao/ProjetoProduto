public class Mouse extends Produto {

    private String tipo;
    public Mouse (String descricao){
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     public String getDescricao(){
        return this.descricao + this.tipo;
     }
}
