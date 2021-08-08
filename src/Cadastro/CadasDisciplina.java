/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Model.Dao.Insert_Into;
import Model.Disciplinas;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Gabriel
 */
public class CadasDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form CadasDisciplina
     */
    public CadasDisciplina() {
        initComponents();
        DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
        modelo.setNumRows(0);
        Table.setRowSorter(new TableRowSorter(modelo));
        readCadasDisciplina();
    }
    
    public void readCadasDisciplina(){
       DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
       modelo.setNumRows(0);
       Insert_Into I = new  Insert_Into();
       for(Disciplinas c: I.readD()){
           
           modelo.addRow(new Object[]{
           
               c.getCodDis(),
               c.getNomeDis(),
               c.getCargaH(),
               c.getAulasSeman(),
               
               
               
               
           
           });
       }
    
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
   
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastrar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CodjLabel = new javax.swing.JLabel();
        Cod = new javax.swing.JTextField();
        NDjLabel = new javax.swing.JLabel();
        ND = new javax.swing.JTextField();
        CHjLabel = new javax.swing.JLabel();
        CH = new javax.swing.JTextField();
        ALSjLabel = new javax.swing.JLabel();
        Segunda = new javax.swing.JRadioButton();
        Terça = new javax.swing.JRadioButton();
        Quarta = new javax.swing.JRadioButton();
        Quinta = new javax.swing.JRadioButton();
        Sexta = new javax.swing.JRadioButton();
        Sabado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        voltar1 = new javax.swing.JButton();
        Cadastrar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Atualizar = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CodjLabel.setText("Código Disciplina:");

        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });

        NDjLabel.setText("Nome da Disciplina:");

        CHjLabel.setText("Carga Horária:");

        ALSjLabel.setText("Aulas da semana:");

        Segunda.setText("Segunda");
        Segunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundaActionPerformed(evt);
            }
        });

        Terça.setText("Terça");
        Terça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerçaActionPerformed(evt);
            }
        });

        Quarta.setText("Quarta");
        Quarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuartaActionPerformed(evt);
            }
        });

        Quinta.setText("Quinta");
        Quinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuintaActionPerformed(evt);
            }
        });

        Sexta.setText("Sexta");
        Sexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SextaActionPerformed(evt);
            }
        });

        Sabado.setText("Sábado");
        Sabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Disciplina");

        voltar1.setText("voltar");
        voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar1ActionPerformed(evt);
            }
        });

        Cadastrar1.setText("Cadastrar");
        Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar1ActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CodDis", "NomeDis", "CargaH", "AulasSeman"
            }
        ));
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        Delete.setText("Deletar");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CodjLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NDjLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ND)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(voltar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Atualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CHjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ALSjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Sexta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Sabado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Quarta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(Segunda)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Terça)
                                            .addComponent(Quinta))
                                        .addGap(4, 4, 4))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Cadastrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodjLabel)
                    .addComponent(Cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHjLabel)
                    .addComponent(CH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NDjLabel)
                    .addComponent(ND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALSjLabel)
                    .addComponent(Segunda)
                    .addComponent(Terça))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quarta)
                    .addComponent(Quinta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Atualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Sexta)
                                    .addComponent(Sabado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(Delete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cadastrar1)
                            .addComponent(voltar1))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodActionPerformed

    private void SegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundaActionPerformed
        // TODO add your handling code here:
        Terça.setSelected(false);
        Quarta.setSelected(false);
        Quinta.setSelected(false);
        Sexta.setSelected(false);
        Sabado.setSelected(false);
    }//GEN-LAST:event_SegundaActionPerformed

    private void QuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuartaActionPerformed
        // TODO add your handling code here:
        Terça.setSelected(false);
        Segunda.setSelected(false);
        Quinta.setSelected(false);
        Sexta.setSelected(false);
        Sabado.setSelected(false);
    }//GEN-LAST:event_QuartaActionPerformed

    private void SextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SextaActionPerformed
        // TODO add your handling code here:
        Terça.setSelected(false);
        Quarta.setSelected(false);
        Quinta.setSelected(false);
        Segunda.setSelected(false);
        Sabado.setSelected(false);
    }//GEN-LAST:event_SextaActionPerformed

    private void QuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuintaActionPerformed
        // TODO add your handling code here:
        Terça.setSelected(false);
        Quarta.setSelected(false);
        Segunda.setSelected(false);
        Sexta.setSelected(false);
        Sabado.setSelected(false);
    }//GEN-LAST:event_QuintaActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_CadastrarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       
    }//GEN-LAST:event_voltarActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_voltar1ActionPerformed

    private void Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar1ActionPerformed
        // TODO add your handling code here:

        Disciplinas c = new Disciplinas();
        Insert_Into I =new  Insert_Into();
        c.setCodDis(Integer.parseInt(Cod.getText()));
        c.setNomeDis(ND.getText());
        c.setCargaH(Float.parseFloat(CH.getText()));
        if(Segunda.isSelected()){
           c.setAulasSeman(Segunda.getText());
           }
        if(Terça.isSelected()){
           c.setAulasSeman(Terça.getText());
           }
        if(Quarta.isSelected()){
           c.setAulasSeman(Quarta.getText());
           }
        if(Quinta.isSelected()){
           c.setAulasSeman(Quinta.getText());
           }
         if(Sexta.isSelected()){
           c.setAulasSeman(Sexta.getText());
           }
          if(Sabado.isSelected()){
           c.setAulasSeman(Sabado.getText());
           }
        
        

        I.create(c);
        readCadasDisciplina();
        
       
        
    }//GEN-LAST:event_Cadastrar1ActionPerformed

    private void TerçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerçaActionPerformed
        // TODO add your handling code here:
        Segunda.setSelected(false);
        Quarta.setSelected(false);
        Quinta.setSelected(false);
        Sexta.setSelected(false);
        Sabado.setSelected(false);
    }//GEN-LAST:event_TerçaActionPerformed

    private void SabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabadoActionPerformed
        // TODO add your handling code here:
        Terça.setSelected(false);
        Quarta.setSelected(false);
        Quinta.setSelected(false);
        Sexta.setSelected(false);
        Segunda.setSelected(false);
    }//GEN-LAST:event_SabadoActionPerformed
  
    
     
    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
        Disciplinas c = new Disciplinas();
        Insert_Into I =new  Insert_Into();
        c.setCodDis(Integer.parseInt(Cod.getText()));
        c.setNomeDis(ND.getText());
        c.setCargaH(Float.parseFloat(CH.getText()));
        if(Segunda.isSelected()){
           c.setAulasSeman(Segunda.getText());
           }
        if(Terça.isSelected()){
           c.setAulasSeman(Terça.getText());
           }
        if(Quarta.isSelected()){
           c.setAulasSeman(Quarta.getText());
           }
        if(Quinta.isSelected()){
           c.setAulasSeman(Quinta.getText());
           }
         if(Sexta.isSelected()){
           c.setAulasSeman(Sexta.getText());
           }
          if(Sabado.isSelected()){
           c.setAulasSeman(Sabado.getText());
           }
        
        

        I.Update(c);
        readCadasDisciplina();
        
      
    }//GEN-LAST:event_AtualizarActionPerformed

    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        // TODO add your handling code here:
     Cod.setText(Table.getValueAt(Table.getSelectedRow(),0).toString());
     ND.setText(Table.getValueAt(Table.getSelectedRow(),1).toString());
     CH.setText(Table.getValueAt(Table.getSelectedRow(),2).toString());
     
    }//GEN-LAST:event_TableKeyReleased

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
        Disciplinas c = new Disciplinas();
        Insert_Into I =new  Insert_Into();
        c.setCodDis(Integer.parseInt(Cod.getText()));
        
        
        

        I.Delete(c);
        readCadasDisciplina();
        
        
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadasDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadasDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadasDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadasDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadasDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALSjLabel;
    private javax.swing.JButton Atualizar;
    private javax.swing.JTextField CH;
    private javax.swing.JLabel CHjLabel;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Cadastrar1;
    private javax.swing.JTextField Cod;
    private javax.swing.JLabel CodjLabel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField ND;
    private javax.swing.JLabel NDjLabel;
    private javax.swing.JRadioButton Quarta;
    private javax.swing.JRadioButton Quinta;
    private javax.swing.JRadioButton Sabado;
    private javax.swing.JRadioButton Segunda;
    private javax.swing.JRadioButton Sexta;
    private javax.swing.JTable Table;
    private javax.swing.JRadioButton Terça;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton voltar;
    private javax.swing.JButton voltar1;
    // End of variables declaration//GEN-END:variables
}