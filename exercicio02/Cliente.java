public class Cliente {
    String Nome;
    String RG;
    String CPF;
    Telefone tell;
    Data Dnasc;
    Endereco end;
    Cliente(String nome, String rG, String cPF, Telefone tell, Data dnasc, Endereco end) {
        this.Nome = nome;
        this.RG = rG;
        this.CPF = cPF;
        this.tell = tell;
        this.Dnasc = dnasc;
        this.end = end;
    }
    public String toString() {
        return "Nome: "+ Nome +
        "\nRG: "+ RG +
        "\nCPF: "+ CPF +
        "\nData de Nascimento: "+ Dnasc +
        "\nTelefone: " + tell +
        "\nEndereço: " + end;
    }
}
