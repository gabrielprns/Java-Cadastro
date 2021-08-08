/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Model.Alunos;
import Model.Dao.Insert_Into;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class CadasAluno extends javax.swing.JFrame {

    /**
     * Creates new form CadasAluno
     */
    public CadasAluno() {
        initComponents();
        DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
        modelo.setNumRows(0);
        Table.setRowSorter(new TableRowSorter(modelo));
        readCadasAluno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void readCadasAluno(){
       DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
       modelo.setNumRows(0);
       Insert_Into I = new  Insert_Into();
       for(Alunos a: I.read()){
           
           modelo.addRow(new Object[]{
           
               a.getMatricula(),
               a.getNome(),
               a.getDataNas(),
               a.getNomeCurso(),
               a.getCodCurso(),
               a.getNP1(),
               a.getNP2(),
               a.getMedia(),
               a.getFaltas()
               
               
               
           
           });
       }
    
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTextField1 = new javax.swing.JTextField();
        cadastro_jLabel = new javax.swing.JLabel();
        Matricula_jLabel = new javax.swing.JLabel();
        Matricula_jTextField = new javax.swing.JTextField();
        Nome_jLabel = new javax.swing.JLabel();
        Nome_jTextField = new javax.swing.JTextField();
        DataNasc_jLabel = new javax.swing.JLabel();
        DataNasc_jTextField = new javax.swing.JTextField();
        CódCurso_jLabel = new javax.swing.JLabel();
        CódCurso_jTextField = new javax.swing.JTextField();
        Nome_Curso_jLabel = new javax.swing.JLabel();
        NP1_jLabel = new javax.swing.JLabel();
        NP1_jTextField = new javax.swing.JTextField();
        NP2_jLabel1 = new javax.swing.JLabel();
        NP2_jTextField1 = new javax.swing.JTextField();
        Media_jLabel2 = new javax.swing.JLabel();
        Media_jTextField2 = new javax.swing.JTextField();
        Faltas_jLabel3 = new javax.swing.JLabel();
        Faltas_jTextField3 = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListT = new javax.swing.JList<>();
        B = new javax.swing.JTextField();
        Atualizar = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastro_jLabel.setText(" Aluno");

        Matricula_jLabel.setText("Matricula :");

        Nome_jLabel.setText("Nome:");

        DataNasc_jLabel.setText("DataNasc:");

        DataNasc_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNasc_jTextFieldActionPerformed(evt);
            }
        });

        CódCurso_jLabel.setText("Código do curso:");

        Nome_Curso_jLabel.setText("Nome do Curso:");

        NP1_jLabel.setText("NP1");

        NP2_jLabel1.setText("NP2");

        Media_jLabel2.setText("Média");

        Faltas_jLabel3.setText("Faltas");

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

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "DataNas", "NomeCurso", "CodCurso", "NP1", "NP2", "Medias", "Faltas"
            }
        ));
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        ListT.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ciência da computação", "Administração de Empresas", "BioMedicina", "Ciências Biológicas", "Direito Educação Física", "Farmacologia", "Rede de Computadores", "Sistemas de Informações" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListT);

        B.setEditable(false);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Matricula_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Matricula_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nome_jLabel))
                            .addComponent(voltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Delete)
                                .addGap(18, 18, 18)
                                .addComponent(Cadastrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nome_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DataNasc_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataNasc_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CódCurso_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CódCurso_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nome_Curso_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B)
                                    .addComponent(jScrollPane2))
                                .addGap(0, 83, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastro_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NP1_jLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(NP1_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Media_jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Media_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NP2_jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(NP2_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Faltas_jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Faltas_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Atualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastro_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Matricula_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Matricula_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nome_jLabel)
                        .addComponent(Nome_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DataNasc_jLabel)
                        .addComponent(DataNasc_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CódCurso_jLabel)
                        .addComponent(CódCurso_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nome_Curso_jLabel))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NP1_jLabel)
                            .addComponent(NP1_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Media_jLabel2)
                            .addComponent(Media_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NP2_jLabel1)
                            .addComponent(NP2_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Faltas_jLabel3)
                            .addComponent(Faltas_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cadastrar)
                            .addComponent(voltar)
                            .addComponent(Atualizar)
                            .addComponent(Delete))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataNasc_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNasc_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNasc_jTextFieldActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        
        Alunos a = new Alunos();
        Insert_Into I =new  Insert_Into();
        a.setMatricula(Integer.parseInt(Matricula_jTextField.getText()));
        a.setNome(Nome_jTextField.getText());
        a.setCodCurso(Integer.parseInt(CódCurso_jTextField.getText()));
        a.setDataNas(DataNasc_jTextField.getText());
        a.setNP1(Double.parseDouble(NP1_jTextField.getText()));
        a.setNP2(Double.parseDouble(NP2_jTextField1.getText()));
        a.setMedia(Double.parseDouble(Media_jTextField2.getText()));
        a.setFaltas(Integer.parseInt(Faltas_jTextField3.getText()));
        String L=ListT.getSelectedValuesList().toString();
        B.setText(L);
        a.setNomeCurso(B.getText());
        
        
        
        I.create(a);
        readCadasAluno();
    }//GEN-LAST:event_CadastrarActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
        Alunos a = new Alunos();
        Insert_Into I =new  Insert_Into();
        a.setMatricula(Integer.parseInt(Matricula_jTextField.getText()));
        a.setNome(Nome_jTextField.getText());
        a.setCodCurso(Integer.parseInt(CódCurso_jTextField.getText()));
        a.setDataNas(DataNasc_jTextField.getText());
        a.setNP1(Double.parseDouble(NP1_jTextField.getText()));
        a.setNP2(Double.parseDouble(NP2_jTextField1.getText()));
        a.setMedia(Double.parseDouble(Media_jTextField2.getText()));
        a.setFaltas(Integer.parseInt(Faltas_jTextField3.getText()));
        String L=ListT.getSelectedValuesList().toString();
        B.setText(L);
        a.setNomeCurso(B.getText());
        
        
        
        I.Update(a);
        readCadasAluno();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        // TODO add your handling code here:
     Matricula_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),0).toString());
     Nome_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),1).toString());
     DataNasc_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),2).toString());
     B.setText(Table.getValueAt(Table.getSelectedRow(),3).toString());
     CódCurso_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),4).toString());
     NP1_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),5).toString());
     NP2_jTextField1.setText(Table.getValueAt(Table.getSelectedRow(),6).toString());
     Media_jTextField2.setText(Table.getValueAt(Table.getSelectedRow(),7).toString());
     Faltas_jTextField3.setText(Table.getValueAt(Table.getSelectedRow(),8).toString());
    }//GEN-LAST:event_TableKeyReleased

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        Alunos a = new Alunos();
        Insert_Into I =new  Insert_Into();
        a.setMatricula(Integer.parseInt(Matricula_jTextField.getText()));
        
        
        
        
        I.Delete(a);
        readCadasAluno();
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
            java.util.logging.Logger.getLogger(CadasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadasAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JTextField B;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel CódCurso_jLabel;
    private javax.swing.JTextField CódCurso_jTextField;
    private javax.swing.JLabel DataNasc_jLabel;
    private javax.swing.JTextField DataNasc_jTextField;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Faltas_jLabel3;
    private javax.swing.JTextField Faltas_jTextField3;
    private javax.swing.JList<String> ListT;
    private javax.swing.JLabel Matricula_jLabel;
    private javax.swing.JTextField Matricula_jTextField;
    private javax.swing.JLabel Media_jLabel2;
    private javax.swing.JTextField Media_jTextField2;
    private javax.swing.JLabel NP1_jLabel;
    private javax.swing.JTextField NP1_jTextField;
    private javax.swing.JLabel NP2_jLabel1;
    private javax.swing.JTextField NP2_jTextField1;
    private javax.swing.JLabel Nome_Curso_jLabel;
    private javax.swing.JLabel Nome_jLabel;
    private javax.swing.JTextField Nome_jTextField;
    private javax.swing.JTable Table;
    private javax.swing.JLabel cadastro_jLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}