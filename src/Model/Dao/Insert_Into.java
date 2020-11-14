/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Model.Alunos;
import Model.Curso;
import Model.Disciplinas;
import Model.Professores;
import connection.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Insert_Into {
    
    
    public void create(Alunos a){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO alunos(Matricula,Nome,DataNas,NomeCurso,CodCurso,NP1,NP2,Media,Faltas)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,a.getMatricula());
            stmt.setString(2,a.getNome());
            stmt.setString(3,a.getDataNas());
            stmt.setString(4,a.getNomeCurso());
            stmt.setInt(5,a.getCodCurso());
            stmt.setDouble(6,a.getNP1());
            stmt.setDouble(7,a.getNP2());
            stmt.setDouble(8,a.getMedia());
            stmt.setInt(9,a.getFaltas());
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao salvar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
    
    public void create(Professores b){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO professores(IdentProf,NomeProf,DataNasc,EspecProfessor,TituloProf,Num,Tel,Cel,Rua,Bairro,Cidade,Estado)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,b.getIdentProf());
            stmt.setString(2,b.getNomeProf());
            stmt.setString(3,b.getDataNasc());
            stmt.setString(4,b.getEspecProfessor());
            stmt.setString(5,b.getTituloProf());
            stmt.setInt(6,b.getNum());
            stmt.setInt(7,b.getTel());
            stmt.setInt(8,b.getCel());
            stmt.setString(9,b.getRua());
            stmt.setString(10,b.getBairro());
            stmt.setString(11,b.getCidade());
            stmt.setString(12,b.getEstado());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao salvar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
    
     public void create(Disciplinas c){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO disciplinas(CodDis,NomeDis,CargaH,AulasSeman)VALUES(?,?,?,?)");
            stmt.setInt(1,c.getCodDis());
            stmt.setString(2,c.getNomeDis());
            stmt.setFloat(3,c.getCargaH());
            stmt.setString(4,c.getAulasSeman());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao salvar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
    
     
     
      public void create(Curso d){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO cursos(CodCursoc,NomeCurso,Tipocurso,CargaHorária,Codinstituto)VALUES(?,?,?,?,?)");
            stmt.setInt(1,d.getCodCursoc());
            stmt.setString(2,d.getNomeCurso());
            stmt.setString(3,d.getTipoCurso());
            stmt.setFloat(4,d.getCargaHoraria());
            stmt.setInt(5,d.getCodinstituto());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "falha ao salvar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
     
     
    public List<Alunos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet AL= null;
        List<Alunos> AlunosL= new ArrayList<>();
        try {
            stmt= con.prepareStatement("SELECT*FROM alunos");
            AL=stmt.executeQuery();
            
            while (AL.next()){
                Alunos a= new Alunos();
                a.setMatricula(AL.getInt("Matricula"));
                a.setNome(AL.getString("Nome"));
                a.setDataNas(AL.getString("DataNas"));
                a.setNomeCurso(AL.getString("NomeCurso"));
                a.setCodCurso(AL.getInt("CodCurso"));
                a.setNP1(AL.getDouble("NP1"));
                a.setNP2(AL.getDouble("NP2"));
                a.setMedia(AL.getDouble("Media"));
                a.setFaltas(AL.getInt("Faltas"));
                AlunosL.add(a);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Into.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{ ConnectionFactory.closeConnection(con, stmt, AL);
                
                
                }
        
        return AlunosL;
    }
    
     public List<Professores> readP(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet AL= null;
        List<Professores> ProfessoresL= new ArrayList<>();
        try {
            stmt= con.prepareStatement("SELECT*FROM professores");
            AL=stmt.executeQuery();
            
            while (AL.next()){
                Professores b= new Professores();
                b.setIdentProf(AL.getInt("IdentProf"));
                b.setNomeProf(AL.getString("NomeProf"));
                b.setRua(AL.getString("Rua"));
                b.setBairro(AL.getString("Bairro"));
                b.setCidade(AL.getString("Cidade"));
                b.setNum(AL.getInt("Num"));
                b.setTel(AL.getInt("Tel"));
                b.setCel(AL.getInt("Cel"));
                b.setEspecProfessor(AL.getString("EspecProfessor"));
                b.setDataNasc(AL.getString("DataNasc"));
                b.setTituloProf(AL.getString("TituloProf"));
                b.setEstado(AL.getString("Estado"));
                ProfessoresL.add(b);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Into.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{ ConnectionFactory.closeConnection(con, stmt, AL);
                
                
                }
        
        return ProfessoresL;
    }
      public List<Disciplinas> readD(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet AL= null;
        List<Disciplinas> DisciplinasL= new ArrayList<>();
        try {
            stmt= con.prepareStatement("SELECT*FROM disciplinas ");
            AL=stmt.executeQuery();
            
            while (AL.next()){
                Disciplinas c= new Disciplinas();
                c.setCodDis(AL.getInt("CodDis"));
                c.setNomeDis(AL.getString("NomeDis"));
                c.setCargaH(AL.getFloat("CargaH"));
                c.setAulasSeman(AL.getString("AulasSeman"));
               
                DisciplinasL.add(c);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Into.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{ ConnectionFactory.closeConnection(con, stmt, AL);
                
                
                }
        
        return DisciplinasL;
    }
      
      
       public List<Curso> readC(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet AL= null;
        List<Curso> CursoL= new ArrayList<>();
        try {
            stmt= con.prepareStatement("SELECT*FROM cursos");
            AL=stmt.executeQuery();
            
            while (AL.next()){
                Curso d= new Curso();
                d.setCodCursoc(AL.getInt("CodCursoc"));
                d.setNomeCurso(AL.getString("Nomecurso"));
                d.setTipoCurso(AL.getString("Tipocurso"));
                d.setCargaHoraria(AL.getFloat("CargaHorária"));
                d.setCodinstituto(AL.getInt("Codinstituto"));
               
                CursoL.add(d);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Into.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{ ConnectionFactory.closeConnection(con, stmt, AL);
                
                
                }
        
        return CursoL;
    }
       
       
        public void Update(Alunos a){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE alunos SET Nome=?,DataNas=?,NomeCurso=?,CodCurso=?,NP1=?,NP2=?,Media=?,Faltas=? WHERE Matricula=?");
            
            stmt.setString(1,a.getNome());
            stmt.setString(2,a.getDataNas());
            stmt.setString(3,a.getNomeCurso());
            stmt.setInt(4,a.getCodCurso());
            stmt.setDouble(5,a.getNP1());
            stmt.setDouble(6,a.getNP2());
            stmt.setDouble(7,a.getMedia());
            stmt.setInt(8,a.getFaltas());
            stmt.setInt(9,a.getMatricula());
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
        
        
         public void Update(Professores b){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE professores SET NomeProf=?,DataNasc=?,EspecProfessor=?,TituloProf=?,Num=?,Tel=?,Cel=?,Rua=?,Bairro=?,Cidade=?,Estado=? WHERE IdentProf=?");
            
            stmt.setString(1,b.getNomeProf());
            stmt.setString(2,b.getDataNasc());
            stmt.setString(3,b.getEspecProfessor());
            stmt.setString(4,b.getTituloProf());
            stmt.setInt(5,b.getNum());
            stmt.setInt(6,b.getTel());
            stmt.setInt(7,b.getCel());
            stmt.setString(8,b.getRua());
            stmt.setString(9,b.getBairro());
            stmt.setString(10,b.getCidade());
            stmt.setString(11,b.getEstado());
            stmt.setInt(12,b.getIdentProf());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,  "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
         
         
         public void Update(Disciplinas c){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE disciplinas SET NomeDis=?,CargaH=?,AulasSeman=? WHERE CodDis=?");
            
            stmt.setString(1,c.getNomeDis());
            stmt.setFloat(2,c.getCargaH());
            stmt.setString(3,c.getAulasSeman());
            stmt.setInt(4,c.getCodDis());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
         
         public void Update(Curso d){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("UPDATE cursos SET NomeCurso=?,Tipocurso=?,CargaHorária=?,Codinstituto=? WHERE  CodCursoc=? ");
            
            stmt.setString(1,d.getNomeCurso());
            stmt.setString(2,d.getTipoCurso());
            stmt.setFloat(3,d.getCargaHoraria());
            stmt.setInt(4,d.getCodinstituto());
            stmt.setInt(5,d.getCodCursoc());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao atualizar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
         
         
         public void Delete(Alunos a){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("DELETE FROM alunos  WHERE Matricula=?");
            
            
            stmt.setInt(1,a.getMatricula());
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "excluido ao atualizar"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
         
         public void Delete(Professores b){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("DELETE FROM professores  WHERE IdentProf=?");
            
            
            stmt.setInt(1,b.getIdentProf());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,  "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
         
         
          public void Delete(Disciplinas c){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("DELETE FROM disciplinas  WHERE CodDis=?");
            
            
            stmt.setInt(1,c.getCodDis());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
          
          
          
          public void Delete(Curso d){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("DELETE FROM cursos  WHERE  CodCursoc=? ");
            
            
            stmt.setInt(1,d.getCodCursoc());
            
            
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir"+ex);
        }finally{
            
            ConnectionFactory.closeConnection(con,stmt);
        }
    
    }
    
}
