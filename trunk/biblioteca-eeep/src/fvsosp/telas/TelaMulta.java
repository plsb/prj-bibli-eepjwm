/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.telas;

import fvsosp.leitor.Leitor;
import fvsosp.leitor.LeitorRN;
import fvsosp.leitor.LeitorTableModel;
import fvsosp.multa.Multa;
import fvsosp.multa.MultaRN;
import fvsosp.multa.MultaTableModel;
import fvsosp.util.FormataTamanhoColunasJTable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Pedro Saraiva
 */
public class TelaMulta extends javax.swing.JDialog {

    List<Multa> listaMultas=new ArrayList<Multa>();
    Leitor leitor = null;
    /**
     * Creates new form TelaMulta
     */
    public TelaMulta() {
        initComponents();
        setTitle("Multa");
        setLocationRelativeTo(null);
        setModal(true);
        tbMulta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        FormataTamanhoColunasJTable.packColumns(tbMulta, 1);
        atualizaTabela();
        
    }
    
    public void atualizaTabela(){
        MultaTableModel mulTM = new MultaTableModel(listaMultas);
        tbMulta.setModel(mulTM);
        
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
        btEditar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        Descricao_Biblioteca = new javax.swing.JLabel();
        tfLeitor = new javax.swing.JTextField();
        btPesquisar6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(432, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/editar2.png"))); // NOI18N
        btEditar.setToolTipText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 300, 42, 33));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jPanel3.setBackground(new java.awt.Color(59, 89, 152));
        jPanel3.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Multa");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 170, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 523, 35));

        Descricao_Biblioteca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Descricao_Biblioteca.setText("Leitor:");
        jPanel1.add(Descricao_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, 29));

        tfLeitor.setToolTipText("Informe o leitor");
        tfLeitor.setEnabled(false);
        jPanel1.add(tfLeitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 296, -1));

        btPesquisar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/application-form-magnify-icon.png"))); // NOI18N
        btPesquisar6.setToolTipText("Pesquise por um Leitor.");
        btPesquisar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisar6ActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 34, -1));

        tbMulta.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 500, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 523, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Multa m = pegaMultaSelecionado();
        if (m != null) {
            TelaMultaPagamento.pagamentoMulta(m);
            atualizaTabela();
        }
        MultaRN mRN = new MultaRN();
        listaMultas = mRN.pesquisarMultas(leitor);
        atualizaTabela();
    }//GEN-LAST:event_btEditarActionPerformed

    private Multa pegaMultaSelecionado() {
        int row = tbMulta.getSelectedRow();
        Multa multa = null;
        if (row > -1) { //então tem ítem selecionado  
            Object value = tbMulta.getValueAt(row, 0);
            multa = new Multa();
            int id = (int) Short.valueOf(String.valueOf(value));
            MultaRN rn = new MultaRN();
            try {
                multa = rn.pesquisarCodigo(id);
            } catch (Exception ex) {
                System.out.println("Erro.:"+ex.getMessage());
            }


        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione a Linha!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return multa;

    }
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btPesquisar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisar6ActionPerformed
        LeitorRN leitorRN = new LeitorRN();
        List<Leitor> lista = leitorRN.listar();
        LeitorTableModel itm = new LeitorTableModel(lista);
        Object o = TelaPesquisa.exibeTela(itm, "Leitor");
        if (o != null) {
            leitor = new Leitor();
            leitor = leitorRN.pesquisarCodigo(Short.parseShort(o.toString()));
            tfLeitor.setText(leitor.getNome());
            MultaRN mulRN = new MultaRN();
            listaMultas = mulRN.pesquisarMultas(leitor);
            atualizaTabela();
            
        }
    }//GEN-LAST:event_btPesquisar6ActionPerformed

    private void tbMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMultaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            btEditarActionPerformed(null);
        }
    }//GEN-LAST:event_tbMultaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao_Biblioteca;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btPesquisar6;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMulta;
    private javax.swing.JTextField tfLeitor;
    // End of variables declaration//GEN-END:variables
}
