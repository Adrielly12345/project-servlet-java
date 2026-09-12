package org.example.model;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private Cidade cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cidade getCidade() {
        return this.cidade;

    }
}







