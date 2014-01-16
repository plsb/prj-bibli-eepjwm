package fvsosp.telas;

import fvsosp.cidade.Cidade;
import fvsosp.cidade.CidadeRN;
import fvsosp.cidade.CidadeTableModel;
import fvsosp.util.OnlyNumberField;
import fvsosp.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Controle Avaliação
 */
@SuppressWarnings("serial")
public class TelaCadastroCidade extends javax.swing.JDialog {

    Cidade cidade;
    CidadeRN cidadeRN = new CidadeRN();

    /**
     * Creates new form TelaCadastroidade
     */
    public TelaCadastroCidade() {
        initComponents();
        setLocationRelativeTo(null);
        tfCodIBGE.setDocument(new OnlyNumberField());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        Descricao_Biblioteca = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        Descricao_Biblioteca1 = new javax.swing.JLabel();
        Descricao_Biblioteca2 = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox();
        tfCodIBGE = new javax.swing.JTextField();

        setTitle("OSBiblio - Cidade");
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(59, 89, 152));
        jPanel3.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cidade");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 170, 30);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 35));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(432, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/save_1.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 33));

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/remove_1.png"))); // NOI18N
        btRemover.setToolTipText("Excluir");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 37, 33));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/novo_1.png"))); // NOI18N
        btNovo.setToolTipText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 42, 33));

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/procurar_1.png"))); // NOI18N
        btPesquisar.setToolTipText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 37, 33));

        Descricao_Biblioteca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Descricao_Biblioteca.setText("UF.: *");
        jPanel1.add(Descricao_Biblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 29));

        tfDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfDescricao.setToolTipText("Informe a Descrição");
        jPanel1.add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, -1));

        Descricao_Biblioteca1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Descricao_Biblioteca1.setText("Cód.IBGE.: *");
        jPanel1.add(Descricao_Biblioteca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 29));

        Descricao_Biblioteca2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Descricao_Biblioteca2.setText("Descrição.: *");
        jPanel1.add(Descricao_Biblioteca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 29));

        cbUF.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.setSelectedItem(cbUF);
        cbUF.setToolTipText("Selecione o Estado:");
        jPanel1.add(cbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        tfCodIBGE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tfCodIBGE.setToolTipText("informe o Cód. IBGE");
        jPanel1.add(tfCodIBGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (Util.chkVazio(tfDescricao.getText(), tfCodIBGE.getText())) {
            if (cidade == null) {
                cidade = new Cidade();
            }
            cidade.setCodIBGE(Integer.parseInt(tfCodIBGE.getText().replaceAll(" ", "")));
            cidade.setDescricao(tfDescricao.getText());
            cidade.setUf(cbUF.getSelectedItem().toString());
            int id = cidade.getIdCidade();
//            Cidade cidadeIBGEExis = cidadeRN.pesquisarIBGE(Integer.parseInt(tfCodIBGE.getText()));
//            
//            if (cidadeIBGEExis!=null) {
//                JOptionPane.showMessageDialog(rootPane, "Cod IBGE Já Cadastrado! Informe outrCód IBGE!");
//            } else 
                if (cidadeRN.salvar(cidade)) {
                JOptionPane.showMessageDialog(rootPane, "Cidade " + cidade.getDescricao()
                        + ", " + ((id == 0) ? "cadastrada" : "alterada") + " com sucesso!");
                limpaCampos();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if (cidade != null) {
            if (cidade.getIdCidade() != 0) {
                if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir a cidade " + cidade.getDescricao()
                        + "?", "OSBiblio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                    if (cidadeRN.remover(cidade)) {
                        JOptionPane.showMessageDialog(rootPane, "Cidade " + cidade.getDescricao()
                                + ", excluída com sucesso!", "Cidade", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir a Cidade "
                                + cidade.getDescricao(),
                                "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        limpaCampos();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Cidade> lista = !tfDescricao.getText().isEmpty() ? cidadeRN.pesquisarDescricao(tfDescricao.getText()) : cidadeRN.listar();
        CidadeTableModel itm = new CidadeTableModel(lista);
        Object o = TelaPesquisa.exibeTela(itm, "Cidade");
        if (o != null) {
            cidade = new Cidade();
            cidade = cidadeRN.pesquisarIBGE(Integer.valueOf(String.valueOf(o)));
            tfCodIBGE.setText(String.valueOf(cidade.getCodIBGE()));
            tfDescricao.setText(cidade.getDescricao());
            cbUF.setSelectedItem(cidade.getUf().toString());
            btRemover.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    public void limpaCampos() {
        cidade = null;
        tfCodIBGE.setText("");
        tfDescricao.setText("");
        cbUF.setSelectedIndex(0);
        tfCodIBGE.requestFocus();
        btRemover.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCidade().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao_Biblioteca;
    private javax.swing.JLabel Descricao_Biblioteca1;
    private javax.swing.JLabel Descricao_Biblioteca2;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfCodIBGE;
    private javax.swing.JTextField tfDescricao;
    // End of variables declaration//GEN-END:variables
}