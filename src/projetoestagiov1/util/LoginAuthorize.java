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
        String strLogin = "Select login from tb_usuario where login='"+login+"'";
        String strSenha = "Select senha from tb_usuario where login='"+senha+"'";
        Recordset rSenha = connection.executeQuery(strLogin);
        Recordset rLogin = connection.executeQuery(strSenha);
        rSenha.getField("senha");rLogin.getField("login");
        
        if (rSenha.next() && rLogin.next()){
            System.out.println("Logado");
            CadastroAlunos cad = new CadastroAlunos();
            cad.setVisible(true);
        }else{
            System.out.println("Usuário ou senha incorretos");
        }
        rSenha.close();
        rLogin.close();
        connection.close();
        return true;
        
    }
}
