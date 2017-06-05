/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.util;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import projetoestagiov1.conexao.Aluno;
import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;
import projetoestagiov1.conexao.Usuario;
import projetoestagiov1.formularios.CadastroAlunos;

/**
 *
 * @author dedeh
 */
public class LoginAuthorize {
    Conexao con = new Conexao();
    Usuario user = new Aluno();
    public boolean autorizarLogin(String login, String senha) throws FilloException{
        con.getConexao();
        String strLogin = "Select login from tb_usuario where login='"+login+"' and senha ='"+senha+"'";
        Recordset rAutenticar = connection.executeQuery(strLogin);
        //testegit2
        if (rAutenticar.next()){
            System.out.println("Logado");
            CadastroAlunos cad = new CadastroAlunos();
            cad.setVisible(true);
        }else{
            System.out.println("Usuário ou senha incorretos");
        }
        rAutenticar.close();
        connection.close();
        return true;
        
    }
}
