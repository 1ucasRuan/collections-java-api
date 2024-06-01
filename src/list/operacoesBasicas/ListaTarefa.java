package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionatTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){
        tarefaList.removeAll(tarefaList);
    }
}
