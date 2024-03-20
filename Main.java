public class Main {
    public static void main(String[] args) {
        // Criando uma instância da tabela hash
        TabelaHash tabelaHash = new TabelaHash();

        // Inserindo alguns clientes de exemplo na tabela
        Cliente cliente1 = new Cliente("123.456.789-00", "Gabriel", "Rua A, 123", "123456789");
        Cliente cliente2 = new Cliente("987.654.321-00", "Maria", "Rua B, 456", "987654321");
        tabelaHash.inserir(cliente1);
        tabelaHash.inserir(cliente2);

        // Buscando um cliente pelo CPF
        String cpfBusca = "123.456.789-00";
        Cliente clienteEncontrado = tabelaHash.buscar(cpfBusca);

        // Exibindo o resultado da busca
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("Endereco: " + clienteEncontrado.getEndereco());
            System.out.println("Telefone: " + clienteEncontrado.getTelefone());
        } else {
            System.out.println("Cliente com CPF " + cpfBusca + " não encontrado.");
        }
    }

}