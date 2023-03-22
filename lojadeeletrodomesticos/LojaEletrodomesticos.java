/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadeeletrodomesticos;

import java.util.Scanner;





/**
 *
 * @author guilh
 */
public class LojaEletrodomesticos {

  
    public static void main(String[] args){
         
         Scanner entrada = new Scanner (System.in);
         Scanner entrada2 = new Scanner (System.in);
         
       /*  Cliente cliente = new Cliente() ;
         
        System.out.println("------ CADASTRO CLIENTE ------");

        
        System.out.println("Digite o nome: ");
            cliente.setNome(entrada.nextLine());
         
        System.out.println("Digite seu email: ");                 
            cliente.setEmail(entrada.next());   
                      
        System.out.println("Digite seu endereço: ");
            cliente.setEndereco(entrada2.nextLine());
            
        System.out.println("Digite sua cidade: ");
            cliente.setCidade(entrada.next());
                            
        System.out.println("Digite seu Telefone: ");
            cliente.setTelefone(entrada.nextLong());
         
        System.out.println("Digite seu CPF:  ");
            cliente.setCpf(entrada.nextLong());
         
        System.out.println("Digite sua idade: ");
            cliente.setIdade(entrada.nextInt());


         System.out.println("Nome: "+cliente.getNome());
         System.out.println("CPF: "+cliente.getCpf());
         System.out.println("Idade: "+cliente.getIdade());
         System.out.println("Cidade: "+cliente.getCidade());
         System.out.println("Endereço: "+cliente.getEndereco());
         System.out.println("Telefone: "+cliente.getTelefone());
         System.out.println("Email: "+cliente.getEmail());
         
//------------------------------------------------------------------- 
    
    
        Fornecedor fornecedor = new Fornecedor();
           System.out.println("------ CADASTRO FORNECEDOR ------");
         
        System.out.println("Digite o CNPJ: ");                 
           fornecedor.setCnpj(entrada.nextLong()); 
         
        System.out.println("Digite o Telefone: ");
           fornecedor.setTelefoneFor(entrada.nextLong());
         
        System.out.println("Nome do fornecedor: ");                 
           fornecedor.setRazaoSocial(entrada.next());   
            
        System.out.println("Digite o email: ");
           fornecedor.setEmailFor(entrada2.next());
                     
        System.out.println("Digite a cidade: ");
            fornecedor.setCidadeFor(entrada2.next());
         
        System.out.println("Digite o endereço: ");
            fornecedor.setEnderecoFor(entrada2.next());

            
       
         
         System.out.println("FORNECEDOR: "+fornecedor.getRazaoSocial());
         //System.out.println("Nome: "+fornecedor.getRazaoSocial());
         System.out.println("CNPJ: "+fornecedor.getCnpj());
         System.out.println("Email: "+fornecedor.getEmailFor());
         System.out.println("Cidade: "+fornecedor.getCidadeFor());
         System.out.println("Endereço: "+fornecedor.getEnderecoFor());
         System.out.println("Telefone: "+fornecedor.getTelefoneFor());
         
 //------------------------------------------------------------------- */       
    Produto meuProduto = new Produto();
        
        System.out.println("-------- PRODUTO --------");
        
        System.out.println("Digite o Nome do Produto:");
        meuProduto.setNome(entrada.nextLine());
        //System.out.println("Insira a Descricao do produto:");
        //meuProduto.setDescricao(entrada.next());
        System.out.println("Insira o Codigo do produto:");
        meuProduto.setCodigo(entrada.next());
        System.out.println("Insira a Categoria do produto:");
        meuProduto.setCategoria(entrada.next());
        System.out.println("Insira o Preco do produto:");
        meuProduto.setPreco(entrada.nextDouble());
                      
        System.out.println("Nome de produto:"+meuProduto.getNome());
       // System.out.println("Descricao do Produto:"+meuProduto.getDescricao());
        System.out.println("Codigo do Produto:"+meuProduto.getCodigo());
        System.out.println("Categoria do Produto:"+meuProduto.getCategoria());
        System.out.println("Preco do Produto:"+meuProduto.getPreco());
        
        
        
        //Venda meuPreco = new Venda();
        
      //--------------------------------------------------------
        
        Estoque meuEstoque = new Estoque();
        
        System.out.println("-------- ESTOQUE --------");
        
        System.out.println("Insira a Quantidade de Estoque:");
        meuEstoque.setQuantidade(entrada.nextInt());
        
        System.out.println("Insira o valor do produto no estoque");
        meuEstoque.setValorEstoque(entrada.nextDouble());
        
        //System.out.println("Quantidade de estoque:"+meuEstoque.getQuantidade());
        System.out.println("Valor em estoque R$ " + meuEstoque.getValorEstoque());
        
        System.out.println("-------- PRECO TOTAL EM ESTOQUE --------");
        System.out.println("Quantidade em estoque"); 
        meuEstoque.setTotalRealEstoque(entrada.nextDouble());
        System.out.println("Valor total em estoque R$"+ meuEstoque.getTotalRealEstoque());
//--------------------------------------------------------
        
    }
}
