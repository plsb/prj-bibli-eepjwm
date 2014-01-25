/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.telas;

import fvsosp.util.FormataTamanhoColunasJTable;
import fvsosp.util.Util;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Pedro Saraiva
 */
public class TelaPesquisa extends javax.swing.JDialog {

    private static Object o;

    public static Object exibeTela(AbstractTableModel atm, String titulo) {
        TelaPesquisa tp = new TelaPesquisa(atm, titulo);
        tp.setVisible(true);
        return o;
    }

    /**
     * Creates new form TelaPesquisa
     */
    private TelaPesquisa(AbstractTableModel atm, String titulo) {
        initComponents();
        tbPesquisa.setAutoCreateRowSorter(true);
        tbPesquisa.setModel(atm);
        setLocationRelativeTo(null);
        setModal(true);
        setTitle("OSBiblio - Pesquisa de " + titulo);
        tbPesquisa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        FormataTamanhoColunasJTable.packColumns(tbPesquisa, 1);
        //packColumns(tbPesquisa, 1);
        Util.setAcessibilidade(this);
    }

    private TelaPesquisa() {
        initComponents();
        setLocationRelativeTo(null);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lbTexto = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        btSelecionar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setTitle("Tela de Pesquisa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(59, 89, 152));
        jPanel4.setLayout(null);

        lbTexto.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbTexto.setForeground(new java.awt.Color(255, 255, 255));
        lbTexto.setText("Pesquisa");
        jPanel4.add(lbTexto);
        lbTexto.setBounds(0, 0, 130, 40);

        tfPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfPesquisar.setToolTipText("Informe o que Deseja pesquisar");
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });
        jPanel4.add(tfPesquisar);
        tfPesquisar.setBounds(130, 10, 260, 22);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbPesquisa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisaMouseClicked(evt);
            }
        });
        tbPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbPesquisaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbPesquisa);

        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/confi.gif"))); // NOI18N
        btSelecionar.setToolTipText("Selecionar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btCancelar.setToolTipText("Sair");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procuraTable(String nome) {
        for (int linha = 0; linha < tbPesquisa.getRowCount(); linha++) {
            String nomeTabela = String.valueOf(tbPesquisa.getValueAt(linha, 1));
            if (nomeTabela.startsWith(nome.toLowerCase())) {
                tbPesquisa.setRowSelectionInterval(linha, linha);
                JViewport viewport = (JViewport) tbPesquisa.getParent();
                Rectangle rect = tbPesquisa.getCellRect(linha, 1, true);
                Point pt = viewport.getViewPosition();
                rect.setLocation(rect.x - pt.x, rect.y - pt.y);
                viewport.scrollRectToVisible(rect);
                break;
            }
        }
    }
    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        int row = tbPesquisa.getSelectedRow();
        if (row > -1) { //então tem ítem selecionado
            o = tbPesquisa.getValueAt(row, 0);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione o Ítem!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void tbPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisaMouseClicked
        if (evt.getClickCount() == 2) {
            btSelecionarActionPerformed(null);
        }
    }//GEN-LAST:event_tbPesquisaMouseClicked

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        o = null;
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPesquisaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btSelecionarActionPerformed(null);
        }
    }//GEN-LAST:event_tbPesquisaKeyReleased

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        procuraTable(tfPesquisar.getText());
    }//GEN-LAST:event_tfPesquisarKeyReleased

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
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}