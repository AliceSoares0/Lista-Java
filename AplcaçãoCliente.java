package org.example;

public class AplicacaoCliente {
    public static void main(String[] args){
        Cliente cli = new Cliente();
        AplicacaoCliente.imprimeCliente(cli);
        Cliente cli1 = new ClientePessoaFisica("Beltrano", "Rua tal", "123");
        AplicacaoCliente.imprimeCliente(cli1);
        Cliente cli2 = new ClientePessoaJuridica("Cicrano", "Rua Taltal", "321");
        AplicacaoCliente.imprimeCliente(cli2);
    }

    public static void imprimeCliente(Cliente c){
        System.out.println(c+" ");
        if(c instanceof ClientePessoaFisica){
            System.out.println("CPF: "+((ClientePessoaFisica) c).getCpf());
        }
        if(c instanceof ClientePessoaJuridica){
            System.out.println("CNPJ: "+((ClientePessoaJuridica) c).getCnpj());
        }
    }
}
