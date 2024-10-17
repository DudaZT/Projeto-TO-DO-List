public class Main {
    public static void main(String[] args) {
        // Criando o gerenciador de listas de tarefas
        ToDoManager gerenciador = new ToDoManager();

        // Criando a primeira lista de tarefas
        ToDoList listaPessoal = new ToDoList("Lista Pessoal");
        listaPessoal.adicionarItem(new ToDoItem("- Fazer compras"));
        listaPessoal.adicionarItem(new ToDoItem("- Estudar Ruby"));

        // Adicionando mais itens à lista pessoal
        listaPessoal.adicionarItem(new ToDoItem("- Comprar frutas"));
        listaPessoal.adicionarItem(new ToDoItem("- Lavar o carro"));
        listaPessoal.adicionarItem(new ToDoItem("- Limpar a casa"));
        
        // Marcando itens como concluídos
        listaPessoal.getItens().get(2).marcarComoCompleto(); 
        listaPessoal.getItens().get(3).marcarComoCompleto();

        // Criando uma segunda lista de tarefas
        ToDoList listaTrabalho = new ToDoList("Lista de Trabalho");
        listaTrabalho.adicionarItem(new ToDoItem("- Revisar código"));
        listaTrabalho.adicionarItem(new ToDoItem("- Escrever documentação"));
        listaTrabalho.adicionarItem(new ToDoItem("- Testar funcionalidades"));

        // Adicionando listas ao gerenciador
        gerenciador.adicionarLista(listaPessoal);
        gerenciador.adicionarLista(listaTrabalho);

        // Exibindo todas as listas e suas respectivas tarefas
        System.out.println("Todas as listas de tarefas:\n");
        gerenciador.listarTodasAsListas();

        // Removendo um item da lista pessoal
        System.out.println("\nRemovendo o item '- Limpar a casa' da 'Lista Pessoal'.");
        listaPessoal.removerItem(listaPessoal.getItens().get(4)); 
        
        // Exibindo novamente as listas após a remoção
        System.out.println("\nTodas as listas de tarefas após remoção:\n");
        gerenciador.listarTodasAsListas();
    }
}
