package aulaHeranca;

public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return super.getNome();
    }
    public int getIdade() {
        return super.getIdade();
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        super.setNome(nome);
    }
    public void setIdade(int idade) {
        super.setIdade(idade);
    }
    
    
}
