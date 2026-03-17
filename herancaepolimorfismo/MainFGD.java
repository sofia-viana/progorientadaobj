package herancaepolimorfismo;
import java.util.ArrayList;
import java.util.List;

public class MainFGD {
    List<Funcionario> funcionarios = new ArrayList<>();

    funcionarios.add(new Gerente("Maria", 7800, "RH"));
    funcionarios.add(new Desenvolvedor("Pedro", 10000, "Java"));
    funcionarios.add(new Funcionario("Luiz", 5000));

    for (Funcionario fun : funcionarios) {
        System.out.println("Nome: "+ fun.getNome());
        System.out.println("Salario: "+ fun.getSalario());
        double bonus;        
    }
}
