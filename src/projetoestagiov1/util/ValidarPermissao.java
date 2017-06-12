/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.util;


import projetoestagiov1.formularios.TelaEmpresa;
import projetoestagiov1.formularios.TelaPrincipal;

/**
 *
 * @author dedeh
 */
public class ValidarPermissao {
    
    public int valPermissao(int permissao){
       if (permissao == 2){
           TelaEmpresa te = new TelaEmpresa();
           te.setVisible(true);
       }else if(permissao == 1){
           TelaPrincipal tp = new TelaPrincipal();
           tp.setVisible(true);
       }
        return permissao;
        
    }
}
