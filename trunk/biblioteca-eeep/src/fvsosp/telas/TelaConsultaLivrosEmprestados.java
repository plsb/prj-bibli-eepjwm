/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fvsosp.telas;

import fvsosp.emprestimo.ExemplaresEmprestadosTableModel;
import fvsosp.exemplaremprestimos.ExemplarEmprestimos;
import fvsosp.util.FormataTamanhoColunasJTable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Pedro Saraiva
 */
public class TelaConsultaLivrosEmprestados extends javax.swing.JDialog {

    private static List<ExemplarEmprestimos> listaExeEmp;
    
    public static void livrosEmprestados(List<ExemplarEmprestimos> lista){
        listaExeEmp = lista;
        TelaConsultaLivrosEmprestados tc = new TelaConsultaLivrosEmprestados();
        tc.setVisible(true);
    }
    /**
     * Creates new form TelaConsultaLivrosEmprestados
     */
    public TelaConsultaLivrosEmprestados() {
        initComponents();
        setTitle("Livros Emprestados a "+listaExeEmp.get(0).getEmprestimo().getLeitor().getNome());
        setModal(true);
        setLocationRelativeTo(null);
        
        ExemplaresEmprestadosTableModel exeempTM = new ExemplaresEmprestadosTableModel(listaExeEmp);
        tbExeEmprestados.setModel(exeempTM);
        FormataTamanhoColunasJTable.packColumns(tbExeEmprestados, 1);
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
        btSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbExeEmprestados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(432, 177));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fvsosp/imagens/SA.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 250, -1, -1));

        jPanel3.setBackground(new java.awt.Color(59, 89, 152));
        jPanel3.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Exemplares Emprestados");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 390, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 504, 35));

        tbExeEmprestados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbExeEmprestados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultaLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaLivrosEmprestados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaLivrosEmprestados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbExeEmprestados;
    // End of variables declaration//GEN-END:variables
}
