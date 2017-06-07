/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.util;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import java.util.ArrayList;
import projetoestagiov1.conexao.Aluno;

import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;

//import projetoestagiov1.conexao.Conexao;
//import static projetoestagiov1.conexao.Conexao.connection;
/**
 *
 * @author dedeh
 */
public class UtilAlunos {

    Conexao con = new Conexao();

    public boolean CadastrarAluno(String nome, String curso, String periodo) throws FilloException {

        try {
            con.getConexao();
            String strQuery = "INSERT INTO tb_aluno(Nome,Curso,Periodo) VALUES('" + nome + "','" + curso + "','" + periodo + "')";
            connection.executeUpdate(strQuery);
            connection.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList ListarAluno() throws FilloException {
        con.getConexao();
        
        ArrayList<Aluno> alunos = new ArrayList();
        Aluno lista = new Aluno();
        
        String strQuery = "Select * from tb_aluno";
        Recordset rs = connection.executeQuery(strQuery);
        

        
        while (rs.next()) 
        {
        lista.setCurso(rs.getField("Curso"));
        lista.setNome(rs.getField("Nome"));
 
            alunos.add(lista);
        }

        
        rs.close();
        connection.close();
        return alunos;
        
    }
    
}
