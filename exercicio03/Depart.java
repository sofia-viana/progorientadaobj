class Depart {
    private int codigo;
    private String depart;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getDepart() {
        return depart;
    }
    public Depart(int codigo, String depart){
        this.codigo = codigo;
        this.depart = depart;
    }
    public String toString() {
        return "Código: "+ codigo +
        "\nDepartamento: "+ depart ;
    }

}

