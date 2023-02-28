package org.example;

public class ClientePessoaFisica extends Cliente{

    String cpf;

    public ClientePessoaFisica(String nome, String endereco, String cpf){
        super(nome,endereco);
        this.cpf = cpf;
    }
    public ClientePessoaFisica(){
        super();
        this.cpf = "456";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return super.toString()+" CPF: "+getCpf();
    }
}
