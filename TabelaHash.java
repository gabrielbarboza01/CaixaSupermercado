import java.util.HashMap;

public class TabelaHash {
    private HashMap<String, Cliente> tabela;

    public TabelaHash() {
        tabela = new HashMap<>();
    }

    // Método para inserir um cliente na tabela
    public void inserir(Cliente cliente) {
        tabela.put(cliente.getCpf(), cliente);
    }

    // Método para buscar um cliente pelo CPF na tabela
    public Cliente buscar(String cpf) {
        return tabela.get(cpf);
    }

}