/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author batista
 */
public class FrameDtAntiga extends javax.swing.JFrame {

    /**
     * Creates new form FrameDtAntiga
     */
    public FrameDtAntiga() {
        initComponents();
        inserirTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        JTableHistorico = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCBSelecionarFiltro = new javax.swing.JComboBox();
        jFdataConsulta = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableHistorico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição da Tarefa", "Data Entrada", "Data Venci.", "Hora Venc.", "Conclusão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHistorico.setColumnSelectionAllowed(true);
        JTableHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableHistoricoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableHistorico);
        JTableHistorico.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/Print.png"))); // NOI18N
        jButton2.setText("Imprimir");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 50));

        jCBSelecionarFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCBSelecionarFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data do Vencimento", "Data de Conclusão", "Data de Entrada" }));
        jCBSelecionarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelecionarFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(jCBSelecionarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 20));

        jFdataConsulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jFdataConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFdataConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(jFdataConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Informe a Data:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etc/Lupa.png"))); // NOI18N
        jBBuscar.setText("Pesquisar");
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 680, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFdataConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFdataConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFdataConsultaActionPerformed

    private void jCBSelecionarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelecionarFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSelecionarFiltroActionPerformed

    private void JTableHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableHistoricoMouseClicked
     
    }//GEN-LAST:event_JTableHistoricoMouseClicked
    public void inserirTabela() {
        setLocationRelativeTo(null);
        
        JTableHistorico.getColumnModel().getColumn(0).setPreferredWidth(30);
        JTableHistorico.getColumnModel().getColumn(1).setPreferredWidth(380);
        JTableHistorico.getColumnModel().getColumn(2).setPreferredWidth(80);
        JTableHistorico.getColumnModel().getColumn(4).setPreferredWidth(65);
        JTableHistorico.setCellSelectionEnabled(false);
        JTableHistorico.setRowSelectionAllowed(true);
 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//Formato da data para ser exibida na tabela

        DateFormat data = DateFormat.getDateInstance();
       
        DefaultTableModel model = (DefaultTableModel) JTableHistorico.getModel();
        ArrayList<Tarefa> listaTf = Agenda.consultaTarefasAntigas();
        
        ArrayList<Date> listaDt = new ArrayList<Date>();
        Object[] fila = new Object[model.getColumnCount()];
        for (int i = 0; i < listaTf.size(); i++) {
            fila[0] = listaTf.get(i).getId();
            fila[1] = listaTf.get(i).getDescr();
            fila[2] = sdf.format(listaTf.get(i).getData_hora_entrada());
            fila[3] = sdf.format(listaTf.get(i).getData_vencimento());
            fila[4] = listaTf.get(i).getHora_vencimento();            
            fila[5] = sdf.format(listaTf.get(i).getData_final());
            model.addRow(fila);
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameDtAntiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDtAntiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDtAntiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDtAntiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDtAntiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableHistorico;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jCBSelecionarFiltro;
    private javax.swing.JFormattedTextField jFdataConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
