public class ToDoItem {
    private String descricao;
    private boolean Completado;

    public ToDoItem(String descricao) {
        this.descricao = descricao;
        this.Completado = false;
    }

    public void marcarComoCompleto() {
        this.Completado = true;
    }

    public void marcarComoPendente() {
        this.Completado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String estado;

        if (Completado) 
        {
            estado = " (Completo)";
        } 
        else 
        {
            estado = " (Pendente)";
        }

        return descricao + estado;
    }
}
