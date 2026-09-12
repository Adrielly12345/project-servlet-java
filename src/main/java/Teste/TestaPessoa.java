package Teste;

import org.example.model.Estado;
import org.example.model.Pessoa;
import org.example.model.Cidade;

public class TestaPessoa {
    public static void main(String[] args) {

        Estado estado = new Estado();
        estado.setNome("Amazonas");
        estado.setSigla("AM");

        Cidade cidade = new Cidade();
        cidade.setNome("Manaus");
        cidade.setEstado(estado);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Adrielly");
        pessoa.setTelefone("9936-2653");
        pessoa.setEmail("adrielly@gmail.com");
        pessoa.setCidade(cidade);


        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Cidade: " +pessoa.getCidade().getNome());
        System.out.println("Estado: " +pessoa.getCidade().getEstado().getNome());
    }
}
