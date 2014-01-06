/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.telas;

import fvsosp.emprestimo.Emprestimo;
import fvsosp.emprestimo.EmprestimoRN;
import fvsosp.emprestimo.EmprestimoTableModel;
import fvsosp.exemplar.Exemplar;
import fvsosp.exemplar.ExemplarRN;
import fvsosp.leitor.Leitor;
import fvsosp.leitor.LeitorRN;
import fvsosp.leitor.LeitorTableModel;
import fvsosp.util.Util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tulio
 */
public class TelaCadastroEmpr extends javax.swing.JDialog {

    Emprestimo emprestimo;
    EmprestimoRN emprestimoRN = new EmprestimoRN();
    Leitor leitor;
    LeitorRN leitorRN = new LeitorRN();
    Set<Exemplar> exemplares = new HashSet<>();

    /**
     * Creates new form TelaCadastroEmpr
     */
    public TelaCadastroEmpr() {
        initComponents();
        setLocationRelativeTo(null);
        tfDataEmprestimoDia.setText("");
        ExemplarRN exemplarRN = new ExemplarRN();
        for (int x = 0; x < exemplarRN.listar().size(); x++) {
            tbExemplaresEmprestimo.getModel().setValueAt(exemplarRN.listar().get(x), x, 0);
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

        jPanel9 = new javax.swing.JPanel();
        labelEmprestimo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tfDataEmprestimoDia = new javax.swing.JFormattedTextField();
        labelDataEmprestimo5 = new javax.swing.JLabel();
        labelDataDevolucao15 = new javax.swing.JLabel();
        tfDataEmprestimoMes = new javax.swing.JFormattedTextField();
        tfDataEmprestimoAno = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfDataDevolucaoMes = new javax.swing.JFormattedTextField();
        tfDataDevolucaoAno = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        tfDataDevolucaoDia = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        labelDataDevolucao17 = new javax.swing.JLabel();
        RemoveAcr = new javax.swing.JButton();
        labelDataEmprestimo7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbExemplaresEmprestimo = new javax.swing.JTable();
        AddAcr = new javax.swing.JButton();
        btNovo5 = new javax.swing.JButton();
        btRemover5 = new javax.swing.JButton();
        btSair5 = new javax.swing.JButton();
        btSalvar5 = new javax.swing.JButton();
        btPesquisar5 = new javax.swing.JButton();
        tfLeitor = new javax.swing.JTextField();
        btPesquisar6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(59, 89, 152));
        jPanel9.setLayout(null);

        labelEmprestimo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        labelEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        labelEmprestimo.setText("Empréstimo");
        jPanel9.add(labelEmprestimo);
        labelEmprestimo.setBounds(0, 0, 270, 30);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tfDataEmprestimoDia.setEditable(false);
        tfDataEmprestimoDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        tfDataEmprestimoDia.setToolTipText("Digite aqui o dia do Empréstimo.");
        tfDataEmprestimoDia.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        labelDataEmprestimo5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDataEmprestimo5.setText("Data de Empréstimo.:");

        labelDataDevolucao15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDataDevolucao15.setText("Data de Devolução.:");

        tfDataEmprestimoMes.setEditable(false);
        tfDataEmprestimoMes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        tfDataEmprestimoMes.setToolTipText("Digite aqui o mês de Empréstimo.");
        tfDataEmprestimoMes.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tfDataEmprestimoAno.setEditable(false);
        tfDataEmprestimoAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        tfDataEmprestimoAno.setToolTipText("Digite aqui o ano de Empréstimo.");
        tfDataEmprestimoAno.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        jLabel21.setText("/");

        jLabel22.setText("/");

        tfDataDevolucaoMes.setEditable(false);
        tfDataDevolucaoMes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        tfDataDevolucaoMes.setToolTipText("Digite aqui o mês de Devolução.");
        tfDataDevolucaoMes.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        tfDataDevolucaoAno.setEditable(false);
        tfDataDevolucaoAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        tfDataDevolucaoAno.setToolTipText("Digite aqui o ano de Devolução.");
        tfDataDevolucaoAno.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        jLabel23.setText("/");

        tfDataDevolucaoDia.setEditable(false);
        tfDataDevolucaoDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        tfDataDevolucaoDia.setToolTipText("Digite aqui o dia de Devolução.");
        tfDataDevolucaoDia.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        jLabel24.setText("/");

        labelDataDevolucao17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDataDevolucao17.setText("Leitor.:");

        RemoveAcr.setText("Remover");
        RemoveAcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAcrActionPerformed(evt);
            }
        });

        labelDataEmprestimo7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        labelDataEmprestimo7.setText("Selecione os Exemplares.:");

        tbExemplaresEmprestimo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbExemplaresEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Exemplares do Empréstimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbExemplaresEmprestimo.setCellSelectionEnabled(true);
        jScrollPane5.setViewportView(tbExemplaresEmprestimo);
        tbExemplaresEmprestimo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        AddAcr.setText("Adicionar");
        AddAcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAcrActionPerformed(evt);
            }
        });

        btNovo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/novo_1.png"))); // NOI18N
        btNovo5.setToolTipText("Novo");
        btNovo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo5ActionPerformed(evt);
            }
        });

        btRemover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/remove_1.png"))); // NOI18N
        btRemover5.setToolTipText("Excluir");
        btRemover5.setEnabled(false);
        btRemover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemover5ActionPerformed(evt);
            }
        });

        btSair5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btSair5.setToolTipText("Sair");
        btSair5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair5ActionPerformed(evt);
            }
        });

        btSalvar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/save_1.png"))); // NOI18N
        btSalvar5.setToolTipText("Salvar");
        btSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar5ActionPerformed(evt);
            }
        });

        btPesquisar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/procurar_1.png"))); // NOI18N
        btPesquisar5.setToolTipText("Pesquisar");
        btPesquisar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisar5ActionPerformed(evt);
            }
        });

        btPesquisar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/application-form-magnify-icon.png"))); // NOI18N
        btPesquisar6.setToolTipText("Pesquisar");
        btPesquisar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(labelDataDevolucao17)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(tfLeitor))
                                    .addGap(18, 18, 18)
                                    .addComponent(btPesquisar6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDataDevolucao15)
                                        .addComponent(labelDataEmprestimo5)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(tfDataEmprestimoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfDataEmprestimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfDataEmprestimoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(tfDataDevolucaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfDataDevolucaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfDataDevolucaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(labelDataEmprestimo7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(AddAcr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RemoveAcr))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair5)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDataEmprestimo5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataEmprestimoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataEmprestimoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDataEmprestimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataDevolucao15)
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataDevolucaoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataDevolucaoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDataDevolucaoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(labelDataDevolucao17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(btPesquisar6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(labelDataEmprestimo7)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAcr)
                    .addComponent(RemoveAcr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair5)
                    .addComponent(btPesquisar5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 373, Short.MAX_VALUE)))
        );

        jPanel7.getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo5ActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btNovo5ActionPerformed

    private void btRemover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemover5ActionPerformed
        if (emprestimo != null) {
            if (emprestimo.getIdEmprestimo() != 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o Empréstimo do dia " + emprestimo.getIdEmprestimo()
                        + "?", "OSBiblio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    if (emprestimoRN.remover(emprestimo)) {
                        JOptionPane.showMessageDialog(rootPane, "Empréstimo: " + emprestimo.getIdEmprestimo()
                                + ", excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o empréstimo "
                                + emprestimo.getIdEmprestimo(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        limpaCampos();
    }//GEN-LAST:event_btRemover5ActionPerformed

    private void btSair5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair5ActionPerformed
        dispose();
    }//GEN-LAST:event_btSair5ActionPerformed

    private void btSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar5ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja efetuar o seguinte Empréstimo: "
                + "\nData de Empréstimo: " + tfDataEmprestimoDia.getText() + " / " + tfDataEmprestimoMes.getText()
                + " / " + tfDataEmprestimoAno.getText()
                + "\nData de Devolução: " + tfDataDevolucaoDia.getText() + " / " + tfDataDevolucaoMes.getText()
                + " / " + tfDataDevolucaoAno.getText()
                + "\nLeitor: " + tfLeitor.getText()
                + "\nExemplar(es): " + exemplares.toString()) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,exemplares.size());
            if (emprestimo == null) {
                emprestimo = new Emprestimo();
            }
            if (Util.chkVazio(tfDataEmprestimoDia.getText(), tfDataEmprestimoMes.getText(), tfDataEmprestimoAno.getText(),
                    tfDataDevolucaoDia.getText(), tfDataDevolucaoMes.getText(), tfDataDevolucaoAno.getText(), tfLeitor.getText())
                    && exemplares.size() > 0) {
                String dataEmprestimo = tfDataEmprestimoDia.getText() + "/" + tfDataEmprestimoMes.getText() + "/" + tfDataEmprestimoAno.getText(),
                        dataDevolucao = tfDataDevolucaoDia.getText() + "/" + tfDataDevolucaoMes.getText() + "/" + tfDataDevolucaoAno.getText();
                try {
                    DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                    emprestimo.setDataEmprestimo(new Date(fmt.parse(dataEmprestimo).getTime()));
                    emprestimo.setDataDevolucao(new Date(fmt.parse(dataDevolucao).getTime()));
                    emprestimo.setLeitor(leitor);
                    emprestimo.setExemplares(exemplares);
                } catch (ParseException ex) {
                    System.out.println(ex.getMessage());
                }
            int id = emprestimo.getIdEmprestimo();
            if (emprestimoRN.adiciona(emprestimo)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo " + ((id == 0) ? "cadastrado" : "alterado")
                        + " com sucesso!");
                limpaCampos();
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro: ao adicionar");
            }
        }
        }
    }//GEN-LAST:event_btSalvar5ActionPerformed

    private void btPesquisar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisar5ActionPerformed
        String dataEmprestimo = tfDataEmprestimoDia.getText() + "/" + tfDataEmprestimoMes.getText() + "/" + tfDataEmprestimoAno.getText(),
                dataDevolucao = tfDataDevolucaoDia.getText() + "/" + tfDataDevolucaoMes.getText() + "/" + tfDataDevolucaoAno.getText();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date emprestimos = null;
        try {
            emprestimos = new Date(fmt.parse(dataEmprestimo).getTime());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        List<Emprestimo> lista = emprestimoRN.listar();
        EmprestimoTableModel itm = new EmprestimoTableModel(lista);
        Object o = TelaPesquisa.exibeTela(itm, "Empréstimo");
        if (o != null) {
            emprestimo = emprestimoRN.pesquisarCodigo(Short.parseShort(o.toString()));
            tfDataEmprestimoDia.setText(emprestimo.getDataEmprestimo().toString().substring(0, 2));
            tfDataEmprestimoMes.setText(emprestimo.getDataEmprestimo().toString().substring(2, 4));
            tfDataEmprestimoAno.setText(emprestimo.getDataEmprestimo().toString().substring(4, 6));
            tfDataDevolucaoDia.setText(emprestimo.getDataDevolucao().toString().substring(0, 2));
            tfDataDevolucaoMes.setText(emprestimo.getDataDevolucao().toString().substring(2, 4));
            tfDataDevolucaoMes.setText(emprestimo.getDataDevolucao().toString().substring(4, 6));
            btRemover5.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisar5ActionPerformed

    private void btPesquisar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisar6ActionPerformed
        List<Leitor> lista = leitorRN.listar();
        LeitorTableModel itm = new LeitorTableModel(lista);
        Object o = TelaPesquisa.exibeTela(itm, "Leitor");
        if (o != null) {
            Calendar datas = Calendar.getInstance();
            leitor = leitorRN.pesquisarCodigo(Short.parseShort(o.toString()));
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String data = fmt.format(Calendar.getInstance().getTime()), dia = data.substring(0, 2),
                    mes = data.substring(3, 5), ano = data.substring(6, 10);
            Calendar calendario = new GregorianCalendar(Integer.parseInt(dia), Integer.parseInt(mes),
                    Integer.parseInt(ano));
            calendario.setTime(new Date());
            calendario.add(Calendar.DATE, leitor.getGruposLeitores().getDuracaoDiasEmprestimo());
            tfDataEmprestimoDia.setText(dia);
            tfDataEmprestimoMes.setText(mes);
            tfDataEmprestimoAno.setText(ano);
            String day = fmt.format(calendario.getTime()), mother = day, year = day;
            tfDataDevolucaoDia.setText(day.substring(0, 2));
            tfDataDevolucaoMes.setText(mother.substring(3, 5));
            tfDataDevolucaoAno.setText(year.substring(6, 10));
            tfLeitor.setText(leitor.getNome());
        }
    }//GEN-LAST:event_btPesquisar6ActionPerformed

    private void AddAcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAcrActionPerformed
        if (tbExemplaresEmprestimo.getSelectedRow() > -1) {
            Exemplar ex = (Exemplar) tbExemplaresEmprestimo.getValueAt(tbExemplaresEmprestimo.getSelectedRow(), 0);
            exemplares.add(ex);
        }
    }//GEN-LAST:event_AddAcrActionPerformed

    private void RemoveAcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAcrActionPerformed
        if (tbExemplaresEmprestimo.getSelectedRow() > -1) {
            tbExemplaresEmprestimo.setValueAt("", tbExemplaresEmprestimo.getSelectedRow(), 0);
            exemplares.remove(tbExemplaresEmprestimo.getSelectedRow());
        } else {
            tbExemplaresEmprestimo.setValueAt("", tbExemplaresEmprestimo.getRowCount() - 1, 0);
            exemplares.remove(tbExemplaresEmprestimo.getRowCount() - 1);
        }
    }//GEN-LAST:event_RemoveAcrActionPerformed

    private void limpaCampos() {
        emprestimo = null;
        leitor = null;
        tfDataEmprestimoDia.setText("");
        tfDataEmprestimoMes.setText("");
        tfDataEmprestimoAno.setText("");
        tfDataDevolucaoDia.setText("");
        tfDataDevolucaoMes.setText("");
        tfDataDevolucaoAno.setText("");
        tfLeitor.setText("");
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEmpr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEmpr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEmpr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroEmpr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroEmpr dialog = new TelaCadastroEmpr();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAcr;
    private javax.swing.JButton RemoveAcr;
    private javax.swing.JButton btNovo5;
    private javax.swing.JButton btPesquisar5;
    private javax.swing.JButton btPesquisar6;
    private javax.swing.JButton btRemover5;
    private javax.swing.JButton btSair5;
    private javax.swing.JButton btSalvar5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelDataDevolucao15;
    private javax.swing.JLabel labelDataDevolucao17;
    private javax.swing.JLabel labelDataEmprestimo5;
    private javax.swing.JLabel labelDataEmprestimo7;
    private javax.swing.JLabel labelEmprestimo;
    public javax.swing.JTable tbExemplaresEmprestimo;
    private javax.swing.JFormattedTextField tfDataDevolucaoAno;
    private javax.swing.JFormattedTextField tfDataDevolucaoDia;
    private javax.swing.JFormattedTextField tfDataDevolucaoMes;
    private javax.swing.JFormattedTextField tfDataEmprestimoAno;
    private javax.swing.JFormattedTextField tfDataEmprestimoDia;
    private javax.swing.JFormattedTextField tfDataEmprestimoMes;
    private javax.swing.JTextField tfLeitor;
    // End of variables declaration//GEN-END:variables
}