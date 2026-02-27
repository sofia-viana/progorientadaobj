public class Endereco {
    String  Logradouro;
    int Num;
    String Bairro;
    String Cidade;
    String Estado;
     Endereco(String logradouro, int num, String bairro, String cidade, String estado) {
        Logradouro = logradouro;
        Num = num;
        Bairro = bairro;
        Cidade = cidade;
        Estado = estado;
    }
    public String toString() {
        return "\nLogradouro: "+ Logradouro +
        "\nNumero: "+ Num +
        "\nBairro: "+ Bairro +
        "\nCidade: "+ Cidade +
        "\nEstado: " + Estado;
    }

}