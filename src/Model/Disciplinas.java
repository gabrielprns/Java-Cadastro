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
public class Disciplinas {
 private int CodDis;
 private String NomeDis;
  private float CargaH;
  private String AulasSeman;
  private String Pesquisa;

    public String getPesquisa() {
        return Pesquisa;
    }

    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }

    public int getCodDis() {
        return CodDis;
    }

    public void setCodDis(int CodDis) {
        this.CodDis = CodDis;
    }

    public String getNomeDis() {
        return NomeDis;
    }

    public void setNomeDis(String NomeDis) {
        this.NomeDis = NomeDis;
    }

    public float getCargaH() {
        return CargaH;
    }

    public void setCargaH(float CargaH) {
        this.CargaH = CargaH;
    }

    public String getAulasSeman() {
        return AulasSeman;
    }

    public void setAulasSeman(String AulasSeman) {
        this.AulasSeman = AulasSeman;
    }
}

    

   