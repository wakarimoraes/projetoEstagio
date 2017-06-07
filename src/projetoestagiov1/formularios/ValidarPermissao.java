/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.formularios;

import projetoestagiov1.conexao.Usuario;

/**
 *
 * @author dedeh
 */
public class ValidarPermissao {
    
    Usuario usuarioLogado = null;
    
    public int valPermissao(){
       if (usuarioLogado.getPermissao() == 2){
           
       }
        return 5;
    }
}
