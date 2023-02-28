package org.example;

public class ClientePessoaJuridica extends Cliente{
    String cnpj;

    public ClientePessoaJuridica(String nome, String endereco, String cnpj){
        super(nome,endereco);
        this.cnpj = cnpj;
    }
    public ClientePessoaJuridica(){
        super();
        this.cnpj = "654";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString()+" CNPJ: "+getCnpj();
    }
}
