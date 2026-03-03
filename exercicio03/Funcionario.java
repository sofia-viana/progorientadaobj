class Funcionario {
    private int matricula;
    private String nome;
    Depart depart;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Funcionario(int matricula, String nome, Depart depart) {
        this.matricula = matricula;
        this.nome = nome;
        this.depart = depart;
    }
    public String toString() {
        return "Matricula: "+ matricula +
        "\nNome: "+ nome +
        "\nCódigo: "+ depart.getCodigo() +
        "\nDepartamento: "+ depart.getDepart() ;
    }
}
