/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Curso {
    private int CodCursoc;
    private String NomeCurso;
    private String TipoCurso;
    private float CargaHoraria;
    private int Codinstituto;

    public int getCodCursoc() {
        return CodCursoc;
    }

    public void setCodCursoc(int CodCursoc) {
        this.CodCursoc = CodCursoc;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public String getTipoCurso() {
        return TipoCurso;
    }

    public void setTipoCurso(String TipoCurso) {
        this.TipoCurso = TipoCurso;
    }

    public float getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(float CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public int getCodinstituto() {
        return Codinstituto;
    }

    public void setCodinstituto(int Codinstituto) {
        this.Codinstituto = Codinstituto;
    }

}
