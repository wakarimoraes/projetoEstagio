/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.util;

import com.codoid.products.exception.FilloException;
import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;

/**
 *
 * @author dedeh
 */
public class VagaUtil {
    Conexao con = new Conexao();
    public boolean cadastrarVaga(String cursoDesejado,String nvagas,String descricao) throws FilloException{
        con.getConexao();
        try{
            String strQuery = "INSERT INTO tb_vaga(cursoDesejado,nvagas,descricao) VALUES('" + cursoDesejado + "','" + nvagas + "','" + descricao + "')";
            connection.executeUpdate(strQuery);
            connection.close();
            return true;
        }catch(Exception e){
            e.getMessage();
           return false; 
        }
        
        
    }
}
