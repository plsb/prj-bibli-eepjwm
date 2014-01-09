package fvsosp.telas;

import fvsosp.autor.*;
import fvsosp.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TÚLIO
 */
public class TelaCadastroAutor extends javax.swing.JDialog {

    Autor autor;
    AutorRN autorRN = new AutorRN();

    /**
     * Creates new form TelaCadastroAutor
     */
    public TelaCadastroAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        tfNomeAutor = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfSobreAutor = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        tfSobreNomeAutor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OSBiblio - Autor");
        setModal(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(432, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/procurar_1.png"))); // NOI18N
        btPesquisar.setToolTipText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 37, 33));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/remove_1.png"))); // NOI18N
        btRemover.setToolTipText("Excluir");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 37, 33));

        tfNomeAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfNomeAutor.setToolTipText("Digite aqui a descrição do autor");
        jPanel1.add(tfNomeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 442, -1));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/save_1.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 40, 33));

        jPanel3.setBackground(new java.awt.Color(59, 89, 152));
        jPanel3.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Autor");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 170, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 462, 35));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/novo_1.png"))); // NOI18N
        btNovo.setToolTipText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 42, 33));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setText("Sobrenome do Autor.: *");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 29));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel25.setText("Sobre o Autor.:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 29));

        tfSobreAutor.setColumns(20);
        tfSobreAutor.setRows(5);
        jScrollPane1.setViewportView(tfSobreAutor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 442, 49));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel26.setText("Nome do Autor.: *");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 29));

        tfSobreNomeAutor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfSobreNomeAutor.setToolTipText("Digite aqui a descrição do autor");
        jPanel1.add(tfSobreNomeAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 442, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        List<Autor> lista = null;
        if (!tfNomeAutor.getText().equals("")) {
            lista = autorRN.pesquisarNome(tfNomeAutor.getText());
        } else {
            lista = autorRN.listar();
        }
        AutorTableModel itm = new AutorTableModel(lista);
        Object o = TelaPesquisa.exibeTela(itm, "Autor");
        autor = new Autor();
        if (o != null) {
            short id = Short.valueOf(String.valueOf(o));
            autor = autorRN.pesquisarCodigo(id);
            tfNomeAutor.setText(autor.getNome().toString());
            tfSobreAutor.setText(autor.getSobreOAutor().toString());
            tfSobreNomeAutor.setText(autor.getSobrenome().toString());
            btRemover.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if (autor != null) {
            if (autor.getIdAutor() != 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o Autor " + autor.getNome()
                        + "?", "OSBiblio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    if (autorRN.remover(autor)) {
                        JOptionPane.showMessageDialog(rootPane, "Autor " + autor.getNome()
                                + ", excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir o autor "
                                + autor.getNome(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        limpaCampos();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (autor == null) {
            autor = new Autor();
        }
        if (Util.chkVazio(tfNomeAutor.getText(),tfSobreNomeAutor.getText())) {
            autor.setNome(tfNomeAutor.getText().toString());
            autor.setSobreOAutor(tfSobreAutor.getText().toString());
            autor.setSobrenome(tfSobreAutor.getText());
            int idAutor = autor.getIdAutor();
            if (autorRN.salvar(autor)) {
                if (idAutor == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Autor " + autor.getNome()
                            + ", cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Autor " + autor.getNome()
                            + ", alterado com sucesso!");
                }
                limpaCampos();
                btRemover.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btNovoActionPerformed

    public void limpaCampos() {
        tfNomeAutor.setText("");
        tfSobreAutor.setText("");
        tfSobreNomeAutor.setText("");
        autor = null;
        tfNomeAutor.requestFocus();
        btRemover.setEnabled(false);
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
            java.util.logging.Logger.getLogger(TelaCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAutor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfNomeAutor;
    private javax.swing.JTextArea tfSobreAutor;
    private javax.swing.JTextField tfSobreNomeAutor;
    // End of variables declaration//GEN-END:variables
}