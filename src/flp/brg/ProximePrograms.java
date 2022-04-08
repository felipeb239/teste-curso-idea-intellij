package flp.brg;

import flp.brg.model.Gato;

public class ProximePrograms {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("TESTANDO PAGINAS INTELLIJ",300 );
        System.out.println(livro);

        /* int a = 5;
           int b = 3;
        System.out.println("TESTE JULIUS " + (a+b)); */


    }
}


class Livro  {
    private String nome;
    private Integer NumPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        NumPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        NumPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", NumPaginas=" + NumPaginas +
                '}';
    }


}