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
import java.util.Iterator;
import javax.rmi.CORBA.Util;
import projetoestagiov1.conexao.Conexao;
import static projetoestagiov1.conexao.Conexao.connection;
import projetoestagiov1.formularios.AlterarAluno;
import projetoestagiov1.formularios.ListaAlunos;
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
       
        Login log  = new Login();
       log.setVisible(true);
       
    }
}

