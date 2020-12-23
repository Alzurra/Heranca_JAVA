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
public class Funcionario extends PessoaFísica {
    private String cartao;
    
    public void setCartao(String cartao){
        this.cartao=cartao;
    }
    
    public String getCartao(){
        return(cartao);
    }

    void setCnpj(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getcnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
