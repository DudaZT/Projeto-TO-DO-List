import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private String nome;
    private List<ToDoItem> itens;

    public ToDoList(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public ToDoList() {
        this.nome = "Lista sem Nome"; 
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<ToDoItem> getItens() {
        return itens; 
    }

    public void adicionarItem(ToDoItem item) {
        itens.add(item);
    }

    public void removerItem(ToDoItem item) {
        itens.remove(item);
    }

    public void listarItens() {
        for (ToDoItem item : itens) {
            System.out.println(item); 
        }
    }
}
