package aulaHeranca;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, info;
        int idade;

        nome = input.next();
        idade = input.nextInt();
        info = input.next();
        Pessoa pf = new PessoaFisica(nome, idade, info);
        imprime(pf);

        nome = input.next();
        idade = input.nextInt();
        info = input.next();
        Pessoa pj = new PessoaJuridica(nome, idade, info);
        imprime(pj);
    }
    public static void imprime(Pessoa p) {
        System.out.println("Nome da pessoa: " + p.getNome());
        System.out.println("Idade da pessoa: " + p.getIdade());
        if (p instanceof PessoaFisica)
            System.out.println("Cpf da pessoa: " + ((PessoaFisica)p).getCpf());
        else
            System.out.println("Cnpj da pessoa: " + ((PessoaJuridica)p).getCnpj());
    }   
}
