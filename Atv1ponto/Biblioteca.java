package Atv1ponto;
import java.util.ArrayList;
public class Biblioteca {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Material> materiais = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }
    public void cadastrarMaterial(Material m){
        materiais.add(m);
    }
    public Usuario buscarUsuario(int codigo){
        for(Usuario u : usuarios) {
            if(u.getCodigo()==codigo){
                return u;
            }
        }
        return null;
    }
    public Material buscarMat(int codigo){
        for(Material m : materiais) {
            if(m.getCodigo()==codigo){
                return m;
            }
        }
        return null;
    }
    public int contarEmprestimos(Usuario u){
        int count =0;
        for(Emprestimo e: emprestimos){
            if(e.getUsuario()==u) {
                count++;
            }   
        }
        return count;
    }
    public void emprestar(int id, int codUsu, int codMat){
        Usuario u = buscarUsuario(codUsu);
        Material m = buscarMat(codMat);
        if (u==null || m==null){
            System.out.println("Erro");
            return;
        }
        if(!m.disponivel()){
            System.out.println("Não Disponível");
            return;
        }
        if(contarEmprestimos(u)>= u.getLimite()){
            System.out.println("Limite Atingido");
            return;
        }
        emprestimos.add(new Emprestimo(id, u, m, 1));
    }
}