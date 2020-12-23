
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author Thiago
 */
public class PessoaJurídica extends Pessoa {
    private String cnpj;
    
public void setCnpj (String Cnpj){
    this.cnpj=cnpj;
}
 public String getCnpj(){
   return(cnpj);     
 }           
}
