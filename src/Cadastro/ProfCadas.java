/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Model.Dao.Insert_Into;
import Model.Professores;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class ProfCadas extends javax.swing.JFrame {

    /**
     * Creates new form ProfCadas
     */
    public ProfCadas() {
        initComponents();
        DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
        modelo.setNumRows(0);
        Table.setRowSorter(new TableRowSorter(modelo));
        readProfCadas();
    }
    
    public void readProfCadas(){
       DefaultTableModel modelo =(DefaultTableModel) Table.getModel();
       modelo.setNumRows(0);
       Insert_Into I = new  Insert_Into();
       for(Professores b: I.readP()){
           
           modelo.addRow(new Object[]{
           
               b.getIdentProf(),
               b.getNomeProf(),
               b.getRua(),
               b.getBairro(),
               b.getCidade(),
               b.getNum(),
               b.getTel(),
               b.getCel(),
               b.getDataNasc(),
               b.getEspecProfessor(),
               b.getTituloProf(),
               b.getEstado()
               
               
               
           
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

        jLabel1 = new javax.swing.JLabel();
        cadastro_jLabel = new javax.swing.JLabel();
        ident_jLabel = new javax.swing.JLabel();
        ident_jTextField = new javax.swing.JTextField();
        Nome_jTextField = new javax.swing.JTextField();
        Nome_jLabel = new javax.swing.JLabel();
        DataNasc_jLabel = new javax.swing.JLabel();
        DataNasc_jTextField = new javax.swing.JTextField();
        endereço_jLabel = new javax.swing.JLabel();
        Rua_jTextField = new javax.swing.JTextField();
        Rua_jLabel = new javax.swing.JLabel();
        Num_jLabel = new javax.swing.JLabel();
        Num_jTextField = new javax.swing.JTextField();
        Bairro_jLabel1 = new javax.swing.JLabel();
        Bairro_jTextField1 = new javax.swing.JTextField();
        Cidade_jLabel = new javax.swing.JLabel();
        Cidade_jTextField = new javax.swing.JTextField();
        Estado_jLabel = new javax.swing.JLabel();
        tel_jLabel = new javax.swing.JLabel();
        tel_jTextField1 = new javax.swing.JTextField();
        Cel_jLabel = new javax.swing.JLabel();
        Cel_jTextField = new javax.swing.JTextField();
        Espec_jLabel = new javax.swing.JLabel();
        Exatas_jCheckBox = new javax.swing.JCheckBox();
        Biologicas_jCheckBox = new javax.swing.JCheckBox();
        Linguisticas_jCheckBox = new javax.swing.JCheckBox();
        Humanas_jCheckBox = new javax.swing.JCheckBox();
        Titulo_jLabel = new javax.swing.JLabel();
        Bacharelado_jCheckBox = new javax.swing.JCheckBox();
        Especialista_jCheckBox = new javax.swing.JCheckBox();
        Mestrado_jCheckBox = new javax.swing.JCheckBox();
        Doutorado_jCheckBox = new javax.swing.JCheckBox();
        voltar1 = new javax.swing.JButton();
        Cadastrar1 = new javax.swing.JButton();
        Estado_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Atualizar = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastro_jLabel.setText("Professor");

        ident_jLabel.setText("Identificação :");

        ident_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ident_jTextFieldActionPerformed(evt);
            }
        });

        Nome_jLabel.setText("Nome:");

        DataNasc_jLabel.setText("DataNasc:");

        DataNasc_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNasc_jTextFieldActionPerformed(evt);
            }
        });

        endereço_jLabel.setText("Endereço:");

        Rua_jLabel.setText("Rua:");

        Num_jLabel.setText("Num:");

        Bairro_jLabel1.setText("Bairro:");

        Cidade_jLabel.setText("Cidade:");

        Estado_jLabel.setText("Estado:");

        tel_jLabel.setText("Tel/fixo:");

        Cel_jLabel.setText("Celular:");

        Espec_jLabel.setText("Especialização:");

        Exatas_jCheckBox.setText("Exatas");
        Exatas_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exatas_jCheckBoxActionPerformed(evt);
            }
        });

        Biologicas_jCheckBox.setText("Biológicas");
        Biologicas_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Biologicas_jCheckBoxActionPerformed(evt);
            }
        });

        Linguisticas_jCheckBox.setText("Linguísticas");
        Linguisticas_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Linguisticas_jCheckBoxActionPerformed(evt);
            }
        });

        Humanas_jCheckBox.setText("Humanas");
        Humanas_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Humanas_jCheckBoxActionPerformed(evt);
            }
        });

        Titulo_jLabel.setText("Título:");

        Bacharelado_jCheckBox.setText("Bacharelado");
        Bacharelado_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bacharelado_jCheckBoxActionPerformed(evt);
            }
        });

        Especialista_jCheckBox.setText("Especialista");
        Especialista_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Especialista_jCheckBoxActionPerformed(evt);
            }
        });

        Mestrado_jCheckBox.setText("Mestrado");
        Mestrado_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mestrado_jCheckBoxActionPerformed(evt);
            }
        });

        Doutorado_jCheckBox.setText("Doutorado");
        Doutorado_jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doutorado_jCheckBoxActionPerformed(evt);
            }
        });

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
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdentProf", "NomeProf", "Rua", "Bairro", "Cidade", "Num", "Tel", "Cel", "DataNasc", "EspecProfessor", "TituloProf", "Estado"
            }
        ));
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereço_jLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bairro_jLabel1)
                                    .addComponent(Rua_jLabel)
                                    .addComponent(Cidade_jLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rua_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bairro_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Cidade_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Estado_jTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addComponent(cadastro_jLabel)
                            .addComponent(Estado_jLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addComponent(Titulo_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mestrado_jCheckBox)
                                    .addComponent(Bacharelado_jCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Especialista_jCheckBox)
                                    .addComponent(Doutorado_jCheckBox)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Espec_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Linguisticas_jCheckBox)
                                    .addComponent(Exatas_jCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Biologicas_jCheckBox)
                                    .addComponent(Humanas_jCheckBox))
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ident_jLabel)
                        .addGap(2, 2, 2)
                        .addComponent(ident_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nome_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DataNasc_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataNasc_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Num_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tel_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tel_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cel_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cel_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cadastrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cadastro_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ident_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ident_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome_jLabel)
                    .addComponent(Nome_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataNasc_jLabel)
                    .addComponent(DataNasc_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Num_jLabel)
                    .addComponent(Num_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel_jLabel)
                    .addComponent(tel_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cel_jLabel)
                    .addComponent(Cel_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(endereço_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rua_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rua_jLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bairro_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bairro_jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cidade_jLabel)
                                    .addComponent(Cidade_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Estado_jLabel)
                                    .addComponent(Estado_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Titulo_jLabel)
                                    .addComponent(Bacharelado_jCheckBox)
                                    .addComponent(Especialista_jCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mestrado_jCheckBox)
                                    .addComponent(Doutorado_jCheckBox))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Deletar)
                                .addGap(18, 18, 18)
                                .addComponent(Cadastrar1)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Atualizar)
                                .addGap(18, 18, 18)
                                .addComponent(voltar1)
                                .addGap(22, 22, 22))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Espec_jLabel)
                    .addComponent(Exatas_jCheckBox)
                    .addComponent(Biologicas_jCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Linguisticas_jCheckBox)
                    .addComponent(Humanas_jCheckBox))
                .addGap(382, 382, 382))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataNasc_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNasc_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNasc_jTextFieldActionPerformed

    private void ident_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ident_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ident_jTextFieldActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible (true);
        this.dispose();
    }//GEN-LAST:event_voltar1ActionPerformed

    private void Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar1ActionPerformed
        // TODO add your handling code here:
        Professores b = new Professores();
        Insert_Into I =new  Insert_Into();
        b.setIdentProf(Integer.parseInt(ident_jTextField.getText()));
        b.setNomeProf(Nome_jTextField.getText());
        b.setDataNasc(DataNasc_jTextField.getText());       
        b.setNum(Integer.parseInt(Num_jTextField.getText()));
        b.setTel(Integer.parseInt(tel_jTextField1.getText()));
        b.setCel(Integer.parseInt(Cel_jTextField.getText()));
        b.setRua(Rua_jTextField.getText());
        b.setBairro(Bairro_jTextField1.getText());
        b.setCidade(Cidade_jTextField.getText());
        b.setEstado(Estado_jTextField.getText());
        if(Exatas_jCheckBox.isSelected()){
           b.setEspecProfessor(Exatas_jCheckBox.getText());
           }
        else if(Biologicas_jCheckBox.isSelected()){
           b.setEspecProfessor(Biologicas_jCheckBox.getText());
           }
        else if(Linguisticas_jCheckBox.isSelected()){
           b.setEspecProfessor(Linguisticas_jCheckBox.getText());
           }
        else if(Humanas_jCheckBox.isSelected()){
           b.setEspecProfessor(Humanas_jCheckBox.getText());
           }
        if(Bacharelado_jCheckBox.isSelected()){
           b.setTituloProf(Bacharelado_jCheckBox.getText());
           }
        else if(Especialista_jCheckBox.isSelected()){
           b.setTituloProf(Especialista_jCheckBox.getText());
           }
        else if(Mestrado_jCheckBox.isSelected()){
           b.setTituloProf(Mestrado_jCheckBox.getText());
           }
        else if(Doutorado_jCheckBox.isSelected()){
           b.setTituloProf(Doutorado_jCheckBox.getText());
           }
        I.create(b);
        readProfCadas();
    }//GEN-LAST:event_Cadastrar1ActionPerformed

    private void Exatas_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exatas_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Biologicas_jCheckBox.setSelected(false);
        Linguisticas_jCheckBox.setSelected(false);
        Humanas_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Exatas_jCheckBoxActionPerformed

    private void Biologicas_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Biologicas_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Exatas_jCheckBox.setSelected(false);
        Linguisticas_jCheckBox.setSelected(false);
        Humanas_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Biologicas_jCheckBoxActionPerformed

    private void Linguisticas_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Linguisticas_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Biologicas_jCheckBox.setSelected(false);
        Exatas_jCheckBox.setSelected(false);
        Humanas_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Linguisticas_jCheckBoxActionPerformed

    private void Humanas_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Humanas_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Biologicas_jCheckBox.setSelected(false);
        Linguisticas_jCheckBox.setSelected(false);
        Exatas_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Humanas_jCheckBoxActionPerformed

    private void Bacharelado_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bacharelado_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Especialista_jCheckBox.setSelected(false);
        Mestrado_jCheckBox.setSelected(false);
        Doutorado_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Bacharelado_jCheckBoxActionPerformed

    private void Especialista_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Especialista_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Bacharelado_jCheckBox.setSelected(false);
        Mestrado_jCheckBox.setSelected(false);
        Doutorado_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Especialista_jCheckBoxActionPerformed

    private void Mestrado_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mestrado_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Bacharelado_jCheckBox.setSelected(false);
        Especialista_jCheckBox.setSelected(false);
        Doutorado_jCheckBox.setSelected(false);
        
    }//GEN-LAST:event_Mestrado_jCheckBoxActionPerformed

    private void Doutorado_jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doutorado_jCheckBoxActionPerformed
        // TODO add your handling code here:
        Bacharelado_jCheckBox.setSelected(false);
        Especialista_jCheckBox.setSelected(false);
        Mestrado_jCheckBox.setSelected(false);
    }//GEN-LAST:event_Doutorado_jCheckBoxActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
        
        Professores b = new Professores();
        Insert_Into I =new  Insert_Into();
        b.setIdentProf(Integer.parseInt(ident_jTextField.getText()));
        b.setNomeProf(Nome_jTextField.getText());
        b.setDataNasc(DataNasc_jTextField.getText());       
        b.setNum(Integer.parseInt(Num_jTextField.getText()));
        b.setTel(Integer.parseInt(tel_jTextField1.getText()));
        b.setCel(Integer.parseInt(Cel_jTextField.getText()));
        b.setRua(Rua_jTextField.getText());
        b.setBairro(Bairro_jTextField1.getText());
        b.setCidade(Cidade_jTextField.getText());
        b.setEstado(Estado_jTextField.getText());
        if(Exatas_jCheckBox.isSelected()){
           b.setEspecProfessor(Exatas_jCheckBox.getText());
           }
        else if(Biologicas_jCheckBox.isSelected()){
           b.setEspecProfessor(Biologicas_jCheckBox.getText());
           }
        else if(Linguisticas_jCheckBox.isSelected()){
           b.setEspecProfessor(Linguisticas_jCheckBox.getText());
           }
        else if(Humanas_jCheckBox.isSelected()){
           b.setEspecProfessor(Humanas_jCheckBox.getText());
           }
        if(Bacharelado_jCheckBox.isSelected()){
           b.setTituloProf(Bacharelado_jCheckBox.getText());
           }
        else if(Especialista_jCheckBox.isSelected()){
           b.setTituloProf(Especialista_jCheckBox.getText());
           }
        else if(Mestrado_jCheckBox.isSelected()){
           b.setTituloProf(Mestrado_jCheckBox.getText());
           }
        else if(Doutorado_jCheckBox.isSelected()){
           b.setTituloProf(Doutorado_jCheckBox.getText());
           }
        I.Update(b);
        readProfCadas();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        // TODO add your handling code here:
     ident_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),0).toString());
     Nome_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),1).toString());
     Rua_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),2).toString());
     Bairro_jTextField1.setText(Table.getValueAt(Table.getSelectedRow(),3).toString());
     Cidade_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),4).toString());
     Num_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),5).toString());
     tel_jTextField1.setText(Table.getValueAt(Table.getSelectedRow(),6).toString());
     Cel_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),7).toString());
     DataNasc_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),8).toString());
     Estado_jTextField.setText(Table.getValueAt(Table.getSelectedRow(),11).toString());
    }//GEN-LAST:event_TableKeyReleased

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        // TODO add your handling code here:
        
        Professores b = new Professores();
        Insert_Into I =new  Insert_Into();
        b.setIdentProf(Integer.parseInt(ident_jTextField.getText()));
        
        I.Delete(b);
        readProfCadas();
    }//GEN-LAST:event_DeletarActionPerformed

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
            java.util.logging.Logger.getLogger(ProfCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfCadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfCadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JCheckBox Bacharelado_jCheckBox;
    private javax.swing.JLabel Bairro_jLabel1;
    private javax.swing.JTextField Bairro_jTextField1;
    private javax.swing.JCheckBox Biologicas_jCheckBox;
    private javax.swing.JButton Cadastrar1;
    private javax.swing.JLabel Cel_jLabel;
    private javax.swing.JTextField Cel_jTextField;
    private javax.swing.JLabel Cidade_jLabel;
    private javax.swing.JTextField Cidade_jTextField;
    private javax.swing.JLabel DataNasc_jLabel;
    private javax.swing.JTextField DataNasc_jTextField;
    private javax.swing.JButton Deletar;
    private javax.swing.JCheckBox Doutorado_jCheckBox;
    private javax.swing.JLabel Espec_jLabel;
    private javax.swing.JCheckBox Especialista_jCheckBox;
    private javax.swing.JLabel Estado_jLabel;
    private javax.swing.JTextField Estado_jTextField;
    private javax.swing.JCheckBox Exatas_jCheckBox;
    private javax.swing.JCheckBox Humanas_jCheckBox;
    private javax.swing.JCheckBox Linguisticas_jCheckBox;
    private javax.swing.JCheckBox Mestrado_jCheckBox;
    private javax.swing.JLabel Nome_jLabel;
    private javax.swing.JTextField Nome_jTextField;
    private javax.swing.JLabel Num_jLabel;
    private javax.swing.JTextField Num_jTextField;
    private javax.swing.JLabel Rua_jLabel;
    private javax.swing.JTextField Rua_jTextField;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Titulo_jLabel;
    private javax.swing.JLabel cadastro_jLabel;
    private javax.swing.JLabel endereço_jLabel;
    private javax.swing.JLabel ident_jLabel;
    private javax.swing.JTextField ident_jTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tel_jLabel;
    private javax.swing.JTextField tel_jTextField1;
    private javax.swing.JButton voltar1;
    // End of variables declaration//GEN-END:variables
}
