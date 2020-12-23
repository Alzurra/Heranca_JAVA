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
public class UsaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago");
        funcionario.setRg("234.451.190-1");
        funcionario.setCartao("RH544");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());

    }

}
