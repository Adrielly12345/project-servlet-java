package Teste;

import org.example.model.Cidade;
import org.example.model.Estado;

public class TestaCidadeEstado {

    public static void main(String[] args){

        Estado estado = new Estado();


        estado.setNome("Amazonas");
        estado.setSigla("AM");

        Cidade cidade = new Cidade();
        cidade.setNome("Manaus");
        cidade.setEstado(estado);

        System.out.println("Exibindo os valores: ");
        System.out.println("Estado: ********");

        System.out.println("Nome: " +estado.getNome());
        System.out.println("Sigla:"+estado.getSigla());


        System.out.println("Cidade ********");

        System.out.println("Nome: " +cidade.getNome());
        Estado estadoDentroDaCidade = cidade.getEstado();
        System.out.println("Estado:"+estadoDentroDaCidade.getNome());

    }
}
