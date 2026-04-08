package Atv1ponto;

public class Emprestimo implements Exibivel, CalculaMulta {

    private int id;
    private Usuario usuario;
    private Material material;
    private int diaEmprestimo;
    private int diaPrevisto;
    private int diaDevolucao;

    public Emprestimo(int id, Usuario usuario, Material material, int diaAtual) {
        this.id = id;
        this.usuario = usuario;
        this.material = material;
        this.diaEmprestimo = diaAtual;
        this.diaPrevisto = diaAtual + usuario.getPrazo();
        this.diaDevolucao = -1;
        material.emprestar();
    }
    public Usuario getUsuario() {
    return usuario;
}

    public void registrarDevolucao(int diaAtual) {
        if (diaDevolucao != -1) {
            System.out.println("Já foi devolvido!");
            return;
        }

        diaDevolucao = diaAtual;
        material.devolver();
    }
    public boolean finalizado() {
        return diaDevolucao != -1;
    }
    public int diasAtraso() {
        if (!finalizado()) return 0;

        int atraso = diaDevolucao - diaPrevisto;

        if (atraso < 0) return 0;

        return atraso;
    }
    public double calcularMulta() {
        return diasAtraso() * usuario.getMulta();
    }
    public String exibirResumo() {
        return "Emprestimo " + id +
               " | Usuario: " + usuario.exibirResumo() +
               " | Material: " + material.exibirResumo() +
               " | Multa: R$ " + calcularMulta();
    }
}