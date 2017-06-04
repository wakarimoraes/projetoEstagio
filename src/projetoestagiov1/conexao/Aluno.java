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
public class Aluno extends Usuario {
    public int Matricula;
    public String Nome;
    public int Periodo;
    public String curso;

    /**
     * @return the Matricula
     */
    public int getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Periodo
     */
    public int getPeriodo() {
        return Periodo;
    }

    /**
     * @param Periodo the Periodo to set
     */
    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
