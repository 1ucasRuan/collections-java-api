package list.operacoesBasicas;

public class Tarefa {
    private String descricao;

    Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return descricao;
    }
    
}
