/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagio.main;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;
import projetoestagiov1.formularios.CadastroAlunos;
import projetoestagiov1.formularios.Login;
import projetoestagiov1.util.UtilAlunos;

/**
 *
 * @author dedeh
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws com.codoid.products.exception.FilloException
     */
    public static void main(String[] args) throws FilloException {
        /*Fillo fillo=new Fillo();
        
         Connection connection=fillo.getConnection("C:/Users\\dedeh\\OneDrive\\Documentos\\bd_aluno.xlsx");
        
         String strQuery="Select * from Sheet1";
         Recordset recordset=connection.executeQuery(strQuery);

         while(recordset.next())
         {
         System.out.println(recordset.getField("Nome"));
         }

         recordset.close();
         connection.close();*/
Login log = new Login();
log.setVisible(true);


    }
}

/* INSERT AQUI
 Fillo fillo=new Fillo();
 Connection connection=fillo.getConnection("C:\\Test.xlsx");
 String strQuery="INSERT INTO tb_aluno(Nome) VALUES(nome)";

 connection.executeUpdate(strQuery);

 connection.close();
        
 SELECT AQUI
        
 */
