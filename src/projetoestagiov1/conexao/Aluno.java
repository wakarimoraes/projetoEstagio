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
public class Aluno  {
    public String matricula;
    public String nome;
    public String periodo;
    public String curso;

    /**
     * @return the matricula
     */
        public Aluno(String Matricula, String Nome, String Curso, String periodo)
    {
     this.curso = Curso ;
     this.matricula = Matricula;
     this.nome = Nome;
     this.periodo = periodo;
    }
        
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param Matricula the matricula to set
     */
    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param Periodo the periodo to set
     */
    public void setPeriodo(String Periodo) {
        this.periodo = Periodo;
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
