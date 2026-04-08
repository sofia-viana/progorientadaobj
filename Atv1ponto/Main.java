package Atv1ponto;

public class Main {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        Usuario aluno = new Aluno(1, "Ana");
        Usuario professor = new Professor(2, "Carlos");

        b.cadastrarUsuario(aluno);
        b.cadastrarUsuario(professor);
        Material livro1 = new Livro(1, "Java Básico", 2, "Ciclano");
        Material livro2 = new Livro(2, "Estruturas de Dados", 1, "Fulano");
        Material revista = new Revista(3, "Revista Tech", 1, 6);
        Material ebook = new Ebook(4, "POO em Java", 1, "PDF", 13);

        b.cadastrarMaterial(livro1);
        b.cadastrarMaterial(livro2);
        b.cadastrarMaterial(revista);
        b.cadastrarMaterial(ebook);

        b.emprestar(1, 1, 1);
        b.emprestar(2, 2, 2);
        b.emprestar(3, 1, 3);
        b.emprestar(4, 2, 4);

        Emprestimo e1 = b.emprestimos.get(0);
        e1.devolver(10);
        Emprestimo e2 = b.emprestimos.get(1);
        e2.devolver(0);
        Emprestimo e3 = b.emprestimos.get(2);
        e3.devolver(5);
        Emprestimo e4 = b.emprestimos.get(3);
        e4.devolver(16);
        System.out.println(e1.exibirResumo());
        System.out.println(e2.exibirResumo());
        System.out.println(e3.exibirResumo());
        System.out.println(e4.exibirResumo());
    }
}