/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.util;

import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;


/**
 *
 * @author dedeh
 */
public class UtilEmpresas  {

    Conexao con = new Conexao();

    public boolean cadastrarempresa(int cnpj, String nome) {
        try {
            con.getConexao();
            String strQuery = "INSERT INTO tb_empresa(cnpj,nome) VALUES('" + cnpj + "','" + nome + "')";
            connection.executeUpdate(strQuery);
            connection.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
