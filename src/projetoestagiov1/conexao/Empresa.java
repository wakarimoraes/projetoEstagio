/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoestagiov1.conexao;

/**
 *
 * @author dedeh
 */
public class Empresa {
    public int CNPJ;
    public int Nome;

    /**
     * @return the CNPJ
     */
    public int getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the Nome
     */
    public int getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(int Nome) {
        this.Nome = Nome;
    }
}
