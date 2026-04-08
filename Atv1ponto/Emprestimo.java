package Atv1ponto;

public class Emprestimo implements Exibivel, CalculaMulta {
    private int id;
    private Usuario usuario;
    private Material material;
    private int diasAtrasados;
    
    public Emprestimo(int id, Usuario usuario, Material material) {
        this.id = id;
        this.usuario= usuario;
        this.material= material;
        this.diasAtrasados = 0;
        material.emprestar();
    }
    public void devolver(int diasAtrasados){
        this.diasAtrasados = diasAtrasados;
        material.devolver();
    }
    public double calcularMulta(){
        return diasAtrasados * usuario.getMulta();
    }
    public String exibirResumo(){
        return "Emprestimo "+id+" | Multa: R$ "+ calcularMulta();
    }
    public Usuario getUsuario(){
        return usuario;
    }
}
