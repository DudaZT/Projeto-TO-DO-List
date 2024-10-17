import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    private List<ToDoList> listas;

    public ToDoManager() {
        listas = new ArrayList<>();
    }

    public void adicionarLista(ToDoList lista) {
        listas.add(lista);
    }

    public void removerLista(ToDoList lista) {
        listas.remove(lista);
    }

    public void listarTodasAsListas() {
        for (ToDoList lista : listas) {
            System.out.println("Lista: " + lista.getNome());
            lista.listarItens();
            System.out.println();
        }
    }
}
