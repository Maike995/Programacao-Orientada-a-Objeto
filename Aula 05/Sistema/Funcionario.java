

package sistema;


public class Funcionario extends Usuario{
  
  public Funcionario(String nome, int senha){
  this.nome=nome;
  this.senha=senha;
  }
  

  public void calcularVenda(int quantidadeDeVenda, double valorUnitario, double listarVenda){
        System.out.println("Relatorio de vendas| Quantidade De Venda: "+quantidadeDeVenda+" | valor unitário: "+valorUnitario+" | listar venda: "+listarVenda);
    }
  
}
