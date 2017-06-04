/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.conexao;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

/**
 *
 * @author dedeh
 */
public class Conexao {
    
    public  static Connection connection;
    
    public Connection getConexao() throws FilloException{
            Fillo fillo=new Fillo();
            try{
                 connection=fillo.getConnection("C:\\Users\\dedeh\\OneDrive\\Documentos\\bd_aluno.xlsx");
                System.out.println("Conexão efetuada");
                
            }catch(FilloException e){
                e.getMessage();
            }
        return connection;
    }


}
