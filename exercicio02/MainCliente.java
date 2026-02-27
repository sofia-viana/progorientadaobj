public class MainCliente {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua do Principe", 
        12, "Boa Vista", 
        "Recife", "PE");

        Data D = new Data(23, 10, 2006);
        Telefone tell = new Telefone("81", "997345678");

        Cliente c = new Cliente("Sofia",
         "345678", "234.865.987-89", tell, D, end);
         System.out.println(c);
        
    }
}