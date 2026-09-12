package org.example;

import org.example.model.Cidade;
import org.example.model.Estado;
import org.example.model.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();

        System.out.print("Digite seu nome: ");
        pessoa.setNome(entrada.nextLine());

        System.out.print("Digite seu telefone: ");
        pessoa.setTelefone(entrada.nextLine());

        System.out.print("Digite seu email: ");
        pessoa.setEmail(entrada.nextLine());

        System.out.println("Informe o nome do seu estado: ");
        estado.setNome(entrada.nextLine());

        System.out.println("Informe a sigla do seu estado: ");
        estado.setSigla(entrada.nextLine());

        System.out.println("Informe o nome da sua cidade: ");
        cidade.setNome(entrada.nextLine());

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Estado: " + estado.getNome());
        System.out.println("Sigla do Estado: " + estado.getSigla());
        System.out.println("Cidade: " + cidade.getNome());

        entrada.close();
    }
}
