package Teste;

import org.example.model.Cidade;
import org.example.model.Estado;
import org.example.model.Pessoa;

import java.util.ArrayList;

public class TestaListaPessoa {
    public static void main(String[] args) {

        //Generics
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Estado estado = new Estado();
        estado.setNome("Amazonas");
        estado.setSigla("AM");

        Cidade cidade = new Cidade();
        cidade.setNome("Manaus");
        cidade.setEstado(estado);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Adrielly");
        pessoa1.setTelefone("9936-2653");
        pessoa1.setEmail("adrielly@gmail.com");
        pessoa1.setCidade(cidade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setTelefone("9936-2653");
        pessoa2.setEmail("maria@gmail.com");
        pessoa2.setCidade(cidade);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Joao");
        pessoa3.setTelefone("9936-2653");
        pessoa3.setEmail("joao@gmail.com");
        pessoa3.setCidade(cidade);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for(Pessoa p:pessoas){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Telefone: " + p.getTelefone());
            System.out.println("Email: " + p.getEmail());
            System.out.println("Cidade: " +p.getCidade().getNome());
            System.out.println("Estado: " +p.getCidade().getEstado().getNome());
            System.out.println("*****************************************");
        }

 //       System.out.println("Nome: " + pessoa.getNome());
  //      System.out.println("Telefone: " + pessoa.getTelefone());
  //      System.out.println("Email: " + pessoa.getEmail());
   //     System.out.println("Cidade: " +pessoa.getCidade().getNome());
   //     System.out.println("Estado: " +pessoa.getCidade().getEstado().getNome());
    }

}
